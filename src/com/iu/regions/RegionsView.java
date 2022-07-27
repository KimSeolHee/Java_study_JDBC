package com.iu.regions;

import java.util.ArrayList;

public class RegionsView {
	

	public void view(RegionsDTO dto) {
//		System.out.println("Region_ID\t Region_name");
//		System.out.println("---------------------------------------");
		System.out.print(dto.getRegion_id()+"\t\t ");
		System.out.println(dto.getRegion_name());
		System.out.println("---------------------------------------");
	}
	
	public void view(ArrayList<RegionsDTO> ar) {
		System.out.println("Region_ID\t Region_name");
		System.out.println("---------------------------------------");
		for(RegionsDTO r : ar) {
			this.view(r);
//			System.out.println(r.getRegion_id());
//			System.out.println(r.getRegion_name());
//			System.out.println("---------------------------------------");
		}
	}

}
