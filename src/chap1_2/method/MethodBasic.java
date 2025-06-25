package chap1_2.method;


public class MethodBasic {

    // 자바는 함수라는 개념이 없음
    // 메서드: 객체가 가진 기능
    // 메서드를 정의할 수 있는 위치는 클래스 내부, 메서드 외부
    public static void main(String... args) {
        int result1 = add(20, 30);
        System.out.println("result1 = " + result1);

        int result2 = addAll(new int[] {1, 2, 3, 4, 5, 6});
        System.out.println("result2 = " + result2);

        int result3 = addAll(10, 30, 50, 70);
    }

    // 2개의 정수를 받아서 더해서 반환
    static int add(int n1, int n2) {
        return n1 + n2;
    }
    int add2(byte n1, byte n2) {
        return n1 + n2;
    }
    int[][] foo() {
        return new int[3][4];
    }
    void bar() {
        System.out.println("hello!!");
    }
    
    // n개의 정수를 전달받아서 싹 더해서 리턴
    static int addAll(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    // 배열 2개를 전달받을 때
    static void ticky(int[] nums1, int[] nums2) {
        ticky(new int[]{1,2,3}, new int[]{4,5,6});
    }

    // 여러개를 리턴하고 싶을 때
    int[] multiReturn(int n1, int n2) {
        return new int[] { n1 + n2, n1 - n2 };
    }
}


