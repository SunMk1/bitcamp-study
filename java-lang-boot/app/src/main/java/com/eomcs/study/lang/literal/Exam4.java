//리터럴: 실수 리터럴이 표현할 수 있는 값의 범위
package com.eomcs.study.lang.literal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lang/literal/exam4")
public class Exam4 {

  static float x = 12.375f;
  @GetMapping("/test1")
  public String test1() {
    float value = 987.654321f; // 4바이트 메모리 사용.. 유효자릿수를 넘어가면 짤린다
    return "부동소수점:" + value;
  }
  @GetMapping("/test2")
  public String test2() {
    double value = 987.654321; // 8바이트 메모리 사용
    return "부동소수점:" + value;
  }
}