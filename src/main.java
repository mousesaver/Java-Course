public class main {

    public static void main(String[] args) {
        Car car = new Car();
//        car.make = "Porshe"
        car.setMake("Maserati");
        car.setModel("Carrera");
        car.setColor("black");
        car.setDoors(2);
        car.setConvertible(true);
        car.describeCar();
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setColor("red");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.describeCar();

        Account checking = new Account();
        checking.setNumber("1234");
        checking.setBalance(342.34);
        checking.setCustomerName("Sean");
        checking.setEmail("sean@123.com");
        checking.setPhoneNumber("234");
        checking.deposit(100);
        checking.withdraw(102);
        Account account2 = new Account("1234", 342.34, "Sean", "sean@123.com", "234");
        System.out.println(account2.getBalance());
        System.out.println(account2.getCustomerName());

        Account timAccount = new Account("Tim", "tim@123.com", "1234");
        System.out.println("AccountNo: " + timAccount.getNumber() + "; name: " + timAccount.getCustomerName());



        Customer sean = new Customer();
        System.out.println("Name: " + sean.getName() + "; Credit Limit: " + sean.getCreditLimit() + "; Email: " + sean.getEmail());

        Customer fan = new Customer("fan", "fan@123.com");
        System.out.println("Name: " + fan.getName() + "; Credit Limit: " + fan.getCreditLimit() + "; Email: " + fan.getEmail());

        Customer bill = new Customer("Bill", 1000, "bill@123.com");
        System.out.println("Name: " + bill.getName() + "; Credit Limit: " + bill.getCreditLimit() + "; Email: " + bill.getEmail());

        //    example for static variable
        Dog rex = new Dog("Rex");
        Dog fluffy = new Dog("Fluffy");
        rex.printName();
        fluffy.printName();
//        example for static method
        Calculator.printSum(2, 3);
        printHello();

//        example of pojo
        for (int i = 1; i <= 5; i++) {
            Student s = new Student("S92300" + i,
                    "Mary",
                    "05/11/1985",
                    "Java Masterclass");

            System.out.println(s);
        }

//        Inheritance
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");
        Dogg dog = new Dogg();
        doAnimalStuff(dog, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("______");
    }
    public static void printHello() {
        System.out.println("hello");
    }
}
