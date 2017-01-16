package example.codeclan.com.homework;

/**
 * Created by user on 16/01/2017.
 */

public class Movie implements Filmable{
    private String title;
    private String genre;
    private int ranking;

    public Movie(String title, String genre, int ranking){
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;
    }

    public String getTitle() {
        return this.title;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getRank() {
        return this.ranking;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRank(int ranking) {
        this.ranking = ranking;
    }

    public String toString(Movie movie) {
        return "Title: '" + this.title + "', Genre: '" + this.genre + "', Ranking: " + this.ranking;
    }

}
