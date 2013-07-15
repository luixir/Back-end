<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="header.jsp" %>
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
              <div class="tab-pane active" id="tab1">
              <table class="table table-striped">
						<thead>
							<tr>
								<th>&nbsp;ID&nbsp;</th>
								<th>名字</th>
								<th>分类</th>
								<th>修改</th>
								<th>删除</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="item" items="${items}">
								<tr>
									<td>${item.id}</td>
									<td>${item.name}</td>
									<td>
										<c:choose>
											<c:when test="${item.category == null}">
												无
	    									</c:when>
											<c:otherwise>
												${item.category.name}
	    									</c:otherwise>
										</c:choose>
									</td>
									<td><a href="${ctx}/items/delete" onclick="return confirm('Are you sure?')">修改</a></td>
									<td><a href="${ctx}/items/delete?id=${item.id}" onclick="return confirm('Delete <${item.name}> item?')">删除</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
              </div>    
              <div class="tab-pane" id="tab2">
              <table class="table table-striped">
						<thead>
							<tr>
								<th>&nbsp;ID&nbsp;</th>
								<th>名字</th>
								<th>分类</th>
								<th>修改</th>
								<th>删除</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="item" items="${items}">
								<tr>
								<c:choose>
									<c:when test="${item.category.name == '火锅'}">
										<td>${item.id}</td>
										<td>${item.name}</td>
										<td>${item.category.name}</td>
										<td><a href="${ctx}/items/delete" onclick="return confirm('Are you sure?')">修改</a></td>
										<td><a href="${ctx}/items/delete?id=${item.id}" onclick="return confirm('Delete <${item.name}> item?')">删除</a></td>
	    							</c:when>	
								</c:choose>
								</tr>
							</c:forEach>
						</tbody>
					</table>
              </div> 
              <div class="tab-pane" id="tab3">
            <table class="table table-striped">
						<thead>
							<tr>
								<th>&nbsp;ID&nbsp;</th>
								<th>名字</th>
								<th>分类</th>
								<th>修改</th>
								<th>删除</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="item" items="${items}">
								<tr>
								<c:choose>
									<c:when test="${item.category.name=='KTV'}">
										<td>${item.id}</td>
										<td>${item.name}</td>
										<td>${item.category.name}</td>
										<td><a href="${ctx}/items/delete" onclick="return confirm('Are you sure?')">修改</a></td>
										<td><a href="${ctx}/items/delete?id=${item.id}" onclick="return confirm('Delete <${item.name}> item?')">删除</a></td>
	    							</c:when>	
								</c:choose>
								</tr>
							</c:forEach>
						</tbody>
					</table>
              </div>
              <div class="tab-pane" id="tab4">
             <table class="table table-striped">
						<thead>
							<tr>
								<th>&nbsp;ID&nbsp;</th>
								<th>名字</th>
								<th>分类</th>
								<th>修改</th>
								<th>删除</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="item" items="${items}">
								<tr>
								<c:choose>
									<c:when test="${item.category.name=='电影'}">
										<td>${item.id}</td>
										<td>${item.name}</td>
										<td>${item.category.name}</td>
										<td><a href="${ctx}/items/delete" onclick="return confirm('Are you sure?')">修改</a></td>
										<td><a href="${ctx}/items/delete?id=${item.id}" onclick="return confirm('Delete <${item.name}> item?')">删除</a></td>
	    							</c:when>	
								</c:choose>
								</tr>
							</c:forEach>
						</tbody>
					</table>
              </div>
              <div class="tab-pane" id="tab5">
              <table class="table table-striped">
						<thead>
							<tr>
								<th>&nbsp;ID&nbsp;</th>
								<th>名字</th>
								<th>分类</th>
								<th>修改</th>
								<th>删除</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="item" items="${items}">
								<tr>
								<c:choose>
									<c:when test="${item.category.name=='酒店'}">
										<td>${item.id}</td>
										<td>${item.name}</td>
										<td>${item.category.name}</td>
										<td><a href="${ctx}/items/delete" onclick="return confirm('Are you sure?')">修改</a></td>
										<td><a href="${ctx}/items/delete?id=${item.id}" onclick="return confirm('Delete <${item.name}> item?')">删除</a></td>
	    							</c:when>	
								</c:choose>
								</tr>
							</c:forEach>
						</tbody>
					</table>
              </div>
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