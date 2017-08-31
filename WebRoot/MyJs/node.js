window.onload=sendNodeAjax;

function sendNodeAjax(){
//	alert(11);
	$.post("nodeSearchServlet.do",{"rolename":'',"random":Math.random()},function(data){
//		alert(data);
		$.each(data,function(index,depart){
			$(".nodeBody").append("<tr><td>"+depart.departId+"</td>" +
					"<td>"+depart.departName+"</td>" +
							"<td>"+depart.departState+"</td>" +
									"<td ><a href='Node/edit.jsp'>修改</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href='#'>删除</a></td></tr>");
		});
	},"json");
	//clickNodeSearch();
};

function clickNodeSearch(){
	$("#nodeSearch").click(function(){
//		alert("hello");
		sendNodeAjax();
	});
	
}	
	