package chap2_5.fileio.objstream;

import chap2_5.fileio.FileExample;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SaveSnack {

    public static void main(String[] args) {

        // 과자 정보들을 텍스트로 파일에 저장하는게 아니라
        // 그냥 객체를 통째로 바이너리 상태로 세이브파일에 넣어버리기

        List<Snack> snackList = List.of(
                new Snack("콘칲", 1970, 1500, Snack.Taste.GOOD),
                new Snack("오징어집", 1985, 1800, Snack.Taste.GOOD),
                new Snack("사브레", 1980, 3000, Snack.Taste.BAD)
        );

        try(FileOutputStream fos = new FileOutputStream(FileExample.ROOT_PATH + "/snack.sav")) {
            // 객체를 통채로 저장하는 보조스트림
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // 객체가 스트림을 통과하려면 직렬화가 되어야 함.
            // snack은 우리가 만들어서 직렬화가 안 되어있음.
            oos.writeObject(snackList);
            System.out.println("객체 저장 성공!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


