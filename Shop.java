class Shop{
	public static void sell(String vegetable,int quantity)
	{
	System.out.println("Running sell in shop");
	System.out.println("vegetable:"+vegetable);
	System.out.println("quantity:"+quantity);
	Agent.purchase(vegetable,quantity);
	}



}