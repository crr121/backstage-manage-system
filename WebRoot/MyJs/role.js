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

//将添加页面add.jsp的参数传入到roleaddservlet,发送Ajax请求
function sendAddAjax(){
	checkboxResult();
	alert(groups);
	$.post("roleAddServlet.do",{"roleName":title,"roleState":status,"roleRight":groups },function(data){
	
		alert("添加成功");
	
	},"json");
};

//查询 index.jsp
window.onload=sendRoleAjax;

function sendRoleAjax(){
//	alert(11);
	$.post("roleSearchServlet.do",{"rolename":'',"random":Math.random()},function(data){
//		alert(data);
		$.each(data,function(index,role){
			$(".nodeBody").append("<tr><td >"+role.roleId+"</td>" +
					"<td>"+role.roleName+"</td>" +
							"<td>"+role.roleState+"</td>" +
									"<td ><a href='Role/edit.jsp' >修改</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href='Role/index.jsp' >删除</a></td></tr>");
		});
	},"json");
	
};




function clickRoleSearch(){
	$("#roleSearch").click(function(){
		alert("hello");
		sendRoleAjax();
	});
	
}	

function test(){
//	alert(11100);
	/*document.getElementById("list1").click(function(){
		aler(33);
	});*/
	$("#list1").click(function(){
		alert(document.getElementById("list1").innerHTML);
	});
}




