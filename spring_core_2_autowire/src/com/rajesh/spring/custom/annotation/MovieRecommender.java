package com.rajesh.spring.custom.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class MovieRecommender {

	@Autowired
	@Genre("Action")
	private MovieCatalog actionCatalog;
	
	@Autowired
	@Genre("Comedy")
	private MovieCatalog comedyCatalog;

	
	public void setComedyCatalog(MovieCatalog comedyCatalog) {
		this.comedyCatalog = comedyCatalog;
	}

	public MovieCatalog getActionCatalog() {
		return actionCatalog;
	}

	public void setActionCatalog(MovieCatalog actionCatalog) {
		this.actionCatalog = actionCatalog;
	}

	public MovieCatalog getComedyCatalog() {
		return comedyCatalog;
	}
	
	
}
