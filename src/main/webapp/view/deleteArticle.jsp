<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Supprimer un article</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/styles.css">
</head>
<body>
<h1>Supprimer un article</h1>
<form action="${pageContext.request.contextPath}/deleteArticle.do" method="get">
    ID de l'article à supprimer: <input type="text" name="articleId"><br>
    <input type="submit" value="Supprimer">
</form>
</body>
</html>
