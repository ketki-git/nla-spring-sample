<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>National Library of Australia</title>
</head>
<body>
	<h2>Book Details</h2>	
	  
	<c:if test="${not empty book}">	
				
		<table id="booksTable" class="table table-striped">
    		<thead>
      			<tr>
        			<th>Title</th>
        			<th>Author</th>
        			<th>Borrower</th>
     			</tr>
    		</thead>
    		<tbody>		
					
					<tr>
						<td>
							<b>${book.title}</b>
							
						      <div class="panel-body">${book.bookInfo}</div>
						    
						</td>			        	
			        	<td>${book.author}</td>
			        	<td>
			        		<c:if test="${not empty borrower}">	
			        		
				        		<a href="${pageContext.request.contextPath}/borrower/${borrower.customerId}">${borrower.customerName}</a>
								
							      <div class="panel-body">
							      		<b>Address:</b><br/>
							      		${borrower.customerAddress}, 
							      		${borrower.customerCity}<br/>
							      		${borrower.customerState} - ${borrower.customerZip}
							      </div>
							    
	    					</c:if> 							
			        	</td>			        
			    	</tr>    		
			</tbody>
  		</table>
		
	</c:if>
</body>
</html>