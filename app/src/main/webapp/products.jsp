<%@ page import="java.util.*, com.fintech.model.Product" %>

<html>
<body>

<h2>Products</h2>

<table border="1">
<tr><th>ID</th><th>Name</th><th>Price</th></tr>

<%
List<Product> list = (List<Product>)request.getAttribute("products");
for(Product p : list){
%>

<tr>
<td><%=p.getId()%></td>
<td><%=p.getName()%></td>
<td><%=p.getPrice()%></td>
</tr>

<% } %>

</table>

</body>
</html>
