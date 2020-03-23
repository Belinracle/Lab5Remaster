package Parsers;

import Collection.Movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CSVParser implements Parser {

    @Override
    public String ser(Movie movie) {
        List<String> args = movie.getArgs();
        StringBuilder sb = new StringBuilder();
        for(String str:args){
            sb.append(str);
        }
        return sb.toString();
    }

    @Override
    public Collection<Movie> deSer(String str) {
        List<Movie> movies = new ArrayList<>();
        String[] linees = str.split("\n");
        for(String line:linees){
            movies.add(new Movie(Arrays.asList(line.split(","))));
        }
        return movies;
    }
}