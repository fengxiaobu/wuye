
/**
 * 时间插件,yyyy-mm-dd
 * @param id 如果是id则传"#属性名称",如果是class则传”.属性名称“
 */
function formdate(id){
	$(id).datetimepicker({
        format: "yyyy-mm-dd",
        language:  'zh-CN',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0
    });
}
/**
 * 时间插件,yyyy-mm-dd yyyy-mm-dd hh:ii
 * 
 * @param id 如果是id则传"#属性名称",如果是class则传”.属性名称“
 * 
 * 注意：input中的属性：data-link-format和data-date-format应该相应修改为‘yyyy-mm-dd hh:ii’
 */
function formdatetime(id){
	$(id).datetimepicker({
		format: "yyyy-mm-dd hh:ii",
	    language:  'zh-CN',
	    weekStart: 1,
	    todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		forceParse: 0,
	    showMeridian: 1
	});
}

/**
 * 去除页面null
 * @param str
 * @returns
 */
function isnull(str){
	if(str==null){
		return "";
	}else{
		return str;
	}
}


