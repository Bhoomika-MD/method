class Docter{

	public static void treatment( String customerName,String patientName,int age)
	{
	System.out.println("running treatment in docter");
	System.out.println("customerName:"+customerName);
	System.out.println("patientName:"+patientName);
	System.out.println("age:"+age);
	
	Nurse.assist(customerName);
	}


}