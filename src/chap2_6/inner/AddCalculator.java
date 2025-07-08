package chap2_6.inner;

// 객체 (물건)를 만들기 위한 설계도
public class AddCalculator implements Calculator {
    @Override
    public int operate(int n1, int n2) {
        return n1 + n2;
    }
}
