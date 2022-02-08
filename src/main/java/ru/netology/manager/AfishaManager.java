package ru.netology.manager;



public class AfishaManager {
    public static Movie[] movies;
    private static int limitForFeed;

    public AfishaManager() {
    }

    public AfishaManager(Movie[] movies, int limitForFeed) {
        this.movies = movies;
        this.limitForFeed = limitForFeed;
    }

//    public static Movie[] getMovies() {
//        return movies;
//    }
//
//    public static void setMovies(Movie[] movies) {
//        AfishaManager.movies = movies;
//    }
//
//    public static int getLimitForFeed() {
//        return limitForFeed;
//    }
//
//    public static void setLimitForFeed(int limitForFeed) {
//        AfishaManager.limitForFeed = limitForFeed;
//    }

    public static void save(Movie movie) {

        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

//    public Movie[] findAll() {return movies;}

    public static Movie[] getAll() {
        int resultLenght;
        if (limitForFeed == 0) {
            resultLenght = 10;
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