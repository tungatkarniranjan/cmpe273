function calTax()
{
	var income = document.getElementById("mnthIncome").value
	var states = document.getElementsByName("state")
	var status = document.getElementById("status").value
	
	var chk=false
	var actState = ""
	
	for(var i=0; i<states.length;i++){
		if(states[i].checked){
			chk=true
			actState=states[i].value
			break
		}
	}
	if(!chk){
		alert("Select a State")
		return
	}
	
	if(income == ""){
		alert("Enter Your Annual Income")
		return
	}
		
	if (actState == "California"){
		(function calTaxCalifornia(income,status){

			var taxConstantk = 0.16
			var singleTaxConstantk = 0.18
			
			var taxableIncome = income - 10000
			if(taxableIncome < 10000)
			{
				alert('No Tax!! Annual Income '+income+' below $10000')
			}
			else
			{
				if(status == "s")
				{
					tax = singleTaxConstantk*income
					var dispTax = 'Effective Income Tax Rate '+singleTaxConstantk*100+'% Avg Yearly Tax : $'+tax
					alert(dispTax)
				}
				else
				{
					tax = taxConstantk*income
					var dispTax = 'Effective Income Tax Rate '+taxConstantk*100+'% Avg Yearly Tax : $'+tax
					alert(dispTax)
				}
				
			}
		})(income,status);
	}
	else if(actState == "Texas"){
		calTaxTexas(income,status)
	}
	else if(actState == "Indiana"){
		calTaxIndiana(income,status)
	}
	
}

function calTaxTexas(income,status){
	
	var taxConstant1k = 0.01
	var taxConstant3k = 0.02
	var taxConstant6k = 0.03
	var taxConstantk = 0.04
	var singleTaxConstant1k = 0.02
	var singleTaxConstan3k = 0.04
	var singleTaxConstant6k = 0.06
	var singleTaxConstantk = 0.08
	
	if (income <= 1000){
		if(status == "s")
		{
			tax = singleTaxConstant1k*income
			var dispTax = 'Effective Income Tax Rate '+singleTaxConstant1k*100+'% Avg Yearly Tax : $'+tax
			alert(dispTax)
		}
		else
		{
			tax = 	taxConstant1k*income
			var dispTax = 'Effective Income Tax Rate '+taxConstant1k*100+'% Avg Yearly Tax : $'+tax
			alert(dispTax)
		}
	}else if(income <= 3000){
		if(status == "s")
		{
			tax = singleTaxConstan3k*income
			var dispTax = 'Effective Income Tax Rate '+singleTaxConstan3k*100+'% Avg Yearly Tax : $'+tax
			alert(dispTax)
		}
		else
		{
			tax = taxConstant3k*income
			var dispTax = 'Effective Income Tax Rate '+taxConstant3k*100+'% Avg Yearly Tax : $'+tax
			alert(dispTax)
		}
	}else if(income <= 6000){
		if(status == "s")
		{
			
			tax = singleTaxConstant6k * income
			var dispTax = 'Effective Income Tax Rate '+singleTaxConstant6k*100+'% Avg Yearly Tax : $'+tax
			alert(dispTax)
		}
		else
		{
			
			tax = taxConstant6k * income
			var dispTax = 'Effective Income Tax Rate '+taxConstant6k*100+'% Avg Yearly Tax : $'+tax
			alert(dispTax)
		}
	}else{
		if(status == "s")
		{
			tax = singleTaxConstantk*income
			var dispTax = 'Effective Income Tax Rate '+singleTaxConstantk*100+'% Avg Yearly Tax : $'+tax
			alert(dispTax)
		}
		else
		{
			tax = taxConstantk*income
			var dispTax = 'Effective Income Tax Rate '+taxConstantk*100+'% Avg Yearly Tax : $'+tax
			alert(dispTax)
		}
	}
}



var calTaxIndiana = function (income,satus){

	var taxConstant5k = 0.12
	var singleTaxConstant5k = 0.14
	
	var taxConstantk = 0.06
	var singleTaxConstantk = 0.08
		
	if(income <= 50000){
		if(status == "s")
		{
			tax = singleTaxConstantk*income
			var dispTax = 'Effective Income Tax Rate '+singleTaxConstantk*100+'% Avg Yearly Tax : $'+tax
			alert(dispTax)
		}
		else
		{
			tax = taxConstantk*income
			var dispTax = 'Effective Income Tax Rate '+taxConstantk*100+'% Avg Yearly Tax : $'+tax
			alert(dispTax)
		}
	}
	else{
		if(status == "s")
		{
			tax = singleTaxConstant5k*income
			var dispTax = 'Effective Income Tax Rate '+singleTaxConstant5k*100+'% Avg Yearly Tax : $'+tax
			alert(dispTax)
		}
		else
		{
			tax = taxConstant5k*income
			var dispTax = 'Effective Income Tax Rate '+taxConstant5k*100+'% Avg Yearly Tax : $'+tax
			alert(dispTax)
		}
	}
}
