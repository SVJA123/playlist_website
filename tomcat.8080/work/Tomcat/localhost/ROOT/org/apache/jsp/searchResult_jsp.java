/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.45
 * Generated at: 2023-03-27 14:48:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import uk.ac.ucl.model.Playlist;
import uk.ac.ucl.model.Music;

public final class searchResult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("uk.ac.ucl.model.Playlist");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("uk.ac.ucl.model.Music");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/meta.jsp", out, false);
      out.write("\n");
      out.write("    <title>Music Playlist App</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/header.jsp", out, false);
      out.write("\n");
      out.write("<div class=\"main\">\n");
      out.write("  <h2>Search Result</h2>\n");
      out.write("  ");

    ArrayList<ArrayList<String>> Playlist = (ArrayList<ArrayList<String>>) request.getAttribute("playlist");
    ArrayList<ArrayList<String>> Music = (ArrayList<ArrayList<String>>) request.getAttribute("music");
    ArrayList<Playlist> p = (ArrayList<Playlist>) request.getAttribute("playlistsP");
    ArrayList<Playlist> m = (ArrayList<Playlist>) request.getAttribute("playlistsM");
    if (Playlist.size() !=0 && Music.size() !=0)
    {
      
      out.write("\n");
      out.write("      <h3>Playlist</h3>\n");
      out.write("      <div class=\"row row-cols-1 row-cols-md-3\" style=\"margin: 10px 10px 10px 10px;\">\n");
      out.write("        ");
 for (int i = 0; i < Playlist.size(); i++) { 
      out.write("\n");
      out.write("        ");
Playlist playlist1 = p.get(i);
      out.write("\n");
      out.write("        <div class=\"col mb-4\">\n");
      out.write("          <div class=\"card text-white bg-dark mb-3\">\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("              <h4 class=\"card-title\">");
      out.print((Playlist.get(i)).get(0));
      out.write("</h4>\n");
      out.write("              <p class=\"card-text\">");
      out.print(playlist1.getPlaylistDescription());
      out.write("</p>\n");
      out.write("              <div style=\"float: left;\">\n");
      out.write("                <form method=\"post\" action=\"viewMusic.html\">\n");
      out.write("                  <input type=\"hidden\" name=\"playlistid\" value=\"");
      out.print((Playlist.get(i)).get(1));
      out.write("\">\n");
      out.write("                  <input type=\"submit\" value=\"View Music\">\n");
      out.write("                </form>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <h3>Music</h3>\n");
      out.write("        <table class=\"table table-hover table-dark\">\n");
      out.write("          <thead>\n");
      out.write("            <tr>\n");
      out.write("              <th scope=\"col\">Playlist</th>\n");
      out.write("              <th scope=\"col\">Name</th>\n");
      out.write("              <th scope=\"col\">Artist</th>\n");
      out.write("              <th scope=\"col\">Album</th>\n");
      out.write("              <th scope=\"col\">Genre</th>\n");
      out.write("              <th scope=\"col\">Year</th>\n");
      out.write("              <th scope=\"col\">Music Link</th>\n");
      out.write("              <th scope=\"col\">View</th>\n");
      out.write("            </tr>\n");
      out.write("          </thead>\n");
      out.write("          ");
 for (int i = 0; i < Music.size(); i++) { 
      out.write("\n");
      out.write("          ");
Playlist playlist1 = m.get(i);
      out.write("\n");
      out.write("          ");
Integer id = Integer.parseInt(Music.get(i).get(2));
      out.write("\n");
      out.write("          ");
Music music1 = playlist1.getMusicById(id);
      out.write("\n");
      out.write("          <tbody>\n");
      out.write("          <tr>\n");
      out.write("            <td>");
      out.print(playlist1.getPlaylistName());
      out.write("</td>\n");
      out.write("            <td>");
      out.print((Music.get(i)).get(0));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(music1.getMusicArtist());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(music1.getAlbumName());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(music1.getMusicGenre());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(music1.getYearAdded());
      out.write("</td>\n");
      out.write("            <td><a href=\"");
      out.print(music1.getMusicPath());
      out.write("\" target=\"_blank\" rel=\"noopener noreferrer\">Link</a></td>\n");
      out.write("            <td>\n");
      out.write("              <form method=\"post\" action=\"viewMusic.html\">\n");
      out.write("                <input type=\"hidden\" name=\"playlistid\" value=\"");
      out.print((Music.get(i)).get(1));
      out.write("\">\n");
      out.write("                <input type=\"submit\" value=\"View Playlist\">\n");
      out.write("              </form>\n");
      out.write("            </td>\n");
      out.write("          </tr>\n");
      out.write("          </tbody>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </table>\n");
      out.write("    ");
 }
    else if (Music.size() != 0){ 
      out.write("\n");
      out.write("    <h3>Music</h3>\n");
      out.write("          <table class=\"table table-hover table-dark\">\n");
      out.write("            <thead>\n");
      out.write("            <tr>\n");
      out.write("              <th scope=\"col\">Playlist</th>\n");
      out.write("              <th scope=\"col\">Name</th>\n");
      out.write("              <th scope=\"col\">Artist</th>\n");
      out.write("              <th scope=\"col\">Album</th>\n");
      out.write("              <th scope=\"col\">Genre</th>\n");
      out.write("              <th scope=\"col\">Year</th>\n");
      out.write("              <th scope=\"col\">Music Link</th>\n");
      out.write("              <th scope=\"col\">View</th>\n");
      out.write("            </tr>\n");
      out.write("            </thead>\n");
      out.write("              ");
 for (int i = 0; i < Music.size(); i++) { 
      out.write("\n");
      out.write("              ");
Playlist playlist1 = m.get(i);
      out.write("\n");
      out.write("              ");
Integer id = Integer.parseInt(Music.get(i).get(2));
      out.write("\n");
      out.write("              ");
Music music1 = playlist1.getMusicById(id);
      out.write("\n");
      out.write("            <tbody>\n");
      out.write("            <tr>\n");
      out.write("              <td>");
      out.print(playlist1.getPlaylistName());
      out.write("</td>\n");
      out.write("              <td>");
      out.print((Music.get(i)).get(0));
      out.write("</td>\n");
      out.write("              <td>");
      out.print(music1.getMusicArtist());
      out.write("</td>\n");
      out.write("              <td>");
      out.print(music1.getAlbumName());
      out.write("</td>\n");
      out.write("              <td>");
      out.print(music1.getMusicGenre());
      out.write("</td>\n");
      out.write("              <td>");
      out.print(music1.getYearAdded());
      out.write("</td>\n");
      out.write("              <td><a href=\"");
      out.print(music1.getMusicPath());
      out.write("\" target=\"_blank\" rel=\"noopener noreferrer\">Link</a></td>\n");
      out.write("              <td>\n");
      out.write("                <form method=\"post\" action=\"viewMusic.html\">\n");
      out.write("                  <input type=\"hidden\" name=\"playlistid\" value=\"");
      out.print((Music.get(i)).get(1));
      out.write("\">\n");
      out.write("                  <input type=\"submit\" value=\"View Playlist\">\n");
      out.write("                </form>\n");
      out.write("              </td>\n");
      out.write("            </tr>\n");
      out.write("            </tbody>\n");
      out.write("              ");
 } 
      out.write("\n");
      out.write("          </table>\n");
      out.write("    ");
 }
    else if (Playlist.size() != 0){ 
      out.write("\n");
      out.write("    <h3>Playlist</h3>\n");
      out.write("      <ul>\n");
      out.write("        <div class=\"row row-cols-1 row-cols-md-3\" style=\"margin: 10px 10px 10px 10px;\">\n");
      out.write("          ");
 for (int i = 0; i < Playlist.size(); i++) { 
      out.write("\n");
      out.write("          ");
Playlist playlist1 = p.get(i);
      out.write("\n");
      out.write("          <div class=\"col mb-4\">\n");
      out.write("            <div class=\"card text-white bg-dark mb-3\">\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <h4 class=\"card-title\">");
      out.print((Playlist.get(i)).get(0));
      out.write("</h4>\n");
      out.write("                <p class=\"card-text\">");
      out.print(playlist1.getPlaylistDescription());
      out.write("</p>\n");
      out.write("                <div style=\"float: left;\">\n");
      out.write("                  <form method=\"post\" action=\"viewMusic.html\">\n");
      out.write("                    <input type=\"hidden\" name=\"playlistid\" value=\"");
      out.print((Playlist.get(i)).get(1));
      out.write("\">\n");
      out.write("                    <input type=\"submit\" value=\"View Music\">\n");
      out.write("                  </form>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          ");
 } 
      out.write("\n");
      out.write("        </div>\n");
      out.write("    ");
 }
    else { 
      out.write("\n");
      out.write("      <h3>Not Found</h3>\n");
      out.write("    ");
 }

    
      out.write("\n");
      out.write("</div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/footer.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
