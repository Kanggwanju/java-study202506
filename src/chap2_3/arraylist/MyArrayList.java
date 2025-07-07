package chap2_3.arraylist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<T> implements Iterable<T> {

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
    public T remove(int index)
        throws ArrayIndexOutOfBoundsException {
        // 인덱스 범위를 확인
        if (index >= size || index < 0) {
            System.out.println("오류: " + index + "는 잘못된 인덱스입니다.");
//            return null;
            throw new ArrayIndexOutOfBoundsException("오류: " + index + "는 잘못된 인덱스입니다.");
        }

        // 지울 데이터를 백업
        T removed = get(index);

        for (int i = index; i < size - 1; i++) {
            values[i] = values[i + 1];
        }

        size--;

        // 메모리 관리 팁: 실제로 가려진 데이터를 지워줌
        values[size] = null;


        // 지운 데이터를 리턴
        return removed;
    }

    // 리스트에 특정 요소가 포함되어 있는지 여부 반환
    public boolean contains(T element) {
        return indexOf(element) != -1;
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
        /*
            논리적으로 전체삭제는 구현이 되었으나 실제 배열 내부에는
            아직 데이터가 남아있는 상태
         */
        for (int i = 0; i < size; i++) {
            values[i] = null;
        }
        size = 0;
        /*
            현재 실제 데이터가 10000개
            10240개 -> 10개로 회귀?
            실제 구현에서는 놔둡니다. 방크기를
            이유: clear 이후에 다시 그만큼의 데이터를 채우는게 일반적
         */
//        this.values = new Object[DEFAULT_CAPACITY];

    }

    public void insert(T element, int index)
        throws ArrayIndexOutOfBoundsException {
        // 인덱스 범위를 확인
        if (index >= (size + 1) || index < 0) {
            System.out.println("오류: " + index + "는(은) 잘못된 인덱스입니다.");
            throw new ArrayIndexOutOfBoundsException("오류: " + index + "는 잘못된 인덱스입니다.");
        }

        if (size == values.length) {
            ensureCapacity();
        }
        for (int i = size; i >= index; i--) {
            values[i + 1] = values[i];
        }
        values[index] = element;
        size++;
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

    @Override
    public Iterator<T> iterator() {
        // 내부 클래스를 사용하여 Iterator 구현
        return new MyIterator();
    }

    // MyArrayList의 Iterator 구현을 위한 내부 클래스
    private class MyIterator implements Iterator<T> {
        // 현재 참조하고 있는 요소의 인덱스
        private int cursor;

        // 다음 요소가 있는지 확인
        @Override
        public boolean hasNext() {
            // 현재 커서 위치가 배열 크기보다 작으면 다음 요소가 있음
            return cursor < size;
        }

        // 다음 요소 반환
        @Override
        public T next() {
            // 다음 요소가 없으면 예외 발생
            if (!hasNext()) {
                throw new NoSuchElementException("더 이상 요소가 없습니다.");
            }
            // 현재 커서 위치의 요소를 반환하고 커서 위치 증가
            return get(cursor++);
        }
    }

}
