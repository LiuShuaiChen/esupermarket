<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%   
String path = request.getContextPath();   
String basePath = request.getScheme()+"://" +request.getServerName()+":" +request.getServerPort()+path+"/" ;   
%>   
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<base href="<%=basePath%>" > 
<link href="jquery/bootstrap_3.3.0/css/bootstrap.min.css" type="text/css" rel="stylesheet" />
<link rel="stylesheet" href="jquery/bs_pagination/css/jquery.bs_pagination.min.css" type="text/css" />

<script type="text/javascript" src="jquery/jquery-1.11.1-min.js"></script>
<script type="text/javascript" src="jquery/bootstrap_3.3.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="jquery/bs_pagination/js/jquery.bs_pagination.min.js"></script>
<script type="text/javascript" src="jquery/bs_pagination/js/localization/en.js"></script>
</head>
<body>

	<div style="width: 80%">
		<div style="position: relative; left: 10px; top: -10px;">
			<div class="page-header">
				<h3>商品列表</h3>
			</div>
		</div>
	</div>
	
	<div style="position: relative; top: -20px; left: 0px; width: 100%; height: 100%;">
	
		<div style="width: 80%; position: absolute;top: 5px; left: 10px;">
		
			<div class="btn-toolbar" role="toolbar" style="height: 80px;">
				<form class="form-inline" role="form" style="position: relative;top: 8%; left: 5px;">
				  
				  <div class="form-group">
				    <div class="input-group">
				      <div class="input-group-addon">商品编号</div>
				      <input class="form-control" type="text">
				    </div>
				  </div>
				  
				   <div class="form-group">
				    <div class="input-group">
				      <div class="input-group-addon">商品标题</div>
				      <input class="form-control" type="text">
				    </div>
				  </div>
				  
				   <div class="form-group">
				    <div class="input-group">
				      <div class="input-group-addon">商品单价</div>
				      <input class="form-control" type="text">
				    </div>
				  </div>
				  
				  <br>
				  
				  <div class="form-group">
				    <div class="input-group">
				      <div class="input-group-addon">商品卖点</div>
				      <input class="form-control" type="text">
				    </div>
				  </div>
				  
				  <div class="form-group">
				    <div class="input-group">
				      <div class="input-group-addon">商品状态</div>
					  <select class="form-control">
					  	<option></option>
					    <option>未发布</option>
					    <option>已发布</option>
					    <option>失效</option>
					  </select>
				    </div>
				  </div>
				  
				  <button type="button" class="btn btn-default">查询</button>			  
				   <span id="message" style="color:red;font-size:16px;"></span>
				</form>
			</div>

			<div class="btn-toolbar" role="toolbar" style="background-color: #F7F7F7; height: 50px; position: relative;top: 5px;">
				<div class="btn-group" style="position: relative; top: 18%;">
				  <button type="button" class="btn btn-primary" onclick="window.location.href='product/saveProduct.do';"><span class="glyphicon glyphicon-plus"></span> 创建</button>
				 
				  <button type="button" class="btn btn-default" onclick="window.location.href='product/editProduct.do';"><span class="glyphicon glyphicon-pencil"></span> 修改</button>
				  <button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-minus"></span> 删除</button>
				</div>
			</div>

			<div style="position: relative;top: 10px;" >
				<table class="table table-hover">
					<thead>
						<tr style="color: #B3B3B3;">
							<td><input type="checkbox" /></td>
							<td>商品编号</td>
							<td>商品标题</td>
							<td>商品单价</td>
							<td>商品状态</td>
							<td>商品卖点描述</td>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><input type="checkbox" /></td>
							<td><a style="text-decoration: none; cursor: pointer;" onclick="window.location.href='detail.html';">HonorH10001</a></td>
							<td>荣耀8，5寸大屏</td>
							<td>1999.0</td>
							<td>未发布</td>
							<td>荣耀8，5寸大屏！不要99，不要199，只卖1999！</td>
						</tr>
						<tr>
							<td><input type="checkbox" /></td>
							<td><a style="text-decoration: none; cursor: pointer;" onclick="window.location.href='detail.html';">HonorH10001</a></td>
							<td>荣耀8，5寸大屏</td>
							<td>1999.0</td>
							<td>未发布</td>
							<td>荣耀8，5寸大屏！不要99，不要199，只卖1999！</td>
						</tr>
					</tbody>
				</table>
			</div>
			
			<div style="height: 50px; position: relative;top: 30px;">
				<div>
					<button type="button" class="btn btn-default" style="cursor: default;">共<b>50</b>条记录</button>
				</div>
				<div class="btn-group" style="position: relative;top: -34px; left: 110px;">
					<button type="button" class="btn btn-default" style="cursor: default;">显示</button>
					<div class="btn-group">
						<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
							10
							<span class="caret"></span>
						</button>
						<ul class="dropdown-menu" role="menu">
							<li><a href="#">20</a></li>
							<li><a href="#">30</a></li>
						</ul>
					</div>
					<button type="button" class="btn btn-default" style="cursor: default;">条/页</button>
				</div>
				<div style="position: relative;top: -88px; left: 285px;">
					<nav>
						<ul class="pagination">
							<li class="disabled"><a href="#">首页</a></li>
							<li class="disabled"><a href="#">上一页</a></li>
							<li class="active"><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">5</a></li>
							<li><a href="#">下一页</a></li>
							<li class="disabled"><a href="#">末页</a></li>
						</ul>
					</nav>
				</div>
			</div>
			
		</div>
		
	</div>
</body>
</html>