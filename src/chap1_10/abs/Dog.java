package chap1_10.abs;

public class Dog extends Pet{

    @Override
    public void feed() {
        System.out.println("강아지는 사료를 냠냠!");
    }

    @Override
    public void sleep() {
        System.out.println("강아지는 마당에서 낮잠을 쿨쿨쿨!");
    }
}
