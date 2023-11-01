package uk.ac.ucl.servlets;

import org.apache.coyote.Response;
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
import java.io.File;
import java.io.IOException;
import java.util.List;

// The servlet invoked to display a list of patients. Note that this data is just example data,
// you replace it with your data.
// The url http://localhost:8080/patientList.html is mapped to calling doGet on the servlet object.
// The servlet object is created automatically, you just provide the class.
@WebServlet("/addPlaylist.html")
public class AddPlaylists extends HttpServlet
{

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
    // Get the data from the model
    // Invoke the JSP.
    // A JSP page is actually converted into a Java class, so behind the scenes everything is Java.
    ServletContext context = getServletContext();
    RequestDispatcher dispatch = context.getRequestDispatcher("/addPlaylist.jsp");
    dispatch.forward(request, response);
  }


  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
    // Get the data from the model
    Model model = ModelFactory.getModel();
    String title = request.getParameter("playlisttitle");
    String desc = request.getParameter("playlistdesc");
    model.createPlaylist(title, desc);
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
