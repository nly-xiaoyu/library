<%--
  Created by IntelliJ IDEA.
  User: nly-xiaoyu
  Date: 2021/9/25
  Time: 22:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="/lib/layui-v2.6.3/css/layui.css" media="all">
    <link rel="stylesheet" href="/css/regiester/public.css">
</head>

<body style="background-image: url('/images/bg.jpg')">

<div id="gb">
    <form class="layui-form" action="/register">
        <div class="registerbox-title">用户注册中心</div>
        <label style="color: red;text-align: center">${msg}</label>
        <div class="layui-form-item">
            <label class="layui-icon layui-icon-username">用户名</label>
            <input type="text" name="username" required lay-verify="required" placeholder="请输入账号" autocomplete="off" class="layui-input">
        </div>
        <div class="layui-form-item">
            <label class="layui-icon">学号</label>
            <input type="text" name="sno" required lay-verify="required" placeholder="请输入学号" autocomplete="off" class="layui-input">
        </div>
        <div class="layui-form-item">
            <label class="layui-icon layui-icon-password">用户密码</label>
            <input type="password" name="password" required lay-verify="pwd" placeholder="请输入密码" autocomplete="off" class="layui-input" id="pass1">
        </div>
        <div class="layui-form-item">
            <label class="layui-icon layui-icon-password">确认密码</label>

            <input type="password" name="passwords" required lay-verify="pwd" placeholder="请再次输入密码" class="layui-input" id="pass2">

        </div>
        <div class="layui-form-item">
            <label class="layui-icon">性别</label>
            <div class="layui-input">
                <input type="radio" name="sex" value="0" title="男" checked>
                <input type="radio" name="sex" value="1" title="女">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input">
                <button class="layui-btn" lay-submit lay-filter="formDemo">注册</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
            <a style="text-decoration:underline	;padding-right: 20px;color: #2badce" href="/">回首页</a>
        </div>
    </form>

</div>
</body>

<script type="text/javascript" src="/lib/jquery-3.4.1/jquery-3.4.1.min.js"></script>
<!--<script type="text/javascript" src="../../layui/layui.all.js"></script>-->
<script type="text/javascript" src="/lib/layui-v2.6.3/layui.js"></script>
<script type="text/javascript">
    layui.use(['form','jquery'], function () {
        var form = layui.form,
            layer = layui.layer,
            $ = layui.$;
        })



    })

</script>
</html>