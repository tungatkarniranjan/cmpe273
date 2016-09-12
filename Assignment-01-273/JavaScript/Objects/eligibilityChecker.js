function customer(fname,lname,lnamt, annual_inc, mnthLiab, prevBank, ssn, creditScore)
{
	this.fName = fname;
	this.lName = lname;
	this.loanAmount = lnamt
	this.annualIncome = annual_inc;
	this.mnthLiab = mnthLiab;
	this.prevBank = mnthLiab;
	this.ssn = ssn
	this.creditScore = creditScore;
	this.fullName = function(){return this.fName+' '+this.lName};
	this.monthlySavings = function(){
		var anInc = parseFloat(annual_inc);
		var mnthInc = anInc/12;
		var mnthSav = mnthInc-parseFloat(mnthLiab)
		return mnthSav.toFixed(2)
	}
}

function createObject() {

	var fname = document.getElementById("name").value
	var lname = document.getElementById("lname").value
	var lnamt = parseFloat(document.getElementById("lnAmt").value)
	var anInc = parseFloat(document.getElementById("anInc").value)
	
	var mnthl = parseFloat(document.getElementById("mnthl").value)
	var prevBank = document.getElementById("prevBank").value
	var ssn = document.getElementById("ssn").value
	var crdScore = parseFloat(document.getElementById("crdScore").value)

	var Customer = new customer(fname,lname,lnamt,anInc,mnthl,prevBank,ssn,crdScore)
	
	checkEligibilty(Customer)

	fname.innerHTML = ""
	lname.innerHTML = ""
	lnamt.innerHTML =""
	anInc.innerHTML = ""
	mnthl.innerHTML = ""
	prevBank.innerHTML = ""
	ssn.innerHTML =""
	crdScore.innerHTML =""

}
function checkEligibilty(customer)
{
	var dispElg = document.getElementById("ans")
	dispElg.innerHTML = ""
	monthlyEMI = (customer.loanAmount/12)
	


	if(customer.monthlySavings()>(monthlyEMI*3))
	{	
		dispElg.innerHTML = 'Your Approximate Monthly Savings : '+customer.monthlySavings()+'\nMonthly EMI : '+monthlyEMI.toFixed(2)+'\nMonthly Savings > 3 * Monthly EMI \nLoan will be granted'
	}
	else if((customer.creditScore >= 800)&&(customer.monthlySavings()>(monthlyEMI*2)))
	{
		dispElg.innerHTML = 'Credit Score > 800 : '+customer.creditScore+'\nMonthly EMI : '+monthlyEMI.toFixed(2)+'\nMonthly Savings > 2 * Monthly EMI \n'+(0.9*customer.loanAmount).toFixed(2)+' will be granted'
		
	}
	else if((customer.creditScore >= 800)&&(customer.monthlySavings()>monthlyEMI)&&(customer.monthlySavings()<(monthlyEMI*2)))
	{
		dispElg.innerHTML = 'Monthly Savings : '+customer.monthlySavings()+'\nMonthly Savings < 2 * Monthly EMI :'+monthlyEMI.toFixed(2)+'\n50% Amount : '+(0.5*customer.loanAmount)+' will be granted'
		
	}
	else if((customer.creditScore >= 800)&&(customer.monthlySavings() < monthlyEMI))
	{
		dispElg.innerHTML = 'Credit Score > 800 : '+customer.creditScore+'\nMonthly Savings : '+customer.monthlySavings()+'\nMonthly Savings < Monthly EMI : '+monthlyEMI.toFixed(2)+'\nPlease talk with Branch Manager for further clarification'
	}
	else if((customer.creditScore <= 800)&&(customer.monthlySavings() < monthlyEMI))
	{
		dispElg.innerHTML = 'Poor Credit Score : '+customer.creditScore+'\nMonthly Saving : '+customer.monthlySavings()+' < Monthly EMI : '+monthlyEMI.toFixed(2)+'\nLoan won\'t be granted'
	}
	else if((customer.creditScore <= 800)&&(customer.monthlySavings() > monthlyEMI))
	{
		dispElg.innerHTML = 'Poor Credit Score : '+customer.creditScore+'\nMonthly Saving : '+customer.monthlySavings()+' > Monthly EMI : '+monthlyEMI.toFixed(2)+'\nLoan won\'t be granted due to poor Credit History'
	}

}