//SFO, 
//LAX,
// AUS, 
//BOS,
// CLE
//JFK

function getAirportDetails()
{
	var airport = document.getElementById("location").value
	var ArptData;
	var jsonArptData;
	var url = "";

	var url = "http://services.faa.gov/airport/status/"+airport+"?format=application/json"

	var arptRequest = new XMLHttpRequest();
	

	arptRequest.onreadystatechange = function() {
		if(this.readyState == 4 && this.status == 200)
		{
			var ArptData = JSON.parse(arptRequest.responseText)
			dispAirportDetails(ArptData)
		}
	}

	arptRequest.open("GET",url,true);
	arptRequest.send();
}

function dispAirportDetails(ArptData)
{
	var disp = document.getElementById("disp")
	var delay = ""
	if(ArptData.delay == "false")
		delay = "No Delay"
	else
		delay = "Delayed"
	
	var det ='Name : '+ArptData.name+'\nCity : '+ArptData.city+'\nState : '+ArptData.state+'\nDelay : '+delay+'\nWeather : '+ArptData.weather.weather+'\nTemperature : '+ArptData.weather.temp+'\nWind : '+ArptData.weather.wind
	disp.innerHTML = det
	
	
}