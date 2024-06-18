package moviesApp;

public class Movie {
    private String title;
    private double imdbRate;
    private String director;
    private double price;
    private String genre;
    private boolean isForChildren;
    private int releaseYear;
    public Movie(String title, double imdbRate, String director, double price, String genre, boolean isForChildren, int releaseYear) {
        this.title = title;
        this.imdbRate = imdbRate;
        this.director = director;
        this.price = price;
        this.genre = genre;
        this.isForChildren = isForChildren;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public double getImdbRate() {
        return imdbRate;
    }

    public String getDirector() {
        return director;
    }

    public double getPrice() {
        return price;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isForChildren() {
        return isForChildren;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", imdbRate=" + imdbRate +
                ", director='" + director + '\'' +
                ", price=" + price +
                ", genre='" + genre + '\'' +
                ", isForChildren=" + isForChildren +
                ", releaseYear=" + releaseYear +
                '}';
    }
}













