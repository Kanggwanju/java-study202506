package chap1_2.method;

import java.util.Arrays;

public class MethodQuiz {

    static String[] foods = {"떡볶이", "치킨", "파스타"};

    public static void main(String[] args) {

        printFoods();

        push("라면");
        push("김치찌개");
        printFoods();

        int index = indexOf("파스타");
        System.out.println("index = " + index);

        int index2 = indexOf("라면땅");
        System.out.println("index2 = " + index2);

        pop();
        printFoods();

        remove("치킨");
//        remove(0);
        printFoods();


        boolean flag1 = include("파스타");
        System.out.println("flag1 = " + flag1);

        boolean flag2 = include("떡라면");
        System.out.println("flag2 = " + flag2);

        insert(1, "파인애플");

        printFoods();

        modify(2, "닭갈비");
        printFoods();
    } // end main

    static void modify(int num, String menu) {
        String[] tempArray = new String[foods.length];
        System.out.println("Arrays.toString(tempArray) = " + Arrays.toString(tempArray));

        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = foods[i];
        }
        tempArray[num] = menu;
        foods = tempArray;
        tempArray = null;
        
    }

    static void insert(int num, String menu) {
        String[] tempArray = new String[foods.length + 1];

        for (int i = 0; i < foods.length; i++) {
            tempArray[i] = foods[i];
        }

        for (int i = tempArray.length - 1; i > num; i--) {
            tempArray[i] = tempArray[i - 1];
        }

        tempArray[num] = menu;
        foods = tempArray;
        tempArray = null;
    }

    static boolean include(String menu) {
        boolean flag = false;
        
        if (indexOf(menu) != -1) {
            flag = true;
        } else {
            flag = false;
        }

        return flag;
    }

    static void remove(String menu) {

        for (int i = 0; i < foods.length; i++) {
            if (menu.equals(foods[i])) {
                for (int j = i; j < foods.length-1; j++) {
                    foods[j] = foods[j+1];
                }

                String[] temp = new String[foods.length-1];
                for (int k = 0; k < temp.length; k++) {
                    temp[k] = foods[k];
                }

                foods = temp;
                temp = null;
            }
        }

    }

    static void pop() {
        // 0. 지워질 데이터를 백업
        String delTarget = foods[foods.length - 1];

        // 1. 기존 사이즈보다 1개 작은 배열 생성
        String[] temp = new String[foods.length - 1];

        // 2. 새 배열의 맨 끝 데이터만 빼고 복사
        for (int i = 0; i < temp.length; i++) {
            temp[i] = foods[i];
        }
        // 3. 주소값 이전
        foods = temp;
        temp = null;
    }

    static int indexOf(String menu) {
        int idx = -1;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(menu)) {
                idx = i;
                break;
            }
        }
        return idx;
    }

    static void push(String menu) {

        String[] tempArray = new String[foods.length + 1];

        for (int i = 0; i < foods.length; i++) {
            tempArray[i] = foods[i];
        }
        tempArray[tempArray.length - 1] = menu;
        foods = tempArray;
        tempArray = null;
    }

    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }


}
