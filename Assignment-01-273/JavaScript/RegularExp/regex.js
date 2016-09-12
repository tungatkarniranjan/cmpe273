function getNumbers()
{
	document.getElementById("txtArea").value = "";
	var parseString = document.getElementById("inputString").value;
	var spltStrarr = parseString.split(";");
	var flg = false;
	if(spltStrarr != null)
	{
		for(var i = 0; i<spltStrarr.length; i++)
		{
			var str1=spltStrarr[i].match(/contact:\d{10}/g);
			var str2=spltStrarr[i].match(/email:\w+[a-zA-Z0-9_.-]\@\w+[a-zA-Z0-9]\.\w+[a-zA-Z0-9.]/g);
			var str3=spltStrarr[i].match(/name:\w+[a-zA-Z.\s]\w+/g);
			var tstCnt = /contact:\d{10}/g;
			var tstEml = /email:\w+[a-zA-Z0-9_.-]\@\w+[a-zA-Z0-9]\.\w+[a-zA-Z0-9.]/g;
			var tstNme = /name:\w+[a-zA-Z.\s]\w+/g;
			
			if(tstCnt.test(spltStrarr[i])&&tstEml.test(spltStrarr[i])&&tstNme.test(spltStrarr[i]))
			{
				flg = true
				document.getElementById("txtArea").value += spltStrarr[i].match(/contact:\d{10}/g) +'\n'+spltStrarr[i].match(/email:\w+[a-zA-Z0-9_.-]\@\w+[a-zA-Z0-9]\.\w+[a-zA-Z0-9.]/g)+'\n'+spltStrarr[i].match(/name:\w+[a-zA-Z.\s]\w+/g)+'\n\n';		
			}
			else
			{
				document.getElementById("txtArea").value +='Expected values not Found!!\n\n'
			}
		}
		if(flg == false)
		{
			document.getElementById("txtArea").value ='Expected values not Found!!'
		}
	}
}