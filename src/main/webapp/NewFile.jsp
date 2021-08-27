<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "com.abc.dao.DBConn" %>
    <%@ page import="java.sql.Connection" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1>테스팅</h1>
 	<%

		Connection con = DBConn.getConnection();
	
		if (con != null) {
			out.println("DB 접속 성공!");
		}
		
	%>
 
</body>
</html>