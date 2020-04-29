package com.cognizant.moviecruiser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.moviecruiser.model.Movie;
import com.cognizant.moviecruiser.repository.MovieRepository;

@Service
public class MovieService {
	@Autowired
	private MovieRepository movieRepository;
	
	public Iterable<Movie> addMovies(List<Movie> movies) {
		return movieRepository.saveAll(movies);
	}

	public Iterable<Movie> getMoviesAdmin() {
		return movieRepository.findAll();
	}

	public Iterable<Movie> getMoviesCustomer() {
		return movieRepository.findMoviesCustomer();
	}

	public Movie getMovieById(Long movieId) {
		return movieRepository.findById(movieId).get();
	}

	public Movie updateMovie(Movie movie) {
		return movieRepository.save(movie);
	}
}
