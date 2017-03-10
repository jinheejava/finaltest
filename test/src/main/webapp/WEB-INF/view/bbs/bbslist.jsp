<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<form name="bbslist" action="bbsWrite.do">
		<h2> 게시판 </h2>
		<table border="1" cellspacing="0">
			<thead>
				<tr>
					<th>NO.</th>
					<th>제목</th>
					<th>작성자</th>
					<th>조회수</th>
				</tr>
			</thead>
			<tbody>
				<c:set var="bbslist" value="${bbslist}"/>
				
				<c:forEach var="dto" items="${bbslist}">
					<tr>
						<td>${dto.idx}</td>
						<td>${dto.subject}</td>
						<td>${dto.writer}</td>
						<td>${dto.readnum}</td>
					</tr>
				</c:forEach>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="3" align="center"> ${page}</td>
					<td> <input type="submit" value="글쓰기"></td> 
				</tr>
			</tfoot>
		</table>
	</form>

</body>
</html>