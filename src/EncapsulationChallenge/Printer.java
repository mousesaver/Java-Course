package EncapsulationChallenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        tonerLevel += tonerAmount;
        if (tonerLevel > 100 || tonerLevel < 0) {
            return -1;
        } else {
            return tonerLevel;
        }

    }

    public int printPages(int pages) {
        if (duplex) {
            if (pages % 2 == 0) {
                pagesPrinted += pages / 2;
            } else {
                pagesPrinted += pages / 2 + 1;
            }
            System.out.println("It's a duplex printer");
        } else {
            pagesPrinted += pages;
        }
        return pagesPrinted;
    }
}
