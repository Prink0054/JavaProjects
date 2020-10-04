<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">


    <title>Hello, world!</title>
    
    <link rel="stylesheet" href="data.css">
  </head>
  <body>
  
  
<div class="container mt-5">
<h3 class="text-center" style="text-decoration: underline; font-size: 40px">Login Form</h3><br><br><br>


<form action="userlogin" method="post">  
  <div class="form-group" >
    <label for="exampleInputEmail1" style="font-size: 25px">Email address</label>
    <input type="email" name="email"
     class="form-control"
      id="exampleInputEmail1"                                                                                                   
      aria-describedby="emailHelp"
       placeholder="Enter email"  >
  </div>
  
  
  <br>
  
  <div class="form-group" >
  
    <label for="exampleInputPassword1" style="font-size: 25px">Password</label>
    <input type="password"  class="form-control" id="exampleInputPassword1" placeholder="Password" name="password">
  </div>
  
  
  
  
  
 <br><br>
    <div class="form-group text-center" >
  
  <button type="submit" class="btn btn-success">Submit</button>
  
  
  
  </div>


</form>

<a href="register.jsp">Submit</a>

<button onclick="location.href ='register.jsp'" >Go To Dashboard</button>
</div>




    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>