class ObjectsRunner{
	public static void main(String[] args){
		System.out.println("=============================");
		String name = Objects.getName(9012345678L);
		System.out.println("The Name of Person for Respective Mobile Number :"+name);
		System.out.println("==============================");
		String ownerName = Objects.getOwnerName("Airtel");
		System.out.println("The Owner name by their Company Name :"+ownerName);
		System.out.println("===============================");
		double price = Objects.getPrice("Tacos");
		if(price == 160.50){
			System.out.println("The Food Item is not in the menu");
		}else{
			System.out.println("The Requested Food Item is price is :"+price);
		}
		System.out.println("==============================");
		double balance = Objects.getBalance(1001001001L);
		if(balance == -1){
			System.out.println("The Account number not found");
		}else{
			System.out.println("The Balancce of Provided Account number is :"+balance);
		}
		System.out.println("===============================");
		double priceOfSource = Objects.getPriceBySource("Diamond");
		if(priceOfSource == 600000.00){
			System.out.println("The Source not found");
		}else{
			System.out.println("The Requested Source Item is price is :"+priceOfSource);
		}
		System.out.println("===============================");
		String isAliveOrNot = Objects.isPersonAlive("Kareena Kapoor");
		System.out.println("The Person name give is :"+isAliveOrNot);
	}
}