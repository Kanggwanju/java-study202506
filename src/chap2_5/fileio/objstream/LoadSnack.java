package chap2_5.fileio.objstream;

import chap2_5.fileio.FileExample;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class LoadSnack {

    public static void main(String[] args) {

        try (FileInputStream fis
                 = new FileInputStream(FileExample.ROOT_PATH + "/snack.sav")) {

            ObjectInputStream ois = new ObjectInputStream(fis);

            // 저장된 객체를 불러와서 역직렬화(deserialization)
            // 타입 캐스팅
            List<Snack> snackList = (List<Snack>) ois.readObject();

            for (Snack snack : snackList) {
                System.out.println("snack = " + snack);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
