<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<html>
<head>
<title>National Library of Australia</title>
</head>
<body>

	<c:choose>
		<c:when test="${not empty borrower}">
			<h2>Borrower Details</h2>
			<div class="panel-details">
				<b>Borrower ID: </b>NLA0998${borrower.customerId} <br />
				<br /> <b>Name: </b>${borrower.customerName} <br />
				<br /> <b>Address: </b><br />
				<br /> ${borrower.customerAddress}, ${borrower.customerCity}<br />
				${borrower.customerState} - ${borrower.customerZip}<br /> <br /> <b>Phone:
				</b>${borrower.customerPhone}<br /> <br /> <b>Email: </b>${borrower.customerEmail}
			</div>
			<br/>
			<%-- 			<c:choose> --%>
			<%-- 				<c:when test="${not empty booksBorrowed}"> --%>
			<%-- 				        			${fn:length(booksBorrowed)}	        			 --%>
			<%-- 				        		</c:when> --%>
			<%-- 				<c:otherwise> --%>
			<!-- 							        None -->
			<%-- 							    </c:otherwise> --%>
			<%-- 			</c:choose> --%>

			<div class="panel panel-default">
						<div class="panel-heading">Books Borrowed By
							"${borrower.customerName}"</div>

						<div class="panel-body panel-details">
						
			<c:choose>
				<c:when test="${not empty booksBorrowed}">					
							<c:forEach var="listValue" items="${booksBorrowed}">
								<b>Title: </b>

								<a title="View Book Details" target="_book"
									data-toggle="tooltip"
									href="${pageContext.request.contextPath}/book/${listValue.id}">${listValue.title}</a>
								<br />
								<b>Author: </b>${listValue.author}<br />
								<hr style="border-top: dotted 1px;" />
							</c:forEach>						
				</c:when>
				<c:otherwise>None</c:otherwise>
			</c:choose>
			</div>
					</div>
		</c:when>
		<c:otherwise>
			<h3>
				Sorry, requested borrower's details cannot be found. Please view the list
				of all available borrowers <a title="View Borrowers" data-toggle="tooltip"
					href="${pageContext.request.contextPath}/borrowers/">here</a>
			</h3>
		</c:otherwise>
	</c:choose>
</body>
</html>