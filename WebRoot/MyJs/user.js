window.onload=function (){sendRoleAjax();sendNodeAjax();};
//用户界面的角色查询
function sendRoleAjax(){

	$.post("roleSearchServlet.do",{"rolename":'',"random":Math.random()},function(data){
	/*	alert(7888);
	alert(data);*/
		$.each(data,function(index,role){
//			alert(12);
			$("#userRole").append(" <li><label class='checkbox inline'><input type='checkbox' name='roleGroup[]' value="+role.roleId+" id='list1' onclick='test();'/>"+role.roleName+"</label>");
		});
	},"json");

};


//用户界面的部门查询
function sendNodeAjax(){

	$.post("nodeSearchServlet.do",{"rolename":'',"random":Math.random()},function(data){
//		alert(data);
//		alert(44);
		$.each(data,function(index,depart){
//			alert($("#userDepart"));
			$("#userDepart").append(" <li><label class='checkbox inline'><input type='checkbox' name='departGroup[]' value="+depart.departId+" id='list1' onclick='test();'/>"+depart.departName+"</label>");
		});
	},"json");
	
};

//index.jsp 查询

function searchAll (){
	$.post("userSearchServlet.do",{"username":'',"random":Math.random()},function(data){
//		alert(data);
		$.each(data,function(index,user){
			$(".userBody").append("<tr><td >"+user.userId+"</td>" +
					"<td>"+user.userName+"</td>" +
							"<td>"+user.userRealname+"</td>" +
									"<td ><a href='User/edit.jsp' >修改</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href='User/index.jsp' >删除</a></td></tr>");
		});
	},"json");
	
}





