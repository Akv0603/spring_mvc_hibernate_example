<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>All New Cars</h2>
<br>

<table>
    <tr>
        <th>Brand</th>
        <th>Model</th>
        <th>Country</th>
        <th>Price</th>
        <th>Operations</th>
    </tr>
    <%--update/delete--%>
    <c:forEach var="car" items="${allCars}">
        <%--создаем линк на update внутри for eacha--%>

        <c:url var="updateButton" value="/updateCar">
            <c:param name="carId" value="${car.id}"/>
        </c:url>

        <%--создаем линк на delete внутри for eacha--%>
        <c:url var="deleteButton" value="/deleteCar">
            <c:param name="carId" value="${car.id}"/>
        </c:url>

        <tr>
            <td>${car.brand}</td>
            <td>${car.modeL}</td>
            <td>${car.country}</td>
            <td>${car.price}</td>

                <%--создаем кнопку update внутри for eacha            --%>
            <td>
                <input type="button" value="Update"
                       onclick="window.location.href = '${updateButton}'"/>

        <%--создаем кнопку Delete внутри for eacha. Кнопки не разделяем, для красоты отображения(в одном <td>)--%>
                <input type="button" value="Delete"
                       onclick="window.location.href = '${deleteButton}'"/>

            </td>
        </tr>

    </c:forEach>

</table>
<br>
<%--создаем кнопку Add. при клике юзается ссылка на метод addMyEmployee()
 в MyController. по ссылке в реквестмаппинг--%>
<input type="button" value="Add"
onclick="window.location.href = 'addNewCar'"/>

</body>

</html>