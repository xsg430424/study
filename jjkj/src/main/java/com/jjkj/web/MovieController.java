package com.jjkj.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jjkj.entity.Movie;
import com.jjkj.service.MovieService;

@Controller
@RequestMapping(value="movie")
public class MovieController {
	@Autowired
	private MovieService service;
	
	@RequestMapping(value="list")
	@ResponseBody
	public List<Movie> findList(Model model){
		List<Movie> list=service.findList();
		model.addAttribute("list", list);
		return list;
	}
	@RequestMapping(value="save")
	public String save(Movie movie){
		service.save(movie);
		System.out.println("保存OK");
		return "redirect:views/index";
	}
	@RequestMapping(value="update")
	public String update(Movie movie){
		service.update(movie);
		System.out.println("修改OK");
		return "redirect:views/index";
	}
	@RequestMapping(value="delete")
	public String delete(String id){
		service.delete(id);
		System.out.println("删除OK");
		return "redirect:views/index";
	}
}
