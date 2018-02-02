package com.Pointwest.Com.Java.UI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.Pointwest.Com.Java.Manager.Manager;
import com.Pointwest.Com.Java.beans.FilmBean;

public class UI {

	public static void printFilm() {
		
		Manager filmManager = new Manager();
		List<FilmBean> filmList = filmManager.getFilms();
		for (FilmBean fb: filmList) {
			System.out.println(fb.getTitle() + "\t" + fb.getDescription() + "\t" + fb.getLength());
		}
	
	}
}
