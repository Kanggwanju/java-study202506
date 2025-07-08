package chap2_5.fileio.textstream;

import chap2_4.collection.song.ref.Artist;
import chap2_5.fileio.FileExample;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderExample {

    public static void main(String[] args) {

        try (FileReader fr = new FileReader(FileExample.ROOT_PATH + "/artist.txt")) {

            // 텍스트를 줄 단위로 읽어내는 보조 스트림
            BufferedReader br = new BufferedReader(fr);

            while (true) {
                String data = br.readLine();

                if (data == null) break;

                String[] split = data.split("-");
//                System.out.println(split[1]);

                Artist artist = new Artist(split[0]);

                // 노래목록 문자열에서 노래들을 분리
                String[] songList = split[1].split(",");
                for (String song : songList) {
                    artist.addSong(song);
                }
                System.out.println("artist = " + artist);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
