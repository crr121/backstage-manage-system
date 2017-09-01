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
