<%@ page language="java" contentType="text/html; charset=GB2312"
	pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB2312">
<title>��ҳ</title>
<!-- ���°汾�� Bootstrap ���� CSS �ļ� -->
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- ��ѡ�� Bootstrap �����ļ���һ�㲻�����룩 -->
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!-- ���µ� Bootstrap ���� JavaScript �ļ� -->
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
</head>
<body
	style="background-image: url(image/2.jpg); background-repeat: no-repeat; background-attachment: fixed; background-size: cover" >
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="row-fluid">
				<div class=col-md-4 column></div>
				<div class=col-md-4 column>
					<br />
					<br />
					<br />
					<br />
					<form class="form-inline" action="Login" method="post">
						<fieldset>
							<legend>��ӭʹ��</legend>
							<label>�û���</label>
							<p>
								<input type="text" name="userName"/>
							</p>
							<label>����</label>
							<p>
								<input type="password" name="userPasswd"/> 
							</p>
							<button class="btn" type="submit">��¼</button>
						</fieldset>
					</form>
				</div>
				<div class=col-md-4 column></div>
			</div>
		</div>
	</div>
</body>
</html>