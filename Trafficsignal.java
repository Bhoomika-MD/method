class Trafficsignal{
	public static void threeClr()
	{
	System.out.println("there are Three colors in traffic signal");
	redClr();
	}
	public static void redClr()
	{
	System.out.println("red indicates to stop");
	yellowClr();
	}
	public static void yellowClr()
	{
	System.out.println("yellow indicates to get ready");
	greenClr();
	}
	public static void greenClr()
	{
	System.out.println("green indicates to move");
	threeClr();
	}
}