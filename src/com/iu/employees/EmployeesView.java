package com.iu.employees;

import java.util.ArrayList;

public class EmployeesView {
	
	public void view(EmployeesDTO dto) {
		System.out.println("employee_id\t first_name \t last_name \t email \t phone_number \t hire_date \t job_id");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.print(dto.getEmployee_id()+" \t ");
		System.out.print(dto.getFirst_name()+" \t ");
		System.out.print(dto.getLast_name()+" \t ");
		System.out.print(dto.getEmail()+" \t ");
		System.out.print(dto.getPhone_number()+" \t ");
		System.out.print(dto.getHire_date()+" \t ");
		System.out.println(dto.getJob_id());
	}
	
	public void view(ArrayList<EmployeesDTO> ar) {
		System.out.println("employee_id\t first_name \t last_name \t email \t phone_number \t hire_date \t job_id");
		System.out.println("-----------------------------------------------------------------------------------");
		for(EmployeesDTO r : ar) {
			this.view(r);
		}
	}

}
