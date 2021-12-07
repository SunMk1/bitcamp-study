//변수: 값을 저장할 메모리를 준비 시키는 명령어
package com.eomcs.study.lang.variable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("lang.variable.exam2")
@RequestMapping("/lang/variable/exam2")
public class Exam2 {

  //name1=홍길동&name2=유관순&name3=안중근&name4=윤봉길&name5=김구&name6=김원봉&name7=이순신
  @GetMapping("/test1")
  public String test1(String name1, String name2, String name3, String name4, String name5,
      String name6, String name7) {
    return "클라이언트에서 받은 값 = " + name1 + " , " + name2 + " , " + name3 + " , " + name4
        + " , " + name5 + " , " + name6 + " , " + name7;
  }
  @GetMapping("/test2")
  public String test2(String[] name) {
    return "클라이언트에서 받은 값 = " + name[0] + " , " + name[1] + " , " + name[2] + " , " + name[3]
        + " , " + name[4] + " , " + name[5] + " , " + name[6];
  }
}
