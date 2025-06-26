package chap1_3.arraylist;

import java.util.Arrays;

public class StringList {

    // 필드
    String[] values;

    // 생성자
    StringList() {
        values = new String[0];
    }

    StringList(String... items) {
        values = items;
    }

    // 메서드
    boolean isOutOfBounds(int index) {
        System.out.println("인덱스의 범위가 잘못되었습니다.");
        return index < 0 || index >= values.length;
    }

    void modify(int index, String item) {
        if (isOutOfBounds(index)) return;
        values[index] = item;
    }

    void insert(int index, String item) {
        if (isOutOfBounds(index)) return;
        String[] temp = copy(1);
        for (int i = values.length; i > index; i--) {
            temp[i] = temp[i - 1];
        }
        temp[index] = item;
        values = temp;
    }

    String pop() {
        if (values.length == 0) {
            System.out.println("제거할 대상이 없습니다.");
            return null;
        }
        String deleted = values[values.length - 1];

        values = copy(-1);
        return deleted;
    }

    int indexOf(String item) {
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return Arrays.toString(values);
    }

    String[] copy(int capacity) {
        String[] tempArray = new String[values.length + capacity];

        // 루프 회전수는 사이즈를 늘릴 때는 원본만큼
        // 줄였을 때는 줄인 만큼 회전
        int loopCount = (capacity >= 0) ? values.length : tempArray.length;
        for (int i = 0; i < loopCount; i++) {
            tempArray[i] = values[i];
        }
        return tempArray;
    }

    void push(String... items) {
        // 1. 사이즈가 1개 더 큰 배열을 생성
        // 2. 원본 내용을 복사
        String[] temp = copy(items.length);

        // 3. 배열에 맨 끝에 데이터 추가
        for (int i = 0; i < items.length; i++) {
            temp[temp.length - (items.length - i)] = items[i];
        }
        // 4. 주소값 이전
        values = temp;
    }

    // 배열 저장값으로 찾아서 삭제
    void remove(String targetItem) {

        if (!include(targetItem)) return;

        for (int i = indexOf(targetItem); i < values.length - 1; i++) {
            values[i] = values[i + 1];
        }
        pop();
    }

    // 오버로딩 : 같은이름의 메서드를 계속만드는 행위
    void remove(int targetIndex) {
        if (isOutOfBounds(targetIndex)) return;
        remove(values[targetIndex]);
    }

    boolean include(String item) {
        return indexOf(item) != -1;
    }
}
