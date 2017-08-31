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
    <script type="text/javascript" src="MyJs/roleIndex.js"></script>
    <script type="text/javascript" src="MyJs/jquery-1.8.3.js"></script>
    <script type="text/javascript" src="MyJs.role.js"></script>

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
    
    角色名称：
    <input type="text" name="rolename" id="rolename"class="abc input-default" placeholder="" value="">&nbsp;&nbsp;  
    <button type="submit" class="btn btn-primary" id="roleSearch" onclick="sendRoleAjax();">查询</button>&nbsp;&nbsp; <button type="button" class="btn btn-success" id="addnew" onclick="roleSearch();">新增角色</button>

<table class="table table-bordered table-hover definewidth m10" >
    <thead>
    <tr>
        <th>角色id</th>
        <th>角色名称</th>
        <th>状态</th>
        <th>操作</th>
    </tr>
    </thead>
    
    <tbody class="nodeBody">
    	<tr>
            <td>5</td>
            <td>管理员</td>
            <td>1</td>
            <td><a href="Role/edit.jsp">编辑</a></td>
        </tr></table>
    </tbody>
	     
  </body>
  <script>
    $(function () {
        
		$('#addnew').click(function(){

				window.location.href="Role/add.jsp";
		 });


    });

	function del(id)
	{
		
		
		if(confirm("确定要删除吗？"))
		{
		
			var url = "Role/index.jsp";
			
			window.location.href=url;		
		
		}
	
	
	
	
	}
</script>
</html>
