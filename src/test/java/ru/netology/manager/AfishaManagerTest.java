package ru.netology.manager;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import ru.netology.domain.AfishaRepository;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

class AfishaManagerTest {
    @Mock
    private AfishaRepository repository = Mockito.mock(AfishaRepository.class);
    @InjectMocks
    private AfishaManager manager = new AfishaManager(repository, 5);

    Movie first = new Movie(1, 1, "urlImg1", "bloodshot", "action", false, "urlPg1");
    Movie second = new Movie(2, 2, "urlImg2", "forward", "cartoon", false, "urlPg2");
    Movie third = new Movie(3, 3, "urlImg3", "hotel belgrade", "comedy", false, "urlPg3");
    Movie fourth = new Movie(4, 4, "urlImg4", "gentlemen", "action", false, "urlPg4");
    Movie fifth = new Movie(5, 5, "urlImg5", "invisible Man", "horror", false, "urlPg5");
    Movie sixth = new Movie(6, 6, "urlImg6", "trolls world tour", "cartoon", true, "urlPg6");
    Movie seventh = new Movie(7, 7, "urlImg7", "number one", "comedy", true, "urlPg7");


    @Test
    public void shouldGetFeed() {
        Movie[] returned = {first, second, third};
        doReturn(returned).when(repository).findAll();

        Movie[] actual = manager.getAllFeed();
        Movie[] expected = new Movie[]{third, second, first};
        assertArrayEquals(expected, actual);
        verify(repository).findAll();
    }


}