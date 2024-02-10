<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	<%@ include file="/WEB-INF/jsp/nav.jsp" %>
	
<div class="container">
	<div class="header">
		<h3>Product Form</h3>
	</div>
	<div class="row">
		<div class="col-md-6">
			<form action="/addproduct" method="post" enctype="application/json" >
				<div class="form-group">
					<label>Item Name</label>
					<input type="text" name="item" required class="form-control" id="item" />
				</div>
				<div class="form-group">
					<label>Qty</label>
					<input type="number" name="qty" required  class="form-control" id="qty" />
				</div>
				<div class="form-group">
					<label>Price</label>
					<input type="text" name="price" required class="form-control" id="price" />
				</div>
				<br>
				<div class="form-group">
					<button type="button" class="btn btn-danger" onclick="window.location.href='/'" >back</button>
					<button type="submit" class="btn btn-success" >Submit</button>
					
				</div>
			</form>
		</div>
	</div>
</div>

<%@ include file="/WEB-INF/jsp/footer.jsp" %>
