<%@ taglib prefix="easy" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<title>Product Details</title>
</head>
<body>
<easy:invokeDemo>
    <jsp:attribute name="productDetails">
        <table width="220" border="1">
        <tr>
            <td><b>Product Name</b></td>
            <td>${productName}</td>
        </tr>
        <tr>
            <td><b>Description</b></td>
            <td>${description}</td>
        </tr>
        <tr>
            <td><b>Price</b></td>
            <td>${price}</td>
        </tr>
        </table>
    </jsp:attribute>
    <jsp:attribute name="productDetailsII">
        <table width="220" border="1">
        <tr>
            <td><b>Product Origin</b></td>
            <td>${productOrigin}</td>
        </tr>
        </table>
    </jsp:attribute>
</easy:invokeDemo>
</body>
</html>