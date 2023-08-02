<%-- 
    Document   : page1
    Created on : Apr 20, 2017, 1:17:50 PM
    Author     : hlayh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>page1</h1>
        <%@include file="WEB-INF/prepare_session.jsp"%>
        @session:<%=session%><br>
        @facture:<%=f%>
    </body>
</html>
