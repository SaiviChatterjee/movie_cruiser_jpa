package com.cognizant.moviecruiser.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cognizant.moviecruiser.model.Movie;

public class MovieDaoCollectionImpl implements MovieDao{
	private static List<Movie> movieList;
	
	public MovieDaoCollectionImpl() throws ParseException {
		super();
		if (movieList == null) {
			movieList = new ArrayList<Movie>();
			movieList.add(new Movie("Extraction","100",true,new SimpleDateFormat("dd/MM/yyyy").parse("24/04/2020"),"Action",true,"https://www.joblo.com/assets/images/joblo/posters/2020/03/extraction_netflix_xlg_thumb.jpg"));
			movieList.add(new Movie("Scoob!","0",true,new SimpleDateFormat("dd/MM/yyyy").parse("15/05/2020"),"Animation",true,"https://www.joblo.com/assets/images/joblo/posters/2020/03/1_thumb.jpg"));
			movieList.add(new Movie("The Two Popes","89",true,new SimpleDateFormat("dd/MM/yyyy").parse("27/11/2019"),"Drama",false,"https://www.joblo.com/assets/images/joblo/posters/2019/12/two-popes_thumb.jpg"));
			movieList.add(new Movie("Birdbox","63",true,new SimpleDateFormat("dd/MM/yyyy").parse("14/11/2018"),"Horror",true,"https://www.joblo.com/assets/images/joblo/posters/2018/12/bird-box-poster_thumb.jpg"));
			movieList.add(new Movie("Hangman","5",false,new SimpleDateFormat("dd/MM/yyyy").parse("22/12/2017"),"Thriller",true,"https://www.joblo.com/assets/images/oldsite/posters/images/full/hangman-poster1big_thumb.jpg"));		

		}
	}

	@Override
	public List<Movie> getMovieListAdmin() {
		return movieList;
	}

	@Override
	public List<Movie> getMovieListCustomer() {
		List<Movie> customerMovieList = new ArrayList<Movie>();

		for (int i = 0; i < movieList.size(); i++) {
			Movie movie = movieList.get(i);
			if ((movie.getDateOfLaunch().equals(new Date()) 
					|| movie.getDateOfLaunch().before(new Date())) && movie.isActive()) {
				customerMovieList.add(movie);
			}
		}

		return customerMovieList;
	}

	@Override
	public void modifyMovie(Movie movie) {
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).equals(movie)) {
				movieList.set(i, movie);
				break;
			}
		}
	}

	@Override
	public Movie getMovie(long movieId) {
		Movie movie = null;
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getId() == movieId) {
				movie = movieList.get(i);
				break;
			}
		}
		return movie;
	}

}
