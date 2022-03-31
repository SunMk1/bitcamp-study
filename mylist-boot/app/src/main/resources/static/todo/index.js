var titleInput = $("#x-title-input")
titleInput.css("display", "none")

var tbody = $("#x-todo-table tbody")

$("#x-todo-input").keyup(function(e) {
    if (e.keyCode == 27) {
        $(e.target).val("")
    } else if (e.keyCode == 13) {
        if ($(e.target).val() == "") {
            Swal.fire("필수 입력 항목이 비어 있습니다.")
            return
        }
        fetch(`/todo/add?title=${e.target.value}`)
        .then(function(response){
            return response.text()
        })
        .then(function(text){
            console.log(text)
            location.reload()
        })
    }
})

fetch("/todo/list")
.then(function(response) {
    return response.json()
})
.then(function(todoList) {
  console.log(todoList)
  for (var todo of todoList) {
    var checkedOption = ""
    var titleTdOption = ""
    if (todo.done) {
      checkedOption = "checked"
      titleTdOption = "class='todo-checked'"
    }
    $("<tr>").attr("data-no", todo.no)
      .html(`<td><input type="checkbox" ${checkedOption} onchange="checkTodo(${todo.no},event.target.checked)"></td>
             <td class="todo-title"><span ${titleTdOption}>${todo.title}</span></td>                
             <td><button type="button" class="update-btn btn btn-primary btn-sm" data-no="${todo.no}">변경</button></td>
             <td><button type="button" class="delete-btn btn btn-primary btn-sm" data-no="${todo.no}">삭제</button></td>`)
      .appendTo(tbody)
  }
  $("#x-todo-input").focus()
})

// tbody.onclick = function(e) {
    // 삭제 버튼을 클릭 했을 때 호출될 리스너 등록하기
    // => 삭제 버튼은 동적으로 생성된다.
    // => 따라서 부모 태그에 리스너를 등록해야 한다.
    // if (e.target instanceof HTMLButtonElement) {  or
    tbody.on("click", function(e){
        var no = e.target.getAttribute("data-no")
        if (e.target.classList == "delete-btn") {
            fetch(`/todo/delete?no=${no}`)
            .then(function(response){
                return response.json()
            })
            .then(function(result) {
            if (result == 0) { 
                alert("삭제할 수 없습니다.")
            } else {
                location.reload()
            }
            })
        }
    // }
        if (e.target.classList == "update-btn") {
            // var no = e.target.getAttribute("data-no")
            // 현재 todo 항목을 편집 중인 상태에서 변경 버튼을 눌렀다면
            if (titleInput.parent()[0] instanceof HTMLTableCellElement){
                // 다른 항목을 편집하기 위해 이동하기 전 해당항목을 편집 전의 상태로 되돌린다.
                titleInput.parent().find("span").css("display", "")
            }
            var titleTd = $(`tr[data-no="${no}"] > td.todo-title`)
            var titleSpan = titleTd.find("span")
            titleSpan.css("display", "none")
            titleInput.val(titleSpan.html())
            titleInput.attr("data-no", no)
            titleTd.append(titleInput)
            titleInput.css("display", "")
        }
    })
// }

function cancelTodoEditing() {
        titleInput.parent().find("span").css("display", "")
        titleInput.css("display", "none")
        $(document.body).append(titleInput)
    }
titleInput.keyup(function(e) {
    var no = titleInput.attr("data-no")
    var titleSpan = titleInput.parent().find("span")
    var originTitle = titleSpan.html()
    if (e.keyCode == 27) {
        cancelTodoEditing()
    } else if (e.keyCode == 13 && titleInput.value != "" && originTitle != titleInput.value) {
        fetch(`/todo/update?no=${no}&title=${titleInput.val()}`)
        .then(function(response){
            return response.json()
        })
        .then(function(result) {
           if (result == 0) {
               alert("변경하지 못했습니다!")
           } else {
            console.log("변경했습니다!")
            titleSpan.html(titleInput.val()) 
            cancelTodoEditing()
           }
        })
    }
})


function checkTodo(no, checked) {
    fetch(`/todo/check?no=${no}&done=${checked}`)
    .then(function(response){
        return response.json()
    })
    .then(function(result) {
        if (result == 0) {
            alert("변경하지 못했습니다!");d
        } else {
             var titleSpan = $(`tr[data-no="${no}"] > td.todo-title > span`)
            if (checked) {
                titleSpan.addClass("todo-checked")
            } else {
            titleSpan.removeClass("todo-checked")
            }
        }
    })
}