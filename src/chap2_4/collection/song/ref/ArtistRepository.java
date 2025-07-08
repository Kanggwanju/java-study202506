package chap2_4.collection.song.ref;

import chap2_5.fileio.FileExample;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// 가수 객체를 자료구조로 관리하는 클래스
public class ArtistRepository {

    // 가수들을 담을 자료구조
    // key: 가수명, value: 가수 객체
    private Map<String, Artist> artistMap;

    public ArtistRepository() {
        artistMap = new HashMap<>();

//        try (FileReader fr = new FileReader(FileExample.ROOT_PATH + "/artist.txt")) {
//
//            // 텍스트를 줄 단위로 읽어내는 보조 스트림
//            BufferedReader br = new BufferedReader(fr);
//
//            while (true) {
//                String data = br.readLine();
//
//                if (data == null) break;
//
//                String[] split = data.split("-");
////                System.out.println(split[1]);
//
//                Artist artist = new Artist(split[0]);
//
//                // 노래목록 문자열에서 노래들을 분리
//                String[] songList = split[1].split(",");
//                for (String song : songList) {
//                    artist.addSong(song);
//                }
//
//                artistMap.put(split[0], artist);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    /**
     * 현재 등록된 가수의 총 개수를 반환합니다.
     *
     * @return 등록된 가수의 개수
     */
    public int count() {
        return artistMap.size();
    }

    /**
     * 해당 가수 이름이 등록되어 있는지 여부를 확인합니다.
     *
     * @param name 확인할 가수명
     * @return 가수명이 등록되어 있으면 true, 그렇지 않으면 false
     */
    public boolean isRegistered(String name) {
        return artistMap.containsKey(name);
    }

    /**
     * 새로운 가수를 등록하고 해당 가수의 노래목록에 새로운 노래를 추가합니다.
     *
     * @param artistName 등록할 가수의 이름
     * @param newSongName 등록할 노래의 이름
     */
    public void addNewArtist(String artistName, String newSongName) {
        // 새 가수 객체 생성
        Artist newArtist = new Artist(artistName);

        // 노래를 새 가수의 노래목록에 추가
        newArtist.addSong(newSongName);

        // 신규가수를 맵에 저장
        artistMap.put(artistName, newArtist);
    }

    /**
     * 지정한 가수의 노래 목록에 새로운 노래를 추가합니다.
     *
     * @param name 추가할 노래를 소유한 가수의 이름
     * @param song 추가하려는 노래의 제목
     * @return 노래가 성공적으로 추가되었으면 true, 이미 존재하는 노래라서 추가에 실패하면 false
     */
    public boolean addNewSong(String name, String song) {
        // 1. Map에서 해당 가수를 꺼내와봄
        Artist artist = artistMap.get(name);

        // 2. 이 가수의 노래목록에 노래를 추가
        return artist.addSong(song);
    }

    /**
     * 지정된 가수 이름에 해당하는 노래 목록을 반환합니다.
     *
     * @param name 노래 목록을 조회할 가수의 이름
     * @return 가수의 노래 목록을 나타내는 Set<String>, 가수가 없으면 null
     */
    public Set<String> getTrackList(String name) {
        Artist artist = artistMap.get(name);
        return artist.getSongList();
    }

    /**
     * 모든 가수명과 그 가수의 노래개수를 리턴해야함.
     */
    public Map<String, Integer> getArtistNameAndSongCount() {
        // 목표: 1. 맵에 있는 가수명을 모두 추출
        //       2. 그 가수의 노래목록을 모두 추출 -> 개수를 셈

        /*
            {
                '동방신기': 4,
                '티아라': 6,
                '아이유': 2,
            }
         */
        Map<String, Integer> artistData = new HashMap<>();

        for (String artistName : artistMap.keySet()) {
            // 가수명 추출
            // 노래목록 추출
            Artist artist = artistMap.get(artistName);
            Set<String> songList = artist.getSongList();
            int size = songList.size();

            artistData.put(artistName, size);
        }

        return artistData;
    }

    // 가수 정보를 세이브파일에 저장하는 메서드
    public void save() {
        try (FileOutputStream fos = new FileOutputStream(FileExample.ROOT_PATH + "/artist.sav")) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(artistMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 가수 정보를 세이브파일로부터 로드하는 메서드
    public void load() {
        String savePath = FileExample.ROOT_PATH + "/artist.sav";
        File saveFile = new File(savePath);
        if (saveFile.exists()) {
            try (FileInputStream fis = new FileInputStream(FileExample.ROOT_PATH + "/artist.sav")) {
                ObjectInputStream ois = new ObjectInputStream(fis);
                artistMap = (Map<String, Artist>) ois.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
