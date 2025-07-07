package chap2_4.collection.song;

import java.util.Objects;
import java.util.Set;

public class Artist {
    private String artistName; // 가수명
    private Set<String> songList; // 노래목록

    public Artist(String artistName, Set<String> songList) {
        this.artistName = artistName;
        this.songList = songList;
    }

    public String getArtistName() {
        return artistName;
    }

    public Set<String> getSongList() {
        return songList;
    }



    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Artist artist)) return false;
        return Objects.equals(artistName, artist.artistName) && Objects.equals(songList, artist.songList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artistName, songList);
    }
}
