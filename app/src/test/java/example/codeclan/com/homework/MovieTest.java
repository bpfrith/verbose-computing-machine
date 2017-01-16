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

    @Test
    public void canSetTitle(){
        movie.setTitle("Lion King");
        assertEquals("Lion King", movie.getTitle());
    }

    @Test
    public void canSetGenre(){
        movie.setGenre("Kids");
        assertEquals("Kids", movie.getGenre());
    }

    @Test
    public void canSetRank(){
        movie.setRank(9);
        assertEquals(9, movie.getRank());
    }

    @Test
    public void canToString(){
        String string = movie.toString(movie);
        assertEquals("Title: 'Jungle Book', Genre: 'Kids', Ranking: 10", string);
    }

}