package chap1_10.abs;

public class Cat extends Pet{

    @Override
    public void feed() {
        System.out.println("고양이는 생선을 냠냠냠!");
    }

    @Override
    public void sleep() {
        System.out.println("고양이는 캣타워에서 쿨쿨!");
    }
}
