package ru.netology.manager;

public class AfishaManager {
    private Movie[] movies = new Movie[0];
    private int limitForFeed = 10;

    public AfishaManager(Movie[] movies, int limitForFeed) {
        this.movies = movies;
        this.limitForFeed = limitForFeed;
    }

    public AfishaManager() {
    }

    public Movie[] getMovies() {
        return movies;
    }

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }

    public int getLimitForFeed() {
        return limitForFeed;
    }

    public void setLimitForFeed(int limitForFeed) {
        this.limitForFeed = limitForFeed;
    }

    public void add(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie[] getAll() {
        int resultLenght;
        if (movies.length < limitForFeed) {
            resultLenght = movies.length;
        } else {
            resultLenght = limitForFeed;
        }
        Movie[] result = new Movie[resultLenght];
        for (int i = 0; i < resultLenght; i++) {
            int index = resultLenght - i - 1;
            result[i] = movies[index];
        }
        return result;
    }


}
