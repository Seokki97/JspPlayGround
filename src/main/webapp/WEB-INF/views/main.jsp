<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hello World JSP</title>
</head>
<body>
<%
    out.println("Hello World!");
%>
<form action="http://localhost:8080/api/board/submit" method="post">
    제목 : <input type="text" size="30" maxlength="50" > <br>
    내용 : <input type="text" size="200" maxlength="500">
    <input type="submit" value="제출"/><br/>

</form>

</body>
</html>
