class Bitcoin{
	public static void gainCoin()
	{
	System.out.println("gain of bitcoin price");
	}
	public static void lossCoin()
	{
	System.out.println("Loss of bitcoin price");
	lowRate();
	}
	public static void lowRate()
	{
	System.out.println("low level of rate");
	gainCoin();
	highRate();
	lossCoin();
	}
	public static void highRate()
	{
	System.out.println("high level of rate");
	gainCoin();
	}



}