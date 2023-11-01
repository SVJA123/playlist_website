<%@ page import="uk.ac.ucl.model.Music" %>
<%@ page import="uk.ac.ucl.model.Playlist" %>
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
        Playlist playlist = (Playlist) request.getAttribute("playlist");
    %>
    <form method="POST" action="./editPlaylist.html">
        <div class="form-group row">
            <label for="n" class="col-sm-2 col-form-label">Playlist Name</label>
            <div class="col-sm-10">
                <input type="text" name="name" class="form-control" id="n" value="<%=playlist.getPlaylistName()%>">
            </div>
        </div>
        <div class="form-group row">
            <label for="d" class="col-sm-2 col-form-label">Playlist Description</label>
            <div class="col-sm-10">
                <input type="text" name="desc" class="form-control" id="d" value="<%=playlist.getPlaylistDescription()%>">
            </div>
        </div>
        <input type="hidden" name="playlistid" value="<%=playlist.getPlaylistId()%>"/>
        <input type="submit" value="Edit"/>
    </form>
</div>
<jsp:include page="/footer.jsp"/>
</body>
</html>
