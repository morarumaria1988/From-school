/*TASK 2 A simple function*/
function displayDate() {
	document.getElementById("date").innerHTML=Date();
}
displayDate();

/*TASK 3 Event listener*/
document.getElementById("showdate").onclick=displayDate;

/*TASK 4 Function with arguments*/
function add(n1,n2) {
	var result;
	result=n1+n2;
	return result;
}

/*TASK 5 More functions*/
function subtract(n1,n2) {
	var result;
	result=n1-n2;
	return result;
}
function multiply(n1,n2) {
	var result;
	result=n1*n2;
	return result;
}
function divide(n1,n2) {
	var result;
	result=n1/n2;
	return result;
}

/*TASK 6 complex function with a switch statement*/
function calculate() {
	var n1=parseInt(document.getElementById("n1").value);
	var n2=parseInt(document.getElementById("n2").value);
	/*TASK 7 If statement*/
	if(isNaN(n1)) {alert("Fel på tal 1");return;}
	if(isNaN(n2)) {alert("Fel på tal 2");return;}
	var operator=document.getElementById("operator").value;
	var result="";
	switch(operator) {
		case "+":result=add(n1,n2);break;
		case "-":result=subtract(n1,n2);break;
		case "*":result=multiply(n1,n2);break;
		case "/":result=divide(n1,n2);break;
	}
	document.getElementById("result").innerHTML=result;
}
document.getElementById("calculate").onclick=calculate;

/*TASK 8 For loop*/
var carsArray=["Volvo", "SAAB", "Ford", "Toyota", "Citroen", "BMW"];
carsArray.sort();
var mycars=""
for (i=0;i<carsArray.length;i++) {
	mycars=mycars+carsArray[i]+",";
}
document.getElementById("cars").innerHTML=mycars;

/*TASK 9 For in loop*/
var carsObject=[{"name":"Volvo","country":"Sweden"}, {"name":"Ford","country":"USA"}, {"name":"Toyota","country":"Japan"},{"name":"SAAB","country":"Sweden"}, {"name":"BMW","country":"Germany"}];
carsObject[6]={"name":"Cooper","country":"UK"};
for(i in carsObject) {
	if(carsObject[i].country==="Sweden") {
		document.getElementById("swedishcars").innerHTML=document.getElementById("swedishcars").innerHTML+"<br />"+carsObject[i].name;
	}
}



