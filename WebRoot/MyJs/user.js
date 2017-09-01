//用户界面的角色查询
function sendRoleAjax(){
	alert(44444);
	document.getElementById("saveid").click(function(){
		
		alert(3333);
	});
//	alert(11);
	$.post("roleSearchServlet.do",{"rolename":'',"random":Math.random()},function(data){
	alert(data);
		$.each(data,function(index,role){
			$("#userRole").append(" <li><label class='checkbox inline'><input type='checkbox' name='group[]' value='100' id='list1' onclick='test();'/>"+role.roleId+"</label>");
		});
	},"json");
	
};

function test(){
	alert(344);
}