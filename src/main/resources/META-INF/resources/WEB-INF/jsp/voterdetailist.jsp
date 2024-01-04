<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link  href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <title>Here is the list of voters</title>
</head>
<body>
    <div class="container">
        <h1>List of Voters</h1>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Last Name</th>
                    <th>Adhar Number</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${l}" var="voter">
                    <tr>
                        <td>${voter.name}</td>
                        <td>${voter.lname}</td>
                        <td>${voter.adharnumber}</td>
                        <td>
                            <form action="/update" method="post">
                            <input type="hidden" name="name" value="${voter.name}">
                                <input type="submit" class="btn btn-success" value="Update">
                          
                            </form>
                             <form action="/delete" method="post">
                <input type="hidden" name="name" value="${voter.name}">
                <input type="submit" class="btn btn-danger" value="Delete">
            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <form action="/Addvoter" method="post">
            <input type="submit" class="btn btn-primary" value="Add Voter">
        </form>
    </div>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
</body>
</html>
