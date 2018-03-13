var i = 1;
var l = 1;
var bai = 28.5;
var dao = 24.0;

function abc() {
	var sp1 = document.getElementById("sp1").innerHTML;
	if(sp1 < 5) {
		i++;

	} else {
		alert("本网站禁止批发！");
	}
	document.getElementById("sp1").innerHTML = i;
	document.getElementById("c3").innerHTML = i * bai;
	document.getElementById("zj").innerHTML = i * bai + l * dao;
}

function efg() {

	var sp1 = document.getElementById("sp1").innerHTML;
	if(sp1 > 1) {

		i--;
	} else {
		alert("再减就没得啦~");
	}
	var sp2 = document.getElementById("sp1");
	document.getElementById("sp1").innerHTML = i
	document.getElementById("c3").innerHTML = i * bai;
	document.getElementById("zj").innerHTML = i * bai + l * dao;
}

function hij() {
	var sp2 = document.getElementById("sp2").innerHTML;
	if(sp2 < 5) {
		l++;
	} else {
		alert("本网站禁止批发！");
	}
	document.getElementById("sp2").innerHTML = l
	document.getElementById("c4").innerHTML = l * dao;
	document.getElementById("zj").innerHTML = i * bai + l * dao;
}

function klm() {
	var sp2 = document.getElementById("sp2").innerHTML;
	if(sp2 > 1) {

		l--;
	} else {
		alert("再减就没得啦~");
	}
	document.getElementById("c4").innerHTML = l * dao;
	document.getElementById("sp2").innerHTML = l;
	document.getElementById("zj").innerHTML = i * bai + l * dao;
}

function nop() {
	document.getElementById("table1").style.display = "none";
	document.getElementById("zj").innerHTML = 0.00;
}

function rst() {
	document.getElementById("table2").style.display = "none";
	document.getElementById("zj").innerHTML = 0.00;
}