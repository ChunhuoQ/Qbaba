$(function(){
			$("#d1").mouseover(function (){
				$("#ul1").show(50);
				$("#ul1").animate({left:'+=20px'},"fast");
			})
			$("#d1").mouseout(function (){
				$("#ul1").hide(50);
				$("#ul1").animate({left:'-=20px'},"fast");
				
			})
			$("#d2").mouseover(function (){
				$("#ul2").show(50);
				$("#ul2").animate({left:'+=30px'},"fast");
			})
			$("#d2").mouseout(function (){
				$("#ul2").hide(50);
				$("#ul2").animate({left:'-=30px'},"fast");
			})
			$("#myli1").click(function (){
				$("#myli1").css("color","white");
			})
			
			
			
			
			
			
			
		})
