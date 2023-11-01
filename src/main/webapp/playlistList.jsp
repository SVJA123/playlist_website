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
  <h2>Playlists:</h2>
    <div class="row row-cols-1 row-cols-md-3" style="margin: 10px 10px 10px 10px;">
    <%
      List<String> playlists = (List<String>) request.getAttribute("playlistNames");
      List<Integer> ids = (List<Integer>) request.getAttribute("playlistIds");
      List<String> descriptions = (List<String>) request.getAttribute("playlistDescriptions");
      for (int i = 0; i < playlists.size(); i++)
      {
        %>
        <div class="col mb-4">
            <div class="card text-white bg-dark mb-3">
                <div class="card-body">
                    <h4 class="card-title"><%=playlists.get(i)%></h4>
                    <p class="card-text"><%=descriptions.get(i)%></p>
                    <div style="float: left;">
                        <form method="post" action="viewMusic.html">
                            <input type="hidden" name="playlistid" value="<%=ids.get(i)%>">
                            <input type="submit" value="View Music">
                        </form>
                    </div>
                    <div style="float: left;">
                        <form method="get" action="editPlaylist.html">
                            <input type="hidden" name="playlistid" value="<%=ids.get(i)%>">
                            <input type="submit" value="Edit">
                        </form>
                    </div>
                    <div style="float: left;">
                        <form method="post" action="removePlaylist.html">
                            <input type="hidden" name="playlistid" value="<%=ids.get(i)%>">
                            <input type="submit" value="Remove">
                        </form>
                    </div>
                </div>
            </div>
        </div>
    <% } %>
    </div>
    <form method="get" action="addPlaylist.html">
        <input type="submit" name="addMusic" value="Add Playlist">
    </form>
<jsp:include page="/footer.jsp"/>
</body>
</html>
