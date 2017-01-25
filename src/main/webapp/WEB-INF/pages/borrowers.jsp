<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>National Library of Australia</title>
</head>
<body>
	<h2>List of Borrowers</h2>	
	  
	<c:if test="${not empty customers}">	
		
		<input type="text" id="searchCustomers" onkeyup="filterResults('searchCustomers', 'customersTable')" placeholder="Search borrowers..">
		
		<table id="customersTable" class="table table-striped">
    		<thead>
      			<tr>
        			<th>Borrower ID</th>
        			<th>Borrower Name</th>
        			<th></th>
     			</tr>
    		</thead>
    		<tbody>		
				<c:forEach var="listValue" items="${customers}">			
					<tr>
						<td>${listValue.customerId}</td>
						<td>
							<a data-toggle="collapse" href="#collapse${listValue.customerId}">${listValue.customerName}</a>
							<div id="collapse${listValue.customerId}" class="panel-collapse collapse">
						      <div class="panel-body">
						      		<b>Address:</b><br/>
						      		${listValue.customerAddress}, 
						      		${listValue.customerCity}<br/>
						      		${listValue.customerState} - ${listValue.customerZip}
						      </div>
						    </div>
						</td>			        	
			        	
			        	<td>
			        		<a class="btn btn-large btn-primary" 
			        			href="${pageContext.request.contextPath}/borrower/${listValue.customerId}">
			        			View Borrowed Books
			        		</a>			        							
			        	</td>			        
			    	</tr>      
				</c:forEach>			
			</tbody>
  		</table>
		
	</c:if>
</body>
</html>