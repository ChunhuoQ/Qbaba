   $(function(){ 
   	$("#ff").toggle(
   		function(){$("#fa").css("display","block");},
	    function(){$("#fa").css("display","none");}
	    )
   })
 
   $(function(){
   	$(".h12 li").hover(
   		function(){
   			i=$(".h12 li").index(this);
   			$(".h12 li").eq(i).toggleClass("red");
   		}
   	)
   })
    $(function(){
   	$(".h12a li").hover(
   		function(){
   			i=$(".h12a li").index(this);
   			$(".h12a li").eq(i).toggleClass("red");
   		}
   	)
   })
    $(function(){
   	$(".h12b li").hover(
   		function(){
   			i=$(".h12b li").index(this);
   			$(".h12b li").eq(i).toggleClass("red");
   		}
   	)
   })
   
   
   
   
   $(function(){
   	$(".h42 li").hover(
   		function(){
   			i=$(".h42 li").index(this);
   			$(".h42 li").eq(i).toggleClass("red");
   		}
   	)
   })
   
   $(function(){
   	$(".zz1 li").hover(
   		function(){
   			i=$(".zz1 li").index(this);
   			$(".zz1 li").eq(i).toggleClass("red");
   		}
   	)
   })
   var i;
   //替换属性的值
   $(function(){
   	$(".h12 li").click(
   		function(){
   		i=$(".h12 li").index(this);
   		$("#ss").html($(".h12 li").eq(i).text());
    	$(".h12").css("display","none");
   	})
   })
   
    $(function(){
   	$(".h12a li").click(
   		function(){
   		i=$(".h12a li").index(this);
   		$("#sw").html($(".h12a li").eq(i).text());
    	$(".h12a").css("display","none");
   	})
   })
   
    $(function(){
   	$(".h12b li").click(
   		function(){
   		i=$(".h12b li").index(this);
   		$("#sq").html($(".h12b li").eq(i).text());
    	$(".h12b").css("display","none");
   	})
   })
   
   
   
    $(function(){ 
   	$("#fb").toggle(
   		function(){$("#fc").css("display","block");},
   		function(){$("#fc").css("display","none");}
   	)
   })
  
 $(function(){ 
   	$(".h41").toggle(
   		function(){$("#fe").css("display","block");},
   		function(){$("#fe").css("display","none");}
   	)
   })
 
  $(function(){ 
   	$("#fh").toggle(
   		function(){$("#fw").css("display","block");},
   	    function(){$("#fw").css("display","none");}
   	)
   })
  
  window.onload=function(){
  	
  	var cc=document.getElementById("ab1");
  	var ck=document.getElementsByName("ka");
  	var cd=document.getElementById("sq").innerText;
//	alert(cd);
  	cc.onclick=function(){
  		var ck1=cd*12;//还款的期数360月
//      alert(ck1);
        for(i=0;i<ck.length;i++){
  		ck[i].innerHTML=ck1;
        }
        
        
        var ben=parseInt(document.getElementById("ben").value);//贷款本金
//      alert(ben);
        var lv=parseFloat(document.getElementById("lv").value)/100;//贷款的年利率
//      alert(lv);
       //   总利息 = 总贷款额 X 月利率 X ( 还款期数 - 1 ) /2
       
        var zongxi=parseInt(ben*(lv/12)*(ck1-1)/2);
//      alert(zongxi);
        
        var cb=document.getElementById("sz");
        cb.innerHTML=zongxi;
        
        // 每月还款额 = 总贷款额 X 月利率 X ( 1+月利率 ) ^ 还款期数 / ( ( 1+月利率 ) ^ 还款期数 -1 )
        
        var moon=parseInt((ben*(lv/12)*Math.pow((1+lv/12),ck1))/ ( Math.pow( (1+lv/12),ck1 ) -1)); 
//      alert(moon);
        var yz=document.getElementById("yz");
        yz.innerHTML=moon;
        
        //本息合计
        var bx=document.getElementById("bx");
        bx.innerHTML=zongxi+ben;
        
        
        //等额本金计算
        
//      月供=月还本金+月还利息
//       月还利息=上月末本金余额×月利率
//        上月末本金余额=总-月还本金

		var moon1=parseInt((ben/ck1)+(ben*lv/12));
//		alert(moon1);
		var yz1=document.getElementById("yz1");
		yz1.innerHTML=moon1;
		
		var zongxi1=parseInt((ben-ben/ck1)*(lv/12)*ck1/3) ;
//		alert(zongxi1);
		
		var cb1=document.getElementById("sz1");
        cb1.innerHTML=zongxi1;
        
         var bx1=document.getElementById("bx1");
         bx1.innerHTML=zongxi1+ben;
  	}
  }
  //000000000000000000000000
  $(function(){
	$("#zxd ul li:nth-of-type(1)").hover(function(){
		$("#yinchang").toggle();
	})
	$("#yinchang").mouseover(function(){
		$("#yinchang").show();
	})
	$("#yinchang").mouseout(function(){
		$("#yinchang").hide();
	})
	//
	$("#zxd ul li:nth-of-type(3)").hover(function(){
		$("#guanzhu").toggle();
	})
	$("#guanzhu").mouseover(function(){
		$("#guanzhu").show();
	})
	$("#guanzhu").mouseout(function(){
		$("#guanzhu").hide();
	})
	//
	$("#zxd ul li:nth-of-type(4)").hover(function(){
		$("#xuanfang").toggle();
	})
	$("#xuanfang").mouseover(function(){
		$("#xuanfang").show();
	})
	$("#xuanfang").mouseout(function(){
		$("#xuanfang").hide();
	})
	//
	$("#zxd ul li:nth-of-type(6)").hover(function(){
		$("#maifang").toggle();
	})
	$("#maifang").mouseover(function(){
		$("#maifang").show();
	})
	$("#maifang").mouseout(function(){
		$("#maifang").hide();
	})
	//
	$("#zxd ul li:nth-of-type(7)").hover(function(){
		$("#jisuan").toggle();
	})
	$("#jisuan").mouseover(function(){
		$("#jisuan").show();
	})
	$("#jisuan").mouseout(function(){
		$("#jisuan").hide();
	})
	//
	$("#zxd ul li:nth-of-type(8)").hover(function(){
		$("#anxin").toggle();
	})
	$("#anxin").mouseover(function(){
		$("#anxin").show();
	})
	$("#anxin").mouseout(function(){
		$("#anxin").hide();
	})
	//
	$("#zxd ul li:nth-of-type(9)").hover(function(){
		$("#saoma").toggle();
	})
	$("#saoma").mouseover(function(){
		$("#saoma").show();
	})
	$("#saoma").mouseout(function(){
		$("#saoma").hide();
	})
	//
	$("#zxd ul li:nth-of-type(10)").hover(function(){
		$("#kefu").toggle();
	})
	$("#kefu").mouseover(function(){
		$("#kefu").show();
	})
	$("#kefu").mouseout(function(){
		$("#kefu").hide();
	})
	//
	$("#zxd ul li:nth-of-type(11)").hover(function(){
		$("#toushu").toggle();
	})
	$("#toushu").mouseover(function(){
		$("#toushu").show();
	})
	$("#toushu").mouseout(function(){
		$("#toushu").hide();
	})
})
  $(function(){
	var hei=$(window).height();
	$(window).scroll(function(){
		if($(window).scrollTop()>hei){
			$("#top1").fadeIn(500);
		}else{
			$("#top1").fadeOut(500);
		}
	})
}
  

