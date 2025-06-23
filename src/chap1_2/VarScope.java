package chap1_2;

public class VarScope {
    public static void main(String[] args) {

        /*
            java는 변수가 선언된 블록에서 생성되어
            블록이 종료되면 메모리에서 자동 제거됨
        */

        int x1 = 10;
        if (true) {
            int x2 = 20;
            System.out.println("x2 = " + x2);
        } // if block
        System.out.println("x1 = " + x1);

        for (int i = 0; i < 3; i++) {

        }
    } // main block
//    int x4 = x1;
} // class block
