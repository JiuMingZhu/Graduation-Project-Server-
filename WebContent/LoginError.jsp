<%@ page language="java" contentType="text/html; charset=GB2312"
	pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
<!--JS函数，用于重定向至登录界面-->
	function Alert() {
		alert("用户名或密码错误，点击确定后3秒返回登录页面");
		setTimeout('Redirect()', 3000);
	}
	function Redirect() {
		window.location = "index.jsp";
	}
	Alert();
</script>
<meta http-equiv="Content-Type" content="text/html; charset=GB2312">
<title>Insert title here</title>
</head>
<body
	style="background-image: url(image/3.jpg); background-repeat: no-repeat; background-attachment: fixed; background-size: cover">
</body>
</html>