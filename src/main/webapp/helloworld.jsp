<%--
  Created by IntelliJ IDEA.
  User: eddbea
  Date: 08/02/2024
  Time: 7:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="dto.Personne" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Jsp page</title>
</head>
<body>
    <h1>Hello World en jsp</h1>
        <%
           int nombre=37;
            ArrayList table=new ArrayList();
            Personne travisKalanick=new Personne("Travis","Kalanick");
           if(nombre==37){

           %>
                ${sessionScope.qqchose}>
                Bonjour <%=travisKalanick.getFullName()%>
                Ce texte est affiche strictement si ma variable vaut <%=nombre%>
        <%
           }
        %>
</body>
</html>