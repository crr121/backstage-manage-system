<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title></title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="Css/style.css" />
    <script type="text/javascript" src="Js/jquery.js"></script>
    <script type="text/javascript" src="Js/jquery.sorted.js"></script>
    <script type="text/javascript" src="Js/bootstrap.js"></script>
    <script type="text/javascript" src="Js/ckform.js"></script>
    <script type="text/javascript" src="Js/common.js"></script>

    <style type="text/css">
        body {
            padding-bottom: 40px;
        }
        .sidebar-nav {
            padding: 9px 0;
        }

        @media (max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
                float: none;
                padding-left: 5px;
                padding-right: 5px;
            }
        }


    </style>
  </head>
  
  <body>
    <form class="form-inline definewidth m20" action="index.jsp" method="get">
    模块名称：
    <input type="text" name="menuname" id="menuname"class="abc input-default" placeholder="" value="">&nbsp;&nbsp; 
    <button type="submit" class="btn btn-primary">查询</button>&nbsp;&nbsp; <button type="button" class="btn btn-success" id="addnew">新增菜单</button>
</form>
<table class="table table-bordered table-hover definewidth m10">
    <thead>
    <tr>
        <th>模块编号</th>
        <th>模块名称</th>
        <th>模块地址</th>
        <th>状态</th>
        <th>管理操作</th>
    </tr>
    </thead>
	     <tr>
            <td colspan="5">系统管理</td>
            <!-- <td><a href="Menu/edit.jsp">编辑</a></td> -->
        </tr>
        <tr>
                <td>12</td>
                <td>部门管理</td>
                <td>system_2/Node/index.jsp</td>
                <td>1</td>
                <td><a href="Menu/edit.jsp">编辑</a>&nbsp;&nbsp;&nbsp;<a href="Menu/index.jsp">删除</a></td>
            </tr><tr>
             	<td>3</td>
                <td>角色管理</td>
                <td>system_2/Role/index.jsp</td>
                <td>1</td>
                <td><a href="Menu/edit.jsp">编辑</a>&nbsp;&nbsp;&nbsp;<a href="Menu/index.jsp">删除</a></td>
            </tr><tr>
                <td>4</td>
                <td>用户管理</td>
                <td>system_2/User/index.jsp</td>
                <td>1</td>
                <td><a href="Menu/edit.jsp">编辑</a>&nbsp;&nbsp;&nbsp;<a href="Menu/index.jsp">删除</a></td>
            </tr><tr>
                <td>6</td>
                <td>模块管理</td>
                <td>system_2/Menu/index.jsp</td>
                <td>1</td>
                <td><a href="Menu/edit.jsp">编辑</a>&nbsp;&nbsp;&nbsp;<a href="Menu/index.jsp">删除</a></td>
            </tr><tr>
                <td>8</td>
                <td>公告管理</td>
                <td>system_2/Declare/index.jsp</td>
                <td>1</td>
                <td><a href="Menu/edit.jsp">编辑</a>&nbsp;&nbsp;&nbsp;<a href="Menu/index.jsp">删除</a></td>
            </tr><tr>
                <td>10</td>
                <td>密码重置</td>
                <td>system_2/PwdReset/index.jsp</td>
                <td>1</td>
                <td><a href="Menu/edit.jsp">编辑</a>&nbsp;&nbsp;&nbsp;<a href="Menu/index.jsp">删除</a></td>
            </tr>
       </table>

  </body>
  <script>
    $(function () {
        

		$('#addnew').click(function(){

				window.location.href="Menu/add.jsp";
		 });


    });
	
</script>
</html>
