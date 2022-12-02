package CompositionChallenge;

public class Refrigerator extends Appliance {

    public Refrigerator(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void orderFood() {
        if (!hasWorkToDo) {
            System.out.println("Done");
        } else {
            System.out.println("Please order food");
            hasWorkToDo = false;
        }
    }
}
