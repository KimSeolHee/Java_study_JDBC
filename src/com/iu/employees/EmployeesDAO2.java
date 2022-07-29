package com.iu.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class EmployeesDAO2 {
	
	public void getJoinTest(EmployeesDTO dto) throws Exception{
		//1.DB연결 2.sql문 작성 3.미리전송 4. 물음표 세팅 5.전송후 결과처리 6.자원 해제
		Connection con = DBConnector.getConnection();
		String sql = "SELECT E.LAST_NAME, D.DEPARTMENT_NAME "
				+ "FROM EMPLOYEES E "
				+ "    INNER JOIN "
				+ "    DEPARTMENTS D "
				+ "    ON E.DEPARTMENT_ID = D.DEPARTMENT_ID "
				+ "WHERE E.EMPLOYEE_ID = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, dto.getEmployee_id());
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			dto = new EmployeesDTO();
			dto.setLast_name(rs.getString("LAST_NAME"));
//			DepartMentsDTO dt = new DepartMentsDTO();
//			dt.setDepartment_name(rs.getString("department_"));
		}
		DBConnector.disConnect(rs, st, con);
	}
	
	//전제조회
	public void getSalaryInfo() throws Exception {
		EmployeesDTO dto = null;
		//1. DB연결
		Connection con = DBConnector.getConnection();
		//2. SQL문작성
		String sql ="SELECT SUM(SALARY) AS sum ,AVG(SALARY), MAX(SALARY) FROM EMPLOYEES";
		//3. 미리전송
		PreparedStatement st = con.prepareStatement(sql);
		//4. ?가 있으면 값세팅
		//5. 최종전송후 결과처리
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			dto = new EmployeesDTO();
//			dto.setSum(rs.getInt("sum"));
//			dto.setAVG(rs.getDouble(2));
//			dto.setMAX(rs.getInt("MAX(SALARY)"));
			System.out.println(rs.getInt("sum"));
			System.out.println(rs.getDouble(2));
		}
		//6. 자원해제
		DBConnector.disConnect(rs, st, con);
//		return dto;
	}

}
