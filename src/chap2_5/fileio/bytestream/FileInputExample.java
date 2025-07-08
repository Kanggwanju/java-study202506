package chap2_5.fileio.bytestream;

import chap2_5.fileio.FileExample;

import java.io.FileInputStream;

public class FileInputExample {

    public static void main(String[] args) {

        try {
            FileInputStream fis
                = new FileInputStream(FileExample.ROOT_PATH + "/pet.txt");

            int data = 0;
            // fis.read()를 했을 때 내용을 끝까지 읽고,
            // 한번 더 실행하면 -1을 반환함.
            while ((data = fis.read()) != -1) {
                // 숫자가 나오므로 char 변환
//                System.out.print((char) data);
                
                // 숫자를 아스키로 변환해서 출력
                System.out.write(data);
            }
            // 출력 버퍼 비우기
            System.out.flush();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
