package com.iu.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class EmployeesDAO {
	//전제조회
	public ArrayList<EmployeesDTO> getList() throws Exception {
		ArrayList<EmployeesDTO> ar = new ArrayList<>();
		//1.DB연결
		Connection con = DBConnector.getConnection();
		
		//2.sql문 작성
		String sql = "SELECT * FROM EMPLOYEES";
		
		//3.미리 준비
		PreparedStatement st = con.prepareStatement(sql);
		
		//4.생성 후 resultSet에 넣기
		ResultSet rs = st.executeQuery();
		
		//5.문자 넣기 나중에 view로 확인(넣기 전 DTO생성)
		while(rs.next()) {
			EmployeesDTO dto = new EmployeesDTO();
			dto.setEmployee_id(rs.getInt("employee_id"));
			dto.setFirst_name(rs.getString("first_name"));
			dto.setLast_name(rs.getString("last_name"));
			dto.setEmail(rs.getString("email"));
			dto.setPhone_number(rs.getString("phone_number"));
			dto.setHire_date(rs.getString("hire_date"));
			dto.setJob_id(rs.getString("job_id"));
			
			ar.add(dto);
		}
		//6.자원 해제
		DBConnector.disConnect(rs, st, con);
		
		return ar;
	}
	
	//특정 컬럼 조회
	public EmployeesDTO getDtail(int employee_id) throws Exception {
		EmployeesDTO dto = null;
		
		Connection con = DBConnector.getConnection();
		String sql = "SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = ?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, employee_id);
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			dto = new EmployeesDTO();
			dto.setEmployee_id(rs.getInt("employee_id"));
			dto.setFirst_name(rs.getString("first_name"));
			dto.setLast_name(rs.getString("last_name"));
			dto.setEmail(rs.getString("email"));
			dto.setPhone_number(rs.getString("phone_number"));
			dto.setHire_date(rs.getString("hire_date"));
			dto.setJob_id(rs.getString("job_id"));
		}
		DBConnector.disConnect(rs, st, con);
		
		return dto;
		
	}

}
