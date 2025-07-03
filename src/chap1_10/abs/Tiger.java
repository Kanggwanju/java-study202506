package chap1_10.abs;

public class Tiger extends Pet {
    @Override
    public void feed() {
        System.out.println("호랑이는 생고기를 먹어요");
    }

    @Override
    public void sleep() {
        System.out.println("호랑이는 연못에서 쿨쿨");
    }
}
