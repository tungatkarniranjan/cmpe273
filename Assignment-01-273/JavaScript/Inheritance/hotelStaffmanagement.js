document.getElementById("designation").addEventListener("change",dispInput)

var Staff = function (fname,lname,designation){
		this.fname = fname;
		this.lname = lname;
		this.designation = designation;
		this.hourlywage = 16;
}

Staff.prototype.monthlyPay = function () {
	return this.hourlywage*160
}


//object Waiter inherited from Staff
var Waiter = function(fname,lname,hours){
	Staff.call(this)
	this.hoursWorked = hours
	this.hourlywage = 20
	this.designation = "Waiter"
}
Waiter.prototype = Object.create(Staff.prototype)
Waiter.prototype.constructor = Waiter
Waiter.prototype.monthlyPay = function() {
	return this.hourlywage*this.hoursWorked
}


//object Bartender inherited from Waiter
var Bartender = function(fname,lname,hours, peopleServed){
	Staff.call(this)
	this.hoursWorked = hours
	this.hourlywage = 22
	this.peopleServed = peopleServed
	this.designation = "Bartender"
}
Bartender.prototype = Object.create(Waiter.prototype)
Bartender.prototype.constructor = Bartender
Bartender.prototype.monthlyPay = function() {
	var extMoney = this.peopleServed*4
	alert(extMoney)
	return ((this.hourlywage*this.hoursWorked)+extMoney)
}


//object Receptionist inherited from Staff
var Receptionist = function(fname,lname,hours){
	Staff.call(this)
	this.hoursWorked = hours
	this.hourlywage = 18
	this.designation = "Receptionist"
}
Receptionist.prototype = Object.create(Staff.prototype)
Receptionist.prototype.constructor = Receptionist
Receptionist.prototype.monthlyPay = function() {
	return this.hourlywage*this.hoursWorked
}


//object Manager inherited from Staff
var Manager = function(fname,lname,hours){
	Staff.call(this)
	this.hoursWorked = hours
	this.hourlywage = 25
	this.increment = 30
	this.designation = "Manager"
}
Manager.prototype = Object.create(Staff.prototype)
Manager.prototype.constructor = Manager
Manager.prototype.monthlyPay = function() {
	var incrPay = this.increment/100*this.hoursWorked
	return ((this.hourlywage*this.hoursWorked)+incrPay)
}


function dispInput() {
	
	var designation = document.getElementById("designation").value
	var dispDivElement = document.getElementById("dispInput")
	dispDivElement.innerHTML = ""
	if(designation == "Manager")
	{
		dispCommon()				
	}
	else if(designation == "Bartender")
	{
		dispBartender()
	}
	else if(designation == "Receptionist")
	{
		dispCommon()
	}
	else if(designation == "Waiter")
	{
		dispCommon()
	}
}

function dispCommon()
{
	var dispDivElement = document.getElementById("dispInput")
	dispDivElement.innerHTML = '<table>'+
									'<tr>'+
										'<td width="100px"><label id="lblfname">First Name</lable></td>'+
										'<td><input type="text" id = "fname"></td>'+
									'</tr>'+
	 								'<tr>'+
										'<td width="100px"><label id="lblfname">Last Name</lable></td>'+
										'<td><input type="text" id = "lname"></td>'+
									'</tr>'+
									'<tr>'+
										'<td><label id="lblhrs">Hours Worked</lable></td>'+
										'<td><input type="text"	id ="hrs"></td>'+
									'</tr>'+
									'<tr>'+
										'<td>'+
										'</td>'+
										'<td>'+
											'<input type="button" id="calPayment" value="Calculate Payment" width="200px" onclick="calPayment()">'+
										'</td>'+
									'</tr>'+
								'</table>'
}

function dispBartender()
{
	var dispDivElement = document.getElementById("dispInput")
	dispDivElement.innerHTML = '<table>'+
									'<tr>'+
										'<td width="100px"><label id="lblfname">First Name</lable></td>'+
										'<td><input type="text" id = "fname"></td>'+
									'</tr>'+
	 								'<tr>'+
										'<td width="100px"><label id="lblfname">Last Name</lable></td>'+
										'<td><input type="text" id = "lname"></td>'+
									'</tr>'+
									'<tr>'+
										'<td><label id="lblhrs">Hours Worked</lable></td>'+
										'<td><input type="text"	id ="hrs"></td>'+
									'</tr>'+
									'<tr>'+
										'<td><label id="lblhrs">People Served</lable></td>'+
										'<td><input type="text"	id ="pserve"></td>'+
									'</tr>'+
									'<tr>'+
										'<td>'+
										'</td>'+
										'<td>'+
											'<input type="button" id="calPaymentBar" value="Calculate Payment" onclick="calPayment()">'+
										'</td>'+
									'</tr>'+
								'</table>'
}


function calPay(designation,fname,lname,hours,peopleServed)
{
	var monthlyPaymngr
	var hourlywage
	var peopleServed
	if(designation == "Manager")
	{
		var manager = new Manager(fname,lname,hours)
		monthlyPaymngr = manager.monthlyPay()
		hourlywage = manager.hourlywage

	}
	else if(designation == "Receptionist")
	{
		var receptionist = new Receptionist(fname,lname,hours)
		monthlyPaymngr = receptionist.monthlyPay()
		hourlywage = receptionist.hourlywage
	}
	else if(designation == "Waiter")
	{
		var waiter = new Receptionist(fname,lname,hours)
		monthlyPaymngr = waiter.monthlyPay()
		hourlywage = waiter.hourlywage
	}
	else if(designation == "Bartender")
	{
		var bartender = new Bartender(fname,lname,hours,peopleServed)
		monthlyPaymngr = bartender.monthlyPay()
		hourlywage = bartender.hourlywage
	}

	var dispDivElement = document.getElementById("dispInput")
	dispDivElement.innerHTML += '<table>'+
									'<tr>'+
										'<td>'+
										'</td>'+
										'<td>'+
											'<textarea id="paymentdet" value="" rows="5" cols = "40"></textarea>'+
										'</td>'+
									'</tr>'+
								'</table>'

	var paymentdet = document.getElementById("paymentdet")
	if(designation == "Manager"||designation=="Receptionist"||designation=="Waiter")
		paymentdet.innerHTML = 'Payment Details : \nHourly Rate : '+hourlywage+'\nPayment Amount : '+monthlyPaymngr	
	else if(designation == "Bartender")
		paymentdet.innerHTML = 'Payment Details : \nHourly Rate : '+hourlywage+'\nPeople Served : '+peopleServed+'\nPayment Amount : '+monthlyPaymngr	
}


function calPayment()
{
	var staffType = document.getElementById("designation").value
	try
	{
		var fname = document.getElementById("fname").value
		var lname = document.getElementById("lname").value
		var hours = parseInt(document.getElementById("hrs").value)

		if(hours == null || hours === NaN || hours === undefined)
			throw "Enter a Valid Number"
		else
			if(staffType == "Manager")
			{
				calPay("Manager",fname,lname,hours,0)
			}
			else if(staffType == "Receptionist")
			{
				calPay("Receptionist",fname,lname,hours,0)
			}
			else if(staffType == "Waiter")
			{
				calPay("Waiter",fname,lname,hours,0)
			}
			else if(staffType == "Bartender")
			{
				alert("Bartender")
				var peopleServed = parseInt(document.getElementById("pserve").value)
				calPay("Bartender",fname,lname,hours,peopleServed)
			}
	}
	catch(e)
	{
		alert("Error : "+e)
	}

}



