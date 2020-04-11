package com.jjkj.dao;

import java.util.List;

import com.jjkj.entity.Movie;


public interface MovieDao {
	public List<Movie> findList();
	public void save(Movie movie);
	public void update(Movie movie);
	public void delete(String id);
//	public Movie searchMovieByDay();
//	public Movie searchMovieByWeek();
//	public Movie searchMovieByMonth();
}
