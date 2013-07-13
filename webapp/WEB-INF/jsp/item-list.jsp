<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset = "utf-8">
  	<title>全部团购</title>
  	<meta name="viewport" content="width=device-width, initial-scale=1.0">
  	<meta name="description" content>
  	<meta name="author" content> 
  	<link rel="stylesheet" type="text/css" href="${ctx}/static/css/style.css">
  	<link href="${ctx}/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${ctx}/static/css/bootstrap.min.css">
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
        
  			<ul class="breadcrumbb">
          <li><a href="HomePage.html">首页</a> <span class="divider">/</span></li>
          <li><a href="ItemModify.html">团购管理</a> <span class="divider">/</span></li>
          <li class="active">全部团购</li>
        </ul>
  			<div class="field">
          
          
          <div class="tabbable" >
            <ul class="nav nav-tabs">    
              <li class="active"><a href="#tab1" data-toggle="tab">全部</a></li>    
              <li><a href="#tab2" data-toggle="tab">美食</a></li>  
              <li><a href="#tab3" data-toggle="tab">KTV</a></li>
              <li><a href="#tab4" data-toggle="tab">电影</a></li>
              <li><a href="#tab5" data-toggle="tab">酒店</a></li>
            </ul>  
            <div class="tab-content">    
              <div class="tab-pane active" id="tab1"><p>I'm in Section 1.</p></div>    
              <div class="tab-pane" id="tab2"><p>Howdy, I'm in Section 2.</p></div> 
              <div class="tab-pane" id="tab3"><p>Howdy, I'm in Section 3.</p></div>
              <div class="tab-pane" id="tab4"><p>Howdy, I'm in Section 4.</p></div>
              <div class="tab-pane" id="tab5"><p>Howdy, I'm in Section 5.</p></div>
            </div>
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

    <script>
    $('#myTab a').click(function (e) {
  e.preventDefault();
  $(this).tab('show');
})
    </script>


  </body>

</html>