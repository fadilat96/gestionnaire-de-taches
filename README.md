# gestionnaire-de-taches
# JSP Page Attributes, 'include' Directive

## Exercise 1

Write a JSP page that displays a visit counter using a page attribute.
Can we achieve the same counter using a local page variable? Justify.

## Exercise 2

Deduce the processing performed by this page by analyzing multiple consecutive executions.

```jsp
<% int x=0,y=0;
if (request.getParameter("envoyer")!=null){
    int val = Integer.parseInt(request.getParameter("val"));
    x = Integer.parseInt(request.getParameter("x"));
    y = Integer.parseInt(request.getParameter("y"));
    if (val==x) y++;
    else y=1;
    x=val;
} %>
<h1><%=y%></h1>
<form id="form1" name="form1" method="post" action="/page.jsp">
    <input name="val" type="text"/>
    <input type="hidden" name="x" value="<%=x%>"/>
    <input type="hidden" name="y" value="<%=y%>"/>
    <input type="submit" name="envoyer" value="envoyer" />
</form>
```
## Exercise 3

We want to implement an authentication mechanism in a JSP page. On the first display of the page, it shows a form (using the 'include' directive) allowing the user to enter a username and password. The user enters these two values and submits them to the page, which verifies them. If they are correct, a welcome message is displayed; otherwise, the page returns the authentication form for the user to try again.

What are the consequences of using a page attribute as an identification mechanism on a multi-user and multi-page website?
Add a mechanism to the page that limits the number of incorrect attempts to 3, then displays an error message and disallows further attempts.
Note: Normally, user credentials are stored in a database, but for simplicity, they are considered as constants in the JSP page.
