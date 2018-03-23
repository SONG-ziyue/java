<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title></title>
<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
<script src="js/jquery_1.11.3_jquery.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
</head>
<body>
<%-- 	<%@include file="top-navigation.jsp" %> --%>
	<jsp:include page="top-navigation.jsp"/>
	<div class="jumbotron" style="padding: 0; background-color: #c7ddef;">
		<div class="container"
			style="float: left; padding-left: 180px; max-width: 700px">
			<div id="carousel-example-generic" class="carousel slide "
				data-ride="carousel" style="max-width: 500px;">
				<!-- Indicators -->
				<ol class="carousel-indicators">
					<li data-target="#carousel-example-generic" data-slide-to="0"
						class="active"></li>
					<li data-target="#carousel-example-generic" data-slide-to="1"></li>
					<li data-target="#carousel-example-generic" data-slide-to="2"></li>
				</ol>

				<!-- Wrapper for slides -->
				<div class="carousel-inner " role="listbox">
					<div class="item active">
						<img src="img/1459.JPG" width="500px" height="300px"
							alt="...">

						<div class="carousel-caption">123</div>
					</div>
					<div class="item">
						<img src="img/1493.JPG" width="500px"
							height="300px" alt="...">

						<div class="carousel-caption">456</div>
					</div>
					<div class="item">
						<img src="img/279759ee3d6d55fba9755ab36c224f4a21a4ddf7.jpg" width="500px"
							height="300px" alt="...">

						<div class="carousel-caption">789</div>
					</div>
				</div>

				<!-- Controls -->
				<a class="left carousel-control" href="#carousel-example-generic"
					role="button" data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a> <a class="right carousel-control" href="#carousel-example-generic"
					role="button" data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>
			</div>
		</div>
		<div class="container"
			style="background-color: #DBDBDB; width: 500px; height: 280px; float: left;">
			<h1>在线预约</h1>

			<p>...</p>

			<p>
				<a class="btn btn-primary btn-lg" href="#" role="button">马上预约</a>
			</p>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<h2>找医院</h2>
				<ol class="breadcrumb">
					<li class="active"><a href="#">城市A</a></li>
					<li><a href="#">城市A</a></li>
					<li><a href="#">城市A</a></li>
					<li><a href="#">城市A</a></li>
					<li><a href="#">城市A</a></li>
					<li><a class="btn btn-default btn-xs bottom-right" role="link"
						href="#">更多 &raquo;</a></li>
				</ol>
				<s:action name="findHospital" namespace="/"></s:action>
				<table>
					<c:forEach var="hospital" items="${hospitals }" begin="0" end="14">
						<!-- 						<tr align="center" height="24px"> -->
						<%-- 							<td width="100">${hospital.id}</td> --%>
						<%-- 							<td width="160"><a href="test2.jsp?param=${hospital.name}">${hospital.name}</a></td> --%>
						<!-- 						</tr> -->
						<ul class="list-group col-md-4 ">
							<li class="list-group-item"><span class="badge"
								style="background-color: green;">${hospital.level}</span><a
								href="hospital.jsp?hid=${hospital.id}">${hospital.name}</a></li>
						</ul>
					</c:forEach>
				</table>
			</div>
			<ul>
			</ul>
			<div class="col-lg-12">
				<h2>找科室</h2>
				<ol class="breadcrumb">
					<li class="active"><a href="#">城市A</a></li>
					<li><a href="#">城市A</a></li>
					<li><a href="#">城市A</a></li>
					<li><a href="#">城市A</a></li>
					<li><a href="#">城市A</a></li>
					<li><a class="btn btn-default btn-xs" role="button">更多
							&raquo;</a></li>
				</ol>
				<ul class="list-group col-md-2">
					<li class="list-group-item">内科</li>
					<li class="list-group-item">外科</li>
					<li class="list-group-item">中医科</li>
					<li class="list-group-item">口腔科</li>
					<li class="list-group-item">针灸科</li>
				</ul>
				<ul class="list-group col-md-2 ">
					<li class="list-group-item">内分泌科</li>
					<li class="list-group-item">肿瘤科</li>
					<li class="list-group-item">妇产科</li>
					<li class="list-group-item">皮肤科</li>
					<li class="list-group-item">五官科</li>
				</ul>
			</div>
		</div>
		<hr />
	</div>

	<!-- footer -->
	<%@include file="footer.jsp"%>
</body>
</html>