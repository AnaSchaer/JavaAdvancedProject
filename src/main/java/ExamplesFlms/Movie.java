package ExamplesFlms;

public abstract class Movie {
    int lengthInMinutes;

    String title;
    double rating;
    String director;
    boolean isUnderAge;
    abstract void makeSound();



    public String getTitle() {
        return title;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }


    public double getRating() {
        return rating;
    }

    public String getDirector() {
        return director;
    }

    public boolean isUnderAge() {
        return isUnderAge;
    }

    public void setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }



    public void setTitle(String title) {
        this.title = title;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setUnderAge(boolean underAge) {
        isUnderAge = underAge;
    }
}
