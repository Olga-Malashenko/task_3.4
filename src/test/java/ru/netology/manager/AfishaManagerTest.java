package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AfishaManagerTest {

    Movie first = new Movie(1, 1, "urlImg1", "bloodshot", "action", false, "urlPg1");
    Movie second = new Movie(2, 2, "urlImg2", "forward", "cartoon", false, "urlPg2");
    Movie third = new Movie(3, 3, "urlImg3", "hotel belgrade", "comedy", false, "urlPg3");
    Movie fourth = new Movie(4, 4, "urlImg4", "gentlemen", "action", false, "urlPg4");
    Movie fifth = new Movie(5, 5, "urlImg5", "invisible Man", "horror", false, "urlPg5");
    Movie sixth = new Movie(6, 6, "urlImg6", "trolls world tour", "cartoon", true, "urlPg6");
    Movie seventh = new Movie(7, 7, "urlImg7", "number one", "comedy", true, "urlPg7");


    @Test
    public void shouldGetOneForEmpty() {
        AfishaManager manager = new AfishaManager();
        manager.add(first);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetSeveralForEmpty() {
        AfishaManager manager = new AfishaManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetOneForParameters() {
        AfishaManager manager = new AfishaManager(1);
        manager.add(sixth);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{sixth};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetSeveralForParametersIfLimitLess() {
        AfishaManager manager = new AfishaManager(3);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{seventh, sixth, fifth};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetSeveralForParametersIfLimitMore() {
        AfishaManager manager = new AfishaManager(8);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

}