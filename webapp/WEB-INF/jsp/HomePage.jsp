<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset = "utf-8">
  	<title>主页</title>
  	<meta name="viewport" content="width=device-width, initial-scale=1.0">
  	<meta name="description" content>
  	<meta name="author" content> 
    
  	<link rel="stylesheet" type="text/css" href="${ctx}/css/style.css">
  	<link href="${ctx}/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${ctx}/css/bootstrap.min.css">
  </head>
  <body>

  	<div class="navbarTop" >
      <p class="quit">
        <button class="btn btn-link" type="button" style="color:white">退出</button>
      </p>
    </div>

  	<div class="container" style="width:1000px">
  		<div class="menu">

        <div id="navbar-example" class="navbar navbar-static">
            <div class="navbar-inner">
              <div class="containerA" style="width: auto;">
                <a class="brand" href="#">菜单</a>
                <ul class="nav" role="navigation">
                  <li class="dropdown">
                    <a id="dLabel1" role="button" class="dropdown-toggle" data-toggle="dropdown" data-target="#" href="">团购管理<b class="caret"></b></a>
                    <ul class="dropdown-menu" role="menu" aria-labelledby="dLabel1">
                      <li role="presentaition">
                        <a role="menuitem" tabindex="-1" href="ItemInput.html">新增团购</a>
                      </li>
                      <li role="presentaition">
                        <a role="menuitem" tabindex="-1" href="ItemModify.html">全部团购</a>
                      </li>
                    </ul>
                  </li>
                  <li class="dropdown">
                    <a id="dLabel2"  role="button" class="dropdown-toggle" data-toggle="dropdown" data-target="#" href="">分类管理<b class="caret"></b></a>
                    <ul class="dropdown-menu" role="menu" aria-labelledby="dLabel2">
                      <li role="presentaition">
                        <a role="menuitem" tabindex="-1" href="CategoryInput.html">新增分类</a>
                      </li>
                      <li role="presentaition">
                        <a role="menuitem" tabindex="-1" href="CategoryModify.html">全部分类</a>
                      </li>
                    </ul>
                  </li>                  
                </ul>
              </div>
            </div>
          </div>


      </div>
  		<div class="mainfield">
        
  			<ul class="breadcrumbb" >
          
          <li class="active">首页</li>
        </ul>
  			<div class="field" style="padding:100px">
          
          <div class="introduction">
            <h3>今日到期团购</h3>
          </div>

          <div class="tableHomepage">
          <table class="table table-hover" >
          <thead>    
            <tr>      
              <th>&nbsp;ID&nbsp;</th>      
              <th>商品名称</th>    
              <th>开始时间</th>    
              <th>结束时间</th>    
            </tr>  
          </thead>  
          <tbody>    
            <tr>      
              <td>333</td>      
              <td>444</td>
              <td>111</td>      
              <td>222</td>     
            </tr>  
          </tbody>
          <tbody>    
            <tr>      
              <td>333</td>      
              <td>444</td>
              <td>111</td>      
              <td>222</td>     
            </tr>  
          </tbody>
          <tbody>    
            <tr>      
              <td>333</td>      
              <td>444</td>
              <td>111</td>      
              <td>222</td>     
            </tr>  
          </tbody>
          </table>
          </div>
        </div>
        </div>
  	</div>

    

    <script type="text/javascript" src="${ctx}/js/jquery.js"></script>
    <script type="text/javascript" src="${ctx}/js/bootstrap.js"></script>
    <script type="text/javascript" src="${ctx}/js/bootstrap.min.js"></script>

    <script>
      $('.dropdown-toggle').dropdown();
    </script>


  </body>

</html>