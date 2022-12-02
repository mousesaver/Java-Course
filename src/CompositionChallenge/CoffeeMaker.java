package CompositionChallenge;

public class CoffeeMaker extends Appliance {

    public CoffeeMaker(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void brewCoffee() {
        if (!hasWorkToDo) {
            System.out.println("Done");
        } else {
            System.out.println("Brewing coffee");
            hasWorkToDo = false;
        }
    }
}
