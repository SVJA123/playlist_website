package uk.ac.ucl.servlets;

import uk.ac.ucl.model.Model;
import uk.ac.ucl.model.ModelFactory;
import uk.ac.ucl.model.Playlist;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// The servlet invoked to perform a search.
// The url http://localhost:8080/runsearch.html is mapped to calling doPost on the servlet object.
// The servlet object is created automatically, you just provide the class.
@WebServlet("/runsearch.html")
public class SearchServlet extends HttpServlet
{
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
    // Use the model to do the search and put the results into the request object sent to the
    // Java Server Page used to display the results.
    Model model = ModelFactory.getModel();
    String actions = request.getParameter("action");
    String search = request.getParameter("searchstring");
    ArrayList<ArrayList<String>> searchPlaylist = new ArrayList<>();
    ArrayList<ArrayList<String>> searchMusic = new ArrayList<>();
    ArrayList<Playlist> playlistsP = new ArrayList<>();
    ArrayList<Playlist> playlistsM = new ArrayList<>();
    if (actions.equals("Search Playlist"))
    {
      searchPlaylist = model.searchPlaylistsByName(search);
    }
    else if (actions.equals("Search Music"))
    {
      searchMusic = model.searchPlaylistsByMusic(search);
    }
    else
    {
        searchPlaylist = model.searchPlaylistsByName(search);
        searchMusic = model.searchPlaylistsByMusic(search);
    }
    for (ArrayList<String> playlist : searchPlaylist)
    {
      playlistsP.add(model.getPlaylist(Integer.parseInt(playlist.get(1))));
    }
    for (ArrayList<String> music : searchMusic)
    {
      playlistsM.add(model.getPlaylist(Integer.parseInt(music.get(1))));
    }
    request.setAttribute("playlist", searchPlaylist);
    request.setAttribute("music", searchMusic);
    request.setAttribute("playlistsP", playlistsP);
    request.setAttribute("playlistsM", playlistsM);
    // Invoke the JSP page.
    ServletContext context = getServletContext();
    RequestDispatcher dispatch = context.getRequestDispatcher("/searchResult.jsp");
    dispatch.forward(request, response);
  }
}
