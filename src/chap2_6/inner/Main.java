package chap2_6.inner;

public class Main {

    // 내부 클래스 (inner class)
    /*
        나는 연산을 위한 추가 구현체가 필요한데
        아무래도 그 설계도는 여기 안에서만 쓰고
        다른 곳에서는 안 쓸 것 같다.
        -> 굳이 새 파일을 만들지 않고 내부 클래스를 생성
     */
    private static class SubCalculator implements Calculator {

        @Override
        public int operate(int n1, int n2) {
            return n1 - n2;
        }
    }


    public static void main(String[] args) {

        Calculator addCalculator = new AddCalculator();

        int result1 = addCalculator.operate(100, 30);
        System.out.println("result1 = " + result1);

        SubCalculator subCalculator = new SubCalculator();
        int result2 = subCalculator.operate(500, 350);
        System.out.println("result2 = " + result2);

        /*
            익명 클래스 (anonymous class)
            - 나는 곱셈 계산기가 필요한데, 여기서만 쓰고 다른 곳에서는 안 쓸 것 같음.
            - 근데 객체를 한번 생성하고 난 이후에는 설계도를 폐기하고 싶음.
         */
        Calculator multiCalculator = new Calculator() {
            // 클래스 내부
            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        };

        int result3 = multiCalculator.operate(50, 30);
        System.out.println("result3 = " + result3);

    }
}
