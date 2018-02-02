package com.Pointwest.Com.Java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.Pointwest.Com.Java.beans.FilmBean;

public class FilmDao {

	Logger myLogger = Logger.getLogger(FilmDao.class);

	public List<FilmBean> getFilms() {
		List<FilmBean> films = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String db = "jdbc:mysql://172.26.83.193:3306/sakila";
			String user = "newuser";
			String password = "password123";
			try {
				Connection conn = DriverManager.getConnection(db,user,password);
				Statement statement = conn.createStatement();
				//ResultSet rs = statement.executeQuery("SELECT * FROM SAKILA.FILM WHERE FILM.TITLE LIKE \"%THE%\";");
				
				/*while (rs.next()) {
					System.out.println(rs.getString("title"));
				}*/
				//Statement st = conn.createStatement();
				//PreparedStatement ps = conn.prepareStatement("SELECT * FROM SAKILA.FILM WHERE FILM.TITLE LIKE ?;");
				PreparedStatement ps = conn.prepareStatement("SELECT * FROM SAKILA.FILM WHERE FILM.LENGTH > ? AND FILM.LENGTH < ?;");
				
				//ps.setString(1, "%the%");
				ps.setInt(1, 100);
				ps.setInt(2, 150);
				ResultSet rs = ps.executeQuery();
				
				films = new ArrayList<FilmBean>();
				while (rs.next()) {
					FilmBean film = new FilmBean();
					film.setDescription(rs.getString("description"));
					film.setTitle(rs.getString("title"));
					film.setLength(rs.getString("length"));
					films.add(film);
					//System.out.println(rs.getString("title"));
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				myLogger.error(e.getMessage());
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			myLogger.error("Encountered issues from Database. For more info, contact JC.");
			myLogger.error(e.getMessage());
		}
		return films;
	}
}