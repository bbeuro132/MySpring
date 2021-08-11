<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.mh.org2.cls.BB" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>나는 bb입니다.</h1>
	${key.aa}
<%
 	//BB bb = (BB)request.getAttribute("key"); //이것과 위의 것은 같다
 	//out.println(bb.getAa()); 
%>
	<form>
		<input type="text" name="bb"/>
		<input type="submit" value="bb값 전송"/>
	</form>
</body>
</html>