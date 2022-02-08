package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;
import static ru.netology.manager.AfishaManager.movies;

class AfishaManagerTest {

    @Test
    public void shouldGetForEmpty() {
        AfishaManager movie = new AfishaManager();

        AfishaManager first = new AfishaManager(movies,1); // что-то я потерялась совсем ((
        // где какой класс писать, где какой параметр... НЕ понимаю, как мы передаем этот объект с фильмом в афишу

        AfishaManager.save();


//        movie.save();

        Movie[] actual = AfishaManager.getAll();
        AfishaManager[] expected = new AfishaManager[]{first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetForSeveral() {
        AfishaManager movie = new AfishaManager();

        AfishaManager first = new AfishaManager();

        AfishaManager.save();

        movie.save();

        Movie[] actual = AfishaManager.getAll();
        AfishaManager[] expected = new AfishaManager[]{first};

        assertArrayEquals(expected, actual);
    }
}