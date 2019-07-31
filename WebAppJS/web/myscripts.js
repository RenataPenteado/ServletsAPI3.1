function myFunction() {
  document.getElementById("demo2").innerHTML = "Hello Inner HTML";
  document.getElementsByName("demo3")[0].innerHTML = "Changed Value";
   document.getElementById("demo5").innerHTML = document.location.host;
   document.getElementById("demo6").innerHTML = document.location;
}

function myFunction2(value) {
	document.getElementById("demo4").innerHTML = value;
}

function myFunction3() {
	document.getElementById("demo4").innerHTML = "";
}

function myFunction4() {
	document.getElementById("demo8").innerHTML = document.getElementById("demo7").value;
}
