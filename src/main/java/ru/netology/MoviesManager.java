package ru.netology;

public class MoviesManager {
    private String[] moviesManager = new String[0];
    private int amountMovies;

    public MoviesManager() {
        this.amountMovies = 5;
    }

    public MoviesManager(int amountMovies) {
        this.amountMovies = amountMovies;
    }

    public void allMovies(String newMovies) {
        String[] tmp = new String[moviesManager.length + 1];
        for (int i = 0; i < moviesManager.length; i++) {
            tmp[i] = moviesManager[i];
        }
        tmp[tmp.length - 1] = newMovies;
        moviesManager = tmp;
    }

    public String[] findAll() {
        return moviesManager;
    }

    public String[] findLast() {
        int totalMovie;
        if (moviesManager.length < amountMovies) {
            totalMovie = moviesManager.length;
        } else {
            totalMovie = amountMovies;
        }

        String[] tmp = new String[totalMovie];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = moviesManager[moviesManager.length - 1 - i];
        }
        return tmp;
    }
}
