<html>
<body bgcolor="#f9cccc">
<h2>Welcome to AP Auctions. Please Enter your Bid.</h2>
<h3 style="color:red;">Required Data Missing! Enter and Resubmit.</h3>

<form action="BidServlet" method="post">
    Item ID: <input type="text" name="itemId"><br><br>
    Item Name: <input type="text" name="itemName"><br><br>
    Your Name: <input type="text" name="name"><br><br>
    Your Email Address: <input type="email" name="email"><br><br>
    Amount Bid: <input type="text" name="amount"><br><br>
    Auto-increment bid to match other bidders?: 
    <input type="checkbox" name="autoIncrement" value="true"><br><br>
    <input type="submit" value="Submit Bid">
</form>
</body>
</html>
