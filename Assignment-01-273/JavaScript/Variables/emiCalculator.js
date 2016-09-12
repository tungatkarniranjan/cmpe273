function calculateMonthlyEmi(){
	var sprincipal = document.getElementById("principal").value
	var sduration = document.getElementById("duration").value
	var yrsMnths = document.getElementById("yrsMnths").value
	var sroi = document.getElementById("roi").value
	var monthlyemi = 0;
	var totalAmount = 0;
	var totalInterest = 0;

	var principal = parseFloat(sprincipal)
	var duration = parseFloat(sduration)
	var roi = parseFloat(sroi)

	var txtArea = document.getElementById("ans")
	txtArea.innerHTML = ""

	if(yrsMnths == "y")
	{
		var actDuration = duration*12;
		
		totalInterest = (principal*roi*duration)/100;
		totalAmount = principal+totalInterest;
		monthlyemi = totalAmount/actDuration;

		var answer = 'Total Interest Incurred : $'+totalInterest.toFixed(2)+'\nTotal Amount to be Repaid : $'+totalAmount.toFixed(2)+'\nMonthly EMI : $'+monthlyemi.toFixed(2)+'\n';

		txtArea.innerHTML = answer;

	}
	else if (yrsMnths == "m")
	{
		var actDuration = duration/12;
		totalInterest = (principal*roi*actDuration)/100;
		totalAmount = principal+totalInterest;
		monthlyemi = totalAmount/duration;

		var answer = 'Total Interest Incurred : $'+totalInterest.toFixed(2)+'\nTotal Amount to be Repaid : $'+totalAmount.toFixed(2)+'\nMonthly EMI : $'+monthlyemi.toFixed(2)+'\n';

		txtArea.innerHTML = answer;

	}

}