//获取复选框的值
function checkboxResult(){
	var groups = "";
	var temp="";
	var group = document.getElementsByName("group[]");
	for(var i=0; i<group.length;i++){
		if(group[i].checked){
			temp=group[i].value;
			groups = groups + "," + temp;
		}
	}
};
/*
//将页面的参数传入到servlet,发送Ajax请求
function sendRoleAjax(){
	checkboxResult();
	$.post("roleAddServlet.do",{"roleName":title,"roleState":status,"roleRight":groups },function(data){
	
	
	});
};
*/
window.onload=sendRoleAjax;

function sendRoleAjax(){
//	alert(11);
	$.post("roleSearchServlet.do",{"rolename":'',"random":Math.random()},function(data){
//		alert(data);
		$.each(data,function(index,role){
			$(".nodeBody").append("<tr><td >"+role.roleId+"</td>" +
					"<td>"+role.roleName+"</td>" +
							"<td>"+role.roleState+"</td>" +
									"<td ><a href='Role/edit.jsp' onclick='clickRoleId();'>修改</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href='Role/index.jsp' onclick='clickRoleId();'>删除</a></td></tr>");
		});
	},"json");
	
};








