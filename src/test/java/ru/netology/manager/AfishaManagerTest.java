package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

    @Test
    public void shouldGetForEmpty() {
        AfishaManager movie = new AfishaManager();

        AfishaManager first = new AfishaManager(movie,1); // что-то я потерялась совсем ((
        // где какой класс писать, где какой параметр... НЕ понимаю, как мы передаем этот объект с фильмом в афишу
//        AfishaManager second = new AfishaManager(2, 2, "second", 1, 1);
//        AfishaManager third = new AfishaManager(3, 3, "third", 1, 1);
        AfishaManager.save();
//        AfishaManager.save(second);
//        AfishaManager.save(third);

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