package com.sssm.demosite.model;

public class SearchQuery {

	public String origin;
	public String destination;

	public SearchQuery(String origin, String destination) {
		super();
		this.origin = origin;
		this.destination = destination;
	}

	public SearchQuery() {

	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "SearchQuery [origin = " + origin + ", destination = " + destination + "]";
	}

}
