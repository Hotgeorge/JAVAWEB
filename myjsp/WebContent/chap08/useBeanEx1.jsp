<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%-- 
    예전 방식 
<%@ page import="chap08.MyBean" %> 
<%
	MyBean myBean = new MyBean();
	myBean.setName("abc");
	myBean.setId(99);
	request.setAttribute("myBean", myBean);
%>
--%>


<%-- 요즘 방식  --%>
<jsp:useBean id="myBean" class="chap08.MyBean" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name='viewport' content='width=device-width, initial-scale=1'>
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css'>
<script src='https://kit.fontawesome.com/a076d05399.js'></script>
<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js'></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js'></script>
<script src='https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js'></script>
<title>Insert title here</title>
</head>
<body>

</body>
</html>