var employcount = 0;
var employArray = [];
function addDetails(){

var empID = document.getElementById("empid").value
var empname = document.getElementById("name").value
var empEmail = document.getElementById("email").value
var empAcc = document.getElementById("acc").value
var empContact = document.getElementById("cnum").value

var employee = {
	id : empID,
	name : empname,
	email : empEmail,
	account : empAcc,
	cntnum : empContact
}

employArray[employcount] = employee

changeEmpCount("add")

var dispbox = document.getElementById("dispempdet")

dispbox.innerHTML = 'Emp ID :'+empID+'</br></br>Name : '+employee.name+'</br></br>Email : '+employee.email+'</br></br>Employee Account : '+employee.account+'</br></br>Contact Number : '+employee.cntnum

}
function changeEmpCount(count)
{
	if(count == "add")
		employcount = employcount +1
	else if(count == "remove")
		employcount = employcount -1
}
function dispAllEmp()
{
	var dispbox = document.getElementById("dispAlldet")
	dispbox.innerHTML = ""
	if(employArray.length == 0)
	{
		alert("!!There are no Employee Records in the System!!")
	}
	else
	{
		for(var i = 0; i<employArray.length;i++)
		{
			dispbox.innerHTML += 'Emp ID :'+employArray[i].id+'</br></br>Name : '+employArray[i].name+'</br></br>Email : '+employArray[i].email+'</br></br>Employee Account : '+employArray[i].account+'</br></br>Contact Number : '+employArray[i].cntnum+'</br></br>'
		}
	}
	
}

function removeEmployee(){

	var dltId = document.getElementById("dltIdtxt").value
	var dispbox = document.getElementById("dispempdet")
	dispbox.innerHTML = ""
	var flg = false
	for(var i = 0; i<employArray.length;i++)
	{
		if(dltId == employArray[i].id)
		{
			flg = true
			dispbox.innerHTML += 'Employee Deleted : </br>Emp ID :'+employArray[i].id+'</br></br>Name : '+employArray[i].name+'</br></br>Email : '+employArray[i].email+'</br></br>Employee Account : '+employArray[i].account+'</br></br>Contact Number : '+employArray[i].cntnum
			employArray.splice(i,1)
			changeEmpCount("remove")
		}
		else
		{
			continue
		}
	}
	if(!flg)
	{
		dispbox.innerHTML += 'Employee Record not Present'
	}
}