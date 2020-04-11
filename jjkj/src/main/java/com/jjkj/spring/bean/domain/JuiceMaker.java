package com.jjkj.spring.bean.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class JuiceMaker implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean,DisposableBean{
	private String beberageShop=null;
	private Source source=null;
	
	public void init() {
		System.out.println(this.getClass().getSimpleName()+":" +"init");
	}
	
	public void myInit() {
		System.out.println(this.getClass().getSimpleName()+":" +"myInit");
	}
	
	public void myDestroy(){
		System.out.println(this.getClass().getSimpleName()+":"+"myDestroy");
	}
	
	public void makeJuice(){
		System.out.println(this.getClass().getSimpleName()+":"+"makeJuice");
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName()+":"+"destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName()+":"+"afterPropertiesSet");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName()+":"+"setApplicationContext");
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName()+":"+"setBeanFactory");
	}

	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName()+":"+"setName");
	}
	
	public String getBeberageShop() {
		return beberageShop;
	}

	public void setBeberageShop(String beberageShop) {
		this.beberageShop = beberageShop;
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}
	
}
