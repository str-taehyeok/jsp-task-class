<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성 페이지</title>
</head>
<body>
	<form action="write-ok.post" method="post">
		<input name="postTitle" placeholder="제목을 입력하세요" />
		<input name="postContent" placeholder="내용을 입력하세요" />
		<button>게시글 작성</button>
	</form>
</body>
</html>