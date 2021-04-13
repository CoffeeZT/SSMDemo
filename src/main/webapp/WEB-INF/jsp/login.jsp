<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 2021/2/1
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
login
<div id="login">
    <form id="userlogin">
        <input type="text" id="username" placeholder="username">
        <input type="password" id="password" placeholder="password">
    </form>
    <input type="button" id="loginbutton" value="login">
</div>
<script type="javascript">
$("#button").click(function () {
var username = $("[name=username]").val();
if (username == ''){
    alert('error 用户名为空！');
    return;
}
/* ajax请求 */
    $.post("/login"),{
        "username":username,
        "password":password
    }
    success : function a(data) {
        if (data !=null&&data.result ==true){
            alert("登陆成功")
            window.location.href = "/hello"
        } else if (datadata !=null&&data.result ==false){
            alert('用户名或密码错误！')
            return;
        }

    }
})
</script>
</body>
</html>
