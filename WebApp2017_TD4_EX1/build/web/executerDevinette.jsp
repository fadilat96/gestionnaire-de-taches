<%-- 
    Document   : executerDevinette
    Created on : Apr 26, 2017, 3:44:39 PM
    Author     : hlayh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" session="true" import="Metier.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="/WEB-INF/prepare_session.jspf" %>
        <%String UC;
        
        if (request.getParameter("submit")==null){
            UC="UC_NEWGAME";
        }
        else UC="UC_NEWTRIAL";
            
if (UC.equals("UC_NEWGAME")){%>
<%@include file="/WEB-INF/formulaire.jspf"%>    
    
<%}

if (UC.equals("UC_NEWTRIAL")){    
int nombre = Integer.parseInt(request.getParameter("nombre"));
int etatJeu=devinetteInstance.jouerNombre(nombre);
switch (etatJeu){
    case Devinette.GREATER:%>
    <h3>Incorrecte, essayer un nombre inferieur</h3>
    <h3>Nombre d'essais: <%=devinetteInstance.getCompteurEssais()%></h3>
<%@include file="/WEB-INF/formulaire.jspf"%>       
       <% break;
    case Devinette.INFERIOR:%>
        <h3>Incorrecte, essayer un nombre superieur</h3>
    <h3>Nombre d'essais :<%=devinetteInstance.getCompteurEssais()%></h3>
<%@include file="/WEB-INF/formulaire.jspf"%>       
       <% break;
           
    case Devinette.EQUAL:%>
     <h3>Bravo, vous avez gagne</h3>
    <h3>Nombre d'essais: <%=devinetteInstance.getCompteurEssais()%></h3>
    <h3><a href="executerDevinette.jsp">relancer le jeu</a>  </h3> 
    <% 
       session.invalidate();
       break;       
}
    
}

%>        
        
    </body>
</html>
