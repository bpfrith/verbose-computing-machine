package example.codeclan.com.homework;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by user on 16/01/2017.
 */

public class RankingsTest {
    Rankings rankings;
    Movie movie;
    Movie movie2;
    Movie movie3;

    @Before
    public void before(){
        rankings = new Rankings();
        movie = new Movie("Jungle Book", "Music", 1);
        movie2 = new Movie("Lion King", "Drama", 2);
        movie3 = new Movie("Aladdin", "Comedy", 3);
    }

    @Test
    public void getRankingsTest(){
        assertNotNull(rankings.getRankings());
    }

    @Test
    public void canGetNumber(){
        assertEquals(0,rankings.getNumber());
    }

    @Test
    public void canAddMovie(){
        rankings.addMovie(movie);
        assertEquals(1, rankings.getNumber());
    }

    @Test
    public void canAddMovieByRank(){
        rankings.addMovieByRank(movie);
        assertEquals(movie, rankings.getMovieByRank(0));
    }

    @Test
    public void canReplaceLastMovie(){
        rankings.addMovie(movie);
        rankings.addMovie(movie2);
        rankings.replaceLastMovie(movie3);
        assertEquals(movie3, rankings.getMovieByRank(1));
    }

}
