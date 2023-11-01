package uk.ac.ucl.model;

import java.util.Date;

public class Music {
    private Integer musicId;
    private String musicName;
    private String musicArtist;
    private String musicGenre;
    private String albumName;
    private Integer yearAdded;
    private String musicPath;

    public Music(Integer musicId, String musicName, String musicArtist, String musicGenre, String albumName, Integer yearAdded, String musicPath)
    {
        this.musicId = musicId;
        this.musicName = musicName;
        this.musicArtist = musicArtist;
        this.musicGenre = musicGenre;
        this.albumName = albumName;
        this.yearAdded = yearAdded;
        this.musicPath = musicPath;
    }

    public Integer getMusicId() { return musicId; }
    public String getMusicName() { return musicName; }
    public String getMusicArtist() { return musicArtist; }
    public String getMusicGenre() { return musicGenre; }
    public String getAlbumName() { return albumName; }
    public Integer getYearAdded() { return yearAdded; }
    public String getMusicPath() { return musicPath; }

    public void setMusicId(Integer musicId) { this.musicId = musicId; }
    public void setMusicName(String musicName) { this.musicName = musicName; }
    public void setMusicArtist(String musicArtist) { this.musicArtist = musicArtist; }
    public void setMusicGenre(String musicGenre) { this.musicGenre = musicGenre; }
    public void setAlbumName(String albumName) { this.albumName = albumName; }
    public void setYearAdded(Integer yearAdded) { this.yearAdded = yearAdded; }
    public void setMusicPath(String musicPath) { this.musicPath = musicPath; }
}
