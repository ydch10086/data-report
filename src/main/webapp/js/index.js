var ctx = "";
$(window).resize(function(){
	$(".bottom").height($(window).height()-60);
	$(".right").width($(window).width()-241);
	$(".tabCount").height($(window).height()-137)
	$(".tabDiv>div").width($(window).width()-329);
	$(".menudiv").height($(window).height()-103);
});
$(function(){
	ctx = $('meta[name=pg-ctx]').attr('content');
	$(".bottom").height($(window).height()-60);
	$(".right").width($(window).width()-241);
	$(".tabCount").height($(window).height()-137)
	$(".tabDiv>div").width($(window).width()-329);
	$(".menudiv").height($(window).height()-103);
	$(".menu>li>div").click(function(){//左边菜单下拉
		 $(".menu>li>ul").stop().slideUp("slow");
		 $(".menu>li>div").removeClass("selMenu");
		 $(".menu>li>div").find("img").attr("src",ctx+"/image/arrowright.png");
		 $(this).next().stop().slideToggle("slow");
		 if($(this).next().height()==1){
			 $(this).find("img").attr("src",ctx+"/image/arrowunder.png");
			 $(this).addClass("selMenu");
		 }
	});
	$(".tabDiv>img").click(function(){//滑动按钮点击
		var num=$(this).index();
		var tabLeft=parseInt($(".tabTitle").css("margin-left").substring(0,$(".tabTitle").css("margin-left").length-2));
		var tabLenght=0;
		$(".tabTitle").find("li").each(function(){
			tabLenght+=$(this).width()+14;
		});
		if(tabLenght>$(".tabDiv>div").width()){
			if(num==0){
				if(tabLeft+100>0){
					tabLeft=0;
				}else{
					tabLeft=tabLeft+25;
				}
			}else{
				if(tabLenght-$(".tabDiv>div").width()-100<=0-tabLeft){
					tabLeft=0-tabLenght+$(".tabDiv>div").width();
				}else{
					tabLeft=tabLeft-25;
				}
			}
			$(".tabTitle").css("margin-left",tabLeft+"px");
		}
	});
	
	$(".menu>li>ul>li").click(function(){//左边菜单点击
		var url=$(this).attr("url");
		var indexNum=1000;
		$(".tabCount").find("iframe").hide();
		$(".tabTitle").find("li").removeClass("seltabTitle");
		$(".tabCount iframe").each(function(index){
			if($(this).attr("src")==url){
				indexNum=index;
				return false;
			}
		});
		if(indexNum<1000){//菜单已存在
			$(".tabTitle").find("li").eq(indexNum).addClass("seltabTitle");
			$(".tabCount").find("iframe").eq(indexNum).show();
			var tabLenght=0;
			$(".tabTitle").find("li").each(function(index){
				if(index<=indexNum){
					tabLenght+=$(this).width()+14;
				}
			});
			if(tabLenght>$(".tabDiv>div").width()){
				$(".tabTitle").css("margin-left",0-tabLenght+$(".tabDiv>div").width()+"px");
			}else{
				$(".tabTitle").css("margin-left","0px");
			}
			return false;
		}
		$(".tabTitle").append('<li class="seltabTitle">'+$(this).html()+'<img src="'+ctx+'/image/close-btn.png"/></li>');
		$(".tabCount").append('<iframe frameborder="no" src="'+url+'"></iframe>');
		var tabLenght=0;
		$(".tabTitle").find("li").each(function(){
			tabLenght+=$(this).width()+14;
		});
		if(tabLenght>$(".tabDiv>div").width()){
			$(".tabTitle").css("margin-left",0-tabLenght+$(".tabDiv>div").width()+"px");
		}
		//选项卡单击
		$(".tabTitle").find("li").unbind("click");
		$(".tabTitle").find("li").click(function(){
			$(".tabTitle").find("li").removeClass("seltabTitle");
			$(".tabCount").find("iframe").hide();
			$(this).addClass("seltabTitle");
			$(".tabCount").find("iframe").eq($(this).index()).show();
		});
		//关闭按钮
		$(".tabTitle>li>img").unbind("click");
		$(".tabTitle>li>img").click(function(){
			var tabNum=$(this).parent().index();
			if($(".tabCount").find("iframe").eq(tabNum).css("display")!="none"){
				$(".tabTitle").find("li").eq(tabNum-1).addClass("seltabTitle");
				$(".tabCount").find("iframe").eq(tabNum-1).show();
			}
			$(this).parent().remove();
			$(".tabCount").find("iframe").eq(tabNum).remove();
			var tabLenght=0;
			$(".tabTitle").find("li").each(function(){
				tabLenght+=$(this).width()+14;
			});
			if(tabLenght<$(".tabDiv>div").width()){
				$(".tabTitle").css("margin-left","0px");
			}
		});
	});
});