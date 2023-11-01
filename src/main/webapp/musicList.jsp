<%@ page import="java.util.List" %>
<%@ page import="uk.ac.ucl.model.Playlist" %>
<%@ page import="uk.ac.ucl.model.Music" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <jsp:include page="/meta.jsp"/>
    <title>Playlist Music App</title>
</head>
<body>
<jsp:include page="/header.jsp"/>
<div class="main">
    <%
        Playlist playlist1 = (Playlist) request.getAttribute("playlist");
    %>
    <h2><%=playlist1.getPlaylistName()%></h2>
    <table class="table table-hover table-dark">
        <thead>
        <tr>
            <th scope="col">Name</th>
            <th scope="col">Artist</th>
            <th scope="col">Album</th>
            <th scope="col">Genre</th>
            <th scope="col">Year</th>
            <th scope="col">Music Link</th>
            <th scope="col">Edit</th>
            <th scope="col">Remove</th>
        </tr>
        </thead>
        <%
            for (Music music : playlist1.getPlaylist())
            {
        %>
        <tbody>
        <tr>
            <td><%=music.getMusicName()%></td>
            <td><%=music.getMusicArtist()%></td>
            <td><%=music.getAlbumName()%></td>
            <td><%=music.getMusicGenre()%></td>
            <td><%=music.getYearAdded()%></td>
            <td><a href="<%=music.getMusicPath()%>" target="_blank" rel="noopener noreferrer">Link</a></td>
            <td><form method="get" action="editMusic.html">
                <input type="hidden" name="playlistid" value="<%=playlist1.getPlaylistId()%>">
                <input type="hidden" name="musicname" value="<%=music.getMusicName()%>">
                <input type="submit" value="Edit">
            </form></td>
            <td><form method="POST" action="removeMusic.html">
                <input type="hidden" name="playlistid" value="<%=playlist1.getPlaylistId()%>">
                <input type="hidden" name="musicid" value="<%=music.getMusicId()%>">
                <input type="submit" value="Remove">
            </form></td>
        </tbody>
        <% } %>
    </table>
    <form method="get" action="addMusic.html">
        <input type="hidden" name="playlistid" value="<%=playlist1.getPlaylistId()%>">
        <input type="submit" name="addMusic" value="Add Music">
    </form>
</div>
<jsp:include page="/footer.jsp"/>
</body>
</html>
