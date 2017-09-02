BUI.use('common/main',function(){
    var config = [{id:'1',menu:[{text:'系统管理',items:[]}]},{id:'7',homePage : '9',menu:[{text:'业务管理',items:[{id:'9',text:'查询业务',href:'Node/index.jsp'}]}]}];
    new PageUtil.MainPage({
        modulesConfig : config
    });
});