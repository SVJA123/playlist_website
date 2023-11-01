package uk.ac.ucl.model;

import java.util.List;
import java.util.Objects;

public class Playlist {

    private Integer playlistId;
    private String playlistName;
    private String playlistDescription;
    private List<Music> playlist;

    public Playlist(Integer playlistId, String playlistName, String playlistDescription, List<Music> playlist)
    {
        this.playlistId = playlistId;
        this.playlistName = playlistName;
        this.playlistDescription = playlistDescription;
        this.playlist = playlist;
    }
    public String getPlaylistName() { return playlistName; }
    public String getPlaylistDescription() { return playlistDescription; }
    public List<Music> getPlaylist() { return playlist; }
    public Integer getPlaylistId() { return playlistId; }
    public void setPlaylistId(Integer playlistId) { this.playlistId = playlistId; }
    public void setPlaylistName(String playlistName) { this.playlistName = playlistName; }
    public void setPlaylistDescription(String playlistDescription) { this.playlistDescription = playlistDescription; }
    public void addMusic(String musicName, String musicArtist, String musicGenre, String albumName, Integer yearAdded, String musicPath)
    {
        int musicId = playlist.size() + 1;
        playlist.add(new Music(musicId, musicName, musicArtist, musicGenre, albumName, yearAdded, musicPath));
    }

    public void updateMusic(Integer id, String newName, String musicArtist, String musicGenre, String albumName, Integer yearAdded, String musicPath)
    {
        for (Music music : playlist)
        {
            if (music.getMusicId() == id)
            {
                music.setMusicName(newName);
                music.setMusicArtist(musicArtist);
                music.setMusicGenre(musicGenre);
                music.setAlbumName(albumName);
                music.setYearAdded(yearAdded);
                music.setMusicPath(musicPath);
            }
        }
    }

    public Music getMusicByName(String musicName)
    {
        for (Music music : playlist)
        {
            if (music.getMusicName().equals(musicName))
            {
                return music;
            }
        }
        return null;
    }

    public Music getMusicById(Integer id)
    {
        for (Music music : playlist)
        {
            if (music.getMusicId() == id)
            {
                return music;
            }
        }
        return null;
    }

    public void updateMusicId()
    {
        int i = 1;
        for (Music music : playlist)
        {
            music.setMusicId(i);
            i++;
        }
    }

    public void removeMusicById(Integer id)
    {
        for (Music music : playlist)
        {
            if (music.getMusicId() == id)
            {
                playlist.remove(music);
                break;
            }
        }
    }

}
