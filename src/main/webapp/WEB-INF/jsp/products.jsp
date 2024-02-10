<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="/WEB-INF/jsp/nav.jsp" %>

<div class="container" style="flex: 1;">
    <form action="/" method="get">
        <div class="row">
        
            <h2 class="text-center mb-4">Product Table Form</h2>
            <div class="col-md-3">
                <input type="text" name="itemname" class="form-control" >
            </div>
            <div class="col-md-3">
                <button type="submit" class="btn btn-primary"><i class="fas fa-search"></i></button>
            </div>
            <div class="col-md-6" >
                <a href="/product" style="float: right;" class="btn btn-success" >add item<i class="fas fa-plus" style="margin-left:5px ;" ></i></a>
            </div>
        
        </div>
    </form>


	<table class="mt-3 table table-bordered " >
        <thead>
            <th>Item</th>
            <th>Quantity</th>
            <th>Price(RM)</th>
            <th colspan="2">Action</th>
        </thead>
        <tbody>
            <c:forEach var="product" items="${products}">
                <tr>
                    <td>${product.item}</td>
                    <td>${product.qty}</td>
                    <td>${product.price}</td>
                    <td ><a class="btn btn-warning" href="editproduct/${product.id}"><i class="fas fa-edit"> </i></a>
                    
                    <button type="button" class="btn btn-danger" onclick="window.location.href='deleteproduct/${product.id}'" ><i class="fas fa-trash-alt"></i></button></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    
</div>

<%@ include file="/WEB-INF/jsp/footer.jsp" %>



