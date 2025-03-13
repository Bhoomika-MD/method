class PostHeadMaster{

	public static void corier(String customerName,String address)
	{
	System.out.println("running corier in postheadmaster");
	System.out.println("customerName:"+customerName);
	System.out.println("address:"+address);
	PostMaster.letter(customerName,address);
	}



}