package ru.netology.domain;

public class AfishaRepository {
    private static Movie[] movies = new Movie[0];

    public static void save(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie[] findAll() {
        return movies;
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

