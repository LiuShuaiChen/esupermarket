<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%   
String path = request.getContextPath();   
String basePath = request.getScheme()+"://" +request.getServerName()+":" +request.getServerPort()+path+"/" ;   
%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<base href="<%=basePath%>" >  
<link href="jquery/bootstrap_3.3.0/css/bootstrap.min.css" type="text/css" rel="stylesheet" />

<script type="text/javascript" src="jquery/jquery-1.11.1-min.js"></script>
<script type="text/javascript" src="jquery/form/jquery.form.js"></script>
<script type="text/javascript" src="jquery/bootstrap_3.3.0/js/bootstrap.min.js"></script>

</head>
<body>

	<div style="position:  relative; left: 30px;width:100%;">
		<h3>创建商品</h3>
	  	<div style="position: relative; top: -40px; left: 70%;">
			<button type="button" class="btn btn-primary">保存</button>
			<button type="button" class="btn btn-default" onclick="window.history.back(-1);">返回</button>
		</div>
		<hr style="position: relative; top: -40px;">
	</div>

	<form class="form-horizontal" role="form" >
		<div class="form-group">
			
			<label for="create-subject" class="col-sm-2 control-label">商品编号<span style="font-size: 15px; color: red;">*</span></label>
			<div class="col-sm-10" style="width: 300px;">
				<input type="text" class="form-control" id="create-subject">
			</div>

			<label for="create-subject" class="col-sm-2 control-label">商品标题<span style="font-size: 15px; color: red;">*</span></label>
			<div class="col-sm-10" style="width: 300px;">
				<input type="text" class="form-control" id="create-subject">
			</div>

		</div>

		<div class="form-group">
			<label for="create-expiryDate" class="col-sm-2 control-label">商品单价</label>
			<div class="col-sm-10" style="width: 300px;">
				<input type="text" class="form-control" id="create-expiryDate">
			</div>

			<label for="create-priority" class="col-sm-2 control-label">商品状态</label>
			<div class="col-sm-10" style="width: 300px;">
				<select class="form-control" id="create-priority">
				  <option>未发布</option>
				  <option>发布</option>
				  <option>失效</option>
				</select>
			</div>

		</div>
		
		<div class="form-group">
			<label for="create-describe" class="col-sm-2 control-label">商品卖点</label>
			<div class="col-sm-10" style="width: 70%;">
				<textarea class="form-control" rows="3" id="create-describe"></textarea>
			</div>
		</div>
		<div class="modal-body" style="height: 400px;">
			<div style="position: relative;top: 20px; left: 50px;">
				请选择要上传的图片：<span style="font-size: 15px; color: red;">*</span><small style="color: gray;">[必须上传五张图片，仅支持.jpg或.png格式]</small>
			</div>
			<div style="position: relative;top: 50px; left: 50px;">
				<input type="file" name="photos">
				<input type="file" name="photos">
				<input type="file" name="photos">
				<input type="file" name="photos">
				<input type="file" name="photos">
				<span id="checkImages" style="color:red;"></span>
			</div>
		</div>
	</form>

</body>
</html>