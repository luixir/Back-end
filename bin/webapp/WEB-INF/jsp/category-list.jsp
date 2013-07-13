<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset = "utf-8">
    <title>分类修改</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content>
    <meta name="author" content> 
    
  	<link rel="stylesheet" type="text/css" href="${ctx}/static/css/style.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/static/css/bootstrap.min.css">
  </head>
  <body>

  	<div class="navbarTop" ></div>
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
        <ul class="breadcrumbb">
          <li><a href="HomePage.html">首页</a> <span class="divider">/</span></li>
          <li><a href="CategoryModify.html">分类管理</a> <span class="divider">/</span></li>
          <li class="active">全部分类</li>
        </ul>
        <div class="field">
          <div class="tablefield">
          <table class="table table-striped">
            <thead>
              <tr>
                <th>&nbsp;ID&nbsp;</th>
                <th>分类</th>    
                <th>父分类</th>    
                <th>修改</th> 
                <th>删除</th>
              </tr>
            </thead>
            <tbody>
              <c:forEach var="category" items="${categories}">
              <tr>
                   <td>${category.id}</td>
                   <td>${category.name}</td>
                   <td>${category.parent.name}</td>
                   <td><a href=#>修改</a></td>
                   <td><a href=#>删除</a></td>
              </tr>
              </c:forEach>
            </tbody>
          </table>
          </div>
        </div>
  		</div>
  	</div>
  	
  	<footer></footer>
    <script type="text/javascript" src="${ctx}/static/js/jquery.js"></script>
  	<script type="text/javascript" src="${ctx}/static/js/bootstrap.js"></script>
  	<script type="text/javascript" src="${ctx}/static/js/bootstrap.min.js"></script>
    <script>
      $('.dropdown-toggle').dropdown();
    </script>

  </body>

</html>