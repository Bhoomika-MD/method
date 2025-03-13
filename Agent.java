class Agent{
	public static void purchase(String vegetable,int quantity)
	{
	System.out.println("Running purchase in agent");
	System.out.println("vegetable:"+vegetable);
	System.out.println("quantity:"+quantity);
	Broker.brokerage(vegetable,quantity);
	}



}