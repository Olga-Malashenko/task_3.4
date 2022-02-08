package ru.netology.domain;

public class Repository {
    private static Movie[] movies = new Movie[0];

    public static void save(Movie movie) {

        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }


}

