<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Car info</h2>
<br>

<form:form action="saveCar" modelAttribute="car">

    Brand <form:input path="brand"/>
    <br><br>
    Model <form:input path="modeL"/>
    <br><br>
    Country <form:input path="country"/>
    <br><br>
    Price <form:input path="price"/>
    <br><br>

    <input type="submit" value="Ok">

</form:form>
</body>
</html>