<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	<%@ include file="/WEB-INF/jsp/nav.jsp" %>
	<div class="container">
		<h2>Product Edit form</h2>
		<div class="row">
			<div class="col-md-6">			
				<form action="/editproduct/${product.id}" method="post" enctype="application/json" >
					<div class="form-group">
					<label>Item Name</label>
						<input type="text" name="item" class="form-control"  value="${product.item}" id="item" />
					</div>
					<div class="form-group">
						<label>Qty</label>
						<input type="number" name="qty" class="form-control" value="${product.qty}" id="qty" />
					</div>
					<div class="form-group">
						<label>Price</label>
						<input type="text" name="price" class="form-control" value="${product.price}" id="price" />
					</div>
					<div class="form-group">
						<button type="button" class="btn btn-danger" onclick="window.location.href='/'" >back</button>
						<button type="submit" class="btn btn-success"  >Save</button>
					</div>
					
				</form>
			</div>
		</div>
	</div>
    
    
	<%@ include file="/WEB-INF/jsp/footer.jsp" %>