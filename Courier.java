class Courier{
	public static void pickUp(String item)
	{
	System.out.println("Running pickup in courier");
	System.out.println("item:"+item);
	Station.send(item);
	}

}