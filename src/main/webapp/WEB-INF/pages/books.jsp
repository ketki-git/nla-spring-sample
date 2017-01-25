<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>National Library of Australia</title>
</head>
<body>
	<h2>List of Books</h2>	
	  
	<c:if test="${not empty booklist}">	
		
		<input type="text" id="searchBooks" onkeyup="filterResults('searchBooks', 'booksTable')" 
				placeholder="Search books by title or author..">
		
		<table id="booksTable" class="table table-striped">
    		<thead>
      			<tr>
        			<th>Book Title</th>
        			<th>Author</th>
        			<th></th>
     			</tr>
    		</thead>
    		<tbody>		
				<c:forEach var="listValue" items="${booklist}">		
				<!--  <a href="#" class="list-group-item">${listValue.title}</a> -->			
					<tr>
						<td>
							<a data-toggle="collapse" href="#collapse${listValue.id}">${listValue.title}</a>
							<div id="collapse${listValue.id}" class="panel-collapse collapse">
						      <div class="panel-body">${listValue.bookInfo}</div>
						    </div>
						</td>			        	
			        	<td>${listValue.author}</td>
			        	<td>
			        		<a class="btn btn-large btn-primary" 
			        			href="${pageContext.request.contextPath}/book/${listValue.id}">
			        			View Borrower
			        		</a>			        						
			        	</td>			        
			    	</tr>      
				</c:forEach>			
			</tbody>
  		</table>
		
	</c:if>
</body>
</html>