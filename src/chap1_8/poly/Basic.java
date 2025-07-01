package chap1_8.poly;

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

/*
        Object
          |
          A
        /   \
       B    C
       |    |
       D    E

 */

public class Basic {


    /*
        다형성 : 객체가 다양한 형태(type)를 가질 수 있는 성질
         - 자식 객체는 상속관계에 있는 타입을 사용할 수 있음
     */
    public static void main(String[] args) {
        A x1 = new A();
        A x2 = new B();
        A x3 = new C();
        Object x4 = new D();
        C x5 = new E();


    }
}
