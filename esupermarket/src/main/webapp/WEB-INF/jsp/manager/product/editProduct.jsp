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

	<div style="position:  relative; left: 30px;">
		<h3>修改商品信息</h3>
	  	<div style="position: relative; top: -40px; left: 70%;">
			<button type="button" class="btn btn-primary">更新</button>
			<button type="button" class="btn btn-default">返回</button>
		</div>
		<hr style="position: relative; top: -40px;">
	</div>

	<form class="form-horizontal" role="form" >
		<div class="form-group">
			
			<label for="create-subject" class="col-sm-2 control-label">商品编号<span style="font-size: 15px; color: red;">*</span></label>
			<div class="col-sm-10" style="width: 300px;">
				<input type="text" class="form-control" id="create-subject" value="201506021225">
			</div>

			<label for="create-subject" class="col-sm-2 control-label">商品标题<span style="font-size: 15px; color: red;">*</span></label>
			<div class="col-sm-10" style="width: 300px;">
				<input type="text" class="form-control" id="create-subject" value="苹果手机">
			</div>

		</div>

		<div class="form-group">
			<label for="create-expiryDate" class="col-sm-2 control-label">商品单价</label>
			<div class="col-sm-10" style="width: 300px;">
				<input type="text" class="form-control" id="create-expiryDate" value="6499.00">
			</div>

			<label for="create-priority" class="col-sm-2 control-label">商品状态</label>
			<div class="col-sm-10" style="width: 300px;">
				<select class="form-control">
				  <option >发布</option>
				  <option >未发布</option>
				  <option >失效</option>
				</select>
			</div>

		</div>
		
		<div class="form-group">
			<label for="create-describe" class="col-sm-2 control-label">商品卖点</label>
			<div class="col-sm-10" style="width: 70%;">
				<textarea class="form-control" rows="3" id="create-describe">便宜打包处理</textarea>
			</div>
		</div>
		
		<div style="position: relative; left: 40px; height: 30px; top: 60px;">
			<div style="position: relative;top: 20px; left: 50px;">
				请选择要上传的图片：<small style="color: gray;">[仅支持.jpg或.png格式]</small>
			</div>
			<div style="position: relative;top: 50px; left: 50px;">
				<input type="file" name="photos"/>
				<img src="" style="width:600px;height:300px;"/><br>
				<input type="file" name="photos"/>
				<img src="" style="width:600px;height:300px;"/><br>
				<input type="file" name="photos"/>
				<img src="" style="width:600px;height:300px;"/><br>
				<input type="file" name="photos"/>
				<img src="" style="width:600px;height:300px;"/><br>
				<input type="file" name="photos"/>
				<img src="" style="width:600px;height:300px;"/><br>
			</div>
		</div>
	</form>

</body>
</html>