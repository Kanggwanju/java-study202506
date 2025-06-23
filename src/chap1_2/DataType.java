package chap1_2;

public class DataType {

    public static void main(String[] args) {
        
        // 정적 타이핑 언어
        int age = 20;
        double pi = 3.14;
        char c = 'A';
        String greeting = "안녕하세요";
        boolean flag = true;


        // 정수 타입 (byte: 1, short: 2, int: 4, long: 8)
        // 1byte == 8bit -> 10진수 정수 8 => 0 0001000
        // -128 ~ 127
        // 2byte == 16bit -> 10진수 정수 1000 => 1111101000
        // -32768 ~ 32767
        byte x1 = 127;
        short x2 = 32767;
        int x3 = 2147483647;
        long x4 = 2147483648155616511L;

        // ==== 실수 타입 ==== //
        float f1 = 3.123123131123F;     // 4byte - 7자리
        double f2 = 3.123123131231;     // 8byte - 15자리
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        // ==== 논리 타입 ==== //
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = 10 < 5;

        // ==== 문자 타입 ==== //
        char c1 = 'A';      // 2byte - 0 ~ 65535
        char c2 = 44032;
        System.out.println("c2 = " + c2);

        char[] cArr = {'h', 'e', 'l', 'l', 'o'};
        String str = new String(cArr);
        System.out.println("str = " + str);
        String str2 = "안녕하세요";
        System.out.println("str2 = " + str2);

        // 자바 17부터 지원
        String str3 = """
                안녕
                메롱
                잘가
                ㅋㅋㅋㅋ
                """;

        // 동적 타이핑 지원 (java 9)
        var z = 100;
        var v = "gggg";

    }
}