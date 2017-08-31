window.onload=sendNodeAjax;

function sendNodeAjax(){
//	alert(11);
	$.post("nodeSearchServlet.do",{"rolename":'',"random":Math.random()},function(data){
//		alert(data);
		$.each(data,function(index,depart){
			$(".nodeBody").append("<tr><td>"+depart.departId+"</td>" +
					"<td>"+depart.departName+"</td>" +
							"<td>"+depart.departState+"</td>" +
									"<td href='Node/edit.jsp'>编辑</td></tr>");
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
	