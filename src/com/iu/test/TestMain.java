package com.iu.test;

import java.sql.Connection;

import com.iu.countries.CountriesDAO;
import com.iu.regions.RegionsDAO;
import com.iu.util.DBConnector;

public class TestMain {

	public static void main(String[] args) {	
		RegionsDAO dao = new RegionsDAO();
		CountriesDAO conDao = new CountriesDAO();
//		try {
//			dao.getList();
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		try {
			conDao.getList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//		try {
//			DBConnector.getConnection();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
