package chap1_2;

public class TypeCasting {

    public static void main(String[] args) {

        // java는 타입이 다른 데이터의 연산을 지원하지 않음
        byte a = 100;
        int b = a; // 암묵적 형 변환 (byte: 1 -> int: 4)

        /*
            var c
            0 0000000 00000000 00000011 11101000
            var d
            1 1101000

            1의보수: 비트 반전
            1101000 -> 0010111
            2의보수: 1을 더함
            0010111
                  1
            0011000
        */

        int c = 1000;
        byte d = (byte) c; // int: 4 -> byte: 1
        // 명시적 형 변환 - 데이터 손실이 발생할 수 있음
        System.out.println("d = " + d); // -24

        int k = 50;   // 4byte
        double j = k; // 8byte
        System.out.println("j = " + j);
        
        double m = 5.567;
        int n = (int) m; // 명시적 형 변환 -> 데이터 손실
        System.out.println("n = " + n); // 5, 소수점 버리기

        // 암묵적(묵시적) 형 변환 -> upcasting (promotion)
        // 명시적 형 변환 -> downcasting

        // 타입이 다른 데이터끼리의 연산은
        // 암묵적 형변환에 의해 작은 데이터가 큰 데이터로 변환됨
        int v = 91;
        double z = 6.6;
        double result = v + z;

        int result2 = 'A' + v;
        System.out.println("result2 = " + result2);

        int h = 5;
        double result3 = 27 / (double) h;
        System.out.println("result3 = " + result3);

        // int 보다 작은 데이터(char, short, byte)들은
        // 연산 결과가 무조건 int다.
        byte b1 = 100;
        byte b2 = 70;
        int result4 = b1 + b2;

        System.out.println('A' + 'C'); // int
    }
}



















