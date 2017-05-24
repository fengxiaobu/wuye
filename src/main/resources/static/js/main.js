
	$("#aside_one_01").on("click", '[data-parent="#aside_one_01"]', function(e) {
		console.log(34)
		console.log(324)
		// e.stopPropagation();
		// $(this).toggleClass("on").find(".down-details").first().slideToggle();
		if($(this).find(".arrow").length) {
			if($(this).find(".glyphicon-menu-right").length) {
				$(this).find(".glyphicon-menu-right").attr("class", $(this).find(".glyphicon-menu-right").attr("class").replace("right", "down"));
			} else {
				$(this).find(".glyphicon-menu-down").attr("class", $(this).find(".glyphicon-menu-down").attr("class").replace("down", "right"));
			}
		}
		// $(this).siblings().removeClass("on").find(".down-summary").removeClass("on");
		// $(this).siblings().find(".down-details").hide();
	});