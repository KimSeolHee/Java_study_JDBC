package com.iu.regions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iu.util.DBConnector;

public class RegionsDAO {
	
	//1. Regions의 모든 데이터 가져오기
	public void getList() throws Exception {
		//1. DB연결 (로그인 및 연결), 객체없이 클래스메서드로 작성(static으로 선언됨)
		Connection con = DBConnector.getConnection();
		
		//2. Query문 작성
		String sql = "SELECT * FROM REGIONS";
		
		//3. Query문 미리 전송(준비를 미리 하는 것)
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. 지금은 sql문이라 할게없음 > 나중에 한다고 함!
		
		//5. 최종 전송 후 결과를 처리, 최종실행한 결과물을 resultSet에 담는다.
		ResultSet rs = st.executeQuery();
		
		//6. rs.next():한줄읽으세요. next() 리턴타입: boolean, 
		//   true면 데이터O false면 데이터X
		while(rs.next()) {
			int id = rs.getInt("Region_id");
			String name = rs.getString("Region_name");
			System.out.print(id + "\t");
			System.out.println(name);
		}
		
	}

}
