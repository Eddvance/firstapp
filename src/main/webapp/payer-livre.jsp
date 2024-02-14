<%--
  Created by IntelliJ IDEA.
  User: eddbea
  Date: 11/02/2024
  Time: 10:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Livre paye</title>
</head>
    <body>
        Paiement effectue avec le numero de carte suivant : <%=request.getParameter("numeroCarte")%><br/><%--Le livre paye est le livre numero : <%=session.getAttribute("identifiantLivre")%><br/>--%>
        Liste des livres payes : <br/>
        <c:forEach items="${listeLivres}" var="livre">
        Le livre paye est le livre numero : ${livre.numeroLivre}<br/><%--Le livre paye est le livre numero : ${sessionScope.livre.numeroLivre}<br/>--%>
        </c:forEach>
    </body>
</html>
