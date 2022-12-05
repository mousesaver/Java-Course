package Polymorphism;

public class main {

    public static void main(String[] args) {
        Movie movie = new Movie("Star Wars");
        movie.watchMovie();

        Adventure theAdventure = new Adventure("Star Wars");
        theAdventure.watchMovie();
    }
}
