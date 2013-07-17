<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<div class="mainfield">

	<ul class="breadcrumbb">
		<li><a href="HomePage.html">首页</a> <span class="divider">/</span></li>
		<li><a href="ItemModify.html">团购管理</a> <span class="divider">/</span></li>
		<li class="active">修改团购</li>
	</ul>

	<div class="field">
		<div class="container-fluid">
		<h3>修改团购</h3>
			<form class="form-horizontal" method="post" action="${ctx}/items/modify">
				<div class="row-fluid">
					<div class="left">
						<div class="control-group">
							<label class="control-label" for="id">ID：</label>
							<div class="controls">
								<input type="text" id="inputName" placeholder="id" name="id" value="${item.id}">
								<abbr title="1">eg</abbr>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="inputName">团购名称：</label>
							<div class="controls">
								<input type="text" id="inputName" placeholder="Name" name="name" value="${item.name}">
								<abbr title="巴黎贝甜">eg</abbr>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="inputShortDescription">简介：</label>
							<div class="controls">
								<input type="text" id="inputShortDescription"
									placeholder="Short description" name="shortDescription" value="${item.shortDescription}">
								<abbr title="代金券1张，全场通用，可叠加使用">eg</abbr>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="inputLongDescription">详情：</label>
							<div class="controls">
								<textarea rows="4" id="inputLongDescription"
									placeholder="Long description" name="longDescription">
									${item.longDescription}
								</textarea>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="inputMainPicture">商品图片：</label>
							<div class="controls">
								<input type="text" id="inputMainPicture"
									placeholder="main picture" name="mainPicture" value="${item.mainPicture}">
								<button type="button" class="btn">浏览</button>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="inputArea">商品区域：</label>
							<div class="controls">
								<input type="text" id="inputarea" placeholder="area" name="area" value="${item.area}">
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="inputPrice">商品原价：</label>
							<div class="controls">
								<input type="text" id="inputPrice" placeholder="price"
									name="actualPrice" value="${item.actualPrice}"> <abbr title="20">eg</abbr>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="inputDiscountedPrice">折扣价：</label>
							<div class="controls">
								<input type="text" id="inputDiscountedPrice"
									placeholder="Discounted price" name="discountPrice" value="${item.discountPrice}"> <abbr
									title="16">eg</abbr>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="inputDiscount">折扣：</label>
							<div class="controls">
								<input type="text" id="inputDiscount" placeholder="Discount"
									name="discount" value="${item.discount}"> <abbr title="8">eg</abbr>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="inputStartDate">开始时间：</label>
							<div class="input-append date datepicker" data-date="12-02-2013"
								data-date-format="yyyy-mm-dd" style="margin-left: 16px;">
								<input size="16" type="text" name="startDate" value="${item.startDate}" readonly>

								<span class="add-on"><i class="icon-th"></i></span>
								<input type="hidden" id="dtp_input1" value="" />
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="inputEndTime">结束时间：</label>
							<div class="input-append date datepicker" data-date="12-02-2013"
								data-date-format="yyyy-mm-dd" style="margin-left: 16px;">
								<input size="16" type="text" name="endDate" value="${item.endDate}" readonly>

								<span class="add-on"><i class="icon-th"></i></span>
								<input type="hidden" id="dtp_input1" value="" />
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="inputContent">商品介绍图片：</label>
							<div class="controls">
								<input type="text" id="inputContent" placeholder="Content">
								<button type="button" class="btn">浏览</button>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="inputContent">分类：</label>
									<c:forEach var="listcategory" items="${listcategory}" varStatus="theCount">
                                             <label class="radio inline"> 
                                             <input type="radio" name="category.id" id="optionsRadios${theCount.count}" value="${listcategory.id}">
                                             ${listcategory.name}
                                             </label>
                                             </c:forEach>
						</div>

						<div class="control-group">
							<label class="control-label" for="inputFeature">其他特点：</label>
							<div class="controls">
								<c:forEach var="listfeature" items="${listfeature}"
									varStatus="theCount">
									<label class="checkbox inline"> <input type="checkbox"
										id="inlineCheckbox${theCount.count}"
										value="${listfeature.name}"> ${listfeature.name}
									</label>
								</c:forEach>
							</div>
						</div>
					</div>

					<!--Sidebar content-->
					<div class="right">
						<label><b>地址：</b></label>
						<div class="control-group">
							<label class="control-label" for="inputShopName">商家名称：</label>
							<div class="controls">
								<input type="text" id="inputShopName" placeholder="Shop name"
									name="address.name" value="${item.address.name}"> <abbr title="巴黎贝甜（国贸店）">eg</abbr>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="inputDetailAddress">详细地址：</label>
							<div class="controls">
								<textarea rows="3" id=""inputDetailAddress""
									placeholder="detail address" name="address.addressDetail">
									${item.address.addressDetail}
								</textarea>
								<abbr title="朝阳区建国门外大街1号国贸商城B1楼SB124A">eg</abbr>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="inputPhone">联系方式：</label>
							<div class="controls">
								<input type="text" id="inputPhone" placeholder="phone"
									name="address.phone" value="${item.address.phone}"> <abbr title="010-51303960">eg</abbr>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="inputTranportationMethod">交通方式：</label>
							<div class="controls">
								<input type="text" id="inputTranportationMethod"
									placeholder="tranportation method" name="methodToThere"
									value="${item.address.methodToThere}">
								<abbr title="地铁大望路站">eg</abbr>
							</div>
						</div>

						<label><b>本单详情：</b></label>
						<div class="control-group">
							<label class="control-label" for="inputItemDetailName">内容：</label>
							<div class="controls">
								<input type="text" id="inputItemDetailName"
									placeholder="item detail name" name="item_content"> <abbr
									title="代金券">eg</abbr>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="inputItemDetailPrice">单价：</label>
							<div class="controls">
								<input type="text" id="inputItemDetailPrice" placeholder="price"
									name="price"> <abbr title="20">eg</abbr>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="inputItemDetailNumber">数量：</label>
							<div class="controls">
								<input type="text" id="inputItemDetailNumber"
									placeholder="number" name="number"> <abbr title="1">eg</abbr>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="inputItemDetailTotal">小计：</label>
							<div class="controls">
								<input type="text" id="inputItemDetailTotal" placeholder="total"
									name="original_total_price"> <abbr title="20">eg</abbr>
							</div>
						</div>

						<p>
							<button class="btn " type="submit"
								style="color: black margin-left:50px">
								<b>继续添加</b>
							</button>
						</p>

					</div>
					<div class="confrimBtn">
						<p>
							<button class="btn " type="submit" style="color: black">
								<b>确认</b>
							</button>
						</p>
					</div>
				</div>
			</form>
		</div>
		<!--Body content-->
	</div>
</div>

<footer></footer>
<script type="text/javascript" src="${ctx}/static/js/jquery.js"></script>
<script type="text/javascript" src="${ctx}/static/js/bootstrap.js"></script>
<script type="text/javascript" src="${ctx}/static/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="${ctx}/static/js/bootstrap-datepicker.js"></script>

<script>
	$('.dropdown-toggle').dropdown();
</script>

<script type="text/javascript">
	$('.datepicker').datepicker({
		autoclose : true,
		todayBtn : true,
		format: 'yyyy-mm-dd',
		todayHighlight: true,
	});
</script>

</body>

</html>