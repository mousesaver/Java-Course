package EncapsulationChallenge;

public class main {

    public static void main(String[] args) {
        Printer a = new Printer(50, 10, true);
        System.out.println(a.addToner(30));
        System.out.println(a.printPages(15));
    }
}
