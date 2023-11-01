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
  <form method="POST" action="./addPlaylist.html">
    <div class="form-group row">
      <label for="title" class="col-sm-2 col-form-label">Playlist Name</label>
      <div class="col-sm-10">
        <input type="text" id="title" class="form-control" name="playlisttitle" placeholder="Enter playlist name here"/>
      </div>
    </div>
    <div class="form-group row">
      <label for="desc" class="col-sm-2 col-form-label">Playlist Description</label>
      <div class="col-sm-10">
        <input type="text" id="desc" class="form-control" name="playlistdesc" placeholder="Enter playlist description here"/>
      </div>
    </div>
    <input type="submit" value="Add"/>
  </form>
</div>
<jsp:include page="/footer.jsp"/>
</body>
</html>
