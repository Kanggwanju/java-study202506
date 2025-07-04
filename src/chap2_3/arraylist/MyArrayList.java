package chap2_3.arraylist;

public class MyArrayList<T> {

    // 상수
    private static final int DEFAULT_CAPACITY = 10;

    // 필드
    private Object[] values;
    private int size;

    // 생성자
    public MyArrayList() {
        this.values = new Object[DEFAULT_CAPACITY];
    }

    // 메서드
    public void push(T element) {
        // 배열이 꽉찼는지 확인하고, 꽉찻으면 사이즈를 늘림
        if (size == values.length) {
            ensureCapacity();
        }
        values[size++] = element;
    }

    // 배열의 크기를 늘리는 내부 메서드
    private void ensureCapacity() {
        int newCapacity = values.length * 2;
        Object[] temp = new Object[newCapacity];
        System.arraycopy(values, 0, temp, 0, size);
    }

    // 배열에 저장된 데이터 개수 알려주기
    public int size() {
        return size;
    }

    // 배열의 특정 인덱스 데이터 참조
    public T get(int index) {
        // 인덱스 범위를 확인
        if (index >= size || index < 0) {
            System.out.println("오류: " + index + "는 잘못된 인덱스입니다.");
//            return null;
            throw new ArrayIndexOutOfBoundsException("오류: " + index + "는 잘못된 인덱스입니다.");
        }
        return (T) values[index];
    }

    // 특정 인덱스의 요소 삭제하기
    public void remove(int index) {
        // 인덱스 범위를 확인
        if (index >= size || index < 0) {
            System.out.println("오류: " + index + "는 잘못된 인덱스입니다.");
//            return null;
            throw new ArrayIndexOutOfBoundsException("오류: " + index + "는 잘못된 인덱스입니다.");
        }

        for (int i = index; i < size; i++) {
            values[i] = values[i + 1];
        }
        values[size - 1] = null;
        size--;
    }

    // 리스트에 특정 요소가 포함되어 있는지 여부 반환
    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (values[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    // 특정 요소가 처음으로 나타나는 인덱스를 반환, 없으면 -1
    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (values[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            values[i] = null;
        }
        size = 0;
    }




    @Override
    public String toString() {
        String formatted = "[ ";
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                formatted += values[i] + " ";
            } else {
                formatted += values[i] + ", ";
            }
        }
        formatted += "]";
        return formatted;
    }

}
