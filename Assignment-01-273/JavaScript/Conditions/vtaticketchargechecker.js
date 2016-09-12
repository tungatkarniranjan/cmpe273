function getTariff()
{
	var std = document.getElementById("std").value;
	var disab = document.getElementsByName("abl");
	
	var chk=false;
	var actDisab = "";
	var tariff = 0;
	
	for(var i=0; i<disab.length;i++)
	{
		if(disab[i].checked)
		{
			chk=true;
			actDisab=disab[i].value;
			break;
		}
	}
	
	if(!chk){
		alert("You haven't stated if you a disability, You be charged normally.");
	}
	
	var ageRange = document.getElementById("ageRange").value;
	
	if(std == "Yes")
	{
		alert("Students have Free Rides!!!")
	}
	else if(actDisab == "Yes")
	{
		if(ageRange == "l8")
		{
			tariff = 2-2;
			alert("You will have a Free Ride!!!");
		}
		else if (ageRange == "l16")
		{
			tariff = 4-2;	
			alert("You will have to pay $"+tariff+" !!!$2 discounts for people with diabilities!!!");
		}
		else if(ageRange == "g16")
		{
			tariff = 8-2;
			alert("You will have to pay $"+tariff+" !!!$2 discounts for people with diabilities!!!");
		}
		else if(ageRange == "g60")
		{
			tariff = 6-2;
			alert("You will have to pay $"+tariff+" !!!$2 discounts for people with diabilities!!!");
		}		
	}
	else
	{
		if(ageRange == "l8")
		{
			tariff = 2;
			alert("You will have to pay $"+tariff);
		}
		else if (ageRange == "l16")
		{
			tariff = 4;	
			alert("You will have to pay $"+tariff);
		}
		else if(ageRange == "g16")
		{
			tariff = 8;
			alert("You will have to pay $"+tariff);
		}
		else if(ageRange == "g60")
		{
			tariff = 6;
			alert("You will have to pay $"+tariff);
		}
	}
	
	
}