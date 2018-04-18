function abc(){
	var ti=new Date();
	var m=ti.getMinutes();
	var s=ti.getSeconds();
	m=chektime(m);
	s=chektime(s);
	document.getElementById("time").value=(ti.getFullYear())+"年"+(ti.getMonth()+1)+"月"+(ti.getDate())+"日"
	+(ti.getHours())+":"+m+":"+s;
	
	setTimeout('abc()',1000);
}
function chektime(i){
	if (i<10){
		i="0" + i
	}
    return i
}


//$(function(){
//	var c=document.getElementById("use").value;
//	if(c==null){
//		alert("aaa")
//	}else{
//		alert("用户名不能为空")
//	}
//})

$(function(){
	$(".tijiao").click(function(){
		var c1=document.getElementById("b1").value;	
		var c2=document.getElementById("b2").value;
		var c=document.getElementById("use").value;
	     if(c==null){
		alert("aaa")
	      }else{
		alert("用户名不能为空")
	    };
	  
		if(c1=c2){
			alert("密码一致")
		}else{
			alert("密码不一致")
		}
	})
})
