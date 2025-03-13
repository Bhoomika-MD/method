class AreaPostOffice{

	public static void home(String customerName,String address)
	{
	System.out.println("running home in areapostoffice");
	System.out.println("customerName:"+customerName);
	System.out.println("address:"+address);
	SubRegionalPostOffice.sent(customerName,address);
	}



}