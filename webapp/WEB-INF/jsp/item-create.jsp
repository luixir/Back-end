<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>新增团购</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content>
<meta name="author" content>
<link rel="stylesheet" type="text/css"
	href="${ctx}/static/css/style.css">
<link rel="stylesheet" type="text/css"
	href="${ctx}/static/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="${ctx}/static/css/datepicker.css">
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
								href="">分类管理<b class="caret"></b></a>
								<ul class="dropdown-menu" role="menu" aria-labelledby="dLabel2">
									<li role="presentaition"><a role="menuitem" tabindex="-1"
										href="CategoryInput.html">新增分类</a></li>
									<li role="presentaition"><a role="menuitem" tabindex="-1"
										href="CategoryModify.html">全部分类</a></li>
								</ul></li>
						</ul>
					</div>
				</div>
			</div>


		</div>
		<div class="mainfield" style="height: 2000px">

			<ul class="breadcrumbb">
				<li><a href="HomePage.html">首页</a> <span class="divider">/</span></li>
				<li><a href="ItemModify.html">团购管理</a> <span class="divider">/</span></li>
				<li class="active">新增团购</li>
			</ul>

			<div class="field">
				<div class="container-fluid">
					<div class="row-fluid">
						
							<div class="detailInformation">

								<form class="form-horizontal" method="post"
									action="${ctx}/items/create">
									<div class="control-group">
										<label class="control-label" for="inputName">团购名称：</label>
										<div class="controls">
											<input type="text" id="inputName" placeholder="Name"
												name="name"> <abbr title="巴黎贝甜">eg</abbr>
										</div>


									</div>

									<div class="control-group">
										<label class="control-label" for="inputShortDescription">简介：</label>
										<div class="controls">
											<input type="text" id="inputShortDescription"
												placeholder="Short description" name="shortDsescription">
											<abbr title="代金券1张，全场通用，可叠加使用">eg</abbr>
										</div>
									</div>

									<div class="control-group">
										<label class="control-label" for="inputLongDescription">详情：</label>
										<div class="controls">
											<input type="text" id="inputLongDescription"
												placeholder="Long description" name="longDescription">
											<abbr title="仅售16元，价值20元的巴黎贝甜代金券1张，全场通用。时尚甜点，醉人季节，用美味让时光停驻">eg</abbr>
										</div>
									</div>

									<div class="control-group">
										<label class="control-label" for="inputMainPicture">商品图片：</label>
										<div class="controls">
											<input type="text" id="inputMainPicture"
												placeholder="main picture" name="mainPicture">
											<button type="button" class="btn">浏览</button>
										</div>
									</div>

									<div class="control-group">
										<label class="control-label" for="inputArea">商品区域：</label>
										<div class="controls">
											<input type="text" id="inputarea"
												placeholder="area" name="area">
											
										</div>
									</div>

									<div class="control-group">
										<label class="control-label" for="inputPrice">商品原价：</label>
										<div class="controls">
											<input type="text" id="inputPrice" placeholder="price"
												name="actualPrice"> <abbr title="20">eg</abbr>
										</div>
									</div>

									<div class="control-group">
										<label class="control-label" for="inputDiscountedPrice">折扣价：</label>
										<div class="controls">
											<input type="text" id="inputDiscountedPrice"
												placeholder="Discounted price" name="discountPrice">
											<abbr title="16">eg</abbr>
										</div>
									</div>

									<div class="control-group">
										<label class="control-label" for="inputDiscount">折扣：</label>
										<div class="controls">
											<input type="text" id="inputDiscount" placeholder="Discount"
												name="discount"> <abbr title="8">eg</abbr>
										</div>
									</div>




									<div class="control-group">
										<label class="control-label" for="inputStartTime">开始时间：</label>
										<div class="input-append date datepicker"
											data-date="12-02-2012" data-date-format="dd-mm-yyyy"
											style="margin-left: 16px;">
											<input size="16" type="text" value="12-02-2012" readonly>

											<span class="add-on"><i class="icon-th"></i></span> <input
												type="hidden" id="dtp_input1" value="" />
										</div>
									</div>

									<div class="control-group">
										<label class="control-label" for="inputEndTime">结束时间：</label>
										<div class="input-append date datepicker"
											data-date="12-02-2012" data-date-format="dd-mm-yyyy"
											style="margin-left: 16px;">
											<input size="16" type="text" value="12-02-2012" readonly>

											<span class="add-on"><i class="icon-th"></i></span> <input
												type="hidden" id="dtp_input1" value="" />
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
										<label class="control-label" for="inputCategory">分类：</label>
										<div class="controls">
											<label class="radio inline"> 
												<c:forEach
													var="rootItems" items="${rootItems}">
													<input type="radio" name="optionsRadios"
														id="optionsRadios11" value="option11" checked>${rootItems.category}/
                                                </c:forEach>
											</label> 
										</div>
									</div>


									<div class="control-group">
										<label class="control-label" for="inputFeature">其他特点：</label>
										<div class="controls">

											<label class="checkbox inline"> <input
												type="checkbox" id="inlineCheckbox1" value="option1">免预约
											</label> <label class="checkbox inline"> <input
												type="checkbox" id="inlineCheckbox2" value="option2">支持随时退
											</label> <label class="checkbox inline"> <input
												type="checkbox" id="inlineCheckbox3" value="option3">支持过期退
											</label>
										</div>
									</div>
									
								</form>
							
							<!--Sidebar content-->





						


							

								<form class="form-horizontal">

									<label><b>地址：</b></label>
									<div class="control-group">
										<label class="control-label" for="inputShopName">商家名称：</label>
										<div class="controls">
											<input type="text" id="inputShopName" placeholder="Shop name"
												name="address.name"> <abbr title="巴黎贝甜（国贸店）">eg</abbr>
										</div>
									</div>

									<div class="control-group">
										<label class="control-label" for="inputDetailAddress">详细地址：</label>
										<div class="controls">
											<input type="text" id="inputDetailAddress"
												placeholder="detail address" name="address.addressDetail">
											<abbr title="朝阳区建国门外大街1号国贸商城B1楼SB124A">eg</abbr>

										</div>
									</div>

									<div class="control-group">
										<label class="control-label" for="inputPhone">联系方式：</label>
										<div class="controls">
											<input type="text" id="inputPhone" placeholder="phone"
												name="address.phone"> <abbr title="010-51303960">eg</abbr>
										</div>
									</div>

									<div class="control-group">
										<label class="control-label" for="inputTranportationMethod">交通方式：</label>
										<div class="controls">
											<input type="text" id="inputTranportationMethod"
												placeholder="tranportation method" name="nethodToThere">
											<abbr title="地铁大望路站">eg</abbr>
										</div>
									</div>

								

									<label><b>本单详情：</b></label>
									<div class="control-group">
										<label class="control-label" for="inputItemDetailName">内容：</label>
										<div class="controls">
											<input type="text" id="inputItemDetailName"
												placeholder="item detail name"> <abbr title="代金券">eg</abbr>
										</div>
									</div>

									<div class="control-group">
										<label class="control-label" for="inputItemDetailPrice">单价：</label>
										<div class="controls">
											<input type="text" id="inputItemDetailPrice"
												placeholder="price"> <abbr title="20">eg</abbr>
										</div>
									</div>

									<div class="control-group">
										<label class="control-label" for="inputItemDetailNumber">数量：</label>
										<div class="controls">
											<input type="text" id="inputItemDetailNumber"
												placeholder="number"> <abbr title="1">eg</abbr>
										</div>
									</div>

									<div class="control-group">
										<label class="control-label" for="inputItemDetailTotal">小计：</label>
										<div class="controls">
											<input type="text" id="inputItemDetailTotal"
												placeholder="total"> <abbr title="20">eg</abbr>
										</div>
									</div>

									<p>
										<button class="btn " type="button" style="color: black">
											<b>继续添加</b>
										</button>
									</p>
									
									<div class="confrimBtn">
										<p>
											<button class="btn " type="button" style="color: black">
												<b>确认</b>
											</button>
										</p>
									</div>
									
									
								</form>

							</div>
							<!--Body content-->
						</div>
					
				</div>



			</div>
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
			todayBtn : true
		});
	</script>




</body>

</html>