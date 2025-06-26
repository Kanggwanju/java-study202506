package chap1_4.juice;

/*
    1. 패키지 이름은 무조건 소문자로 작성하는 게 관례
    2. 변수, 메서드 이름과 규칙이 같음 (띄어쓰기, 숫자로 시작, 예약어, 특수문자)
    3. 패키지명을 지을 때 띄어쓰기가 있어야 하는 경우
       ex) my phone number -> my.phone.number 폴더를 더 쪼갠다.
    4. java로 시작하는 패키지는 사용금지 (라이브러리랑 헷갈림)
 */
public class Apple {
    String sweet;

    public Apple() {
        System.out.println("쥬스를 만들 때 사용하는 사과입니다.");
    }
}
