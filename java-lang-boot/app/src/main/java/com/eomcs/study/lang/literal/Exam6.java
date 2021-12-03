//리터럴: 문자 리터럴이 표현할 수 있는 값의 범위
package com.eomcs.study.lang.literal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lang/literal/exam6")
public class Exam6 {

  @GetMapping("/test1")
  public String test1() {
    return "012ABC가각간똘똠똡똥";
  }
  @GetMapping("/test2")
  public String test2() {
    return "012\nABC\n가각간\n똘똠똡똥";
  }
  @GetMapping("/test3")
  public String test3() {
    return "012\rABC\r가각간\r똘똠똡똥";
  }
}