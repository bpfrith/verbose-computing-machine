package example.codeclan.com.homework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 16/01/2017.
 */
public class MovieTest {

    Movie movie;

    @Before
    public void setUp() throws Exception {
        movie = new Movie("Jungle Book", "Kids", 10);
    }

    @Test
    public void canGetTitle(){
        assertEquals("Jungle Book", movie.getTitle());
    }

    @Test
    public void canGetGenre(){
        assertEquals("Kids", movie.getGenre());
    }

    @Test
    public void canGetRank(){
        assertEquals(10, movie.getRank());
    }

}