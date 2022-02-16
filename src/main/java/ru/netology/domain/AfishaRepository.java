package ru.netology.domain;

public class AfishaRepository {


    private Movie[] movies = new Movie[0];

    public Movie[] getMovies() {
        return movies;
    }

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }

    public AfishaRepository() {
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
    }

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





