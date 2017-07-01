
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
/**
 * 富文本编辑器
 */
function qqEditor(){
	KindEditor.ready(function(K) {
		K.each({
			'plug-align' : {
				name : '对齐方式',
				method : {
					'justifyleft' : '左对齐',
					'justifycenter' : '居中对齐',
					'justifyright' : '右对齐'
				}
			},
			'plug-order' : {
				name : '编号',
				method : {
					'insertorderedlist' : '数字编号',
					'insertunorderedlist' : '项目编号'
				}
			},
			'plug-indent' : {
				name : '缩进',
				method : {
					'indent' : '向右缩进',
					'outdent' : '向左缩进'
				}
			}
		},function( pluginName, pluginData ){
			var lang = {};
			lang[pluginName] = pluginData.name;
			KindEditor.lang( lang );
			KindEditor.plugin( pluginName, function(K) {
				var self = this;
				self.clickToolbar( pluginName, function() {
					var menu = self.createMenu({
							name : pluginName,
							width : pluginData.width || 100
						});
					K.each( pluginData.method, function( i, v ){
						menu.addItem({
							title : v,
							checked : false,
							iconClass : pluginName+'-'+i,
							click : function() {
								self.exec(i).hideMenu();
							}
						});
					})
				});
			});
		});
		K.create('#contentqq', {
			//统计直属
			 afterChange : function() {
					K('#count').val(this.count());
				
			}, 
			themeType : 'qq',
			items : [
				'bold','italic','underline','fontname','fontsize','forecolor','hilitecolor','plug-align','plug-order','plug-indent','link'
			],
	
		afterBlur:function(){this.sync();}
		});
	});
	
}

