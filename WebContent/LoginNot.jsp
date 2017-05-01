<%@ page language="java" contentType="text/html; charset=GB2312"
	pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
<!--JS函数，用于重定向至登录界面-->
	function Alert() {
		alert("尚未登陆");
		setTimeout('Redirect()', 1);
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
	style="background-image: url(image/2.jpg); background-repeat: no-repeat; background-attachment: fixed; background-size: cover">
</body>
</html>