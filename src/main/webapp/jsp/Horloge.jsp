<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Afficher horloge</title>
</head>
<body>
  <h1>Bienvenue il est <%= request.getAttribute("date") %> </h1>
</body>
</html>