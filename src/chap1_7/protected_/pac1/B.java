package chap1_7.protected_.pac1;

public class B {

    void test() {
        A a = new A();
        a.f1 = 10;
        a.f2 = 20;
        a.m1();
        a.m2();

        new A(123);
        new A("abc");
    }
}
