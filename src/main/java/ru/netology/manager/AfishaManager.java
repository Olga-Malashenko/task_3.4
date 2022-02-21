package ru.netology.manager;


import ru.netology.domain.AfishaRepository;
import ru.netology.domain.Movie;

public class AfishaManager {
    private AfishaRepository repository;
    private int limitForFeed;

    public AfishaManager(AfishaRepository repository, int limitForFeed) {
        this.repository = repository;
        this.limitForFeed = limitForFeed;
    }

//    public AfishaManager(AfishaRepository repository) {
//        this.repository = repository;
//    }


    public int getLimitForFeed() {
        return limitForFeed;
    }

    public void setLimitForFeed(int limitForFeed) {
        this.limitForFeed = limitForFeed;
    }


    public void add(Movie movie) {
        repository.save(movie);
    }

    public Movie[] getAllFeed() {
        Movie[] movies = repository.findAll();
        int resultLenght;
        if (movies.length < limitForFeed) {
            resultLenght = movies.length;
        } else {
            resultLenght = limitForFeed;
        }
        Movie[] result = new Movie[resultLenght];
        for (int i = movies.length - resultLenght; i < movies.length; i++) {
            int index = movies.length - i - 1;
            result[index] = movies[i];
        }
        return result;
    }


    //    по заданию не нужно добавлять
    //    другие методы сверх первой задачи
//        поэтому закомментила

//    public void findById(int id) {
//        repository.findById(id);
//    }
//
//    public void removeById(int id) {
//        repository.removeById(id);
//    }
//
//    public void removeAll() {
//        repository.removeAll();
//    }




}
