package com.driver;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServices {
    @Autowired
    MovieRepository movieRepository;

    public void addMovie(Movie movie){
        movieRepository.addMovie(movie);
    }

    public void addDirector(Director director){
        movieRepository.addDirector(director);
    }

    public void addMovieDirectorPair(String movie, String director){
        movieRepository.addMovieDirectorPair(movie, director);
    }

    public Movie getMovie(String movieName){
        return movieRepository.getMovie(movieName);
    }

    public Director getDirector(String directorName){
        return movieRepository.getDirector(directorName);
    }

    public List<String> getMoviesFromDirector(String director){
        return movieRepository.getMoviesFromDirector(director);
    }

    public List<String> findAllMovies(){
        return movieRepository.getAllMovies();
    }

    public void deleteDirector(String director){
        movieRepository.deleteDirector(director);
    }

    public void deleteAllDirectors(){
        movieRepository.deleteAllDirector();
    }
}
