$(document).ready(function(){
//	alert();
	$("#a1").mouseover(function(){
		$("#a1").css({"color":"red"});
		$("#ol1").show();
	})
	$("#a1").mouseout(function(){
		$("#a1").css({"color":"white"});
		$("#ol1").hide();
	})
})

 $(document).ready(function(){
//	alert();
	$("#aa").mouseover(function(){
	  $("#aa").css({"color":"red"});
//	  $(".ul2 p").css("background-color","#999999");
	  $("#b1").show();
	  }).mouseout(function(){
	  	$("#aa").css({"color":"white"});
		$("#b1").hide();
	  }) 
   })
 //鼠标移上去变背景颜色
 
   $(function(){
   	$(".dl1 p").hover(function(){
   		 i=$(".dl1 p").index(this);
   		 $(".dl1 p").eq(i).toggleClass("red");
   	})
   })
   
   $(function(){
   	$(".a2 p").hover(function(){
   		 i=$(".a2 p").index(this);
   		 $(".a2 p").eq(i).toggleClass("red");
   	})
   })
   
 $(document).ready(function(){
//	alert();
	$("#aa1").mouseover(function(){
	  $("#aa1").css({"color":"red"});		
	  $("#b2").show();
	  }).mouseout(function(){
	  	$("#aa1").css({"color":"white"});
		$("#b2").hide();
	  })
   })

$(document).ready(function(){
//	alert();
	$(".x-map").mouseover(function(){
		$(".xtop").show();
	}).mouseout(function(){
		$(".xtop").hide();
	})
})

$(document).ready(function(){
	$(".arrowRight").click(function(){
		$(".cl img").each(function(index,img){
			if($(".s8").css("left")=="910px"){
			
			}else if($(".s8").css("left")=="1210px"){
				$(".arrowRight").css("color","aliceblue")
				var num=parseInt($(img).css("left"))+(-300);
			    $(img).animate({left:num+"px"},80);
			}else{
				$(".arrowLeft").css("color","black")
			 num=parseInt($(img).css("left"))+(-300);
			$(img).animate({left:num+"px"},80);}
		})
	})
})
$(document).ready(function(){
	$(".arrowLeft").click(function(){
		$(".cl img").each(function(index,img){
			if($(".s1").css("left")=="10px"){
			
			}else if($(".s1").css("left")=="-290px"){
				
				$(".arrowLeft").css("color","aliceblue");
			num=parseInt($(img).css("left"))+(300);
			$(img).animate({left:num+"px"},80);
			}else{
				
				$(".arrowRight").css("color","black")
			var num=parseInt($(img).css("left"))+(300);
			$(img).animate({left:num+"px"},80);}
		})
	})
})


$(function(){
	$(".sp1").mouseover(function(){
//		alert("aaa");
		$("#ff").css("display","block");
		$("#ff").siblings().css("display","none");
		$(this).css("color","white");
		$(this).siblings().css("color","#999999");
	})
})
$(function(){
	$(".sp2").mouseover(function(){
//		alert("aaa");
		$("#fk").css("display","block");
		$("#fk").siblings().css("display","none");
		$(this).css("color","white");
		$(this).siblings().css("color","#999999");
	})
})
$(function(){
	$(".sp3").mouseover(function(){
//		alert("aaa");
		$("#fa").css("display","block");
		$("#fa").siblings().css("display","none");
		$(this).css("color","white");
		$(this).siblings().css("color","#999999");
	})
})
$(function(){
	$(".sp4").mouseover(function(){
//		alert("aaa");
		$("#fa1").css("display","block");
		$("#fa1").siblings().css("display","none");
		$(this).css("color","white");
		$(this).siblings().css("color","#999999");
	})
})
$(function(){
	$(".sp5").mouseover(function(){
//		alert("aaa");
		$("#fa2").css("display","block");
		$("#fa2").siblings().css("display","none");
		$(this).css("color","white");
		$(this).siblings().css("color","#999999");
	})
})
$(function(){
	$(".sp6").mouseover(function(){
//		alert("aaa");
		$("#fa3").css("display","block");
		$("#fa3").siblings().css("display","none");
		$(this).css("color","white");
		$(this).siblings().css("color","#999999");
	})
})
//表单下拉
$(function(){
	$("#jj").click(function(){
		$(".inp-1").css("display","block");
		$(".inp-2").css("display","none");
		$("#j2").css("display","none");
		$("#j1").css("display","block");
	})
})
$(function(){
	$("#j1").click(function(){
		$(".inp-1").css("display","none");
		$("#j1").css("display","none");
		$("#j2").css("display","block");
	})
})
$(function(){
	$("#jk").click(function(){
		$(".inp-2").css("display","block");
		$(".inp-1").css("display","none");
		$("#j3").css("display","none");
		$("#j4").css("display","block");
	})
	})
$(function(){
	$("#j4").click(function(){
		$(".inp-2").css("display","none");
		$("#j4").css("display","none");
		$("#j3").css("display","block");
	})
})

$(function(){
	$(".inp-1 li").eq(0).click(function(){
		$("#jj").attr("placeholder","不限");
		$(".inp-1").css("display","none");
	})
	$(".inp-1 li").eq(1).click(function(){
		$("#jj").attr("placeholder","独栋别墅");
		$(".inp-1").css("display","none");
	})
	$(".inp-1 li").eq(2).click(function(){
		$("#jj").attr("placeholder","联排别墅");
		$(".inp-1").css("display","none");
	})
	$(".inp-1 li").eq(3).click(function(){
		$("#jj").attr("placeholder","公寓");
		$(".inp-1").css("display","none");
	})
	$(".inp-1 li").eq(4).click(function(){
		$("#jj").attr("placeholder","土地");
		$(".inp-1").css("display","none");
	})
})

$(function(){
	$(".inp-2 li").eq(0).click(function(){
		$("#jk").attr("placeholder","不限");
		$(".inp-2").css("display","none");
	})
	$(".inp-2 li").eq(1).click(function(){
		$("#jk").attr("placeholder","50万以下（美元）");
		$(".inp-2").css("display","none");
	})
	$(".inp-2 li").eq(2).click(function(){
		$("#jk").attr("placeholder","50-100万（美元）");
		$(".inp-2").css("display","none");
	})
	$(".inp-2 li").eq(3).click(function(){
		$("#jk").attr("placeholder","100-200万（美元）");
		$(".inp-2").css("display","none");
	})
	$(".inp-2 li").eq(4).click(function(){
		$("#jk").attr("placeholder","200-500万（美元）");
		$(".inp-2").css("display","none");
	})
})
