<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/board/insert-ok.jsp">
제목 : <input type="text" name="title"><br>
내용 : <textarea name="content"></textarea><br>
사용자 : <input type="text" name="creusr"><br>
<button>글쓰기</button>
</form>
<a href="/board/list.jsp"><button>목록으로</button></a>
</body>
</html>