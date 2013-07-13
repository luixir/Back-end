<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="en">
  <head>
  	<meta charset = "utf-8">
  	<title>Log in</title>
  	<meta name="viewport" content="width=device-width, initial-scale=1.0">
  	<meta name="description" content>
  	<meta name="author" content> 
    <link rel="stylesheet" type="text/css" href="${ctx}/static/css/style.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/static/css/login.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/static/css/bootstrap.min.css">
  </head>
  <body>
    
    <div class="navbar" ></div>
  	<div class = "container" >

      
      
      <div class = "form-login-container">

  		<form class="form-login">
        <h2 class="form-login-heading">Log in</h2>
        
          

  			  <input type = "text" class = "input-block-level" placeholder="Administrator Id">
          
       
  			<input type = "password" class = "input-block-level" placeholder="Password">
  			<label class = "checkbox">
  				<input type="checkbox" value="remember-me"> Remember me
  			</label>
  			<button class = "btn btn-large " type="submit">Login</button>        
  		</form>

      </div>
    
  	</div>
    
  	
  </body>
</html>