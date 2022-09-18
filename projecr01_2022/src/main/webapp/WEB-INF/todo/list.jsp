<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>title</title>
</head>
<body>
	<h1>List page</h1>


	${list}

	<h4>----------</h4>
	${list[0].tno} --- ${list[0].title}
	<ul>
		<c:forEach var="dto" items="${list}">
			<li>${dto}</li>
		</c:forEach>
	</ul>


	<ul>
		<c:forEach var="num" begin="1" end="10">
			<li>${num}</li>
		</c:forEach>
	</ul>

	<c:if test="${list.size()%2 ==0}">
		1.짝수	
	</c:if>
	<c:if test="${list.size()%2 ==1}">
		1.홀수	
	</c:if>
	
	
	<c:choose>
		<c:when test="${list.size()%2== 0}">
			2.짝수  
		</c:when>
		<c:when test="${list.size() % 2 == 1}">
			2.홀수  
		</c:when>
	</c:choose>
	
	
	<c:set var="target" value="5"></c:set>
	
	<ul>
		<c:forEach var="num" begin="1" end="10">
			<c:if test="${num == target}">
				num is target 
			</c:if>
		</c:forEach>
	</ul>
	
	
	
</body>
</html>