class BakeryRunners{
	public static void main(String[] args)
	{
	String itemName="Bun";
	int quantity=6;
	Bakery.buy(itemName,quantity);
	boolean value1=true;
	Bakery.open(value1);
	boolean value2=false;
	Bakery.close(value2);
	String ownerName="Krishna";
	Bakery.owner(ownerName);
	String cashierName="Sudhama";
	Bakery.cashier(cashierName);
	}

}