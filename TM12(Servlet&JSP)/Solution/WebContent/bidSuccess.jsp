<%@ page import="com.auction.bean.BidBean" %>
<%
    BidBean bid = (BidBean) request.getAttribute("bid");
%>

<html>
<body bgcolor="#ffeb99">
<h2>Bid Submitted</h2>
<p>Your bid is now active. If your bid is successful, you will be notified within 24 hours of the close of bidding.</p>

<table border="1" cellpadding="5">
    <tr><th colspan="2"><%= bid.getItemName() %></th></tr>
    <tr><td>Item ID:</td><td><%= bid.getItemId() %></td></tr>
    <tr><td>Name:</td><td><%= bid.getName() %></td></tr>
    <tr><td>Email address:</td><td><%= bid.getEmail() %></td></tr>
    <tr><td>Bid price:</td><td>Rs.<%= bid.getAmount() %></td></tr>
    <tr><td>Auto-increment price:</td><td><%= bid.isAutoIncrement() %></td></tr>
</table>
</body>
</html>
