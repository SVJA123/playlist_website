package uk.ac.ucl.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Model
{
  private List<Playlist> Playlists;

  public Model()
  {
    // Initialise the data structure to store the data.
    this.Playlists = new ArrayList<Playlist>();
  }

  // Read the json file
  public void readFile(File file)
  {
    try {
      Gson gson = new GsonBuilder()
              .setPrettyPrinting()
              .create();
      FileReader reader = new FileReader(file);
      Type PlaylistType = new TypeToken<ArrayList<Playlist>>(){}.getType();
      Playlists = gson.fromJson(reader, PlaylistType);
      for (Playlist playlist : Playlists)
      {
        // Can be deleted if wanted
        System.out.println(playlist.getPlaylistName());
      }
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }
  }

  // Write to the json file

  public void writeToFile(File file)
  {
    Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();
    try (FileWriter writer = new FileWriter(file)) {
      gson.toJson(Playlists, writer);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  // Create a new playlist
  public void createPlaylist(String playlistName, String playlistDescription)
  {
    List<Music> playlist = new ArrayList<Music>();
    Integer id = Playlists.size() + 1;
    Playlists.add(new Playlist(id, playlistName, playlistDescription, playlist));
  }


  // Get a playlist by id
  public Playlist getPlaylist(Integer playlistId)
  {
    for (Playlist playlist : Playlists)
    {
      if (playlist.getPlaylistId().equals(playlistId))
      {
        return playlist;
      }
    }
    return null;
  }


  // Update the list of playlist
  public void updatePlaylist(Integer playlistId, Playlist playlist)
  {
    for (Playlist playlist1 : Playlists)
    {
      if (playlist1.getPlaylistId().equals(playlistId))
      {
        Playlists.set(playlistId - 1, playlist);
        break;
      }
    }
  }

  // Update the playlist id
  public void updatePlaylistId()
  {
    for(Playlist playlist : Playlists)
    {
      playlist.setPlaylistId(Playlists.indexOf(playlist) + 1);
    }
  }

  // remove a playlist
  public void removePlaylist(Integer playlistId)
  {
    for (Playlist playlist : Playlists)
    {
      if (playlist.getPlaylistId().equals(playlistId))
      {
        Playlists.remove(playlist);
        break;
      }
    }
  }


    // Get the list of playlist names
  public ArrayList<String> getPlaylistNames()
  {
    ArrayList<String> names = new ArrayList<String>();
    for (Playlist playlist : Playlists)
    {
      names.add(playlist.getPlaylistName());
    }
    return names;
  }

  // Get the list of playlist ids
  public ArrayList<Integer> getPlaylistIds()
  {
    ArrayList<Integer> ids = new ArrayList<Integer>();
    for (Playlist playlist : Playlists)
    {
      ids.add(playlist.getPlaylistId());
    }
    return ids;
  }

  // Get the list of playlist descriptions
  public ArrayList<String> getPlaylistDescriptions()
  {
    ArrayList<String> descriptions = new ArrayList<String>();
    for (Playlist playlist : Playlists)
    {
      descriptions.add(playlist.getPlaylistDescription());
    }
    return descriptions;
  }

  // Search for a playlist by name
  public ArrayList<ArrayList<String>> searchPlaylistsByName(String playlistName)
  {
    ArrayList<ArrayList<String>> lst = new ArrayList<ArrayList<String>>();
    for (Playlist playlist : Playlists)
    {
      ArrayList<String> names = new ArrayList<String>();
      if (((playlist.getPlaylistName()).toLowerCase()).contains(playlistName.toLowerCase()))
      {
        names.add(playlist.getPlaylistName());
        names.add(Integer.toString(playlist.getPlaylistId()));
        lst.add(names);
      }
    }
    return lst;
  }

    // Search for a playlist by music
  public ArrayList<ArrayList<String>> searchPlaylistsByMusic(String musicName)
  {
    ArrayList<ArrayList<String>> lst = new ArrayList<ArrayList<String>>();
    for (Playlist playlist : Playlists)
    {
      ArrayList<String> names = new ArrayList<String>();
      for (Music music : playlist.getPlaylist())
      {
        if (((music.getMusicName()).toLowerCase()).contains(musicName.toLowerCase()))
        {
          names.add(music.getMusicName());
          names.add(Integer.toString(playlist.getPlaylistId()));
          names.add(Integer.toString(music.getMusicId()));
          lst.add(names);
        }
      }
    }
    return lst;
  }


}
