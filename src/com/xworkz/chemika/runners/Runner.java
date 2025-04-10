package com.xworkz.chemika.runners;
import com.xworkz.chemika.internals.*;

public class Runner {
    public static void main(String[] args) {
        Student student =new Student(17,"Bhoomika", 21);
        System.out.println("Representation of Student:"+student);
        System.out.println("generated code is : "+System.identityHashCode(student));
        System.out.println("defined code is : "+student.hashCode());

        Temple temple=new Temple(32,"Ganesha",'f');
        System.out.println("God:"+temple);
        System.out.println("generated code is : "+System.identityHashCode(temple));
        System.out.println("defined code is : "+temple.hashCode());

        Hospital hospital=new Hospital(43,"Sagar",true);
        System.out.println("Hospital:"+hospital);
        System.out.println("generated code is : "+System.identityHashCode(hospital));
        System.out.println("defined code is : "+hospital.hashCode());

        Car car=new Car("Making","TopEnd",2025);
        System.out.println("Car:"+car);
        System.out.println("generated code is : "+System.identityHashCode(car));
        System.out.println("defined code is : "+car.hashCode());

        Book book=new Book("Ramayana","Valmiki",300);
        System.out.println("Book:"+book);
        System.out.println("generated code is : "+System.identityHashCode(book));
        System.out.println("defined code is : "+book.hashCode());

        Employee employee=new Employee("Shashank",3,45763);
        System.out.println("Employee:"+employee);
        System.out.println("generated code is : "+System.identityHashCode(employee));
        System.out.println("defined code is : "+employee.hashCode());

        BankAccount bankAccount=new BankAccount("bhoomi@123",3456,"Bhoomika");
        System.out.println("BankAccount:"+bankAccount);
        System.out.println("generated code is : "+System.identityHashCode(bankAccount));
        System.out.println("defined code is : "+bankAccount.hashCode());


        Movie movie=new Movie("Gaalipata","recent",9);
        System.out.println("Movie:"+movie);
        System.out.println("generated code is : "+System.identityHashCode(movie));
        System.out.println("defined code is : "+movie.hashCode());

        City city=new City("Davanagere",67,577004);
        System.out.println("City:"+city);
        System.out.println("generated code is : "+System.identityHashCode(city));
        System.out.println("defined code is : "+city.hashCode());

        Computer computer=new Computer("Mac","M1Air",280);
        System.out.println("Computer:"+computer);
        System.out.println("generated code is : "+System.identityHashCode(computer));
        System.out.println("defined code is : "+computer.hashCode());

        Animal animal=new Animal("Mammals",56,67.9);
        System.out.println("Animal:"+animal);
        System.out.println("generated code is : "+System.identityHashCode(animal));
        System.out.println("defined code is : "+animal.hashCode());

        House house=new House("Bangalore",8,789654);
        System.out.println("House:"+house);
        System.out.println("generated code is : "+System.identityHashCode(house));
        System.out.println("defined code is : "+house.hashCode());

        Phone phone=new Phone("Iphone","updated",13.5);
        System.out.println("Phone:"+phone);
        System.out.println("generated code is : "+System.identityHashCode(phone));
        System.out.println("defined code is : "+phone.hashCode());

        Teacher teacher=new Teacher("Sudha","Kannada",25);
        System.out.println("Teach:"+teacher);
        System.out.println("generated code is : "+System.identityHashCode(teacher));
        System.out.println("defined code is : "+teacher.hashCode());

        Course course=new Course("Java","jav45",100);
        System.out.println("Course:"+course);
        System.out.println("generated code is : "+System.identityHashCode(course));
        System.out.println("defined code is : "+course.hashCode());

        Bicycle bicycle=new Bicycle("Hercules",78,15.6);
        System.out.println("Bicycle:"+bicycle);
        System.out.println("generated code is : "+System.identityHashCode(bicycle));
        System.out.println("defined code is : "+bicycle.hashCode());

        Product product=new Product("Chocolate",67.8 ,7);
        System.out.println("Product:"+product);
        System.out.println("generated code is : "+System.identityHashCode(product));
        System.out.println("defined code is : "+product.hashCode());

        Game game=new Game("TempleRun","Appstore",9.5);
        System.out.println("Game:"+game);
        System.out.println("generated code is : "+System.identityHashCode(game));
        System.out.println("defined code is : "+game.hashCode());

        Music music=new Music("ArjunJanya","present",67);
        System.out.println("Music:"+music);
        System.out.println("generated code is : "+System.identityHashCode(music));
        System.out.println("defined code is : "+music.hashCode());

        AirPlane airPlane=new AirPlane("Malysia",78,"Army");
        System.out.println("Airplane:"+airPlane);
        System.out.println("generated code is : "+System.identityHashCode(airPlane));
        System.out.println("defined code is : "+airPlane.hashCode());

        Furniture furniture=new Furniture("Sofa","Leather",78.96);
        System.out.println("Furniture:"+furniture);
        System.out.println("generated code is : "+System.identityHashCode(furniture));
        System.out.println("defined code is : "+furniture.hashCode());

        TV tv=new TV("Samsung",42.5,true);
        System.out.println("TVshow:"+tv);
        System.out.println("generated code is : "+System.identityHashCode(tv));
        System.out.println("defined code is : "+tv.hashCode());

        Restaurent restaurent=new Restaurent("OceanPark","Mitsui",9.4);
        System.out.println("Restaurent:"+restaurent);
        System.out.println("generated code is : "+System.identityHashCode(restaurent));
        System.out.println("defined code is : "+restaurent.hashCode());

        Cloth cloth=new Cloth("Polyster","medium",89.6);
        System.out.println("Clothing:"+cloth);
        System.out.println("generated code is : "+System.identityHashCode(cloth));
        System.out.println("defined code is : "+cloth.hashCode());

        Camera camera=new Camera("Nikon",78.96,false);
        System.out.println("camera:"+camera);
        System.out.println("generated code is : "+System.identityHashCode(camera));
        System.out.println("defined code is : "+camera.hashCode());

        Refrigerator refrigerator=new Refrigerator("Whirlpool",78,true);
        System.out.println("Refrigerator:"+refrigerator);
        System.out.println("generated code is : "+System.identityHashCode(refrigerator));
        System.out.println("defined code is : "+refrigerator.hashCode());

        Watch watch=new Watch("Titan","Digital",768.9);
        System.out.println("Time:"+watch);
        System.out.println("generated code is : "+System.identityHashCode(watch));
        System.out.println("defined code is : "+watch.hashCode());

        School school=new School("Taralabalu",78,"Davanagere");
        System.out.println("Student:"+school);
        System.out.println("generated code is : "+System.identityHashCode(school));
        System.out.println("defined code is : "+school.hashCode());

        Dog dog=new Dog("Husky",17,45);
        System.out.println("Bark:"+dog);
        System.out.println("generated code is : "+System.identityHashCode(dog));
        System.out.println("defined code is : "+dog.hashCode());

        Cat cat=new Cat("BlackWhite","black",14);
        System.out.println("Cat:"+cat);
        System.out.println("generated code is : "+System.identityHashCode(cat));
        System.out.println("defined code is : "+cat.hashCode());

        University university=new University("GMIT",2000,900);
        System.out.println("University:"+university);
        System.out.println("generated code is : "+System.identityHashCode(university));
        System.out.println("defined code is : "+university.hashCode());

        Train train=new Train("VascodaGama",20,78.96);
        System.out.println("Train:"+train);
        System.out.println("generated code is : "+System.identityHashCode(train));
        System.out.println("defined code is : "+train.hashCode());

        Ship ship=new Ship("Indigo",67.8,900);
        System.out.println("Shipping:"+ship);
        System.out.println("generated code is : "+System.identityHashCode(ship));
        System.out.println("defined code is : "+ship.hashCode());

        Rocket rocket=new Rocket("Boby",67,2);
        System.out.println("Flying:"+rocket);
        System.out.println("generated code is : "+System.identityHashCode(rocket));
        System.out.println("defined code is : "+rocket.hashCode());

        Planet planet=new Planet("Earth",89766556.876,1);
        System.out.println("Light:"+planet);
        System.out.println("generated code is : "+System.identityHashCode(planet));
        System.out.println("defined code is : "+planet.hashCode());

        Tree tree=new Tree("Oak",67,78.9);
        System.out.println("Wind:"+tree);
        System.out.println("generated code is : "+System.identityHashCode(tree));
        System.out.println("defined code is : "+tree.hashCode());

        Flower flower=new Flower("Pink","rose",true);
        System.out.println("Bloom:"+flower);
        System.out.println("generated code is : "+System.identityHashCode(flower));
        System.out.println("defined code is : "+flower.hashCode());

        Meal meal=new Meal("Thali",2,true);
        System.out.println("Eat:"+meal);
        System.out.println("generated code is : "+System.identityHashCode(meal));
        System.out.println("defined code is : "+meal.hashCode());

        Song song=new Song("Mungaru male","Ganesh",5);
        System.out.println("Listen:"+song);
        System.out.println("generated code is : "+System.identityHashCode(song));
        System.out.println("defined code is : "+song.hashCode());

        Vehicle vehicle=new Vehicle("2wheeler","Petrol",2);
        System.out.println("Move:"+vehicle);
        System.out.println("generated code is : "+System.identityHashCode(vehicle));
        System.out.println("defined code is : "+vehicle.hashCode());

        Printer printer=new Printer("Sony",true,67);
        System.out.println("Print:"+printer);
        System.out.println("generated code is : "+System.identityHashCode(printer));
        System.out.println("defined code is : "+printer.hashCode());

        Fan fan=new Fan("3wing",5,true);
        System.out.println("Fan:"+fan);
        System.out.println("generated code is : "+System.identityHashCode(fan));
        System.out.println("defined code is : "+fan.hashCode());

        Building building=new Building("bhoomika",6,"PG");
        System.out.println("Build:"+building);
        System.out.println("generated code is : "+System.identityHashCode(building));
        System.out.println("defined code is : "+building.hashCode());

        Ball ball=new Ball("brown","rubber",5);
        System.out.println("throw:"+ball);
        System.out.println("generated code is : "+System.identityHashCode(ball));
        System.out.println("defined code is : "+ball.hashCode());

        Magazine magazine=new Magazine("model",89,"Priyanka");
        System.out.println("book:"+magazine);
        System.out.println("generated code is : "+System.identityHashCode(magazine));
        System.out.println("defined code is : "+magazine.hashCode());

        Newspaper newspaper=new Newspaper("KannadaPrabha","kannada",76);
        System.out.println("Paper:"+newspaper);
        System.out.println("generated code is : "+System.identityHashCode(newspaper));
        System.out.println("defined code is : "+newspaper.hashCode());

        Podcast podcast=new Podcast("Advertisement","Makeup",4);
        System.out.println("Podcast:"+podcast);
        System.out.println("generated code is : "+System.identityHashCode(podcast));
        System.out.println("defined code is : "+podcast.hashCode());

        Robot robot=new Robot("Chitti","Cook",true);
        System.out.println("Robo:"+robot);
        System.out.println("generated code is : "+System.identityHashCode(robot));
        System.out.println("defined code is : "+robot.hashCode());

        Drone drone=new Drone("Pratap",6784.976,true);
        System.out.println("fly:"+drone);
        System.out.println("generated code is : "+System.identityHashCode(drone));
        System.out.println("defined code is : "+drone.hashCode());

        Keyboard keyboard=new Keyboard("screentouch",true,"6column");
        System.out.println("typing:"+keyboard);
        System.out.println("generated code is : "+System.identityHashCode(keyboard));
        System.out.println("defined code is : "+keyboard.hashCode());

        Mouse mouse=new Mouse("Leo",true,78);
        System.out.println("move:"+mouse);
        System.out.println("generated code is : "+System.identityHashCode(mouse));
        System.out.println("defined code is : "+mouse.hashCode());

        Monitor monitor=new Monitor("Ultimate",789.6,true);
        System.out.println("see:"+monitor);
        System.out.println("generated code is : "+System.identityHashCode(monitor));
        System.out.println("defined code is : "+monitor.hashCode());

        SmartPhone smartPhone=new SmartPhone("iphone",678,true);
        System.out.println("using:"+smartPhone);
        System.out.println("generated code is : "+System.identityHashCode(smartPhone));
        System.out.println("defined code is : "+smartPhone.hashCode());

        Tablet tablet=new Tablet("Pharma",687,678);
        System.out.println("take:"+tablet);
        System.out.println("generated code is : "+System.identityHashCode(tablet));
        System.out.println("defined code is : "+tablet.hashCode());

        Speaker speaker=new Speaker(678,true,"Beoplay");
        System.out.println("volume:"+speaker);
        System.out.println("generated code is : "+System.identityHashCode(speaker));
        System.out.println("defined code is : "+speaker.hashCode());

        Headphone headphone=new Headphone("Leaf",false,"JBL");
        System.out.println("hear:"+headphone);
        System.out.println("generated code is : "+System.identityHashCode(headphone));
        System.out.println("defined code is : "+headphone.hashCode());

        Router router=new Router("d link",678976,true);
        System.out.println("Router:"+router);
        System.out.println("generated code is : "+System.identityHashCode(router));
        System.out.println("defined code is : "+router.hashCode());

        Desk desk=new Desk("Iron",6,true);
        System.out.println("sit:"+desk);
        System.out.println("generated code is : "+System.identityHashCode(desk));
        System.out.println("defined code is : "+desk.hashCode());

        Chair chair=new Chair("red",true,78);
        System.out.println("lift:"+chair);
        System.out.println("generated code is : "+System.identityHashCode(chair));
        System.out.println("defined code is : "+chair.hashCode());

        Microphone microphone=new Microphone("bluetooth",true,67);
        System.out.println("Microphone:"+microphone);
        System.out.println("generated code is : "+System.identityHashCode(microphone));
        System.out.println("defined code is : "+microphone.hashCode());

        Television television=new Television("Sony",67,true);
        System.out.println("see:"+television);
        System.out.println("generated code is : "+System.identityHashCode(television));
        System.out.println("defined code is : "+television.hashCode());

        GameConsole gameConsole=new GameConsole("Pubg",56,true);
        System.out.println("Game:"+gameConsole);
        System.out.println("generated code is : "+System.identityHashCode(gameConsole));
        System.out.println("defined code is : "+gameConsole.hashCode());

        Projector projector=new Projector(76,false,"monthly");
        System.out.println("Projector:"+projector);
        System.out.println("generated code is : "+System.identityHashCode(projector));
        System.out.println("defined code is : "+projector.hashCode());

        Scanner scanner=new Scanner("Highversion",45,true);
        System.out.println("Scanner:"+scanner);
        System.out.println("generated code is : "+System.identityHashCode(scanner));
        System.out.println("defined code is : "+scanner.hashCode());

        Webcam webcam=new Webcam(32,true,"Lenova");
        System.out.println("Webcam:"+webcam);
        System.out.println("generated code is : "+System.identityHashCode(webcam));
        System.out.println("defined code is : "+webcam.hashCode());

        Smartwatch smartwatch=new Smartwatch("higherend",true,10);
        System.out.println("Smartwatch:"+smartwatch);
        System.out.println("generated code is : "+System.identityHashCode(smartwatch));
        System.out.println("defined code is : "+smartwatch.hashCode());

        Charger charger=new Charger("Ctype",65,true);
        System.out.println("Charger:"+charger);
        System.out.println("generated code is : "+System.identityHashCode(charger));
        System.out.println("defined code is : "+charger.hashCode());

        SmartTV smartTV=new SmartTV("EV",56,false);
        System.out.println("SmartTV:"+smartTV);
        System.out.println("generated code is : "+System.identityHashCode(smartTV));
        System.out.println("defined code is : "+smartTV.hashCode());

        EReader eReader=new EReader("newVersion",8,true);
        System.out.println("Ereader:"+eReader);
        System.out.println("generated code is : "+System.identityHashCode(eReader));
        System.out.println("defined code is : "+eReader.hashCode());

        VRHeadset vrHeadset=new VRHeadset("apple",true,56);
        System.out.println("VRHeadset:"+vrHeadset);
        System.out.println("generated code is : "+System.identityHashCode(vrHeadset));
        System.out.println("defined code is : "+vrHeadset.hashCode());

        AirConditioner airConditioner=new AirConditioner("Whirlpool",678,true);
        System.out.println("AirConditioner:"+airConditioner);
        System.out.println("generated code is : "+System.identityHashCode(airConditioner));
        System.out.println("defined code is : "+airConditioner.hashCode());

        WashingMachine washingMachine=new WashingMachine("UPload",15,false);
        System.out.println("Washing machine:"+washingMachine);
        System.out.println("generated code is : "+System.identityHashCode(washingMachine));
        System.out.println("defined code is : "+washingMachine.hashCode());

        Oven oven=new Oven("double",67,true);
        System.out.println("Oven:"+oven);
        System.out.println("generated code is : "+System.identityHashCode(oven));
        System.out.println("defined code is : "+oven.hashCode());

        Toaster toaster=new Toaster(76,"Grey",true);
        System.out.println("Toaster:"+toaster);
        System.out.println("generated code is : "+System.identityHashCode(toaster));
        System.out.println("defined code is : "+toaster.hashCode());

        Microwave microwave=new Microwave(67,"Beon",true);
        System.out.println("Microwave:"+microwave);
        System.out.println("generated code is : "+System.identityHashCode(microwave));
        System.out.println("defined code is : "+microwave.hashCode());

        CoffeeMachine coffeeMachine=new CoffeeMachine("Automatic",true,9);
        System.out.println("CoffeeMachime:"+coffeeMachine);
        System.out.println("generated code is : "+System.identityHashCode(coffeeMachine));
        System.out.println("defined code is : "+coffeeMachine.hashCode());

        Blender blender=new Blender(78,false,"sony");
        System.out.println("Blender:"+blender);
        System.out.println("generated code is : "+System.identityHashCode(blender));
        System.out.println("defined code is : "+blender.hashCode());

        VacuumCleaner vacuumCleaner=new VacuumCleaner("EurekaFrobs",89,false);
        System.out.println("VacuumCleaner:"+vacuumCleaner);
        System.out.println("generated code is : "+System.identityHashCode(vacuumCleaner));
        System.out.println("defined code is : "+vacuumCleaner.hashCode());

        Heater heater=new Heater(98,"Radient",false);
        System.out.println("Heater:"+heater);
        System.out.println("generated code is : "+System.identityHashCode(heater));
        System.out.println("defined code is : "+heater.hashCode());

        WaterPurifier waterPurifier=new WaterPurifier("Aquagaurd",20,true);
        System.out.println("WaterPurifier:"+waterPurifier);
        System.out.println("generated code is : "+System.identityHashCode(waterPurifier));
        System.out.println("defined code is : "+waterPurifier.hashCode());

        Dishwasher dishwasher=new Dishwasher(6,true,"Whirlpool");
        System.out.println("Dishwasher:"+dishwasher);
        System.out.println("generated code is : "+System.identityHashCode(dishwasher));
        System.out.println("defined code is : "+dishwasher.hashCode());

        ElectricKettle electricKettle=new ElectricKettle(5,true,"grey");
        System.out.println("Electrickettle:"+electricKettle);
        System.out.println("generated code is : "+System.identityHashCode(electricKettle));
        System.out.println("defined code is : "+electricKettle.hashCode());

        Iron iron=new Iron(78,true,"Metal");
        System.out.println("Iron:"+iron);
        System.out.println("generated code is : "+System.identityHashCode(iron));
        System.out.println("defined code is : "+iron.hashCode());

        ElectricScooter electricScooter=new ElectricScooter(16,20,false);
        System.out.println("ElectricScooter:"+electricScooter);
        System.out.println("generated code is : "+System.identityHashCode(electricScooter));
        System.out.println("defined code is : "+electricScooter.hashCode());

        FitnessTracker fitnessTracker=new FitnessTracker("smart",true,5000);
        System.out.println("FitnessTracker:"+fitnessTracker);
        System.out.println("generated code is : "+System.identityHashCode(fitnessTracker));
        System.out.println("defined code is : "+fitnessTracker.hashCode());

        LightBulb lightBulb=new LightBulb(76,"yellow",true);
        System.out.println("LightBulb:"+lightBulb);
        System.out.println("generated code is : "+System.identityHashCode(lightBulb));
        System.out.println("defined code is : "+lightBulb.hashCode());

        ElectricGrill electricGrill=new ElectricGrill(67,true,"Sonic");
        System.out.println("ElectricGrill:"+electricGrill);
        System.out.println("generated code is : "+System.identityHashCode(electricGrill));
        System.out.println("defined code is : "+electricGrill.hashCode());

        Tripod tripod=new Tripod(78.9,true,"Fiber");
        System.out.println("Tripod:"+tripod);
        System.out.println("generated code is : "+System.identityHashCode(tripod));
        System.out.println("defined code is : "+tripod.hashCode());

        PowerBank powerBank=new PowerBank(54,1,true);
        System.out.println("PowerBank:"+powerBank);
        System.out.println("generated code is : "+System.identityHashCode(powerBank));
        System.out.println("defined code is : "+powerBank.hashCode());

        ExternalHardDrive externalHardDrive=new ExternalHardDrive(24,"ctype",true);
        System.out.println("ExternalHardDrive:"+externalHardDrive);
        System.out.println("generated code is : "+System.identityHashCode(externalHardDrive));
        System.out.println("defined code is : "+externalHardDrive.hashCode());

        USBDrive usbDrive=new USBDrive(180,true,"intel");
        System.out.println("USBDrive:"+usbDrive);
        System.out.println("generated code is : "+System.identityHashCode(usbDrive));
        System.out.println("defined code is : "+usbDrive.hashCode());

        Tent tent=new Tent(4,true,"Brown");
        System.out.println("Tent:"+tent);
        System.out.println("generated code is : "+System.identityHashCode(tent));
        System.out.println("defined code is : "+tent.hashCode());

        Backpack backpack=new Backpack(5,true,"black");
        System.out.println("BackPack:"+backpack);
        System.out.println("generated code is : "+System.identityHashCode(backpack));
        System.out.println("defined code is : "+backpack.hashCode());

        Shoe shoe=new Shoe("Nike",6,true);
        System.out.println("Shoe:"+shoe);
        System.out.println("generated code is : "+System.identityHashCode(shoe));
        System.out.println("defined code is : "+shoe.hashCode());

        Mug mug=new Mug(6,true,"pink");
        System.out.println("Mug:"+mug);
        System.out.println("generated code is : "+System.identityHashCode(mug));
        System.out.println("defined code is : "+mug.hashCode());

        Glasses glasses=new Glasses("Steel",true,"Convex");
        System.out.println("Glasses:"+glasses);
        System.out.println("generated code is : "+System.identityHashCode(glasses));
        System.out.println("defined code is : "+glasses.hashCode());


        Calculator calculator=new Calculator(true,"Casio",20);
        System.out.println("Calculator:"+calculator);
        System.out.println("generated code is : "+System.identityHashCode(calculator));
        System.out.println("defined code is : "+calculator.hashCode());

        CameraBag cameraBag=new CameraBag(2,true,"black");
        System.out.println("CameraBag:"+cameraBag);
        System.out.println("generated code is : "+System.identityHashCode(cameraBag));
        System.out.println("defined code is : "+cameraBag.hashCode());

        Luggage luggage=new Luggage(20,true,"Black");
        System.out.println("Luggage:"+luggage);
        System.out.println("generated code is : "+System.identityHashCode(luggage));
        System.out.println("defined code is : "+luggage.hashCode());

        Stapler stapler=new Stapler(25,"Pink",true);
        System.out.println("Stapler:"+stapler);
        System.out.println("generated code is : "+System.identityHashCode(stapler));
        System.out.println("defined code is : "+stapler.hashCode());

    }
}
