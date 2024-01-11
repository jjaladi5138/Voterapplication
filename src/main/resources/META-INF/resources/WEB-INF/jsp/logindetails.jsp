<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <title>Admin Registration</title>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Your Logo/Brand</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="/Register">Register</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/listdetails">Listofdetails</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/Addvoter">Logindetails</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container">
    <h1 class="text-justify">Please submit admin details</h1>
    <div class="row">
        <form class="col-lg-6 offset-lg-3" action="/submitdetails" method="post">
            <label for="username">Username:</label><br>
            <input type="text" id="fname" name="username"/><br>

            <label for="password">Password:</label><br>
            <input type="text" id="lname"  name="password"><br>

            <label for="role">Role:</label><br>
            <input type="text" id="lname"  name="role"><br>

            <button type="submit" class="btn btn-success">Submit</button>
        </form>
    </div>
</div>

<script src="webjars/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>
