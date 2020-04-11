package jjkj;

import java.util.Date;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jjkj.dao.MovieDao;
import com.jjkj.entity.Movie;
import com.jjkj.service.MovieService;

public class TestCase {
	ApplicationContext ctx;
	@Before
	public void init(){
		ctx=new ClassPathXmlApplicationContext("spring-mvc.xml");
	}
	@Test
	public void testMovieDao(){
		MovieDao dao=ctx.getBean("movieDao",MovieDao.class);
		System.out.println(dao.findList());
	}
	@Test
	public void testMovieService(){
		MovieService service=ctx.getBean("movieService",MovieService.class);
		System.out.println(service.findList());
	}
	@Test
	public void save(){
		MovieService service=ctx.getBean("movieService",MovieService.class);
		Movie m=new Movie();
		m.setMid(UUID.randomUUID().toString());
		m.setMname("英雄本色");
		m.setPlayer("古巨基");
		m.setPlot("hhhhhhhhhhh");
		m.setRegion("香港");
		m.setRelease_year("2008");
		m.setType("国产");
		service.save(m);
	}
	@Test
	public void delete(){
		MovieService service=ctx.getBean("movieService",MovieService.class);
		String id="a59c694f-9292-4c76-b6df-996579e05a57";
		service.delete(id);
	}
}
