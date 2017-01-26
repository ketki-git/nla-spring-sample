<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>

    <meta charset="utf-8">

    <title><decorator:title/></title>

	<link rel="shortcut icon" href="https://www.nla.gov.au/sites/all/themes/nlaoid/favicon.ico" type="image/vnd.microsoft.icon" />
	
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/assets/bootstrap/3.3.7/css/bootstrap.min.css" media="all"/>	
          
    <!-- Default CSS styles pulled from NLA site -->      
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/nla-web-1.css" media="all"/>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/nla-web-2.css" media="all"/>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/nla-web-3.css" media="all"/>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/nla-web-4.css" media="all"/>
                            
	<link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/style.css" media="all"/>
                                      
    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <decorator:head/>
</head>
<body>


<header class="header" id="header" role="banner">

    <div class="container">
      <p class="nla row text-center">
        <a href="http://nla.gov.au">National Library of Australia - SAMPLE APP</a>
      </p>
      <div class="row primary-brand">
        <div class="col-md-8 col-sm-8 clearfix">
          <a href="${pageContext.request.contextPath}" title="National Library of Australia logo" rel="home" class="header__logo svg">           
              <img src="${pageContext.request.contextPath}/img/logo.png" alt="NLA logo"/>           
          </a>
        </div>
        <div class="col-md-4 col-sm-4 clearfix">
            <div class="header__region region region-header">
    			<div id="block-views-exp-search-view-page" class="block block-views first last odd">      
				  <form id="views-exposed-form-search-view-page" accept-charset="UTF-8">
				  	<div>
				  		<div class="views-exposed-form">
				  			<div class="views-exposed-widgets clearfix">
				          		<div id="edit-search-api-views-fulltext-wrapper" class="views-exposed-widget views-widget-filter-search_api_views_fulltext">
				                	<div class="views-widget">
				          				<div class="form-item form-type-textfield form-item-search-api-views-fulltext">
				  							<label for="edit-search-api-views-fulltext">Search this website </label>
				 							<input onfocus="if (this.value == 'Search this site') {this.value = '';}" onblur="if (this.value == '') {this.value = 'Search this site';}" title="search website" type="text" id="edit-search-api-views-fulltext" name="search_api_views_fulltext" value="Search this site" size="30" maxlength="128" class="form-text">
										</div>
				        			</div>
				              	</div>
				        		<div class="views-exposed-widget views-submit-button">
				      				<span class="glyphicon glyphicon-search form-control-feedback"></span>
				      				<input type="submit" id="edit-submit-search-view" name="" value="Search" class="form-submit">    
				      			</div>
				      		</div>
						</div>
					</div>
					</form>
				</div>
  			</div>
        </div>
      </div>
    </div>    
  </header>
  
  <div id="main" class="container">           

    <div id="navigation">
      
  				<div class="om-maximenu om-maximenu-no-style om-maximenu-block om-maximenu-row om-maximenu-block-down code-om-u1-383374331 responsive-menus-sidr-processed" style="display: block;">     
            
					<div class="om-menu-ul-wrapper">
  						
  						<ul class="om-menu">
                     
  							<li class="om-leaf">   
    							<a class="om-link" href="${pageContext.request.contextPath}/books" >List of Books</a>
    						</li>
  
  							<li class="om-leaf">   
    							<a class="om-link" href="${pageContext.request.contextPath}/borrowers">List of Borrowers</a>      
  							</li>
      					</ul>   
					</div>
      			</div> 
		
    </div>        
  </div>

	<div class="container article">
	
	    <c:if test="${page_error != null }">
	        <div class="alert alert-error">
	            <button type="button" class="close" data-dismiss="alert">&times;</button>
	            <h4>Error!</h4>
	                ${page_error}
	        </div>
	    </c:if>
	
	    <decorator:body/>
	
	    <footer>
	
	    </footer>
	</div>
	             
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>  		
  	<script type="text/javascript" src="${pageContext.request.contextPath}/js/nla.js"></script>
  	
</body>
</html>