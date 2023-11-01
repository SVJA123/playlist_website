<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="uk.ac.ucl.model.Playlist" %>
<%@ page import="uk.ac.ucl.model.Music" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <jsp:include page="/meta.jsp"/>
    <title>Music Playlist App</title>
</head>
<body>
<jsp:include page="/header.jsp"/>
<div class="main">
  <h2>Search Result</h2>
  <%
    ArrayList<ArrayList<String>> Playlist = (ArrayList<ArrayList<String>>) request.getAttribute("playlist");
    ArrayList<ArrayList<String>> Music = (ArrayList<ArrayList<String>>) request.getAttribute("music");
    ArrayList<Playlist> p = (ArrayList<Playlist>) request.getAttribute("playlistsP");
    ArrayList<Playlist> m = (ArrayList<Playlist>) request.getAttribute("playlistsM");
    if (Playlist.size() !=0 && Music.size() !=0)
    {
      %>
      <h3>Playlist</h3>
      <div class="row row-cols-1 row-cols-md-3" style="margin: 10px 10px 10px 10px;">
        <% for (int i = 0; i < Playlist.size(); i++) { %>
        <%Playlist playlist1 = p.get(i);%>
        <div class="col mb-4">
          <div class="card text-white bg-dark mb-3">
            <div class="card-body">
              <h4 class="card-title"><%=(Playlist.get(i)).get(0)%></h4>
              <p class="card-text"><%=playlist1.getPlaylistDescription()%></p>
              <div style="float: left;">
                <form method="post" action="viewMusic.html">
                  <input type="hidden" name="playlistid" value="<%=(Playlist.get(i)).get(1)%>">
                  <input type="submit" value="View Music">
                </form>
              </div>
            </div>
          </div>
        </div>
        <% } %>
        </div>
        <h3>Music</h3>
        <table class="table table-hover table-dark">
          <thead>
            <tr>
              <th scope="col">Playlist</th>
              <th scope="col">Name</th>
              <th scope="col">Artist</th>
              <th scope="col">Album</th>
              <th scope="col">Genre</th>
              <th scope="col">Year</th>
              <th scope="col">Music Link</th>
              <th scope="col">View</th>
            </tr>
          </thead>
          <% for (int i = 0; i < Music.size(); i++) { %>
          <%Playlist playlist1 = m.get(i);%>
          <%Integer id = Integer.parseInt(Music.get(i).get(2));%>
          <%Music music1 = playlist1.getMusicById(id);%>
          <tbody>
          <tr>
            <td><%=playlist1.getPlaylistName()%></td>
            <td><%=(Music.get(i)).get(0)%></td>
            <td><%=music1.getMusicArtist()%></td>
            <td><%=music1.getAlbumName()%></td>
            <td><%=music1.getMusicGenre()%></td>
            <td><%=music1.getYearAdded()%></td>
            <td><a href="<%=music1.getMusicPath()%>" target="_blank" rel="noopener noreferrer">Link</a></td>
            <td>
              <form method="post" action="viewMusic.html">
                <input type="hidden" name="playlistid" value="<%=(Music.get(i)).get(1)%>">
                <input type="submit" value="View Playlist">
              </form>
            </td>
          </tr>
          </tbody>
            <% } %>
        </table>
    <% }
    else if (Music.size() != 0){ %>
    <h3>Music</h3>
          <table class="table table-hover table-dark">
            <thead>
            <tr>
              <th scope="col">Playlist</th>
              <th scope="col">Name</th>
              <th scope="col">Artist</th>
              <th scope="col">Album</th>
              <th scope="col">Genre</th>
              <th scope="col">Year</th>
              <th scope="col">Music Link</th>
              <th scope="col">View</th>
            </tr>
            </thead>
              <% for (int i = 0; i < Music.size(); i++) { %>
              <%Playlist playlist1 = m.get(i);%>
              <%Integer id = Integer.parseInt(Music.get(i).get(2));%>
              <%Music music1 = playlist1.getMusicById(id);%>
            <tbody>
            <tr>
              <td><%=playlist1.getPlaylistName()%></td>
              <td><%=(Music.get(i)).get(0)%></td>
              <td><%=music1.getMusicArtist()%></td>
              <td><%=music1.getAlbumName()%></td>
              <td><%=music1.getMusicGenre()%></td>
              <td><%=music1.getYearAdded()%></td>
              <td><a href="<%=music1.getMusicPath()%>" target="_blank" rel="noopener noreferrer">Link</a></td>
              <td>
                <form method="post" action="viewMusic.html">
                  <input type="hidden" name="playlistid" value="<%=(Music.get(i)).get(1)%>">
                  <input type="submit" value="View Playlist">
                </form>
              </td>
            </tr>
            </tbody>
              <% } %>
          </table>
    <% }
    else if (Playlist.size() != 0){ %>
    <h3>Playlist</h3>
      <ul>
        <div class="row row-cols-1 row-cols-md-3" style="margin: 10px 10px 10px 10px;">
          <% for (int i = 0; i < Playlist.size(); i++) { %>
          <%Playlist playlist1 = p.get(i);%>
          <div class="col mb-4">
            <div class="card text-white bg-dark mb-3">
              <div class="card-body">
                <h4 class="card-title"><%=(Playlist.get(i)).get(0)%></h4>
                <p class="card-text"><%=playlist1.getPlaylistDescription()%></p>
                <div style="float: left;">
                  <form method="post" action="viewMusic.html">
                    <input type="hidden" name="playlistid" value="<%=(Playlist.get(i)).get(1)%>">
                    <input type="submit" value="View Music">
                  </form>
                </div>
              </div>
            </div>
          </div>
          <% } %>
        </div>
    <% }
    else { %>
      <h3>Not Found</h3>
    <% }

    %>
</div>
<jsp:include page="/footer.jsp"/>
</body>
</html>