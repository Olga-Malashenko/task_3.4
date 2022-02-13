package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AfishaManagerTest {
    private Movie[] movies;

    public static void main(String[] movies) {
        Movie first = new Movie(1, 1, 'urlImg1', 'bloodshot', 'action', 0, 'urlPg1');
        Movie second = new Movie(2, 2, 'urlImg2', 'forward', 'cartoon', 0, 'urlPg2');
        Movie third = new Movie(3, 3, 'urlImg3', 'hotel belgrade', 'comedy', 0, 'urlPg3');
        Movie fourth = new Movie(4, 4, 'urlImg4', 'gentlemen', 'action', 0, 'urlPg4');
        Movie fifth = new Movie(5, 5, 'urlImg5', 'invisible Man', 'horror', 0, 'urlPg5');
        Movie sixth = new Movie(6, 6, 'urlImg6', 'trolls world tour', 'cartoon', 1,'urlPg6');
        Movie seventh = new Movie(7, 7, 'urlImg7', 'number one', 'comedy', 1, 'urlPg7');
    }

    @Test
    public void shouldGetForEmpty() {
        AfishaManager movie = new AfishaManager();



        AfishaManager first = new AfishaManager(movies,1); // что-то я потерялась совсем ((
        // где какой класс писать, где какой параметр... НЕ понимаю, как мы передаем этот объект с фильмом в афишу

        AfishaManager.save();


//        movie.save();

        AfishaManager[] actual = AfishaManager.getAll();
        AfishaManager[] expected = new AfishaManager[]{first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetForSeveral() {
        AfishaManager movie = new AfishaManager();

        AfishaManager first = new AfishaManager();

        AfishaManager.save();

        movie.save();

        AfishaManager[] actual = AfishaManager.getAll();
        AfishaManager[] expected = new AfishaManager[]{first};

        assertArrayEquals(expected, actual);
    }
}