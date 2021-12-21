# bitcamp-20211108
비트캠프 자바 216기 교육과정 수업 자료 모음
<<<<<<< Updated upstream

## 구글 미트
https://meet.google.com/cyz-mbfk-qaa

## 1일차 ~ 12일차(2021-11-08(월) ~ 2021-11-23(화))
- HTML, CSS, JavaScript, jQuery, Bootstrap

## 13일차(2021-11-24,수)
- 소프트웨어 유형을 설명할 수 있는가?
 유형은 두가지 1. 시스템 sw = 하드웨어를 제어하는게 목적인 소프트웨어 ex)window, 그래픽카드 드라이버 / 2. 어플리케이션 sw = 사용자의 목적을 위한 소프트웨어 ex) 브라우저, 한글, 오피스

    - 시스템 S/W와 애플리케이션 S/W를 구분하여 설명할 수 있는가?
시스템 S/W = 하드웨어를 제어하기위함 / 애플리케이션 S/W = 사용자의 목적을 위함

    - 스탠드얼론 애플리케이션과 클라이언트/서버 애플리케이션을 구분하여 설명할 수 있는가?
스탠드얼론 = 로컬에 설치하여 서버 상관없이 독립적으로 실행 가능한 애플리케이션 / C/S = 클라이언트와 서버간의 통신으로 실행되는 애플리케이션

    - 설치형 애플리케이션과 서비스형 애플리케이션을 구분하여 설명할 수 있는가?
 설치형 = 사용자의 로컬에 설치하여 실행함 / 서비스형 = 별도의 설치가 필요없는 클라이언트를 이용하여 실행

    - 웹애플리케이션 아키텍처를 설명할 수 있는가?
서버에서 정보를 받음 > 작업수행 > api로 연결 > DBMS > api > 작업수행 > 화면출력 > 서버로 결과리턴

- 형상관리 시스템의 목적을 설명할 수 있는가?
 작업물의 변경내역을 기록하고 문제가 생길시 빠르게 대처하기위해, 여러사람과 작업할때 효율성을 높이기위해

    - CVS, SVN, Git을 비교 설명할 수 있는가?
CVS = 파일단위로 전송, 변경내역이 서버에만 저장 / SVN = 변경내역 단위로 전송, 변경내역이 서버에만 저장 / Git = 변경내역 단위로 전송, 로컬에 클론하여 저장(변경내역이 로컬에도 남아있음)

- 웹 개발자가 갖춰야 할 주요 기술을 알고 있는가?
JS JAVA HTML  SQL

    - 각 기술의 용도를 간단히 설명할 수 있는가?
 HTML, JS = 웹브라우저 제어 /  JAVA = 언어 및 도구 사용 / SQL = 서버관리, 통신

## 14일차(2021-11-25,목)
- git 개발 도구를 설치하고 원격의 깃 저장소를 로컬로 가져올 수 있는가?
 인터넷 git downlord / git clone 주소

    - 깃 디렉토리와 워킹 디렉토리를 설명할 수 있는가?
     깃디렉토리 = .git 워킹디렉토리를 백업하는 폴더 / 워킹 디렉토리 = 깃 폴더내 파일들의 작업 및 수정이 이뤄지는 디렉토리

- 변경한 파일을 로컬 저장소로 백업하고 원격 저장소에 업로드 할 수 있는가?
  git add . (백업명단 작성==변경내역저장) > git commit -m "." (깃 디렉토리에 백업) > git push 로 서버에 업로드 할 수 있다

    - clone/add/commit/push/pull 명령을 다룰 수 있는가?
     git clone 주소 => 깃에 있는 디렉토리 가져오기 / git add . => 로컬 디렉토리에 백업 / git commit -m "." => 깃 디렉토리에 저장 / git push user~~ password~~ 깃 서버에 업로드 git pull 깃서버에서 가져오기

- 프로그래밍 관련 도구를 설치하고 설정할 수 있는가?
 YES

    - VSCode와 플러그인을 설치할 수 있는가?
     YES

    - JDK 설치 및 설정을 할 수 있는가? YES 설정 =>
     환경변수 설정 (PATH)

    - Eclipse IDE 설치와 워크스페이스를 설정할 수 있는가?
     YES
- 애플리케이션 빌드 유형을 설명할 수 있는가?
 인터프린터 , 컴파일 , 하이브리드

    - 인터프리터 방식/컴파일 방식/하이브리드 방식을 예를 들어 설명할 수 있는가?
     인터 => 자바스크립트 / 컴파일 => C 하이브리드 => 자바

    - 각 빌드 방식의 장단점을 설명할 수 있는가?
     인터 => 장점: 실행할때마다 로드하기 때문에 문법 오류가 나기 힘들다, 인터프린터만 있으면 어느 환경에서도 실행할 수 있다 / 단점: 실행할때마다 로드하기 때문에 실행 속도가 느리다 , 공개할때 소스파일을 전부 공유해야한다(그래야지만 실행 가능하기 때문)

    컴파일 => 장점: 실행할때는 번역이 모두 끝난 실행파일만 실행하기때문에 속도가 빠르다, 소스파일을 숨길 수 있다 / 단점: 컴파일 과정에서 기기에 맞는 기계어로 번역되기 때문에 실행환경이 달라지면 실행이 불가능하다

    하이브리드 => 장점: 반쯤 번역된 파일을 실행하기 때문에 인터프린트 방식보다 실행이 빠르다, 자바 가상머신과 번역파일이 있으면 어느 환경에서도 실행할 수 있다 / 단점: 인터프린터와 컴파일 방식의 중간이기 때문에 어중간할 수 있다, 클래스 파일을 디컴파일하여 소스파일을 들킬 수 있다

- OS와 CPU에 따라 실행 파일이 다른 것을 설명할 수 있는가?
 os =  명령어 포맷이 os 마다 다 다르기때문 / cpu = cpu마다 명령어가 다 다르기때문(컴파일 방식이 다른곳에서 실행 못하는 이유들)
    - 같은 CPU/다른 OS에서 실행 파일이 다른 이유? ""
    - 다른 CPU/같은 OS에서 실행 파일이 다른 이유? ""

- 인터프리터를 가리키는 다양한 용어를 말 할 수 있는가?
자바스크립트, node js, jvm

## 15일차(2021-11-26,금)
- JVM/JRE/JDK/JavaSE/JavaEE/JavaME 을 설명할 수 있는가?
 JVM = 자바버추얼머신(실행기) / JRE = 자바실행도구(+JVM) / JDK = 자바개발도구(+JRE) // SE = 스탠다드 에디션 / EE = 엔터프라이즈 기업용 / ME = 마이크로 냉장고,모니터등 작은 프로그램용

- 자바 컴파일러와 JVM의 역할을 이해하는가?
컴파일러 = JVM 이 읽을 수 있는 가상 기계어로 번역 (번역과정에서 문법검사실시) JVM = 컴파일된 파일(.class) 실행

- 자바 애플리케이션의 최소 코드를 직접 작성할 수 있는가?
class 파일명
public static void main (String[]args){
    명령문
}
    - 엔트리 포인트(entry point) 의미를 설명할 수 있는가? JVM 이 읽기 시작하는 지점(진입점)

- 자바 컴파일러를 사용하여 자바 소스를 컴파일 할 수 있는가?
 YES -d
    - 소스 파일과 클래스를 파일을 분리하여 컴파일 할 수 있는가?
     YES

- JVM을 사용하여 자바 클래스 파일을 실행할 수 있는가?
 YES -cp
    - 패키지에 소속된 클래스를 파일을 실행할 수 있는가?
     YES

- 텍스트 파일과 바이너리 파일을 구분하는 방법을 아는가? 확장자명, 텍스트
 편집기로 수정, 실행 가능한지 여부

- 함수와 클래스, 패키지 문법이 등장한 이유를 설명할 수 있는가?
 시간이 지남에 따라 코드가 복잡해지고 길어지면서 정리정돈할 필요가 생겼기때문

- 자바가 C/C++ 언어와 달리 각 파일 마다 컴파일 하는 이유를 설명할 수 있는가?
자바는 컴파일 과정에서 기계어로 번역되지않기때문

- 자바에서 편집한 소스 파일을 한 번에 컴파일하는 수동 컴파일 방식 보다 각 소스 파일 별로 자동으로 컴파일 하는 방식을 사용하는 이유를 설명할 수 있는가? (C/C++ 사례와 비교 설명)
자바는 컴파일 과정에서 기계어로 번역하지않기 때문에 따로 실행이 가능하다. 그래서 각 파일마다 컴파일한다. / C 는 컴파일 과정에서 완전한 기계어로 번역되기에 연동되는 파일을 전부 링크해야 실행파일로 만들어 작동시킬수있다. 그래서 한번에 컴파일한다.

- 이클립스 IDE 용 프로젝트 폴더 구조와 Maven 빌드 도구용 프로젝트 폴더 구조를 아는가?
이클립스 : src             Maven : src
           folder                     main
           folder                       java
                                        resources
                                   bin

- 빌드 도구의 역할을 설명할 수 있는가?
컴파일, 테스트, 문서생성, 패키징 등 개발지원

    - ant, maven, gradle 빌드 도구를 간단히 비교 설명할 수 있는가?
ant = 빌드 스크립트 파일,기본적인 빌드도구 기능 / maven = ant +  외부 라이브러리 관리기능 / gradle = maven + groovy, kotlin 으로 빌드과정을 정교하게 제어

- gradle 빌드 도구를 설치하고 설정할 수 있는가?
gradle init

- gradle을 이용하여 자바 프로젝트 폴더를 구성할 수 있는가?
java-lang = 프로젝트 폴더 / app = 서브 프로젝트 폴더

- build.gradle 빌드 스크립트 파일에 이클립스 관련 설정을 수행할 수 있는가?
YES
    - gradle에 플러그인을 추가할 수 있는가?
    java-lang/app/build.gradle
    build.gradle + ( id = java ), build.gradle + ( id = eclipse )

    - gradle 을 사용하여 이클립스 프로젝트 관련 설정 파일을 만들 수 있는가?
   java-lang/app gradle eclipse

- Eclipse IDE에서 gradle 로 초기화시킨 프로젝트를 임포트 할 수 있는가?
import java-lang/app

## 16일차(2021-11-29,월)
- Gradle과 플러그인의 관계를 설명할 수 있는가?
gradle은 프로젝트 폴더 구조를 maven 형식으로 바꿔주고, 플러그인을 사용하면 특정작업을 수행할 수 있게 폴더구조를 맞춤 제작해준다.

- 기존 자바 프로젝트를 스프링 부트 프로젝트로 전환할 수 있는가?
gradle에 spring boot를 플러그인 하여 사용할 수 있다. (localhost:8080/파일명)

- 자바 소스 파일과 클래스 블록, 클래스 파일의 관계를 설명할 수 있는가?
자바 소스 파일 = 사용자가 작성한 모든 코드 / 클래스 블록 = 코드 안에 class{} /
클래스 파일 = 클래스 블록을 컴파일한 파일

- 자바 주석의 종류와 그 사용법을 설명할 수 있는가?
한줄 주석 //
영역 지정 주석 /* */
javadoc 주석 /** */

javadoc = 컴파일 과정에서 주석은 전부 사라진다. 기존엔 워드파일로 저장했고 그렇기에 소스파일이 수정되면 워드파일도 같이 수정해야했지만 javadoc이 나온뒤엔 /**안에 코드를 자동으로 문서 제작하여 훨씬편리하게 되었다...(주석안에 코드를 넣어 사용가능)

- 리터럴을 설명할 수 있는가?
값(데이터)을 표현하는 것
int a = 1; // a 상수 // 1 리터럴 //

- 정수 리터럴을 진수법에 따라 표현할 수 있는가?
2진수 0b1111
8진수 011
10진수 11
16진수 0x11

## 17일차(2021-11-30,화)
- 클래스 실행과 외부 라이브러리의 관계를 설명할 수 있는가?
클래스를 실행했을때 내부코드에 외부 라이브러리의 기능을 사용하는 코드가 있을 경우 외부 라이브러리의 경로만 지정해준다면 외부 라이브러리의 기능을 사용할 수 있다

  - jar 파일의 이름 유래를 설명할 수 있는가?
 jar = 자바 아카이브 / tar = 테이프 아카이브
 테이프에 내용을 저장하던 테이프 아카이브에서 유래됐다

- 스프링부트의 실행 과정을 설명할 수 있는가?
jvm 실행 > 스프링부트 트리거 코드가있는 파일 실행 > 스프링부트의 톰캣서버 작동 > 1. 웹서버와 통신 2. 웹mvc로 파일 실행

- 메모리에 값을 저장하는 원리를 설명할 수 있는가?
0과 1의 전기신호로 저장한다

- 정수를 2진수로 표현하는 규칙을 알고 있는가?
2의 보수법

  -  번거로움이있다)
  2의 보수 = 음수의 경우 양수의 신호를 뒤집어 표현한뒤 오른쪽 끝에 1을 미리 더한다. 0이 양수 0 하나다 (-0 대신 음수Sign-Magnitude/1의 보수/2의 보수/Excess-K 규칙을 설명할 수 있는가?
  맨앞에 부호비트가 0이면 양수 1이면 음수이다
  sign = 음수를 표현할때 맨앞의 부호 비트만 바뀐다. 0이 두개 나온다 (+0, -0) 음수에서의 뺄셈 계산이 불가능하다(큰 수의 부호를 따라가기 때문에 계산이 이상해진다)
  1의 보수 = 음수의 경우 양수의 신호를 뒤집어 표현한다. 0이 두개 나온다 (+0, -0) 비트가 초과해서 넘어갈경우 더하기 연산뒤 오른쪽 끝에 1을 더한다
  (연산을 한번 더 하는가 하나 더 생겼다)
  EXcess-K = 저장하려는 값 + 2(제곱 = 비트 수 - 1) = 결과값 을 2진수로 저장한다. 음수에서 양수로 갈수록 2진수가 커진다.

- 메모리 크기에 따라 저장할 수 있는 정수 값의 범위를 설명할 수 있는가?
메모리 타입을 정하고 에러가 날때까지 숫자를 올리면 알 수 있다.

- 4바이트 크기의 정수 리터럴과 8바이트 크기의 정수 리터럴을 표현할 수 있는가?
4바이트 = 그냥 표기하면 된다
8바이트 = 끝에 L,l 을 붙인다

- 부동소수점이 메모리에 저장되는 원리를 설명할 수 있는가?
수를 IEEE-754 방식에 따라 2진수화 후 저장한다
소수점 앞의 수 = 2진수화
수수점 뒤의 수 = 2로 나눈 후 1이 넘으면 1 아닐경우 0 으로 2진수화
위 과정이 끝나고 정규화 하여 소수점을 없앤다

  - 32비트 메모리(1|8|23), 64비트 메모리(1|11|52)에 저장하는 방법을 설명할 수 있는가?
  IEEE-754 방식 ==
  수를 비트수에 맞춰 2진수화 한 후 가수부와 지수부로 나누어 저장한다.
  가수부 = Sign-Magnitude 방식으로 저장 (그래서 맨 앞에 부호가 존재한다)
  지수부 = Excess-K 방식으로 저장

- 4바이트 크기의 부동소수점 리터럴과 8바이트 크기의 부동소수점 리터럴을 표현할 수 있는가?
4바이트 = 끝에 F,f 를 붙인다
8바이트 = 그냥 표기하면 하거나 D,d 를 붙인다

- 부동소수점의 유효자릿수의 개념을 이해하는가?
IEEE-754 방식에 따라 짤리지않는 대략적인 범위를 알 수 있다. 그 범위가 유효 자릿수이다. 4byte = 7자리 8byte = 15자리

## 18일차(2021-12-01,수)
- 문자 리터럴을 작성할 수 있는가?
문자코드를 2진수화 시켜서 저장한것

- 어떤 값을 메모리에 저장하려면 2진수화시켜야 한다는 의미를 설명할 수 있는가?
어떤 데이터(값)던 컴퓨터에 저장 할 수 있게 0과 1의 전기적 신호로 바꿔야한다. 그것을 표기한것이 2진수 이다

- 문자집합의 의미를 설명할 수 있는가?
문자코드를 나열한 테이플 표

- 문자집합의 종류와 탄생 배경을 설명할 수 있는가?
ASCII = 미국 최초의 문자집합
ISO-8859-1 = ASCII에 없는 유럽문자를 쓰기 위해 만들어진 문자집합
EUC-KR = 최초의 한글문자집합
조합형 = EUC-KR 에서 표기가 불가능한 문자가 있어서 삼보컴퓨터가 주도하여 만든 문자집합
MS949 = MS가 윈도우에서 추가한 규칙
UTF-16 = 국제표준규칙으로 다시만든 문자집
UTF-8 = 영어를 다시 1byte 로 쓰기 위한 유니코드 변형 포맷

- 각 문자집합에 대해서 설명할 수 있는가?
ASCII = 영어 + 각종기호(문자집합 기본형) 7bit
ISO-8859-1 = ASCII + 유럽문자집합 1byte
EUC-KR = 한글최초 문자집합 (2350자 정도 밖에 등록되지않았다) 2byte
조합형 = 초성,중성,중성에 각 5bit로 번호를 부여하여 사용한다
MS949 = 윈도우에서 쓰는 기본형 문자집합
UTF-16 = 국제표준규칙으로 재정리한 문자집합 모든 언어가 2byte 가 되었다
UTF-8 = 영어를 1byte로 쓰기위해 다시 재정립한 문자집합 한글이 3byte가 되었다

- JVM과 OS 사이에서 문자를 다루는 상황을 설명할 수 있는가?
JVM은 UTF-16을 사용하고 mac,linux,unix 는 UTF-8 , window는 MS949를 사용한다. 소스파일을 컴파일 할 경우 JVM이 쓰는 UTF-16으로 변환하여 저장하고 실행시에 다시 시스템언어로 변환한다.


- 컴파일할 때 문자집합을 지정하는 이유를 설명할 수 있는가?
os 의 기본 문자집합과 소스파일의 문자집합이 다를 경우 컴파일 할때 os 문자집합을 기준으로 하기 때문에 소스파일의 문자집합과 완전히 다른 문자가 나오게 된다. 그래서 사용한 문자집합을 알려주어 os 문자집합으로 작성된것으로 간주하게 해줘야한다.

- 줄바꿈 제어 코드(CR, LF)에 대해 설명할 수 있는가?
CL = 커서를 맨앞으로 옮김
LF = 커서를 그대로 두고 줄을 한칸 올림

## 19일차(2021-12-02,목)
- 인코딩과 디코딩에 대해 설명할 수 있는가?
인코딩 = 받은 데이터를 변환 하는 작업 (압축, 문자코드변환 등)
디코딩 = 인코딩한 데이터를 원래 상태로 되돌리는 작업

- 이스케이프 문자에 대해 설명할 수 있는가?
문구를 제어하기위한 문자 
/n 라인피드, /t 탭...

- 요청 파라미터와 변수를 설명할 수 있는가?
요청 파라미터 = 클라이언트에서 요청한 변수데이터
변수 = 값을 저장하는 공간

- 코로나로 휴강

## 20일차(2021-12-03,금)
- 변수 선언이 무엇인지 설명할 수 있는가?
값을 저장하는 공간을 마련하라는 명령어, 선언한 변수명에 데이터가 저장된다

- 데이터타입을 설명할 수 있는가?
int, long = 정수 / float, double = 부동소수점 / Sting = 문자열 / char = 문자~~

- 자바 원시 데이터 타입(java primitive data type) 8개를 설명할 수 있는가?
byte = 1by , short = 2by , int = 4by , long = 8by , float = 4by(부동소수) , double = 8by(부동소수) char = 2by(문자), boolean = true, false(논리연산자)

- URL 인코딩(퍼센트 인코딩)을 설명할 수 있는가?
영어,숫자,특수문자를 제외한 나머지를 변환한다.
문자의 정수값을 %를 붙여 문자열로 변환하여 전달하여 7비트 이하 장비에서 데이터를 받을때 짤리지않게 하는 방법이다.

- 웹브라우저에서 자바 메서드까지 문자가 전달되는 과정을 설명할 수 있는가?
브라우저 요청 => 문자코드 퍼센트 인코딩 => 스프링부트에 전달 => 스프링부트에서 utf-8로 변환 => JVM이 읽을 수 있게 utf-16으로 다시 변환 => 앱에 값 대입(전달)

- 정수,부동소수점,논리,문자 변수를 선언하고 사용할 수 있는가?
정수 int a = 1; / 부동소수 float a = 1.00f; / 논리 boolean = true; / 문자 char = '가';레

- 배열을 선언하고 사용할 수 있는가?
int[] arr = new int[5];

- 메모리를 통해 배열 레퍼런스와 배열 인스턴스를 설명할 수 있는가?
레퍼런스는 설정한 배열의 주소다.
인스턴스는 배열의 메모리 그 자체다.
new int[5] = 배열의 레퍼런스를 리턴 , [][][][][] = 인스턴스
int[] arr = new int[5]; // arr = 퍼런스 , int[] = 인스턴스

- 배열의 인덱스를 사용하여 배열 항목에 값을 저장하고 꺼낼 수 있는가?
int[] arr = new int[5];
arr[2] = 1;
system.out.println(arr[2]);

- 배열을 선언할 때 초기화시키는 문법을 아는가?
배열은 선언시 자동 초기화 된다.

- 가비지와 가비지 컬렉터에 대해 설명할 수 있는가?
가비지 = 배열의 레퍼런스를 찾을 수 없어 사용할 수 없게된 메모리
가비지 컬렉터 = 메모리가 부족해지면 가비지를 자동으로 정리해주는 프로그램

## 21일차(2021-12-06,월)
- 배열 문법을 설명할 수 있는가?
배열 먼저 선언 후에 값 넣기 = int[]arr = new int[5];
arr = {1,2,3,4,5}
배열 선언과 동시에 값 넣기 = int[]arr = {1,2,3,4,5}

- 암시적 형변환, 명시적 형변환에 대해 설명할 수 있는가?
암시적 형변환 = int i = 4;  long l = i; 형변환이 가능한 상황에서 값을 옮겨담아 형변환한다. 
명시적 형변환 = float f = (float)4; 형변환이 불가능한 상황에서도 강제로 형변환 할 수 있다. 대신 담으려는 데이터가 변환하려는 타입에 다 들어가지 않는경우 값이 짤릴 수 있다.

- 스프링부트에서 요청 파라미터에 대한 형변환 처리 과정을 설명할 수 있는가?
웹브라우저에서 받는 파라미터는 문자열이므로 스프링부트가 문자열을 데이터타입에 맞춰 바꿔주는 문법을 사용하여 자동으로 형변환 해준다.
/exam?i=4 (브라우저에서 받은 파라미터는 무조건 문자열) ==> i = Integer.valueOf(i)

- 이클립스에서 스프링부트 실행 원리 정리
이클립스에서 스프링 앱 클래스를 실행시키고 스프링 앱 클래스가 스프링부트를 실행 시킨다. 실행된 스프링부트는 톰캣서버를 실행시킨다.

- 스프링부트를 통해 HTML 및 자바 클래스를 실행 과정
html의 경우 웹브라우저에서 요청을 받고 스프링부트 웹서버에서 바로 읽어들여 실행한다.
자바 클래스의 경우 요청을 받고 서블릿 컨테이너로 전달한 후 서블릿 컨테이너가 웹MVC로 데이터를 넘겨서 요청받은 클래스에 파라미터 값을 넣어 실행시킨 후 리턴값을 받아낸다

- 프론트엔드, 백엔드, 풀스택 개발에 대해서 이해하는가?
프론트엔드 = html 등 사용자와 상호작용하는 기능 개발
백엔드 = 데이터, 업무수행 기능 개발
풀스택 = 프론트와 백엔드 둘다 수행 가능함

## 22일차(2021-12-07,화)
- 클라이언트측 렌더링(client-side rendering) 방식으로 웹페이지를 구현할 수 있는가?
XMLHttpRequest 를 통해 서버와 통신하여 서버에선 결과값만 받아오고 html 수정,생성은 클라이언트 쪽에서 처리하여 웹페이지를 구현하면 된다.

- 코드, 함수(메서드), 클래스, 패키지 문법의 존재 이유를 설명할 수 있는가?
코드는 컴퓨터에게 명령문을 작성하기위해 존재
함수는 기능을 위한 명령문을 묶어 관리하기 위해 존재
클래스는 함수의 기능을 묶어 관리하기 위해 존재
패키지는 비슷한 기능의 클래스들을 관리하기 위해 존재

- 메서드를 UML로 표기하거나 알아 볼 수 있는가?
변수명(파라미터 : 파라미터 타입) : 리턴타입

- 엘리먼트의 세부 용어(시작태그, 끝태그, 콘텐트, 속성, 자식태그와 부모태그)를 설명할 수 있는가?
시작태그 < 콘텐트 > 끝태그
<부모태그>
  <자식태그 id(속성명)="속성값">

- 서버에 데이터를 보낼 때 URL 인코딩을 해야하는 상황을 설명할 수 있는가?
script 태그 사이에서 문자,특수문자,숫자 등 url 인코딩 되지 않는 문자들중 브라우저에서 다른 의미로 사용하고 있는 문자를 보낼때 개발자가 직접 URL 인코딩하여 보내야한다.

- 프론트-엔드 웹페이지를 작성할 때 사용하는 핵심 API를 간단히 소개할 수 있는가?
DOM API = 태그를 선택, 변경, 생성, 삭제
태그 이벤트 = 태그에 이벤트가 발생했을때 실행될 함수를 등록
AJAX = 서버와 통신, 요청 작업을 수행

- CSS 셀렉터의 용도를 설명할 수 있는가?
특정 태그를 가리켜서 작업을 수행하기 위해 사용한다.

- 스프링부트에서 결과를 리턴할 때 JSON 형식의 문자열로 변환시키는 과정을 설명할 수 있는가?
결과값을 리턴하는 과정중에 메세지 컨버터에서 가공을 하게되는데, 이 과정에서 배열이나 객체는 JSON 형식으로 변환된다. (내부적으로 배열이나 객체를 JSON 컨버터를 통해 변환하게 되어있다.)
나머지는 보통의 문자열로 리턴한다.

- JSON 형식이 무엇인지 설명할 수 있는가?
자바스크립트의 객체 초기화 문법을 모방하여 만든 데이터형식
앱간의 데이터를 주고받기 좋다.

- 클래스, 객체, 인스턴스, 메서드의 관계를 설명할 수 있는가?
클래스 = 메서드의 집합체 및 객체의 설계도면
객체 = 클래스의 내용에 따라 만들어진 데이터덩어리들을 보관하는곳
인스턴스 = 객체의 데이터들 데이터의 실체
메서드 = 클래스의 명령문, 코드

- AJAX API를 사용해서 서버에 요청할 수 있는가?
var xhr = XMLHttpResponse 로 도구를 가져온다.
xhr.open = 서버에 연결
xhr.send = 서버에 요청

- 서버에 보낸 JSON 형식의 문자열을 자바스크립트에서 다룰 수 있는가?
JSON.parse 로 데이터 타입에 맞춰 자바스크립트의 데이터로 변환하여 여러 기능에 사용할 수 있다.

- 태그를 생성하고 다른 태그의 자식 태그로 삽입할 수 있는가?
var a = document.creatEliment(생성할 태그)
타겟태그.appendchild(a)

## 23일차(2021-12-08,수)
- 반복문 대신에 forEach()를 사용하여 배열을 다룰 수 있는가?
배열.forEach (function(파라미터){
  배열을 꺼낼때마다 실행 할 콜백함수
})

- forEach() 함수의 동작원리를 설명할 수 있는가?
배열을 한바퀴 순회하면서 콜백 함수를 실행한다.
배열 꺼냄 => 콜백함수 실행 => 리턴 => 배열 꺼냄 => 반복~~
for 루프를 직접 돌릴 필요 없이 함수만 배정해주면된다.

- XMLHttpRequest 대신에 fetch() 를 사용하여 HTTP 요청을 수행할 수 있는가?
var 변수 = XMLHttpRequest ==> 도구 가져오기
변수.onload = function(){
  응답받은 후 실행할 함수
}
변수.open(요청방식, 요청URL, 비동기여부) ==> 메소드와 주소 설정
변수.send() ==> 서버에 요청

XMLHttpRequest 를 이용하는것보다 코드가 획기적으로 짧아진다
====> fetch(요청URL)

XMLHttpRequest 방식을 한줄로 표현 가능하다.

- fetch()에서 사용된 함수 체인의 원리를 설명할 수 있는가?
데이터를 이어받아 콜백함수를 이용하여 처리하는 방식으로 작업이 끊기지 않고 이어지게된다.
fetch(요청URL)  ==> URL을 입력하여 데이터를 받아온다.
.then(function(받아온 데이터){  ==> 받아온 데이터를 가공한다.
  return JSON, text 파일 가공
})
.then(function(가공된 데이터){  ==> 가공된 데이터로 함수를 실행한다.
  실행할 함수
})

- 정적 자원과 동적 자원의 URL과 실행 과정을 설명할 수 있는가?
정적 자원 = /lang/exam4.html 브라우저에서 요청 => 스프링부트가 html 파일을 읽어들임 => 리턴받은 html을 브라우저에서 실행 (파일을 그대로 리턴)
동적 자원 = /lang/exam4/test1 브라우저에서 요청 => 스프링부트가 클래스에 메소드를 전달 => 클래스가 실행, 리턴값 반환 => 브라우저에서 값대입, 화면 출력 (파일 실행후 결과값 리턴)

- 웹페이지에서 절대 경로와 상대 경로를 설명할 수 있는가?
현재폴더 aaa
절대 경로 => 파일의 절대적인 위치, 경로 = C:/user/aaa/bbb/ccc  ==> /  로 시작하지 하는 경우
상대 경로 => 지금있는 위치에서 목적지까지의 경로 = bbb/ccc  ==> / 로 시작하지 않는경우 (유지보수하기 더 좋음)

- 산술 연산자와 우선 순위에 대해 설명할 수 있는가?
우선순위 높은순서대로
()
i++ i--
++i --i
* / %
+ -
< >
== !=

- 산술 연산을 수행할 때 언제 암시적 형변환이 이루어지는지 설명할 수 있는가?
작은값이 큰값에 들어갈때
int a = 3, byte b = 1
a(int) + b(int 로 변환) = int 4

정수와 부동소수점을 연산할때
int a = 3, float b = 1.0f
a(float 로 변환) + b(float) = float 4.0

- 산술 연산을 수행할 때 개발자가 직접 명시적 형변환을 수행해야 하는 경우를 설명할 수 있는가?
큰값을 작은 값에 넣을때
int a = 3, byte b = 1
(byte)a + (byte)b = byte 4
자바 기본 연산단위가 int 이기 때문에 byte 도 명시적 형변환 해주어야 byte 타입으로 계산된다.

정수와 부동소수점을 연산해서 정수를 만들때
int a = 3, float b = 1.0f
a + (int)b = int 4

- 비교 연산자를 사용할 때 부동소수점의 경우 발생할 수 있는 문제가 무엇인지 설명할 수 있는가?
부동소수점은 계산 할때 IEEE 754 방식으로 변환되어 계산되기 때문에 변환과정에서 끝에 극소수의 값이 붙는 경우가 있다.
그래서 비교 연산을 실행할 경우 반대의 결과가 나올 수 있다.

- 논리 연산자에서 &&, || 와 &, | 의 차이점을 설명할 수 있는가?\
&& = 양쪽 모두 true 일 경우 true 이기 때문에 왼쪽값이 false 일 경우 오른쪽값은 건너뛰고 값을 리턴한다.
|| = 어느 한쪽만 true 일 경우 true 이기 때문에 왼쪽값이 true 일 경우 오른쪽값은 건너뛰고 값을 리턴한다.
&, | = 왼쪽값으로 이미 결과값이 나왔어도 오른쪽 값까지 모두 검사한다.

- 비트 논리 연산자의 동작 원리와 활용처를 설명할 수 있는가?
& = 양쪽 모두 1일때만 1을 리턴 >> 색 빼기
| = 양쪽중 한쪽이 1일 경우 1을 리턴 >> 색 강화
^ = 양쪽의 값이 다를 경우 1을 리턴 >> 크로마키
~ = not 연산자 비트값을 뒤집는다 >> 반전

- 비트 이동 연산자의 동작 원리와 활용처(*, / 효과)를 설명할 수 있는가?
>> = 비트를 2의 비트 이동수 제곱만큼 나눈다 (/)
<< = 비트를 2의 비트 이동수 제곱만큼 곱한다 (*)
비트 논리 연산자와 함께 사용하여 특정 비트값을 알아내거나 곱하거나 나누는 연산을 할때 사용한다.

- 조건 연산자를 사용할 수 있는가?
값을 받을 변수나 메소드 = 조건문 ? ture 일 경우 return 할 표현식 : false 일 경우 return 할 표현식

- 문장(statement)과 표현식(expression)의 관계를 설명할 수 있는가? 
문장 = 실행 명령 
표현식 = 값을 리턴하는 실행 명령
둘다 실행명령이며 문장(실행명령)이라는 큰 틀 안에 표현식(값을 리턴하는 실행 명령)이 있다. 

## 24일차(2021-12-09,목)
- 전위 연산자와 후위 연산자의 동작 원리를 설명할 수 있는가?
전위 연산자 = ++i
동작원리 = i = i + 1
후위 연산자 = i++
동작원리 = int temp = i
           i = i + 1 
           i++을 바로 사용할경우 임시메모리인 temp에 있는 값을 리턴한다
- 다양한 할당 연산자의 사용법을 아는가?
a += b >> a = a + b
a -= b >> a = a - b
a *= b >> a = a * b
수식을 함축해서 쓰는게 가능해진다.

- Scanner 클래스를 이용하여 키보드 입력을 다룰 수 있는가?
nextline = lf 를 쓰게 될경우 사용하게 된다 
next = 연달아 바로 입력할때 사용한다

- Scanner의 메서드에서 다루는 토큰(token)에 대해 설명할 수 있는가?
토큰 = 공백문자 스페이스,탭,엔터 등 공백을 입력하는 문자
Scanner 관련 기능중 공백을 기준으로 값을 리턴하거나 종료하는 등의 공백과 관련된 기능이 있다.

- if, switch 조건문을 다룰 수 있는가?
if (조건문){
  조건문의 내용이 참일때 내용을 실행한다.  
}else{
    if 의 내용이 거짓일 때 실행한다.
}
switch (조건문){
 case1: 조건 1 일때 실행된다
 break (브레이크를 쓰지 않으면 밑에 있는 케이스를 전부 실행하게 된다)
 case2: 조건 2 일때 실행된다
 break
}
switch 문으로 해결할 수 있을 경우 switch문으로 해결하는게 좋다. 
이유는 if, else 등을 사용해서 할 경우 참, 거짓인지 일일히 판단하여 실행하지만 switch 의 경우 조건에 맞는 case 문으로 점프하여 실행하기때문에 더 효율적이다

- while, do ~ while 반복문을 다룰 수 있는가?
while (조건문){
    조건문이 참일 경우 실행한다. 실행 후 다시 조건문을 검사하여 참일경우 다시 실행한다. 거짓일 경우 끝난다.
}
do{
    일단 실행 후 while의 조건문을 검사한다 참일 경우 do 라인부터 다시 실행하고 거짓일 경우 끝난다.
}while(조건문)

- break, continue 명령을 사용할 수 있는가?
break를 사용하면 반복문을 끝내고 나올 수 있다.
제어문들이 겹친경우 나갈 반복문에 라벨을 부여하여 break 라벨 을 실행해 나갈 수 있다.
continue는 만나면 위의 조건문부터 다시 실행하게 한다.
중간에 원하는 결과가 나오지 않을때 보통 사용하여 다시 실행하게 한다.

- 명령문에 라벨을 붙이는 경우를 설명할 수 있는가?
제어문들이 겹쳐서 나가야하는 제어문을 특정 지어야 할때 사용한다.

- for 반복문을 사용할 수 있는가?
for (int i = 0, i < 5, i++){
    변수 초기화를 먼저 진행후 조건문을 검사한다.
    조건문이 참일 경우 내용을 실행하고 증감연산자를 실행한 뒤 다시 조건문을 검사한다. 조건문이 참이 될때 까지 반복한다.
}

## 25일차(2021-12-10,금)
- 중첩 for 반복문을 다룰 수 있는가?

- for 문에서 break와 continue 명령을 사용할 수 있는가?

- ArrayList 와 배열의 차이점을 설명할 수 있는가?

- MyList 프로젝트 실습(Ver. 01)
  - 연락처 관리 구현(목록,등록,상세조회)

  ## 26일차(2021-12-13,월)
- MyList 프로젝트 실습(Ver. 01)
  - 연락처 관리 구현(계속)
- 과제
  - 개인 프로젝트 : CRUD 기능 구현

## 27일차(2021-12-14,화)
- 개인 프로젝트 발표
  - 구현 사항 시연
  - 오프라인
    - 김지현,오승지,임성현,장창훈,조원석,채다해,한상은,이장일,이상준,정창성,
  - 온라인
    - 곽민규,김기현,양성은,김재원,명준호,박경현,양승범,오민현,장효범,최리나,허정윤,이재훈,서영범,김민수,김주은,정요섭,강동우,전영민,박력,김규범,
- 자바스크립트
  - 자바스크립트 문법 요점 정리: ex00/
  - script 태그 사용법: ex01/

## 28일차(2021-12-15,수)
- 자바스크립트
  - script 태그 사용법: ex01/ (계속)
  - 변수,배열,조건문,반복문 등 사용법: ex02/

## 29일차(2021-12-16,목)
- 자바스크립트
  - 함수 사용법: ex03/
- MyList 프로젝트 실습(Ver. 02)
  - 메서드 다루기

## 30일차(2021-12-17,금)
- MyList 프로젝트 실습(Ver. 02)
  - 메서드 다루기(계속)
- 자바 기초(com.eomcs.lang.ex07)
  - 메서드 사용법(Exam0110 ~ Exam0421)

  ## 31일차(2021-12-20,월)
- 자바 기초(com.eomcs.lang.ex07)
  - 클래스 파일 포맷 분석 및 직접 바이트코드 작성하기
  - 메서드 사용법(계속; Exam0440 ~ )

## 32일차(2021-12-21,화)
- 자바 객체지향 프로그래밍(com.eomcs.oop)
- MyList 프로젝트 실습(Ver. 03)
  - 자바 클래스 다루기
  - 자바스크립트 객체 다루기
- 자바스크립트
  - 객체 사용법: ex04/
