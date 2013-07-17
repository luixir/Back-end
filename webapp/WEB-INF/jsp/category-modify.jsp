<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

		<div class="mainfield">
			<ul class="breadcrumbb">
				<li><a href="HomePage.html">首页</a> <span class="divider">/</span></li>
				<li><a href="${ctx}/categories">分类管理</a> <span class="divider">/</span></li>
				<li class="active">新增分类</li>
			</ul>
			<div class="container-fluid">
			<h3>修改分类</h3>
				<form class="forma" method="post" action="${ctx}/categories/modify">
					<fieldset>
						<label>ID:</label>
						<input type="text" placeholder="category name" value="${categories.id}" name="id">
						<label>分类名称:</label> 
						<input type="text" placeholder="category name" value="${categories.name}" name="name"> 
						<span class="help-block">Example 中餐</span>
						<label>分类图片:</label> 
						<input type="text" placeholder="category picture" value="${categories.picture}" name="picture">
						<button type="button" class="btn">浏览</button>
						<br></br>
						<label>父类别:</label> 
						<select name="parent.id">
						<option value=""></option>
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