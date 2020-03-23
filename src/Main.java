import Collection.Movie;
import Collection.MovieGenre;
import Collection.MpaaRating;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arg = new ArrayList<>();
        arg.add("1");
        arg.add("2");
        arg.add("3");
        arg.add("4");
        arg.add("5");
        arg.add(MovieGenre.COMEDY.toString());
        arg.add(MpaaRating.G.toString());
        arg.add("6");
        arg.add("7");
        arg.add("8");
        arg.add("9");
        arg.add("10");
        arg.add("11");
        arg.add("12");
        Movie mov = new Movie(arg);
        System.out.println(mov.getArgs().toString());
    }
}
