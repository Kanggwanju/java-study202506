package chap2_2.lang;

import java.util.Arrays;

public class StringExample {

    public static void main(String[] args) {

        String str = "hello java";

        // charAt(index) : 문자열 인덱스에 따른 글자 반환
        char c = str.charAt(4);//str[4]
        System.out.println("c = " + c);

        // substring() : 문자열의 특정 범위를 추출
        String ss1 = str.substring(6); //6번부터 끝까지 슬라이싱
        System.out.println("ss1 = " + ss1);

        String ss2 = str.substring(1, 5); // 1번부터 5번미만까지 슬라이싱
        System.out.println("ss2 = " + ss2);

        // length() : 문자열의 총 길이 반환
        int len = str.length();
        System.out.println("len = " + len);

        // indexOf(), lastIndexOf(): 특정 문자나 단어의 첫글자 인덱스 반환
        int first = str.indexOf("l");
        int last = str.lastIndexOf("l");
        System.out.println("first = " + first);
        System.out.println("last = " + last);

        // java라는 단어가 포함되어있으면 첫글자인덱스 반환
        // 포함되어 있지 않으면 -1 반환
        int java = str.indexOf("java");
        System.out.println("java = " + java);

        // 일괄 대소문자변경
        String str2 = "HeLLo PoRoRO";
        String lower = str2.toLowerCase();
        String upper = str2.toUpperCase();
        System.out.println("lower = " + lower);
        System.out.println("upper = " + upper);

        //파일경로에서 확장자 추출
        String filePath = "D:/local/img/2022/01/03/dogdogdog.GIF";
        String ext = filePath.substring(filePath.lastIndexOf(".") + 1);
        System.out.println("ext = " + ext);

        switch (ext.toLowerCase()) {
            case "jpg":
            case "png":
            case "gif":
            case "svg":
                System.out.println("이미지파일입니다.");
                break;
            default:
                System.out.println("일반 파일입니다.");
        }

        // replace(old, new): 문자열 내부에 old문자를 찾아서 new문자로 일괄변경
        String message = "python study, python program, python data";
        String replace = message.replace("python", "java");
        System.out.println("replace = " + replace);

        // split() : 문자열을 특정 기준을 기반으로 쪼개서 배열에 반환
        String food = "짜장면,짬뽕,탕수육";
        String[] foodList = food.split(",");
        System.out.println(Arrays.toString(foodList));
    }

}
