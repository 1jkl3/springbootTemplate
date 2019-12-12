<%--
  Created by IntelliJ IDEA.
  User: tgj
  Date: 2019/9/10
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
    <link rel="stylesheet" href="/static/css/index.css">
</head>
<body>
    <div  id="app">
        <el-container v-cloak>
            <span>{{msg}}</span>
        </el-container>
    </div>
</body>
<script src="https://unpkg.com/vue/dist/vue.js"></script>
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<script src="/static/js/index.js"></script>
</html>
