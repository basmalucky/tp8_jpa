<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Modifier un article</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/styles.css">
    <script>
        function modifyArticle() {
            var articleId = document.getElementById("articleId").value;
            var description = document.getElementById("description").value;
            var quantite = document.getElementById("quantite").value;
            var price = document.getElementById("price").value;
            var xhr = new XMLHttpRequest();
            xhr.open("POST", "${pageContext.request.contextPath}/modifyArticle.do", true);
            xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
            xhr.onreadystatechange = function() {
                if (xhr.readyState == 4 && xhr.status == 200) {
                    var response = xhr.responseText;
                    var responseDiv = document.getElementById("response");
                    responseDiv.innerHTML = response;
                    responseDiv.style.display = "block";
                    if (response.includes("successfully")) {
                        responseDiv.className = "";
                    } else {
                        responseDiv.className = "error";
                    }
                }
            };
            var params = "articleId=" + encodeURIComponent(articleId) +
                "&description=" + encodeURIComponent(description) +
                "&quantite=" + encodeURIComponent(quantite) +
                "&price=" + encodeURIComponent(price);
            xhr.send(params);
        }
    </script>
</head>
<body>
<h1>Modifier un article</h1>
<form onsubmit="event.preventDefault(); modifyArticle();">
    ID de l'article à modifier: <input type="text" id="articleId" name="articleId"><br>
    Nouvelle description: <input type="text" id="description" name="description"><br>
    Nouvelle quantité: <input type="text" id="quantite" name="quantite"><br>
    Nouveau prix: <input type="text" id="price" name="price"><br>
    <input type="submit" value="Modifier">
</form>
<div id="response"></div>
</body>
</html>
