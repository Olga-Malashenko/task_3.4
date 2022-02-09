package ru.netology.manager;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import ru.netology.domain.AfishaRepository;
import ru.netology.domain.Movie;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

class AfishaManagerTest {
    @Mock
    private AfishaRepository repository = Mockito.mock(AfishaRepository.class);
    @InjectMocks
    private AfishaManager manager = new AfishaManager(repository);

    @Test
    public void shouldAdd() {
        Movie[] returned = {first, second, third};
        doReturn(returned).when(repository.findAll());
        verify(repository).findAll();

    }

    @Test
    void getAll() {

        verify(repository).findAll();
    }

    @Test
    void removeById() {

        verify(repository).findAll();
    }

}