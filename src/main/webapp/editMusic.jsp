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
        Music music = (Music) request.getAttribute("music1");
    %>
    <form method="POST" action="./editMusic.html">
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="name">Song name:</label>
                <input type="text" id="name" class="form-control" name="musicname" value="<%=music.getMusicName()%>"/>
            </div>
            <div class="form-group col-md-6">
                <label for="artist">Artist name:</label>
                <input type="text" id="artist" class="form-control" name="musicartist" value="<%=music.getMusicArtist()%>"/>
            </div>
        </div>
        <div class="form-group">
            <label for="album">Album name:</label>
            <input type="text" id="album" class="form-control" name="musicalbum" value="<%=music.getAlbumName()%>"/>
        </div>
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="genre">Genre:</label>
                <input type="text" id="genre" class="form-control" name="musicgenre" value="<%=music.getMusicGenre()%>"/>
            </div>
            <div class="form-group col-md-6">
                <label for="year">Year added:</label>
                <input type="number" id="year" class="form-control" name="musicyear" value="<%=music.getYearAdded()%>"/>
            </div>
        </div>
        <div class="form-group">
            <label for="link">Link:</label>
            <input type="text" id="link" class="form-control" name="musiclink" value="<%=music.getMusicPath()%>"/>
        </div>
        <input type="hidden" name="musicid" value="<%=music.getMusicId()%>"/>
        <input type="hidden" name="playlistid" value="<%=(String) request.getAttribute("playlistnames")%>"/>
        <input type="submit" value="Edit"/>
    </form>
</div>
<jsp:include page="/footer.jsp"/>
</body>
</html>
