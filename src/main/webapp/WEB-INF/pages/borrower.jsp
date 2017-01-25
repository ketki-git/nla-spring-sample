<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
 
<html>
<head>
    <title>National Library of Australia</title>
</head>
<body>
	<h2>Borrower Details</h2>	
	  
	<c:if test="${not empty borrower}">	
				
		<table id="customersTable" class="table table-striped">
    		<thead>
      			<tr>
        			<th>Name</th>
        			<th>No. of borrowed books</th>
        			<th>Borrowed Books</th>        			
     			</tr>
    		</thead>
    		<tbody>					
					<tr>
						<td>
							<a data-toggle="collapse" href="#collapse${borrower.customerId}">${borrower.customerName}</a>
							<div id="collapse${borrower.customerId}" class="panel-collapse">
						      <div class="panel-body">
						      		<b>Address:</b><br/>
						      		${borrower.customerAddress}, 
						      		${borrower.customerCity}<br/>
						      		${borrower.customerState} - ${borrower.customerZip}
						      </div>
						    </div>
						</td>	
						
						<td>
			        		<c:if test="${not empty booksBorrowed}">
			        			${fn:length(booksBorrowed)}	        			
			        		</c:if>
			        	</td>	
			        			        	
			        	<td>
			        		<c:if test="${not empty booksBorrowed}">
			        			<c:forEach var="listValue" items="${booksBorrowed}">			        				
			        				<b>Title: </b>${listValue.title}<br/>
			        				<b>Author: </b>${listValue.author}<br/><br/>
			        			</c:forEach>			        			
			        		</c:if>
			        	</td>			        			       
			    	</tr>   			
			</tbody>
  		</table>
		
	</c:if>
</body>
</html>