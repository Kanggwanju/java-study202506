package chap1_3;

import java.util.Scanner;

public class StringCompare {

    public static void main(String[] args) {

        String str1 = "김철수";
        String str2 = "김철수";
        String str3 = new String("김철수");

        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1 == str3 : " + (str1 == str3));

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);

        Scanner sc = new Scanner(System.in);

        System.out.println("=======================");
        String inputName = sc.nextLine();
        String myName = "홍길동";

        System.out.println("inputName = " + inputName);
        System.out.println("myName = " + myName);

        System.out.println("같은가? : " + (inputName.equals(myName)));
    }
}
