<%--
  Created by IntelliJ IDEA.
  User: eddbea
  Date: 11/02/2024
  Time: 10:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Paiement effectue avec le numero de carte suivant : <%=request.getParameter("numeroCarte")%><br/>
<%--Le livre paye est le livre numero : <%=session.getAttribute("identifiantLivre")%><br/>--%>
Le livre paye est le livre numero : ${sessionScope.livre.numeroLivre}<br/>
<%--Le livre paye est le livre numero : ${livre.numeroLivre}<br/>--%>
</body>
</html>
