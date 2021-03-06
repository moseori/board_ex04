<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" referrerpolicy="no-referrer"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<script>
	let contextPath = '${contextPath}'
	let csrfHeaderName = "${_csrf.headerName}";
	let csrfTokenName = "${_csrf.token}"
</script>
<script src="${contextPath }/resources/js/reply.js"></script>
<header>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<a class="navbar-brand" href="${contextPath}/">Home</a>

		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="${contextPath}/board/list">게시판</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Link 2</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Link 3</a></li>
		</ul>
	</nav>
</header>
