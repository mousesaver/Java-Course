package CompositionChallenge;

public class DishWasher extends Appliance {
    public DishWasher(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }
    public void doDishes() {
        if (!hasWorkToDo) {
            System.out.println("Done");
        } else {
            System.out.println("Doing dishes!");
            hasWorkToDo = false;
        }

    }



}
