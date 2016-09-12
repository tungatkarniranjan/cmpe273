//San Jose zip codes - http://california.hometownlocator.com/
//San Franciso zip code - http://www.city-data.com/

sjcZipcode=[
"95101",
"95110",
"95111",
"95112",
"95113",
"95116",
"95117",
"95118",
"95119",
"95120",
"95121",
"95122",
"95123",
"95124",
"95125",
"95126",
"95127",
"95128",
"95129",
"95130",
"95131",
"95132",
"95133",
"95134",
"95135",
"95136",
"95138",
"95139",
"95140",
"95141", 
"95148"
]

sfoZipCodes = [
"94102", 
"94103",
"94104", 
"94105", 
"94107", 
"94108", 
"94109", 
"94110", 
"94111", 
"94112", 
"94114", 
"94115", 
"94116", 
"94117", 
"94118", 
"94121", 
"94122", 
"94123", 
"94124", 
"94127", 
"94129", 
"94130", 
"94131", 
"94132", 
"94133", 
"94134", 
"94158"]

function zipCodeValidator(city,zipCode){

	var flg = false;

	try
	{
		if(city == "San Jose")
		{
			for(var i = 0; i<sjcZipcode.length; i++)
			{
				if(zipCode == sjcZipcode[i])
				{
					flg=true;
					alert("Address Confirmed")
					break
				}
				else
				{
					continue
				}
			}
			if(flg == false)
				throw ("Not a valid Zip Code for San Jose")
		}
		else if(city == "San Francisco")
		{

			for(var i = 0; i<sfoZipCodes.length; i++)
			{
				if(zipCode == sfoZipCodes[i])
				{
					flg=true;
					alert("Address Confirmed")
					break
				}
				else
				{
					continue
				}
			}
			if(flg == false)
				throw ("Not a valid Zip Code for San Francisco")
		}
		else
		{
			throw ("City Not Found")
		}
	}
	catch(e)
	{
		alert('Error Occured : '+e)
	}
}

function checkAddress(){
	var address = document.getElementById("addr").value
	var city = document.getElementById("city").value
	var zip = document.getElementById("zip").value
	var state = document.getElementById("state").value

	try
	{
		if((address == "")||(city=="")||(zip=="")||(state == ""))
		{
			throw ("Some of the fields Missing")
		}
		else
		{
			if((state == "California")||(state == "CALIFORNIA")||(state=="california"))
			{
				if((parseInt(zip) > 95148)||(parseInt(zip) < 94102))
				{
					throw new RangeError("Zip Code are out of known Range");
				}
				zipCodeValidator(city,zip)
				cityValidator
			}
			else
				throw("Not a Valid State")
		}

	}
	catch(e)
	{
		alert("Error Occured : "+e)
	}
}