<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

    
<jsp:include page="/WEB-INF/views/templates/header.jsp"></jsp:include>
	<div class="container">
	<h1>Successful Added</h1>
	<p><strong>Name: </strong>${developer.name}</p>
	<p><strong>Last Name: </strong>${developer.lastName}</p>
	<p><strong>Type: </strong>${developer.type}</p>
		
		
		<hr/>
		<p><strong>Skills: </strong></p>
		<ul>
			<c:forEach items="${developer.skills}" var="skill" >
				<li>${skill}</li>
			</c:forEach>
		</ul>
		<br/>
	<a class="btn btn-default"  href="<spring:url value="/developer/"/>"  >Back</a>
	</div>
	
<jsp:include page="/WEB-INF/views/templates/footer.jsp"></jsp:include>