package CompositionChallenge;

public class SmartKitchen {

    private CoffeeMaker coffeeMaker;
    private Refrigerator refrigerator;
    private DishWasher dishWasher;

    public SmartKitchen(CoffeeMaker coffeeMaker, Refrigerator refrigerator, DishWasher dishWasher) {
        this.coffeeMaker = coffeeMaker;
        this.refrigerator = refrigerator;
        this.dishWasher = dishWasher;
    }

    public void addWater() {
        System.out.println("Adding water");
        coffeeMaker.setHasWorkToDo(true);
        coffeeMaker.brewCoffee();
    }

    public void pourMilk() {
        System.out.println("Pouring Milk");
        refrigerator.setHasWorkToDo(true);
        refrigerator.orderFood();
    }

    public void loadDishwasher() {
        System.out.println("Loading Dishes");
        dishWasher.setHasWorkToDo(true);
        dishWasher.doDishes();
    }

    public void doKitchenWork() {
        System.out.println("Doing Kitchen Work");
        addWater();
        pourMilk();
        loadDishwasher();
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }
}
