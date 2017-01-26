<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<title>National Library of Australia</title>
</head>
<body>
	<p class="error">Sorry, I cannot find the page that you are requesting. Please go to the
	<a title="View Customer Details" data-toggle="tooltip"
						href="${pageContext.request.contextPath}/">main page here</a> to browse further.
	</p>
</body>
</html>