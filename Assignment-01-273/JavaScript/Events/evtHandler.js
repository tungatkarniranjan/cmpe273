var product;
var qty;

function mngImg() {
	
	var prdpicId = this.attributes["data-img"].value;
	console.log(prdpicId);
	product = prdpicId;
	
	var actPic = document.getElementById(prdpicId);

	var imgs = document.getElementsByTagName("IMG")
	for(var i = 0; i<imgs.length; i++)
	{
		if(imgs[i].className === "")
		{
			imgs[i].className = "hide";
		}
	}
	
	if(actPic.className === "hide"){
		actPic.className = "";
		changeTotal()
	}else{
		actPic.className = "hide";
	}
}

function enlargeImg()
{
	this.style.height = "40%";
	this.style.width = "40%";
	this.style.position = "absolute"
}

function resetImg()
{
	this.style.height = "150px"
	this.style.width = "200px"
	this.style.position = "absolute"
}

function changeTotal() {
	
	var tot = document.getElementById("total");
	var qtyVal= document.getElementById("qty").value;
	var price;
	
	if(product == "prd1pic")
	{
		price = 80*qtyVal
		tot.innerHTML = "Price : $80/pc, Total Price : "+price;
	}
	else if(product == "prd2pic")
	{
		price = 20*qtyVal
		tot.innerHTML = "Price : $20/pc, Total Price : "+price;
	}
	else if(product == "prd3pic")
	{
		price = 50*qtyVal
		tot.innerHTML = "Price : $50/pc, Total Price : "+price;
	}
	else if(product == null)
	{
		tot.innerHTML = "Select a product";	
	}
}
var prd1 = document.getElementById("prpic1");
var prdPic1 = document.getElementById("prd1pic");

var prd2 = document.getElementById("prpic2");
var prdPic2 = document.getElementById("prd2pic");

var prd3 = document.getElementById("prpic3");
var prdPic3 = document.getElementById("prd3pic");

prd1.addEventListener("click",mngImg,false);
prd2.addEventListener("click",mngImg,false);
prd3.addEventListener("click",mngImg,false);

prdPic1.addEventListener("mouseenter",enlargeImg);
prdPic1.addEventListener("mouseleave",resetImg);

prdPic2.addEventListener("mouseenter",enlargeImg);
prdPic2.addEventListener("mouseleave",resetImg);

prdPic3.addEventListener("mouseenter",enlargeImg);
prdPic3.addEventListener("mouseleave",resetImg);
	
	
var quantity = document.getElementById("qty");
quantity.addEventListener("change",changeTotal);