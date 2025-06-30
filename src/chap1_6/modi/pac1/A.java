package chap1_6.modi.pac1;

public class A {

    // 접근 제어자: 필드, 생성자, 메서드, 클래스에만 붙일 수 있음
    // 필드
    public int f1;
    int f2;         // default (package private) 제한
    private int f3;

    // 메서드
    public void m1() {
        int x = 1;
    }
    void m2() {}        // default 제한
    private void m3() {}

    // 생성자
    public A() {
        this(1.5);
        f1 = 1;
        f2 = 2;
        f3 = 3;
        m1();
        m2();
        m3();

        new B();
    }
    A(int a) {}    // default 제한
    private A(double b) {}
}
