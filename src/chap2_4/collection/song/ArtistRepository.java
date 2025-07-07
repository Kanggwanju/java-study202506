package chap2_4.collection.song;

import java.util.*;

// 가수 객체를 자료구조로 관리하는 클래스
public class ArtistRepository {

    // 가수들을 담을 자료구조
    // key: 가수명, value: 가수 객체
    private Map<String, Artist> artistMap;

    public ArtistRepository() {
        this.artistMap = new HashMap<>();
    }

    public int count() {
        if (this.artistMap == null) return 0;
        return artistMap.size();
    }

    // 저장소에 곡 추가 메서드
    public void addSong(String singerName, String songName) {

        // 저장소에 가수 이름이 없는 경우 = 신규 등록
        if (!this.artistMap.containsKey(singerName)) {
            // 새로운 set을 생성해서 노래명 추가
            Set<String> set = new HashSet<>();
            set.add(songName);
            
            // 생성한 set을 이용해서 Artist 객체 생성
            Artist artist = new Artist(singerName, set);

            // Map 저장소에 데이터 추가
            this.artistMap.put(singerName, artist);
            
            System.out.printf("\n# %s님이 신규등록되었습니다.\n", singerName);

        } else { // 이미 가수가 등록 되어있는 경우
            // 가수의 노래 목록을 가져옴 
            Set<String> songList = this.artistMap.get(singerName).getSongList();

            // 노래 목록을 통해 iter 실행
            for (String song : songList) {
                // 추가하려는 노래 이름이 이미 등록되어있는 경우
                if (song.equals(songName)) {
                    System.out.printf("\n# [%s]곡은 이미 등록된 노래입니다.\n", songName);
                    return;
                }
            }
            
            // for 문을 통과하여 등록되어있지 않은 경우 -> 곡 추가
            songList.add(songName);
            System.out.printf("\n# %s님의 노래목록에 %s곡이 추가되었습니다.\n", singerName, songName);
//            System.out.println(songLists);

        }
    }

    public void searchSinger(String singerName) {
        // 저장소에 가수 이름이 없는 경우
        if (!this.artistMap.containsKey(singerName)) {
            System.out.println("\n# 해당 가수는 등록되지 않았습니다.");

        } else { // 가수 이름이 있는 경우
            Set<String> songList = this.artistMap.get(singerName).getSongList();

            System.out.printf("\n# %s님의 노래목록\n", singerName);
            System.out.println("========================");
            for (String song : songList) {
                System.out.printf("# %s\n", song);
            }

        }
    }

    public void showSingers() {
        // map의 반복문 처리
        Set<String> keys = this.artistMap.keySet();

        // 등록된 가수의 수만큼 반복문 진행
        for (String key : keys) {
            // 해당 가수의 노래 리스트를 가져옴
            Set<String> songList = this.artistMap.get(key).getSongList();
            
            // 노래의 개수만큼 반복문 진행
            int n = 0;
            for (String s : songList) {
                n++;
            }
            System.out.printf("# %s - 총 %d곡\n", key, n);
        }

    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ArtistRepository that)) return false;
        return Objects.equals(artistMap, that.artistMap);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(artistMap);
    }

}
