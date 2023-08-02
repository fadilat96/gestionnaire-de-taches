package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Metier.*;

public final class executerDevinette_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/prepare_session.jspf");
    _jspx_dependants.add("/WEB-INF/formulaire.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

    Devinette devinetteInstance =(Devinette)session.getAttribute("devinette");
    if (devinetteInstance==null){
    devinetteInstance=new Devinette();
    session.setAttribute("devinette",devinetteInstance);
    }    
    
      out.write("\n");
      out.write("        ");
String UC;
        
        if (request.getParameter("submit")==null){
            UC="UC_NEWGAME";
        }
        else UC="UC_NEWTRIAL";
            
if (UC.equals("UC_NEWGAME")){
      out.write('\n');
      out.write("<form action=\"executerDevinette.jsp\">\n");
      out.write("    Nombre a essayer: \n");
      out.write("    <input type=\"text\" name=\"nombre\" value=\"\" /><br>\n");
      out.write("    <input type=\"submit\" name=\"submit\" value=\"Essayer\" />\n");
      out.write("</form>");
      out.write("    \n");
      out.write("    \n");
}

if (UC.equals("UC_NEWTRIAL")){    
int nombre = Integer.parseInt(request.getParameter("nombre"));
int etatJeu=devinetteInstance.jouerNombre(nombre);
switch (etatJeu){
    case Devinette.GREATER:
      out.write("\n");
      out.write("    <h3>Incorrecte, essayer un nombre inferieur</h3>\n");
      out.write("    <h3>Nombre d'essais: ");
      out.print(devinetteInstance.getCompteurEssais());
      out.write("</h3>\n");
      out.write("<form action=\"executerDevinette.jsp\">\n");
      out.write("    Nombre a essayer: \n");
      out.write("    <input type=\"text\" name=\"nombre\" value=\"\" /><br>\n");
      out.write("    <input type=\"submit\" name=\"submit\" value=\"Essayer\" />\n");
      out.write("</form>");
      out.write("       \n");
      out.write("       ");
 break;
    case Devinette.INFERIOR:
      out.write("\n");
      out.write("        <h3>Incorrecte, essayer un nombre superieur</h3>\n");
      out.write("    <h3>Nombre d'essais :");
      out.print(devinetteInstance.getCompteurEssais());
      out.write("</h3>\n");
      out.write("<form action=\"executerDevinette.jsp\">\n");
      out.write("    Nombre a essayer: \n");
      out.write("    <input type=\"text\" name=\"nombre\" value=\"\" /><br>\n");
      out.write("    <input type=\"submit\" name=\"submit\" value=\"Essayer\" />\n");
      out.write("</form>");
      out.write("       \n");
      out.write("       ");
 break;
           
    case Devinette.EQUAL:
      out.write("\n");
      out.write("     <h3>Bravo, vous avez gagne</h3>\n");
      out.write("    <h3>Nombre d'essais: ");
      out.print(devinetteInstance.getCompteurEssais());
      out.write("</h3>\n");
      out.write("    <h3><a href=\"executerDevinette.jsp\">relancer le jeu</a>  </h3> \n");
      out.write("    ");
 
       session.invalidate();
       break;       
}
    
}


      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
