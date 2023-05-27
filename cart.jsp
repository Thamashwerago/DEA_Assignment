<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Shopping Cart</title>
</head>
<body>
    <h1>Shopping Cart</h1>
    <table>
        <thead>
            <tr>
                <th>Name</th>
                <th>Price</th>
            </tr>
        </thead>
        <tbody>
            <% for (Product product : ((Cart) request.getSession().getAttribute("cart")).getItems()) { %>
                
                    <td><%= product.getName() %></td>
                    <td><%= product.getPrice() %></td>
                
            <% } %>
        </tbody>
    </table>
    <p>Total Price: <%= ((Cart) request.getSession().getAttribute("cart")).getTotalPrice() %></p>
</body>
</html>
