<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <jsp:include page="/meta.jsp"/>
  <title>Playlist Music App</title>
</head>
<body>
<jsp:include page="/header.jsp"/>
<div class="main">
  <form method="POST" action="./addMusic.html">
    <div class="form-row">
      <div class="form-group col-md-6">
        <label for="name">Music name:</label>
        <input type="text" id="name" class="form-control" name="musicname" placeholder="Enter music title here"/>
      </div>
      <div class="form-group col-md-6">
        <label for="artist">Music artist:</label>
        <input type="text" id="artist" class="form-control" name="musicartist" placeholder="Enter music artist here"/>
      </div>
    </div>
    <div class="form-group">
      <label for="album">Music album:</label>
      <input type="text" id="album" class="form-control" name="musicalbum" placeholder="Enter music album name here"/>
    </div>
    <div class="form-row">
      <div class="form-group col-md-6">
        <label for="genre">Music genre:</label>
        <input type="text" id="genre" class="form-control" name="musicgenre" placeholder="Enter music genre here"/>
      </div>
      <div class="form-group col-md-6">
        <label for="year">Music year:</label>
        <input type="number" id="year" class="form-control" name="musicyear" placeholder="Enter music year here"/>
      </div>
    </div>
    <div class="form-group">
      <label for="link">Music link:</label>
      <input type="text" id="link" class="form-control" name="musiclink" placeholder="https://open.spotify.com/"/>
    </div>
    <input type="hidden" name="playlistid" value="<%=(String) request.getAttribute("playlistids")%>"/>
    <input type="submit" value="Add"/>
  </form>
</div>
<jsp:include page="/footer.jsp"/>
</body>
</html>
