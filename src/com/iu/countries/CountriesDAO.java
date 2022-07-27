package com.iu.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iu.util.DBConnector;

public class CountriesDAO {
	
	public void getList() throws Exception {
		//1. DB연결 (로그인 및 연결), 객체없이 클래스메서드로 작성(static으로 선언됨)
		//2. Query문 작성\
		//3. Query문 미리 전송(준비를 미리 하는 것)
		//4. 지금은 sql문이라 할게없음 > 나중에 한다고 함!
		//5. 최종 전송 후 결과를 처리, 최종실행한 결과물을 resultSet에 담는다.
		//6. rs.next():한줄읽으세요. next() 리턴타입: boolean, 
		//   true면 데이터O false면 데이터X
		
		Connection con = DBConnector.getConnection();
		
		String sql = "SELECT * FROM COUNTRIES";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			String id = rs.getString("country_id");
			String name = rs.getString("country_name");
			int regionId = rs.getInt("region_id");
			
			System.out.print(id+"\t");
			System.out.print(name+"\t");
			System.out.println(regionId);
		}
		
		
		
		
		
	}

}
