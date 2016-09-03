<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>数据应用登录</title>
<script src="${ctx }/js/jquery/jquery.min-1.11.3.js"></script>
<link rel="stylesheet" href="${ctx}/css/global.css">
<link rel="stylesheet" href="${ctx}/css/login.css">
<script type="text/javascript">
	$(function(){
		$(".webTitle").css("line-height",$(".webTitle").height()+"px");
		$(".userName").focus(function(){
			$(this).addClass("userNamfocus");
		}).blur(function(){
			$(this).removeClass("userNamfocus");
		});
		$(".passWord").add(".passWord1").focus(function(){
			$(".pwdDiv").addClass("userNamfocus");
		}).blur(function(){
			$(".pwdDiv").removeClass("userNamfocus");
		});
		$(".pwdDiv span").click(function(){
			if($(".passWord").css("display")=="none"){
				$(".pwdDiv span").html("显示");
				$(".passWord").val($(".passWord1").val());
				$(".passWord").show();
				$(".passWord1").hide();
			}else{
				$(".pwdDiv span").html("隐藏");
				$(".passWord1").val($(".passWord").val());
				$(".passWord1").show();
				$(".passWord").hide();
			}
		});
	});
	function subCheck(){
		if($(".userName").val()==""){
			$(".hint").html("用户名不能为空");
			return false;
		}else if($(".passWord").val()==""){
			$(".hint").html("密码不能为空");
			return false;
		}else{
			if($(".passWord").css("display")=="none"){
				$(".passWord").val($(".passWord1").val());
			}
			return true;
		}
	}
</script>
</head>
<body style="height: 100%;min-height: 550px;">
	<div class="webTitle">
		<div>欢迎使用天龙智能分析系统</div>
	</div>
	<div class="loginmain">
		<img src="${ctx}/image/logo.png"/>
		<form class="loginForm" method="post" action="${ctx }/login" onsubmit="return subCheck();">
			<div class="hint">${errorInfo}</div>
			<input type="text" class="userName" name="userName" value="${userName}" placeholder="用户名" />
			<div class="pwdDiv">
				<input type="password" class="passWord"  name="passWord" placeholder="密码" />
				<input type="text" class="passWord1"  placeholder="密码" />
				<span>显示</span>
			</div>
			<div class="forgetPwd"><a href="#">忘记密码?</a></div>
			<input type="submit" class="subBtn" value="登录" />
		</form>
		<div class="webInfo"> Copyright © 2015-2025 安能物流. 
			<span class="triangle-topleft "></span>
		</div>
	</div>
	<ul class="bottomBg">
		<li style="background: #000;"></li>
		<li style="background: #E68514;"></li>
	</ul>
</body>
</html>