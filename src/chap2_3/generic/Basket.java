package chap2_3.generic;

/*
    이건 바구니의 설계도고 아직 뭘 담을지는 몰라
    근데 아무튼 과일을 담을거임
    F는 과일을 의미, 이게 대체 무슨 과일이냐? 설계도는 몰라
    F는 바구니가 만들어진 다음에 결정됨
 */
public class Basket<F extends Fruit> {

    private F fruit;

    public F getFruit() {
        return fruit;
    }

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }
}
