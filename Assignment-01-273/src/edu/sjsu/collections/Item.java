package edu.sjsu.collections;

public class Item {
	
	private double itmPrice;
	private String itmName;
	private String itmCategory;
	private double itmdiscPercent;
	private double itmdiscPrice;
	private double itmchkPrice;
	private double itmTaxPercent;
		
	
	Item() {
		this.itmPrice = 0.0;
		this.itmName = "";
		this.itmCategory = "";
		this.itmdiscPercent = 0;
		this.itmdiscPrice = 0.0;
		this.itmchkPrice = 0.0;
		this.itmTaxPercent = 0.0;
	}

	public void setitmName(String name)
	{
		this.itmName = name;
	}
	
	public void setitmCategory(String category)
	{
		this.itmCategory = category;
	}
	
	public void setitmPrice(Double price)
	{
		this.itmPrice = price;
	}
	
	public void setitmdiscPercent(double percent)
	{
		this.itmdiscPercent = percent;
		setitmdiscPrice();
	}
	
	public void setitmTaxPercent(double percent)
	{
		this.itmTaxPercent = percent;
		setitmchkPrice();
	}
	
	private void setitmdiscPrice()
	{
		this.itmdiscPrice = this.itmPrice - this.itmPrice*(this.itmdiscPercent/100);
	}
	
	private void setitmchkPrice()
	{
		this.itmchkPrice = this.itmdiscPrice + (this.itmTaxPercent/100 * this.itmPrice);
	}
	
	public double getitmchkPrice()
	{
		return this.itmchkPrice;
	}
	
	public double getitmdiscPrice()
	{
		return this.itmdiscPercent;
	}
	public String getitmdName()
	{
		return this.itmName;
	}
	public String getitmdCategory()
	{
		return this.itmCategory;
	}
	
	public String toString()
	{
		return "Product Name : "+this.itmName+"\nProduct Category : "+this.itmCategory+"\nProduct Price : $"+this.itmPrice+"\nDiscount : " 
				+this.itmdiscPercent+"%\nDiscount Price : $"+this.itmdiscPrice+"\nCheckout Price(After taxes) : $"+Math.round(this.itmchkPrice);
	}
}
