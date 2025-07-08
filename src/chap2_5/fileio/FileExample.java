package chap2_5.fileio;

import java.io.File;
import java.io.IOException;

public class FileExample {

    // 파일을 저장할 기본 경로
    public static final String ROOT_PATH = "C:/fileUploadEx";

    public static void main(String[] args) {

        // 폴더 생성 명령
        // 1. 생성 할 폴더의 경로를 파일 객체로 매핑
        File rootDirectory = new File(ROOT_PATH);

        // 2. 폴더생성 명령
        if (!rootDirectory.exists()) {
            rootDirectory.mkdir();
        }

        // 파일 생성하기
        // 1. 파일이 저장될 경로와 파일명을 함께 파일 객체로 매핑
        File newFile = new File(ROOT_PATH + "/food.txt");
        if (!newFile.exists()) {
            try {
                newFile.createNewFile();
                System.out.println("파일이 생성되었습니다.");
            } catch (IOException e) {
                System.out.println("파일 생성에 실패했습니다.");
            }
        }

    }
}
