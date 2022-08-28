package ExamplesFlms;

public class Cinema {
    private Movie[] movies;
    private int index;

    public Cinema() {
        index = 0;
        this.movies = new Movie[3];
    }

    public void adMovie(Movie newMovie) {
        movies[index] = newMovie;
        index++;
    }


}
