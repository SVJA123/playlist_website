package uk.ac.ucl.servlets;

import uk.ac.ucl.model.Model;
import uk.ac.ucl.model.ModelFactory;
import uk.ac.ucl.model.Music;
import uk.ac.ucl.model.Playlist;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

// The servlet invoked to display a list of patients. Note that this data is just example data,
// you replace it with your data.
// The url http://localhost:8080/patientList.html is mapped to calling doGet on the servlet object.
// The servlet object is created automatically, you just provide the class.

@WebServlet("/editMusic.html")
public class EditMusic extends HttpServlet
{
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
    // Get the data from the model
    // Invoke the JSP.
    // A JSP page is actually converted into a Java class, so behind the scenes everything is Java.
    Model model = ModelFactory.getModel();
    String id = request.getParameter("playlistid");
    String musicName = request.getParameter("musicname");
    Integer idInt;
    try {
      idInt = Integer.parseInt(id);
    } catch (NumberFormatException e) {
      idInt = 0;
    }
    Playlist playlist = model.getPlaylist(idInt);
    Music music = playlist.getMusicByName(musicName);
    request.setAttribute("playlistnames", id);
    request.setAttribute("music1", music);
    ServletContext context = getServletContext();
    RequestDispatcher dispatch = context.getRequestDispatcher("/editMusic.jsp");
    dispatch.forward(request, response);
  }
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
    // Get the data from the model
    Model model = ModelFactory.getModel();
    String name = request.getParameter("musicname");
    String artist = request.getParameter("musicartist");
    String album = request.getParameter("musicalbum");
    String genre = request.getParameter("musicgenre");
    String year = request.getParameter("musicyear");
    String link = request.getParameter("musiclink");
    String pid = request.getParameter("playlistid");
    String id = request.getParameter("musicid");
    Integer yearInt;
    Integer idInt;
    Integer pidInt;
    try {
      yearInt = Integer.parseInt(year);
      idInt = Integer.parseInt(id);
        pidInt = Integer.parseInt(pid);
    } catch (NumberFormatException e) {
      yearInt = 0;
      idInt = 0;
        pidInt = 0;
    }
    Playlist playlist1 = model.getPlaylist(pidInt);
    playlist1.updateMusic(idInt, name, artist, genre, album, yearInt, link);
    model.updatePlaylist(playlist1.getPlaylistId(), playlist1);
    model.writeToFile(new File("./data/playlists.json"));
    // Then add the data to the request object that will be sent to the Java Server Page, so that
    // the JSP can access the data (a Java data structure).

    // Invoke the JSP.
    // A JSP page is actually converted into a Java class, so behind the scenes everything is Java.
//    ServletContext context = getServletContext();
    ServletContext context = getServletContext();
    RequestDispatcher dispatch = context.getRequestDispatcher("/index.html");
    dispatch.forward(request, response);
  }
}
