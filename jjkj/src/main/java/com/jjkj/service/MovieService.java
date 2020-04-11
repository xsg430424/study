package com.jjkj.service;

import java.util.List;

import com.jjkj.entity.Movie;

public interface MovieService {
	public List<Movie> findList();
	public void save(Movie movie);
	public void update(Movie movie);
	public void delete(String id);
}
