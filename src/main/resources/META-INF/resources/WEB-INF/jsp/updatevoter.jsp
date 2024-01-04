<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
 <link  href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <title>Voter Registration Form</title>
</head>
<body>
    <div class="container">
        <h1 class="text-justify">Please update the Adharnumber</h1>
        <h1 class="text-justify">You need to update only AdharNumber ${name}</h1>
        <div class ="row">
        <form class="col-lg-6 offset-lg-3" action="/updatedetails" method="post">
           
            <label for="adharnumber">Adharnumber:</label><br>
<input type="number" id="number" name="adharnumber"><br>

<label for="lname">lname:</label><br>
<input type="text" id="lname" name="lname"><br>

<button type="submit" class="btn btn-success">Submit</button>
            
            
            <input type="hidden" id="fname" name =name value = "${name}"/><br>
        </form>
        </div>
    </div>
     <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>
