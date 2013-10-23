package com.rajesh.spring.custom.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 
@Service 
public class MovieLibrary {

 	@Autowired
	private MovieCatalog movieCatalog;

	public MovieCatalog getMovieCatalog() {
		return movieCatalog;
	}
	 
	public void setMovieCatalog(MovieCatalog movieCatalog) {
		this.movieCatalog = movieCatalog;
	}

	 
}
