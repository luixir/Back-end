<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
		<div class="mainfield">
			<ul class="breadcrumbb">
				<li><a href="HomePage.html">首页</a> <span class="divider">/</span></li>
				<li><a href="CategoryModify.html">分类管理</a> <span
					class="divider">/</span></li>
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
									<td>
										<c:choose>
											<c:when test="${category.parent.name == null}">
												无
	    									</c:when>
											<c:otherwise>
												${category.parent.name}
	    									</c:otherwise>
										</c:choose>
									</td>
									<td><a href="${ctx}/categories/delete" onclick="return confirm('Are you sure?')">修改</a></td>
									<td><a href="${ctx}/categories/delete?id=${category.id}" onclick="return confirm('Delete <${category.name}> category?')">删除</a></td>
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