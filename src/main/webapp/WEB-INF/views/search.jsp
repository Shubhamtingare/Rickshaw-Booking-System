<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/search" method="get">
    <label>Location:</label>
    <input type="text" name="location" required>
    <button type="submit">Search</button>
</form>
<c:forEach items="${rickshaws}" var="rickshaw">
    <p>${rickshaw.vehicleType} - ${rickshaw.fare}</p>
</c:forEach>

</body>
</html>