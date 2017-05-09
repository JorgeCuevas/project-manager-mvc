<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    
    
<html>
<jsp:include page="/WEB-INF/views/templates/header.jsp"></jsp:include>
    <div class="container">
     
<a href='<spring:url value="add/" />' class="btn btn-success" >Add +</a>
	<hr/>
    <div class="panel panel-default">
  
  <div class="panel-heading">Projects Availables</div>
 <!-- Table -->
  <table class="table">
		<thead>
			<tr>
				<th>
					ID
				</th>
				<th>
					Descripcion
				</th>
				<th>
					Manager Id
				</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="project" items="${projects}">
				<tr>
				<th>
					${project.id}
				</th>
				<th>
					${project.descripcion}
				</th>
				<th>
					${project.managerId}
				</th>
			</tr>
			</c:forEach>
		</tbody>    
  </table>
</div>
    </div>
<jsp:include page="/WEB-INF/views/templates/footer.jsp"></jsp:include>
</html>