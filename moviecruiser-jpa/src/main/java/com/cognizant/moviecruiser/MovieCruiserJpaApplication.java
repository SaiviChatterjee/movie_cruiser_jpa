package com.cognizant.moviecruiser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.moviecruiser.model.Movie;
import com.cognizant.moviecruiser.service.MovieService;

@SpringBootApplication
public class MovieCruiserJpaApplication implements CommandLineRunner{
	private static final Logger LOGGER = LoggerFactory.getLogger(MovieCruiserJpaApplication.class);

	@Autowired
	MovieService movieService;

	public static void main(String[] args) {
		SpringApplication.run(MovieCruiserJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		getMovieListAdmin();
//		getMovieListCustomer();
//		updateMovie(2);
//		getMovie(3);
	}
	
	public void getMovieListAdmin() {
		LOGGER.info("start");
		Iterable<Movie> movies = movieService.getMoviesAdmin();
		LOGGER.debug("admin-movies{}:", movies);
		LOGGER.info("end");
	}

	public void getMovieListCustomer() {
		LOGGER.info("start");
		Iterable<Movie> movies = movieService.getMoviesCustomer();
		LOGGER.debug("customer-movies{}:", movies);
		LOGGER.info("end");
	}

	public void updateMovie(long movieId) {
		LOGGER.info("start");
		Movie movie=movieService.getMovieById(movieId);
		LOGGER.debug("before update {}:", movie);
		movie.setTitle("Generic Movie Name");
		movie.setBoxOffice("100");
		Movie updatedMovie=movieService.updateMovie(movie);
		LOGGER.debug("after update {}:", updatedMovie);
		LOGGER.info("end");
	}

	public void getMovie(long movieId) {
		LOGGER.info("start");
		Movie movie = movieService.getMovieById(movieId);
		LOGGER.debug("movie{}:", movie);
		LOGGER.info("end");
	}

}
