package com.iu.test;

import java.sql.Connection;
import java.util.ArrayList;

import com.iu.countries.CountriesDAO;
import com.iu.regions.RegionsDAO;
import com.iu.regions.RegionsDTO;
import com.iu.regions.RegionsView;
import com.iu.util.DBConnector;

public class TestMain {

	public static void main(String[] args) {	
		RegionsDAO dao = new RegionsDAO();
		CountriesDAO conDao = new CountriesDAO();
		RegionsView view = new RegionsView();
		RegionsDTO dto = new RegionsDTO();
		try {
			ArrayList<RegionsDTO> ar = dao.getList();
			view.view(ar);
			
//			dto = dao.getDetail(4);
//			view.view(dto);
//			dao.getDetail(4);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		try {
////			conDao.getList();
//			conDao.getDetail("BE");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
//		try {
//			DBConnector.getConnection();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
