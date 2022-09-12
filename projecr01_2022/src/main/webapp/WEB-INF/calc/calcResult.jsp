<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1>NUM1 ${param.num1}</h1>
 	<h1>NUM2 ${param.num2}</h1> 
 	
 	<h1>SUM ${Integer.parseInt(param.num1)+Integer.parseInt(param.num2)}</h1>
</body>
</html>