package com.iu.test;

import java.sql.Connection;
import java.util.ArrayList;

import com.iu.countries.CountriesDAO;
import com.iu.countries.CountriesDTO;
import com.iu.countries.CountriesView;
import com.iu.employees.EmployeesDAO;
import com.iu.employees.EmployeesDTO;
import com.iu.employees.EmployeesView;
import com.iu.regions.RegionsDAO;
import com.iu.regions.RegionsDTO;
import com.iu.regions.RegionsView;
import com.iu.util.DBConnector;

public class TestMain {

	public static void main(String[] args) {	
		RegionsDAO dao = new RegionsDAO();
		RegionsView view = new RegionsView();
		RegionsDTO dto = new RegionsDTO();
		
		CountriesDAO conDao = new CountriesDAO();
		CountriesDTO dto2 = new CountriesDTO();
		CountriesView view2 = new CountriesView();
		
		EmployeesDAO eDao = new EmployeesDAO();
		EmployeesView eView = new EmployeesView();
		EmployeesDTO eDto = new EmployeesDTO();
		
		try {
//			ArrayList<EmployeesDTO> ar = eDao.getList(); 
//			eView.view(ar);
			eDto = eDao.getDtail(105);
			eView.view(eDto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		try {
//			ArrayList<RegionsDTO> ar = dao.getList();
//			view.view(ar);
//			
////			dto = dao.getDetail(4);
////			view.view(dto);
////			dao.getDetail(4);
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
//		try {
//			ArrayList<CountriesDTO> ar = conDao.getList();
//			view2.view(ar);		
////			dto2 = conDao.getDetail("EG");
////			view2.view(dto2);
//			
////			conDao.getList();
////			conDao.getDetail("BE");
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
