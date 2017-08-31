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
<form action="Role/index.jsp" method="post" class="definewidth m20">
    <table class="table table-bordered table-hover definewidth m10">
        <tr>
            <td width="10%" class="tableleft">角色名称</td>
            <td><input type="text" name="title"/></td>
        </tr>
        <tr>
            <td class="tableleft">状态</td>
            <td>
                <input type="radio" name="status" value="1" checked/> 启用  <input type="radio" name="status" value="0"/> 禁用
            </td>
        </tr>
        <tr>
            <td class="tableleft">权限</td>
            <td>
                <ul>
            	   
               	     <li><label class='checkbox inline'><input type='checkbox' name='group[]' value='' />部门管理</label>
			                <ul>
			                	<li><label class='checkbox inline'><input type='checkbox' name='node[]' value='1' />部门查询</label>
			               	    <li><label class='checkbox inline'><input type='checkbox' name='node[]' value='2' />部门添加</label>
			                    <li><label class='checkbox inline'><input type='checkbox' name='node[]' value='3' />部门删除</label>
			                    <li><label class='checkbox inline'><input type='checkbox' name='node[]' value='4' />部门修改</label>
			                </ul>
            	    </li>
               
               
                    <li><label class='checkbox inline'><input type='checkbox' name='group[]' value='' />角色管理</label>
			                <ul>
				                <li><label class='checkbox inline'><input type='checkbox' name='node[]' value='5' />角色列表</label>
				                <li><label class='checkbox inline'><input type='checkbox' name='node[]' value='6' />角色添加</label>
				                <li><label class='checkbox inline'><input type='checkbox' name='node[]' value='7' />角色编辑</label>
				                <li><label class='checkbox inline'><input type='checkbox' name='node[]' value='8' />角色删除</label>
			                </ul>
               	    </li>	


               
                   <li><label class='checkbox inline'><input type='checkbox' name='group[]' value='' />用户管理</label>
			                <ul>
				                <li><label class='checkbox inline'><input type='checkbox' name='node[]' value='9' />用户列表</label>
				                <li><label class='checkbox inline'><input type='checkbox' name='node[]' value='10' />用户添加</label>
				                <li><label class='checkbox inline'><input type='checkbox' name='node[]' value='11' />用户编辑</label>
				                <li><label class='checkbox inline'><input type='checkbox' name='node[]' value='12' />用户删除</label>
			                </ul>
                   </li>
                
                
               	   <li><label class='checkbox inline'><input type='checkbox' name='group[]' value='' />模块管理</label>
			                <ul>
				                <li><label class='checkbox inline'><input type='checkbox' name='node[]' value='13' />模块列表</label>
				                <li><label class='checkbox inline'><input type='checkbox' name='node[]' value='14' />模块新增</label>
				                <li><label class='checkbox inline'><input type='checkbox' name='node[]' value='15' />模块编辑</label>
				                <li><label class='checkbox inline'><input type='checkbox' name='node[]' value='16' />模块删除</label>
			                </ul>
                   </li>
                
                
                    <li><label class='checkbox inline'><input type='checkbox' name='group[]' value='' />公告管理</label>
               			    <ul>
               			        <li><label class='checkbox inline'><input type='checkbox' name='node[]' value='17' />发布公告</label>
				                <li><label class='checkbox inline'><input type='checkbox' name='node[]' value='18' />修改公告</label>
				                <li><label class='checkbox inline'><input type='checkbox' name='node[]' value='19' />删除公告</label>
				            </ul>
				    </li>
                
                
                
                
	                <li><label class='checkbox inline'><input type='checkbox' name='group[]' value='' />系统设置</label>
			                <ul>
				                <li><label class='checkbox inline'><input type='checkbox' name='node[]' value='20' />密码重置</label>
			                </ul>
		            </li>
                
              	  
            </ul> 
          </td>
        </tr>
        <tr>
            <td class="tableleft"></td>
            <td>
                <button type="submit" class="btn btn-primary" type="button">保存</button> &nbsp;&nbsp;<button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button>
            </td>
        </tr>
    </table>
</form>
  </body>
 <script>
    $(function () {
        $(':checkbox[name="group[]"]').click(function () {
            $(':checkbox', $(this).closest('li')).prop('checked', this.checked);
        });

		$('#backid').click(function(){
				window.location.href="Role/index.jsp";
		 });
    });
</script>
</html>
