<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Order Page</title>
</head>
<body>
<h2>Place an Order</h2>
<form action="order" method="post">
    Order ID: <input type="number" name="orderId" required><br>
    Customer Name: <input type="text" name="customerName" required><br>
    Item: <input type="text" name="item" required><br>
    Quantity: <input type="number" name="quantity" required><br>
    <button type="submit">Submit Order</button>
</form>
</body>
</html>
