//변수: 값을 저장할 메모리를 준비 시키는 명령어
package com.eomcs.study.lang.variable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("lang.variable.exam1")// 클래스 이름이 같은 경우 충돌 방지
@RequestMapping("/lang/variable/exam1")
public class Exam1 {

  //test1?name=홍길동&tel=010-9999-1111&gender=man
  @GetMapping("/test1")
  public String test1(String name, String tel, String gender) {
    return "클라이언트에서 받은 값 = " + name + "," + tel + "," + gender;
  }
  //b=100&s=32767&i=2100000000&l=9220000000000000000 
  @GetMapping("/test2")
  public String test2(byte b, short s, int i, long l) {
    return "클라이언트에서 받은 값 = " + b + "," + s + "," + i + "," + l;
  }
  //f=987.6543/짤림/21&d=98765.4321234567/짤림/89 7자리, 15자리
  @GetMapping("/test3")
  public String test3(float f, double d) {
    return "클라이언트에서 받은 값 = " + f + " , " + d;
  }
  //c=가
  @GetMapping("/test4")
  public String test4(char c) {
    return "클라이언트에서 받은 값 = " + c + " , " + (int)c;
  }
  //b=true
  //b=1
  //- boolean 리터럴은 true/false 이다.
  //- 논리 값으로 1/0, true/false 를 사용할 수 있는 이유는 
  //  스프링 부트가 중간에서 변환해 주기 때문이다.
  @GetMapping("/test5")
  public String test5(boolean b) {
    return "클라이언트에서 받은 값 = " + b;
  }
}
