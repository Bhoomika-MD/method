class SubRegionalPostOffice{

	public static void sent(String customerName,String address)
	{
	System.out.println("running sent in subregionalpostoffice");
	System.out.println("customerName:"+customerName);
	System.out.println("address:"+address);
	RegionalPostOffice.deliver(customerName,address);
	}



}