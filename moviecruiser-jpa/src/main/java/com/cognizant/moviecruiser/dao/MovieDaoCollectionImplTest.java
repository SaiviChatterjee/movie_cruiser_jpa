package com.cognizant.moviecruiser.dao;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import com.cognizant.moviecruiser.model.Movie;

public class MovieDaoCollectionImplTest {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String choice;

		do {
			System.out.println("Menu");
			System.out.println("****************************************");
			System.out.println("1. Admin");
			System.out.println("2. Customer");
			System.out.println("3. Exit");
			System.out.println("****************************************");

			choice = sc.nextLine();
			System.out.println("****************************************");

			switch (choice) {
			case "1": {
				String adminChoice;
				do {
					System.out.println("Admin Menu");
					System.out.println("****************************************");
					System.out.println("1. Get Movie List");
					System.out.println("2. Modify Movie");
					System.out.println("3. Get Movie");
					System.out.println("4. Main Menu");
					System.out.println("****************************************");

					adminChoice = sc.nextLine();
					System.out.println("****************************************");

					switch (adminChoice) {
					case "1": {
						System.out.println("Admin Movie List");
						System.out.println("****************************************");
						System.out.println(String.format("%-3s %-20s %-15s %-8s %-30s %-18s " + 
								"%-15s", "Id", "Title", "Bos Office", "Active", 
								"Date of Launch", "Genre", "Has Teaser"));
						System.out.println();

						testGetMovieListAdmin();
						System.out.println("****************************************");
						break;
					}
					case "2": {
						testModifyMovie();
						System.out.println("Movie 1 is modified !! Enter 3 to display the changes.");
						System.out.println("****************************************");
						break;
					}
					case "3": {
						System.out.println("Movie 1 is displayed !!");
						System.out.println("****************************************");
						System.out.println(String.format("%-3s %-20s %-15s %-8s %-30s %-18s"
								+ " %-15s", "Id", "Title", "Bos Office", "Active", 
								"Date of Launch", "Genre", "Has Teaser"));
						System.out.println();

						testGetMovie();
						System.out.println("****************************************");
						break;
					}
					case "4": {
						break;
					}
					default: {
						System.out.println("Enter valid choice");
						System.out.println("****************************************");
					}
					}
				} while (!adminChoice.equals("4"));
				break;
			}
			case "2": {
				System.out.println("Customer Movie List");
				System.out.println("****************************************");
				System.out.println(String.format("%-3s %-20s %-15s %-8s %-30s %-18s %-15s", 
						"Id", "Title", "Bos Office", "Active", "Date of Launch", "Genre", 
						"Has Teaser"));
				System.out.println();

				testGetMovieListCustomer();
				System.out.println("****************************************");
				break;
			}
			case "3": {
				break;
			}
			default: {
				System.out.println("Enter valid choice");
				System.out.println("****************************************");
			}
			}
		} while (!choice.equals("3"));

		sc.close();
	}

	public static void testGetMovieListAdmin() throws ParseException {
		MovieDao movieDao = new MovieDaoCollectionImpl();
		List<Movie> movieList = movieDao.getMovieListAdmin();

		for (int i = 0; i < movieList.size(); i++) {
			System.out.println(movieList.get(i));
		}
	}

	public static void testGetMovieListCustomer() throws ParseException {
		MovieDao movieDao = new MovieDaoCollectionImpl();
		List<Movie> movieList = movieDao.getMovieListCustomer();

		for (int i = 0; i < movieList.size(); i++) {
			System.out.println(movieList.get(i));
		}
	}

	public static void testModifyMovie() throws ParseException {
		MovieDao movieDao = new MovieDaoCollectionImpl();
		Movie movie = movieDao.getMovie(1);
		movie.setTitle("Generic Name");
		movieDao.modifyMovie(movie);
	}

	public static void testGetMovie() throws ParseException {
		MovieDao movieDao = new MovieDaoCollectionImpl();
		System.out.println(movieDao.getMovie(1));
	}

}
