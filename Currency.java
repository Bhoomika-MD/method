class Currency{
	public static void coinCurr()
	{
	System.out.println("diff coins in diff shape");
	}
	public static void dollarCurr()
	{
	System.out.println("diff shape symbol");
	noteCurr();
	}
	public static void noteCurr()
	{
	System.out.println("diff color and size");
	dollarCurr();
	rupeeCurr();
	}
	public static void rupeeCurr()
	{
	System.out.println("Indian currency");
	coinCurr();
	noteCurr();
	}



}