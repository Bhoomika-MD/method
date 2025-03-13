class Bakery{
	public static void buy(String itemName,int quantity)
	{
	System.out.println("Items names and its quantity");
	System.out.println(itemName);
	System.out.println(quantity);
	}
	public static void open(boolean yesorno)
	{
	System.out.println("print yesorno in open");
	System.out.println(yesorno);
	}
	public static void close(boolean yesorno)
	{
	System.out.println("the bakery is running closed");
	System.out.println(yesorno);
	}
	public static void owner(String name)
	{
	System.out.println("bakery owner name ");
	System.out.println(name);
	}
	public static void cashier(String name)
	{
	System.out.println("bakery cashier name");
	System.out.println(name);
	}
}