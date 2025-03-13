class Wallet{
	public static void menBrands()
	{
	System.out.println("men brand");
	}
	public static void womenBrands()
	{
	System.out.println("women brand");
	uniBrands();
	}
	public static void uniBrands()
	{
	System.out.println("uni brand");
	womenBrands();
	childrenBrand();
	}
	public static void childrenBrand()
	{
	System.out.println("kids purse");
	menBrands();
	}



}