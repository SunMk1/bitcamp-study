//변수: 스프링 부트의 자동 형변환
package com.eomcs.study.lang.variable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("lang.variable.exam4")// 클래스 이름이 같은 경우 충돌 방지
@RequestMapping("/lang/variable/exam4")
public class Exam4 {

  @GetMapping("/test1")
  public String test1(int v1, int v2, String op) {
    int result = 0;
    switch (op) {
      case "+": result = v1 + v2; break;
      case "-": result = v1 - v2; break;
      case "*": result = v1 * v2; break;
      case "/": result = v1 / v2; break;
      case "%": result = v1 % v2; break;
      default: return "해당 연산을 수행할 수 없습니다";
    }
    String html = "<!DOCTYPE html>"
        +"<html>"
        +"<head>"
        + "<meta charset=\"UTF-8\">"
        + "<title>변수 활용</title>"
        + "</head>"
        + "<body>"
        + "<h1>계산 결과</h1>"
        + "<p>결과: " + v1 + " " + op + " " + v2 + " = " + result + "</p>"
        + "</body>"
        + "</html>";

    return html;
  }

  @GetMapping("/test2")
  public Object test2(int v1, int v2, String op) {
    System.out.println(">" + v1 + "<");
    System.out.println(">" + v2 + "<");
    System.out.println(">" + op + "<");

    int result = 0;
    switch (op) {
      case "+": result = v1 + v2; break;
      case "-": result = v1 - v2; break;
      case "*": result = v1 * v2; break;
      case "/": result = v1 / v2; break;
      case "%": result = v1 % v2; break;
      default: return "해당 연산을 수행할 수 없습니다.";
    }
    return result;
  }

  @GetMapping("/test3")
  public Object test3() {
    String[] names;
    names = new String[] {"홍길동","임꺽정","유관순","안중근","윤봉길"};
    return names;
  }
}
