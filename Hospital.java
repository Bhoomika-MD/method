class Hospital{

	public static void checkUp(String customerName,String patientName,int age,String mobile,String email,String sickness)
	{
	System.out.println("running checkup in hospital");
	System.out.println("customerName:"+customerName);
	System.out.println("patientName:"+patientName);
	System.out.println("age:"+age);
	System.out.println("mobile:"+mobile);
	System.out.println("email:"+email);
	System.out.println("sickness:"+sickness);
	
	Docter.treatment(customerName,patientName,age);
	}


}