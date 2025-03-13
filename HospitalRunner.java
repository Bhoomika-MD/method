class HospitalRunner{

	public static void main(String[] values)
	{
	System.out.println("running main in hospitalrunner");
	String customerName="Kavi";
	String patientName="Pavi";
	int age=78;
	String mobile="6754984324";
	String email="kavi@gmail.com";
	String sickness="diognising";
	Hospital.checkUp(customerName,patientName, age, mobile,email, sickness);
	
	}


}