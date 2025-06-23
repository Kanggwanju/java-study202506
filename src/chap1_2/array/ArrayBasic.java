package chap1_2.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasic {

    public static void main(String[] args) {
        
        // 배열: 1. 동종모음 구조 (같은 타입끼리만 저장 가능)
        //       2. 생성시의 크기가 불변함 (값을 안넣으면 기본값 초기화)
        
        // 1. 배열 변수를 선언 (스택에 변수를 선언)
        int[] numbers; // 4byte? (X)
        // 2. 배열을 생성 (힙에 데이터를 저장)
        numbers = new int[5];
        // 3. 배열을 초기화 (값 저장)
        numbers[0] = 50;
        numbers[1] = 77;
        numbers[2] = (int) 66.7;
        numbers[3] = numbers[0] * 2;
        numbers[4] = 99;
        System.out.println("numbers = " + numbers);

        System.out.println(Arrays.toString(numbers));

        // 배열 길이 확인
        System.out.println(numbers.length);

        // 배열 순회
        System.out.println("=====================");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("데이터= " + numbers[i]);

        }
        System.out.println("=====================");

        // enhanced for loop
        for (int n : numbers) {
            System.out.println("n = " + n);
        }
        System.out.println("=====================");

        Arrays.stream(numbers).forEach(n -> System.out.println(n));


        System.out.println("=================");

        // 배열 단축 생성 문법
        // String[] pets = new String[] {"멍멍이", "야옹이", "짹짹이"};

        // 변수를 선언할 때만 new Type[] 생략 가능
        String[] pets = {"멍멍이", "야옹이", "짹짹이"};
        pets = new String[] {"어흥이", "톰톰이"};

        System.out.println(Arrays.toString(pets));

        foo(new String[] {"하하", "호호"});

        System.out.println("===============");

        /*
            # 배열의 기본 값
            자바의 배열은 생성되는 순간 해당 공간에 기본값들을 채워넣음
            정수형: 0
            실수형: 0.0
            논리형: false
            문자형: ''
            기타(String): null
         */
        byte[] bArr = new byte[3];
        System.out.println(Arrays.toString(bArr));

        double[] dArr = new double[4];
        System.out.println(Arrays.toString(dArr));

        boolean[] blArr = new boolean[3];
        System.out.println(Arrays.toString(blArr));

        char[] cArr = new char[3];
        System.out.println(Arrays.toString(cArr));

        // 기본타입 (정수, 실수, 논리, 문자-char)
        // 나머지 참조타입 (주소를 저장하는 변수 - 포인터)
        String[] sArr = new String[3];
        System.out.println(Arrays.toString(sArr));

        Scanner[] scanners = new Scanner[4];
        System.out.println(Arrays.toString(scanners));

    }// end main

    static void foo(String[] sArr) {

    }

}

