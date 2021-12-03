//리터럴: 문자 리터럴이 표현할 수 있는 값의 범위
package com.eomcs.study.lang.literal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lang/literal/exam5")
public class Exam5 {

  @GetMapping("/test1")
  public String test1() {
    return "문자:" + 'A' + '가';
  }
  @GetMapping("/test2")
  public String test2() {
    return "문자:" + '\u0041' + '\uac00'; // 유니코드 값을 지정해도 된다.
  }
  @GetMapping("/test3")
  public String test3() {
    return "문자:" + (char)0x041 + ',' + (char)0xac00; // 문자의 코드 값은 그냥 정수 값이다.
    // 문자코드로 형변환 해줘야한다.
  }
  @GetMapping("/test4")
  public String test4() {
    return "문자:" + (char)65 + ',' + (char)44032; // 문자의 코드 값은 그냥 정수 값이다.
    // 문자코드로 형변환 해줘야한다.
  }
  @GetMapping("/test5")
  public String test5() {
    return "문자:" + '\u4eba' + '\u00a9' + '\u03c0'; // 키보드에 없는 특수문자를 쓸때 코드로 사용
  }
}