package chap1_10.abs;

// 추상적
// 추상 클래스: 실체화된 객체가 아닌 다형성을 위한 껍데기 클래스 (규격)
// 오버라이딩을 강제할 수 있음
public abstract class Pet {

    // 추상 메서드: 오버라이딩을 위한 껍데기 틀
    public abstract void feed();
    public abstract void sleep();
}
