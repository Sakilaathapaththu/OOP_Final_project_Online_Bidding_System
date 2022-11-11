<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert and update admin details</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

 <link href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css' rel='stylesheet'>
<link href='https://use.fontawesome.com/releases/v5.8.1/css/all.css' rel='stylesheet'>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet"/>
    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
      .box {
   
    padding: 40px;
     background:linear-gradient(to right, #b92b27, #1565c0) ;
    margin-right:20%;
    margin-left:20%;
    
    text-align: center;
    transition: 0.25s;
    
}
	.box input[type="text"],
.box input[type="password"] {
    border: 0;
    background: none;
    display: block;
    margin: 20px auto;
    text-align: center;
    border: 2px solid #3498db;
    padding: 10px 10px;
    width: 250px;
    outline: none;
    color: white;
    border-radius: 24px;
    transition: 0.25s
}
.box h1 {
    color: white;
    text-transform: uppercase;
    font-weight: 500
}

.box input[type="text"]:focus,
.box input[type="password"]:focus {
    width: 300px;
    border-color: white;
}

.box input[type="submit"] {
    border: 0;
    background: none;
    display: block;
    margin: 20px auto;
    text-align: center;
    border: 2px solid #2ecc71;
    padding: 14px 40px;
    outline: none;
    color: white;
    border-radius: 24px;
    transition: 0.25s;
    cursor: pointer
}

.box input[type="submit"]:hover {
    background: #2ecc71
}
.c{
color: white;
}
    </style>



</head>
<body>
<div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom shadow-sm">
	
  <p class="my-0 mr-md-auto font-weight-normal"  style="font-size:180%;" ><b>Sky Bid.Lk</b></p>
  
  <nav class="my-2 my-md-0 mr-md-3">
  	<a class="p-2 text-dark" href="home.jsp">Home</a>
  	<a class="p-2 text-dark" href="product.jsp">Products</a>
    <a class="p-2 text-dark" href="About.jsp">About Us</a>
    <a class="p-2 text-dark" href="ContactUs.jsp">Help</a>
    <a class="p-2 text-dark" href="ContactUs.jsp">Feedback</a>
    
  </nav>
  <a class="btn btn-outline-primary mr-3" href="Adminlogin.jsp">Admin Login</a>
  <a class="btn btn-outline-primary" href="Userlogin.jsp">User Login</a>
</div>
<center><h4>Insert Admin</h4></center>


<form action="insert" method="post" class="box" >
<div class="form-group">
	<label for="name" class="c">Name</label>
	<input type="text" name="Adminname" placeholder="Enter your name" class="form-control" required><br>
</div>
<div class="form-group">
	<label for="telephone" class="c">Telephone number</label>
	<input type="text" name="AdminTelephone" placeholder="Enter your telephone number" class="form-control" pattern="[0-9]{10}" required><br>
</div>	
<div class="form-group">
	<label for="NIC" class="c">NIC</label>
	<input type="text" name="AdminNIC" placeholder="Enter your NIC number" class="form-control" pattern="[0-9]{12}" required><br>
</div>
<div class="form-group">
	<label for="username" class="c">User Name</label>
	<input type="text" name="Ausername" pattern=".+@skybid\.lk" placeholder="name.skybid.lk" class="form-control" required><br>
</div>
<div class="form-group">
	<label for="password" class="c">Password</label>
	<input type="password" name="Apassword" placeholder="Enter your Password" class="form-control" pattern=".{8,}" required><br>
</div>

	<input type="submit" name="submit" value="Insert Admin" class="btn btn-primary"> <br>
		
	
</form>	

<br><br>
<form action="view" method="post" class="box">
<input type="submit" name="submit" value="view admin detatis and update" class="btn btn-secondary btn-lg">

</form>
	
	
	
	
	











<footer class="pt-4 my-md-5 pt-md-5 border-top">
    <div class="row">
      <div class="col-12 col-md mr-5" >
        <iframe width="250" height="200" src="https://maps.google.com/maps?q=manhatan&t=&z=13&ie=UTF8&iwloc=&output=embed" frameborder="0"
    style="border:0" allowfullscreen></iframe>
        <small class="d-block mb-3 text-muted">©Sky Bid.Lk 2022-2023</small>
      </div>
      <div class="col-6 col-md">
        <h5>Features</h5>
        <ul class="list-unstyled text-small">
          <li><a class="text-muted" href="#">Cool stuff</a></li>
          <li><a class="text-muted" href="#">Random feature</a></li>
          <li><a class="text-muted" href="#">Team feature</a></li>
          <li><a class="text-muted" href="#">Stuff for developers</a></li>
          <li><a class="text-muted" href="#">Another one</a></li>
          <li><a class="text-muted" href="#">Last time</a></li>
        </ul>
      </div>
      <div class="col-6 col-md">
        <h5>Resources</h5>
        <ul class="list-unstyled text-small">
          <li><a class="text-muted" href="#">Resource</a></li>
          <li><a class="text-muted" href="#">Resource name</a></li>
          <li><a class="text-muted" href="#">Another resource</a></li>
          <li><a class="text-muted" href="#">Final resource</a></li>
        </ul>
      </div>
      <div class="col-6 col-md">
        <h5>About</h5>
        <ul class="list-unstyled text-small">
          <li><a class="text-muted" href="#">Team</a></li>
          <li><a class="text-muted" href="#">Locations</a></li>
          <li><a class="text-muted" href="#">Privacy</a></li>
          <li><a class="text-muted" href="#">Terms</a></li>
        </ul>
      </div>
    </div>
  </footer>
  
  
</body>
</html>