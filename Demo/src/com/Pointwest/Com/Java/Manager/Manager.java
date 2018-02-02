package com.Pointwest.Com.Java.Manager;

import java.util.List;

import com.Pointwest.Com.Java.beans.FilmBean;
import com.Pointwest.Com.Java.dao.FilmDao;

public class Manager {
	
	public List<FilmBean> getFilms() {
	FilmDao filmDao = new FilmDao();
	List<FilmBean> films = filmDao.getFilms();
	return films;
	}
}
