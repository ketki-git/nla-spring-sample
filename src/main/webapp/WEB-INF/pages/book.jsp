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
<c:choose>
	<c:when test="${not empty book}">
		<h2>Book Details - "${book.title}"</h2>
		<div class="panel-details">
			<b>Title: </b>${book.title}<br /> <br /> <b>Author: </b>${book.author}<br />
			<br /> <b>ISBN: </b>8951-5816-89${book.id}<br /> <br />
			${book.bookInfo}
		</div>
		<br />
		<div class="panel panel-default">
			<div class="panel-heading">Book Borrowed By</div>

			<c:if test="${not empty borrower}">
				<div class="panel-body panel-details">
					<a title="View Customer Details" data-toggle="tooltip"
						href="${pageContext.request.contextPath}/borrower/${borrower.customerId}">${borrower.customerName}</a>
					<br /> <br /> ${borrower.customerAddress},
					${borrower.customerCity}<br /> ${borrower.customerState} -
					${borrower.customerZip}<br /> <b>Phone:</b>
					${borrower.customerPhone}<br /> <b>Email:</b>
					${borrower.customerEmail}

				</div>
			</c:if>
		</div>
	</c:when>
	<c:otherwise>
		<h3>Sorry, requested book details cannot be found. 
			Please view the list of available books
			<a title="View Books" data-toggle="tooltip"
										href="${pageContext.request.contextPath}/">here</a>
		</h3>
	</c:otherwise>
	</c:choose>
</body>
</html>