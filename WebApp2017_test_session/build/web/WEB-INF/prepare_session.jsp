<%@page session="true" import="Metier.*" %>
<%
    Facture f =(Facture)session.getAttribute("mafacture");
    if (f==null){
    f=new Facture();
    session.setAttribute("mafacture",f);
    }    
    %>
