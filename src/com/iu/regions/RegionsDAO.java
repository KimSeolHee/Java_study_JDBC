package com.iu.regions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class RegionsDAO {
	
	//2. Regions에서 하나의 결과(row)
	public RegionsDTO getDetail(int region_id) throws Exception {
		RegionsDTO dto = null;
		//1. DB연결
		Connection con = DBConnector.getConnection();
		
		//2. sql문 작성(변수 값은 ?로 처리)
		String sql = "SELECT * FROM REGIONS WHERE REGION_ID = ?";
		
		//3. 미리전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ? 값 세팅 , 첫 번째 인자값은 물음표가 몇번째 순서인지(인덱스번호-오라클은 1번부터 셈)
		//             두 번째는 매개변수을 넣어줌
		//ex)WHERE NUM BETWEEN ?(1) AND ?(2); 
		st.setInt(1, region_id);
		
		//5. 최종 전송 후 결과 처리
		ResultSet rs = st.executeQuery();
		
//		while(rs.next()) {
//			int rid = rs.getInt("region_id");
//			String name = rs.getString("region_name");
//			System.out.print(rid+"\t");
//			System.out.println(name);
//		}
		
		if(rs.next()) {
			dto = new RegionsDTO();
			int rId = rs.getInt(1);
			String rName = rs.getString(2);
			dto.setRegion_id(rId);
			dto.setRegion_name(rs.getString("Region_name"));
		}
		//6. 자원 해제
		DBConnector.disConnect(rs, st, con);
		
		return dto;
	}
	
	
	//1. Regions의 모든 데이터 가져오기
	public ArrayList<RegionsDTO> getList() throws Exception {
		//받아온 데이터를 리스트에 넣기만 하면되고 기존에 있는 데이터배열을 받는게 아니라서 
		//안에서 리스트를 선언한다.
		ArrayList<RegionsDTO> ar = new ArrayList();
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
			RegionsDTO dto = new RegionsDTO();
			dto.setRegion_id(rs.getInt("Region_id"));
			dto.setRegion_name(rs.getString("Region_name"));
			ar.add(dto);
		}
		
		//7. 자원 해제
		DBConnector.disConnect(rs, st, con);
		return ar;
		
	}

}
