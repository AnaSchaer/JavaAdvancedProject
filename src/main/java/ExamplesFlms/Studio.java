package ExamplesFlms;

public class Studio {
    public void makeMovies(){

            Movie firstMovie = new Horror();
            firstMovie.setLengthInMinutes(12);
            firstMovie.setTitle("Rocky");

            Movie secondMovie = new Horror();
            secondMovie.setLengthInMinutes(62);
            secondMovie.setTitle("Balada");

            Movie thirdMovie = new Comedy();
            thirdMovie.setLengthInMinutes(83);
            thirdMovie.setTitle("Inception");

            Cinema cinema = new Cinema();
            cinema.adMovie(firstMovie);
            cinema.adMovie(secondMovie);
            cinema.adMovie(thirdMovie);


    }
}
