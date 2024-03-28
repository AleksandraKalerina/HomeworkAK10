package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {
    MoviesManager manager = new MoviesManager();

    @Test
    public void movieTest() {
        MoviesManager man = new MoviesManager();
        String[] expected = {};
        String[] actual = man.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void oneMovie() {
        manager.allMovies("Taxi");
        String[] expected = {"Taxi"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TwoMovies() {
        manager.allMovies("Taxi 2");
        manager.allMovies("Taxi 3");
        String[] expected = {"Taxi 2", "Taxi 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastMovies() {
        manager.allMovies("Hobbit 1");
        manager.allMovies("Hobbit 2");
        manager.allMovies("Hobbit 3");
        manager.allMovies("Lord of the Rings 1");
        manager.allMovies("Lord of the Rings 2");
        manager.allMovies("Lord of the Rings 3");
        String[] expected = {"Lord of the Rings 3", "Lord of the Rings 2", "Lord of the Rings 1", "Hobbit 3", "Hobbit 2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastMovies3() {
        MoviesManager last = new MoviesManager(3);

        last.allMovies("Harry Potter");
        last.allMovies("Harry Potter 2");
        last.allMovies("Harry Potter 3");
        last.allMovies("Harry Potter 4");
        last.allMovies("Harry Potter 5");
        last.allMovies("Harry Potter 6");
        last.allMovies("Harry Potter 7");
        String[] expected = {"Harry Potter 7", "Harry Potter 6", "Harry Potter 5"};
        String[] actual = last.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
