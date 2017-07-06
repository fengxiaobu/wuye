webpackHotUpdate(0,{

/***/ 242:
/***/ (function(module, exports) {

	/* WEBPACK VAR INJECTION */(function(global) {'use strict';

	Object.defineProperty(exports, "__esModule", {
	    value: true
	});
	// <template>
	//                     <router-view></router-view>
	// </template>
	// <script>
	exports.default = {
	    filters: {},
	    directives: {},
	    components: {},
	    data: function data() {
	        return {
	            isEnterHouseInfo: global.isEnterHouseInfo,
	            userInfo: global.userInfo
	        };
	    },

	    watch: {},
	    ready: function ready() {
	        // if(!global.isEVPI) { // 未完善资料
	        //     this.$router.go('/home/business/enter/userinfo');
	        // } else {
	        switch (parseInt(this.isEnterHouseInfo && this.isEnterHouseInfo.houseInfoDetails ? this.isEnterHouseInfo.houseInfoDetails.enterapplyState : 0, 10)) {
	            case 0:
	                // 未入驻-->办理入驻
	                this.$router.go('/home/business/enter/userinfo');
	                break;
	            case 1:
	                // 审核
	                this.$router.go('/home/business/enter/rnterexamine');
	                break;
	            case 2:
	                // 费用缴纳
	                this.$router.go('/home/business/enter/enterpay');
	                break;
	            case 3:
	                // 
	                this.$router.go('/home/business/enter/userinfo');
	                break;
	        }
	        // }        
	    },
	    beforeDestroy: function beforeDestroy() {},

	    methods: {}
	};
	// </script>
	/* WEBPACK VAR INJECTION */}.call(exports, (function() { return this; }())))

/***/ })

})