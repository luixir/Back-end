<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>新增分类</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content>
<meta name="author" content>
<link rel="stylesheet" type="text/css"
	href="${ctx}/static/css/style.css">
<link rel="stylesheet" type="text/css"
	href="${ctx}/static/css/bootstrap.min.css">
</head>
<body>

	<div class="navbarTop">
		<p class="quit">
			<button class="btn btn-link" type="button" style="color: white">退出</button>
		</p>
	</div>
	<div class="container" style="width: 1000px">
		<div class="menu">

			<div id="navbar-example" class="navbar navbar-static">
				<div class="navbar-inner">
					<div class="containerA" style="width: auto;">
						<a class="brand" href="#">菜单</a>
						<ul class="nav" role="navigation">
							<li class="dropdown"><a id="dLabel1" role="button"
								class="dropdown-toggle" data-toggle="dropdown" data-target="#"
								href="">团购管理<b class="caret"></b></a>
								<ul class="dropdown-menu" role="menu" aria-labelledby="dLabel1">
									<li role="presentaition"><a role="menuitem" tabindex="-1"
										href="ItemInput.html">新增团购</a></li>
									<li role="presentaition"><a role="menuitem" tabindex="-1"
										href="ItemModify.html">全部团购</a></li>
								</ul></li>
							<li class="dropdown"><a id="dLabel2" role="button"
								class="dropdown-toggle" data-toggle="dropdown" data-target="#"
								href="#">分类管理<b class="caret"></b></a>
								<ul class="dropdown-menu" role="menu" aria-labelledby="dLabel2">
									<li role="presentaition"><a role="menuitem" tabindex="-1"
										href="${ctx}/categories/create">新增分类</a></li>
									<li role="presentaition"><a role="menuitem" tabindex="-1"
										href="${ctx}/categories">全部分类</a></li>
								</ul></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div class="mainfield">

			<ul class="breadcrumbb">
				<li><a href="HomePage.html">首页</a> <span class="divider">/</span></li>
				<li><a href="${ctx}/categories">分类管理</a> <span
					class="divider">/</span></li>
				<li class="active"><a href="${ctx}/categories/create">新增分类</a></li>
			</ul>
			<div class="field">

				<form class="forma" method="post" action="${ctx}/categories/create">
					<fieldset>
						<label>分类名称:</label> <input type="text"
							placeholder="category name" name="name"> <span
							class="help-block">Example 中餐</span> <label>分类图片:</label> <input
							type="text" placeholder="category picture" name="picture">
						<button type="button" class="btn">浏览</button>
						<br></br> <label>父类别:</label> 
						<select name= "parent.id">
							<c:forEach var="rootcategory" items="${rootCategories}">
								<option value="${rootcategory.id}">${rootcategory.name}</option>
							</c:forEach>
						</select>
					</fieldset>

					<div class="confrimBtn">
						<p>
							<button class="btn " type="submit" style="color: black">
								<b>确认</b>
							</button>
						</p>
					</div>
				</form>
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