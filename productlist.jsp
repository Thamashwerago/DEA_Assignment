<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product List</title>
</head>
<body>
    <h1>Product List</h1>
    <ul>
        <% for (Product product : (List<Product>) request.getAttribute("products")) { %>
            <li><%= product.getName() %> - <%= product.getPrice() %></li>
        <% } %>
    </ul>
    <a href="cart">View Cart</a>
</body>
</html>
