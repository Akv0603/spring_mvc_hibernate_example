<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>All Cars</h2>
<br>

<table>

    <tr>
        <th>Brand</th>
        <th>Model</th>
        <th>Country</th>
        <th>Price</th>
    </tr>

    <c:forEach var="car" items="${allCars}">

        <tr>
            <td>${car.brand}</td>
            <td>${car.modeL}</td>
            <td>${car.country}</td>
            <td>${car.price}</td>
        </tr>







    </c:forEach>

</table>


</body>

</html>