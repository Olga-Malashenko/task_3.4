package ru.netology.domain;

public class AfishaRepository {
    Movie first = new Movie(1, 1, "urlImg1", "bloodshot", "action", false, "urlPg1");
    Movie second = new Movie(2, 2, "urlImg2", "forward", "cartoon", false, "urlPg2");
    Movie third = new Movie(3, 3, "urlImg3", "hotel belgrade", "comedy", false, "urlPg3");
    Movie fourth = new Movie(4, 4, "urlImg4", "gentlemen", "action", false, "urlPg4");
    Movie fifth = new Movie(5, 5, "urlImg5", "invisible Man", "horror", false, "urlPg5");
    Movie sixth = new Movie(6, 6, "urlImg6", "trolls world tour", "cartoon", true, "urlPg6");
    Movie seventh = new Movie(7, 7, "urlImg7", "number one", "comedy", true, "urlPg7");

//    AfishaRepository repo = new AfishaRepository();

    private Movie[] movies = new Movie[0];
//    private int limitForFeed = 10;

//    public AfishaRepository(int limitForFeed) {
//        this.limitForFeed = limitForFeed;
//    }

    public AfishaRepository() {
    }

    public Movie[] getMovies() {
        return movies;
    }

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }

//    public int getLimitForFeed() {
//        return limitForFeed;
//    }
//
//    public void setLimitForFeed(int limitForFeed) {
//        this.limitForFeed = limitForFeed;
//    }

    public Movie[] findAll() {
        return movies;
    } // не вполне понимаю,
    // зачем нам нужен этот метод, он же копирует сеттер??

    public void save(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie findById(int id) {
        Movie resultMovie = null;
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                resultMovie = movie;
            }
        }
        return resultMovie;
    }

    public void removeById(int id) {
        int length = movies.length - 1;
        Movie[] tmp = new Movie[length];
        int copyTo = 0;
        for (Movie movie : movies) {
            if (movie.getId() != id) {
                tmp[copyTo] = movie;
                copyTo++;
            }
        }
        movies = tmp;
    }

    public void removeAll() {
        movies = new Movie[0];
    }

}





