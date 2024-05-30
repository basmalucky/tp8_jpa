<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Ajouter un nouvel article</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/styles.css">
</head>
<body>
<div class="container">
    <h1>Ajouter un nouvel article</h1>
    <form action="${pageContext.request.contextPath}/addArticle.do" method="post">
        <label for="description">Description:</label>
        <input type="text" id="description" name="description" required>

        <label for="quantite">Quantité:</label>
        <input type="number" id="quantite" name="quantite" required>

        <label for="price">Prix:</label>
        <input type="number" step="0.01" id="price" name="price" required>

        <input type="submit" value="Ajouter">
    </form>
</div>
</body>
</html>
