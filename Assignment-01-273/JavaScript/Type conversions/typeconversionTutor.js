
function checkDifferentOutputs()
{

	var variable1 = document.getElementById("var1").value;
	var variable2 = document.getElementById("var2").value;
	checkOpString(variable1,variable2);
	checkOpInt(variable1,variable2);
	checkOpDouble(variable1,variable2);
}

function checkOpString(variable1,variable2)
{
	var dispString = document.getElementById("dispString")
	dispString.innerHTML = ""

	var vartype1 = typeof variable1
	var vartype2 = typeof variable2

	dispString.innerHTML = 'typeof '+variable1+' : '+vartype1+'\n'
	dispString.innerHTML += 'typeof '+variable2+' : '+vartype2+'\n\n'

	dispString.innerHTML += 'Simple Concatenation : '+variable1+' + '+variable2+' : '+variable1+variable2

}

function checkOpInt(variable1,variable2)
{
	var dispInt = document.getElementById("dispInt")
	dispInt.innerHTML = ""

	var vartype1 = typeof variable1
	var vartype2 = typeof variable2

	dispInt.innerHTML += 'typeof '+variable1+' : '+vartype1+'\n'
	dispInt.innerHTML += 'typeof '+variable2+' : '+vartype2+'\n\n'

	var convertTointVariable1 = parseInt(variable1);
	var convertTointVariable2 = parseInt(variable2);

	dispInt.innerHTML +='var convertTointVariable1 = parseInt(variable1);\nvar convertTointVariable2 = parseInt(variable2);\n\n'
	varconvartype1 = typeof convertTointVariable1;
	varconvartype1 = typeof convertTointVariable2
	dispInt.innerHTML += 'typeof convertTointVariable1 : '+varconvartype1+'\n'
	dispInt.innerHTML += 'typeof convertTointVariable2 : '+varconvartype1+'\n\n'

	dispInt.innerHTML += 'Simple Concatenation : '+variable1+' + '+variable2+' : '+variable1+variable2+'\n'
	dispInt.innerHTML += 'Type Converted Variables Concat : '+convertTointVariable1+' + '+convertTointVariable2+' : '+(convertTointVariable1+convertTointVariable2)+'\n'

}

function checkOpDouble(variable1,variable2)
{
	var dispFloat = document.getElementById("dispFloat")
	dispFloat.innerHTML = ""

	var vartype1 = typeof variable1
	var vartype2 = typeof variable2

	dispFloat.innerHTML += 'typeof '+variable1+' : '+vartype1+'\n'
	dispFloat.innerHTML += 'typeof '+variable2+' : '+vartype2+'\n\n'

	var convertTointVariable1 = parseFloat(variable1);
	var convertTointVariable2 = parseFloat(variable2);

	dispFloat.innerHTML +='var convertToFloatVariable1 = parseFloat(variable1);\nvar convertToFloatVariable2 = parseFloat(variable2);\n\n'
	varconvartype1 = typeof convertTointVariable1;
	varconvartype1 = typeof convertTointVariable2
	dispFloat.innerHTML += 'typeof convertTointVariable1 : '+varconvartype1+'\n'
	dispFloat.innerHTML += 'typeof convertTointVariable2 : '+varconvartype1+'\n\n'

	dispFloat.innerHTML += 'Simple Concatenation : '+variable1+' + '+variable2+' : '+variable1+variable2+'\n'
	dispFloat.innerHTML += 'Type Converted Variables Concat : '+convertTointVariable1+' + '+convertTointVariable2+' : '+(convertTointVariable1+convertTointVariable2)+'\n'

}