package com.iu.countries;

import java.util.ArrayList;

public class CountriesView {
	
	public void view(CountriesDTO dto) {
//		System.out.println("country_id \t country_name \t region_id");
//		System.out.println("------------------------------------------------");
		System.out.print(dto.getCountry_id() + " \t\t ");
		System.out.print(dto.getCountry_name() + " \t\t ");
		System.out.println(dto.getRegion_id());
		System.out.println("------------------------------------------------");
	}
	
	public void view(ArrayList<CountriesDTO> ar) {
		System.out.println("country_id \t country_name \t region_id");
		System.out.println("------------------------------------------------");
		for(CountriesDTO r:ar) {
			this.view(r);
		}
	}

}
