package ru.netology.manager;


import ru.netology.domain.AfishaRepository;
import ru.netology.domain.Movie;

public class AfishaManager {
    private static AfishaRepository repository;
    public AfishaManager(AfishaRepository repository) {
        this.repository = repository;
    }
//    public static Movie[] movies;
//    private static int limitForFeed;

    public void add(Movie movie) {
        repository.save(movie);
    }

//
//    public AfishaManager() {
//    }
//
//    public AfishaManager(Movie[] movies, int limitForFeed) {
//        this.movies = movies;
//        this.limitForFeed = limitForFeed;
//    }

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



//    public Movie[] findAll() {return movies;}

    public static Movie[] getAll() {
        Movie[] movies = repository.findAll();

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

    public void removeById(int id) {
        repository.removeById(id);
    }

}
