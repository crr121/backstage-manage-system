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
    <script type="text/javascript" src="MyJs/node.js"></script>

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
  <form class="form-inline definewidth m20" > 
     部门名称：
   <input type="text" name="rolename" id="rolename"class="abc input-default" placeholder="" value="">&nbsp;&nbsp;  
   <button type="submit" class="btn btn-primary" onclick="sendNodeAjax();" id="nodeSearch">查询</button>&nbsp;&nbsp; 
   <button type="button" class="btn btn-success" id="addnew">添加部门</button>
   
</form>
<table class="table table-bordered table-hover definewidth m10" >
    <thead>
    <tr>
        <th >部门编号</th>
        <th>部门名称</th>
        <th>状态</th>
        <th>管理操作</th>
    </tr>
    </thead>
    <tbody class="nodeBody">
   		<tr>
            <td >5</td>
            <td>管理员</td>
            <td>1</td>
            <td id="nodeid"><a href="Node/edit.jsp" >修改</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="Node/index.jsp"   >删除</a> </td> 
         </tr>
    </tbody>
</table>
<div class="inline pull-right page">
         10122 条记录 1/507 页  <a href='#'>下一页</a>     <span class='current'>1</span><a href='#'>2</a><a href='/chinapost/index.php?m=Label&a=index&p=3'>3</a><a href='#'>4</a><a href='#'>5</a>  <a href='#' >下5页</a> <a href='#' >最后一页</a>    </div>

  </body>
  <script>
    $(function () {
        
		$('#addnew').click(function(){

				window.location.href="Node/add.jsp";
		 });
    });

   /*  $(function(){
    	$('nodedel').click(function(){
    		alert(12);
    	})
    });
     */
    
	function del(id)
	{
		
		
		if(confirm("确定要删除吗？"))
		{
		
			var url = "Node/index.jsp";
			
			window.location.href=url;		
		
		}
	
	}
	
	
</script>
</html>
