package com.jjkj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jjkj.dao.MovieDao;
import com.jjkj.entity.Movie;
@Service("movieService")
@Transactional(readOnly = true)
public class MovieServiceImpl implements MovieService{
	@Autowired
	private MovieDao movieDao;
	
	@Transactional(readOnly = true)
	public List<Movie> findList() {
		return movieDao.findList();
	}
	@Transactional(readOnly = false)
	public void save(Movie movie) {
		movieDao.save(movie);
	}
	@Transactional(readOnly = false)
	public void update(Movie movie){
		movieDao.update(movie);
	}
	@Transactional(readOnly = false)
	public void delete(String id){
		movieDao.delete(id);
	}
}
