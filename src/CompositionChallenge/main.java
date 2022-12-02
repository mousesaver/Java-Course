package CompositionChallenge;

public class main {
    public static void main(String[] args) {
        DishWasher dishWasher = new DishWasher(false);
        Refrigerator refrigerator = new Refrigerator(false);
        CoffeeMaker coffeeMaker = new CoffeeMaker(false);
        SmartKitchen smartKitchen = new SmartKitchen(coffeeMaker, refrigerator, dishWasher);
        smartKitchen.getCoffeeMaker().brewCoffee();
        smartKitchen.getDishWasher().doDishes();
        smartKitchen.getRefrigerator().orderFood();
        smartKitchen.doKitchenWork();
    }

}
