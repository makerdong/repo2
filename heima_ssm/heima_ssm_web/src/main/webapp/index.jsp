<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<body>
<%--<jsp:forward page="/pages/main.jsp"></jsp:forward>--%>
<form action="login" method="post">
    <table>
        <tr>
            <td>姓名：</td>
            <td><input type="text" name="username" /></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="password" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="登录" />
                <input type="reset" value="重置" /></td>
        </tr>
    </table>
</form>
</body>
</html>
