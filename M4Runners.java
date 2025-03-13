class M4Runners{

		public static void main(String[] args)
		{
		{
		String itemName="Ladders";
		int quantity=6;
		char grade='a';
		Ladder.buy( itemName, quantity, grade);
		boolean value1=true;
		double weight=3.5;
		String shopName="Sonbar";
		Ladder.open( value1 ,  weight, shopName );
		double height=12;
		boolean value2=false;
		Ladder.close( height, value2);
		String ownerName="Shashi";
		int ownerAge=48;
		Ladder.owner( ownerName, ownerAge);
		String cashierName="Kantesh";
		Ladder.cashier( cashierName);
		int cashierAge=67;
		Ladder.cashier( cashierAge );
		String customerPlace="Davanagere";
		Ladder.customer( customerPlace);
		}
		
		{
		String itemName="Dosa";
		int quantity=2;
		String place="Bnglr";
		Fooditem.order(itemName,quantity,place);
		char grade='b';
		int quantity1=8;
		boolean value3=false;
		Fooditem.cancel(grade,quantity1,value3);
		double percentage=80;
		String hotelName="Aadya";
		Fooditem.taste(percentage,hotelName);
		boolean value4=true;
		double weight=10;
		Fooditem.waste(value4,weight);
		String ownerName="Ashok";
		Fooditem.owner(ownerName);
		int cashierAge=80;
		Fooditem.cashier(cashierAge);
		String customerPlace="Dharwad";
		Fooditem.customer(customerPlace);
		}
		{
		String itemName="IEEpaper";
		int quantity=6;
		boolean value5=true;
		Paper.fold(itemName,quantity,value5);
		char grade='a';
		double weight=6.8;
		String content="It is a project paper";
		Paper.unFold(grade,weight,content);
		String poemName="RomeoJuliet";
		int lines=20;
		Paper.poem(poemName,lines);
		String chapterName="Hero";
		boolean value6=false;
		Paper.lesson(chapterName,value6);
		String writerName1="Anand";
		Paper.writer(writerName1);
		int publisherAge=75;
		Paper.publisher(publisherAge);
		String readerLocation="Hubli";
		Paper.reader(readerLocation);
		}
		{
		String topicName="geography";
		int quantity=1;
		char rate='a';
		Whiteboard.write(topicName,quantity,rate);
		String directorName="Arman";
		double price=200.34;
		boolean value7=true;
		Whiteboard.director(directorName,price,value7);
		boolean value8=false;
		int lineNumber=10;
		Whiteboard.erase(value8,lineNumber);
		String schoolName="STJ";
		char grade='a';
		Whiteboard.school(schoolName,grade);
		String studentPlace="Harihara";
		Whiteboard.student(studentPlace);
		int teacherAge=56;
		Whiteboard.teacher(teacherAge);
		String puneName="Gopal";
		Whiteboard.pune(puneName);
		}
		{
		String teddyName="Crazy";
		int quantity=1;
		double price=200.67;
		Teddybear.newArrival(teddyName,quantity,price);
		boolean value9=true;
		String oldPlace="Garbage";
		int year=2003;
		Teddybear.old(value9,oldPlace,year);
		String giftedBy="Friend";
		boolean value10=false;
		Teddybear.gift(giftedBy,value10);
		char grade='b';
		String shopName="Miniso";
		Teddybear.purchase(grade,shopName);
		String ownerName="Ganesh";
		Teddybear.owner(ownerName);
		int numberMembers=8;
		Teddybear.worker(numberMembers);
		int phNumber=756789014;
		Teddybear.buy(phNumber);
		}
		{
		String location="Mysuru";
		int quantity=9;
		char grade='c';
		Dmart.shop(location,quantity,grade);
		String reason="not satisfied";
		boolean value11=true;
		double price=679.56;
		Dmart.return1(reason,value11,price);
		int items=7;
		String groceryName="dal";
		Dmart.grocery(items,groceryName);
		int orderItem=4;
		boolean value12=false;
		Dmart.cancel(orderItem,value12);
		String customerName="Ajay";
		Dmart.customer(customerName);
		int deliveryCost=678;
		Dmart.delivery(deliveryCost);
		double percentage=67.78;
		Dmart.shipping(percentage);
		}
		{
		String itemName="faceMask";
		int quantity=2;
		char rate=83;	
		Mask.apply(itemName,quantity,rate);
		boolean value13=true;
		String personName="Khushi";
		double percentage=78.7;
		Mask.remove(value13,personName,percentage);
		char grade='a';
		int itemNumber=3;
		Mask.newone(grade,itemNumber);
		int date=2009;
		boolean value14=false;
		Mask.corona(date,value14);
		String diseaseName="viral";
		Mask.pandemic(diseaseName);
		int age=78;
		Mask.person(age);
		String treat="diseaseSick";
		Mask.docter(treat);
		}
	}




}