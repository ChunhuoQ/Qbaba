function lingxing(){
 			var numb=document.getElementById("text").value;
 		
 			var uprow=(numb+1)/2;
 			
	for(var i=1;i<=uprow/4;i++){
		for(var j=1;j<=uprow-i;j++){
			document.write("&nbsp; ");
			}
			for(var k=1;k<=2*i-1;k++){
				if(k==1||k==2*i-1){
				document.write("Q");
				}else{
					document.write("&nbsp; ");
				}
			}
			document.write("<br />");
		}
	
		var downrow=numb-uprow;
		for(var i=numb;i>=downrow;i--){
			//占位
			for(var j=1;j<=uprow-i;j++){
				document.write("&nbsp; ");
			}
			for(var k=1;k<=2*i-1;k++){
				if(k==1||k==2*i-1){
					document.write("Q");
				}else{
					document.write("&nbsp; ");
				}
			}
			document.write("<br />");
		}
	}
