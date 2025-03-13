class RegionalPostOffice{

	public static void deliver(String customerName,String address)
	{
	System.out.println("running deliver in regionalpostoffice");
	System.out.println("customerName:"+customerName);
	System.out.println("address:"+address);
	PostHeadMaster.corier(customerName,address);
	}



}