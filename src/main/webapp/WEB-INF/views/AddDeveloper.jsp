<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<jsp:include page="/WEB-INF/views/templates/header.jsp"></jsp:include>


<div class="container">
<p class="header-text">Create Developer Profile</p>

<spring:url value="/developer/" var="saveDev"  />
	
	<form:form method="POST" action="${saveDev}" modelAttribute="developer" >
		<div class="form-group">
			<label for="email">Name:</label> 
			<form:input type="text" path="name" cssClass="form-control" id="name"  />
			<form:errors path="name" />
		</div>
		<div class="form-group">
			<label for="pwd">Last Name:</label> 
			<form:input type="text" path="lastName" cssClass="form-control" id="lastName" />
			<form:errors path="lastName" />
		</div>
		
		<div class="form-group">
		<label>Type:</label>
		<form:select items="${types}" cssClass="form-control" path="type"/>
		</div>
		
		<div class="form-group">
		<label>Skill:</label>
		<form:checkboxes items="${skills}" cssClass="form-check-input" path="skills"/>
		</div>
		
		<button type="submit" class="btn btn-default">Submit</button>
	</form:form>

</div>


<jsp:include page="/WEB-INF/views/templates/footer.jsp"></jsp:include>