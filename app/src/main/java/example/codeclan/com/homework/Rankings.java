package example.codeclan.com.homework;

import java.util.ArrayList;

/**
 * Created by user on 16/01/2017.
 */

public class Rankings {
    private ArrayList<Movie> movies;

    public Rankings() {
        movies = new ArrayList<Movie>();
    }

    public Rankings(ArrayList<Movie> movies) {
        movies = new ArrayList<Movie>(movies);
    }

    public ArrayList<Movie> getRankings() {
        return new ArrayList<Movie>(movies);
    }

    public int getNumber() {
        return movies.size();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public Movie getMovieByRank(int index) {
        return movies.get(index);
    }

    public void addMovieByRank(Movie movie) {
        int ranking = movie.getRank();
        int index = ranking - 1;
        movies.add(index, movie);
    }

    public void replaceLastMovie(Movie movie) {
        int index = getNumber() - 1;
        movies.set(index, movie);
    }

}
