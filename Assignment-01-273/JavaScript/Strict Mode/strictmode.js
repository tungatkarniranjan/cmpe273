
function calnormalStrict()
{
	"use strict";
	try
	{
		amt = document.getElementById("amt").value
		amtFloat = parseFloat(amt)

		plan = document.getElementById("plan").value

		limit = 0;

		if(plan == "60")
		{
			if(amtFloat <= 100)
				alert("$60")
			else
			{
				extAmt = amtFloat -100
				tariff = extAmt*2
				totAmt = 60+tariff
				alert("With Strict Mode: Total Tariff : "+totAmt)
			}
		}
		else if(plan == "55")
		{
			if(amtFloat <= 100)
				alert("$55")
			else
			{
				extAmt = amtFloat -100
				tariff = extAmt*2
				totAmt = 60+tariff
				alert("With Strict Mode: "+totAmt)
			}
		}
		else if (plan =="49") 
		{
			if(amtFloat <= 80)
			{
				alert("$49")
			}
			else
			{
				extAmt = amtFloat -80
				tariff = extAmt*2
				totAmt = 60+tariff
				alert("With Strict Mode: "+totAmt)
			}
		}
	}
	catch(e)
	{
		alert("Error Encountered with Strict Mode"+e)
	}
}


function calnormalMode()
{
	amt = document.getElementById("amt").value
	amtFloat = parseFloat(amt)

	plan = document.getElementById("plan").value

	limit = 0;

	if(plan == "60")
	{
		if(amtFloat <= 100)
			alert("$60")
		else
		{
			extAmt = amtFloat -100
			tariff = extAmt*2
			totAmt = 60+tariff
			alert("Without Strict Mode: Total Tariff : "+totAmt)
		}
	}
	else if(plan == "55")
	{
		if(amtFloat <= 100)
			alert("$55")
		else
		{
			extAmt = amtFloat -100
			tariff = extAmt*2
			totAmt = 60+tariff
			alert("Without Strict Mode: "+totAmt)
		}
	}
	else if (plan =="49") 
	{
		if(amtFloat <= 80)
		{
			alert("$49")
		}
		else
		{
			extAmt = amtFloat -80
			tariff = extAmt*2
			totAmt = 60+tariff
			alert("Without Strict Mode: "+totAmt)
		}
	}
}

function calStrict()
{
	"use strict";
	try
	{
		var amt = document.getElementById("amt").value
		var amtFloat = parseFloat(amt)

		var plan = document.getElementById("plan").value

		

		if(plan == "60")
		{
			if(amtFloat <= 100)
				alert("$60")
			else
			{
				var extAmt = amtFloat -100
				var tariff = extAmt*2
				var totAmt = 60+tariff
				alert("With Correct Use of Strict Mode: Total Tariff : "+totAmt)
			}
		}
		else if(plan == "55")
		{
			if(amtFloat <= 100)
				alert("$55")
			else
			{
				var extAmt = amtFloat -100
				var tariff = extAmt*2
				var totAmt = 60+tariff
				alert("With Correct Use of Strict Mode: Total Tariff : "+totAmt)
			}
		}
		else if (plan =="49") 
		{
			if(amtFloat <= 80)
			{
				alert("$49")
			}
			else
			{
				var extAmt = amtFloat -80
				var tariff = extAmt*2
				var totAmt = 60+tariff
				alert("With Correct Use of Strict Mode: Total Tariff : "+totAmt)
			}
		}
	}
	catch(e)
	{
		alert("Error Encountered with Strict Mode"+e)
	}
}