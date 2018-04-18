function a1(num){
    var prices=document.getElementsByName("price")[num].value;
	var count=parseInt(document.getElementsByName("amount")[num].value)-1;
	if(count<1){
     alert("一件起结算！");
	}else{
		document.getElementsByName("amount")[num].value=count;
		var totals=parseFloat(prices*count);
        document.getElementById("price"+num).innerHTML="¥" +totals;
	}
}

function b1(num){
	var prices=document.getElementsByName("price")[num].value;
	var count=parseInt(document.getElementsByName("amount")[num].value)+1;
	document.getElementsByName("amount")[num].value=count;
	var totals=parseFloat(prices*count);
	document.getElementById("price"+num).innerHTML="¥" +totals;
}
