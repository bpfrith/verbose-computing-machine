package example.codeclan.com.homework;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by user on 16/01/2017.
 */

public class FilmTest {
    Rankings rankings;
    Movie movies;
    @Before
    public void before() {
        movies = new Movie();
    }

    @Test
    public void getMoviesTest(){
        assertNotNull(movies.getMovie());
    }

    @Test
    public void getNumberOfMovies(){
        assertEquals(1,movies.getNumber());
    }
}
