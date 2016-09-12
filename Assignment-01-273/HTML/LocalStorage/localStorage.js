(function () {
var fname = document.getElementById("name");
var email = document.getElementById("email");
var number = document.getElementById("number");
var date = document.getElementById("date");
var dest = document.getElementById("dest");

fname.innerHTML = "";
email.innerHTML ="";
number.innerHTML ="";
dest.innerHTML ="";
date.innerHTML ="";

var Name = localStorage.getItem("ticket-name");
var Email = localStorage.getItem("ticket-email");
var cNumber = localStorage.getItem("ticket-number");
var tDate = localStorage.getItem("ticket-date");
var Dest = localStorage.getItem("ticket-dest");

fname.value = Name
email.value = Email
number.value = cNumber
date.value = tDate
dest.value = Dest


})();


function setLocalStorage()
{
	var fname = document.getElementById("name").value;
	var email = document.getElementById("email").value;
	var number = document.getElementById("number").value;
	var date = document.getElementById("date").value;
	var dest = document.getElementById("dest").value;

	localStorage.setItem("ticket-name",fname);
	localStorage.setItem("ticket-email",email);
	localStorage.setItem("ticket-number",number);
	localStorage.setItem("ticket-date",date);
	localStorage.setItem("ticket-dest",dest);

	alert("We Have saved your Details!..")

}

function clearLocalStorage()
{
	alert("Thank for using our Services!!..")
	localStorage.clear();
}
