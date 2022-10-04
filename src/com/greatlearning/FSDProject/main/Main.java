package com.greatlearning.FSDProject.main;

import com.greatlearning.FSDProject.admindepartment.AdminDepartment;
import com.greatlearning.FSDProject.hrdepartment.HrDepartment;
import com.greatlearning.FSDProject.superdepartment.SuperDepartment;
import com.greatlearning.FSDProject.techdepartment.TechDepartment;

public class Main {
	 public static void main(String[] args) {

	        @SuppressWarnings("unused")
			SuperDepartment SD = new SuperDepartment();
	        AdminDepartment AD = new AdminDepartment();
	        HrDepartment HD = new HrDepartment();
	        TechDepartment TD = new TechDepartment();

	        System.out.println(AD.departmentName());
	        System.out.println(AD.getTodaysWork());
	        System.out.println(AD.getWorkDeadline());
	        System.out.println(AD.isTodayAHoliday());
	        
	        System.out.println(" ");
	        System.out.println(HD.departmentName());
	        System.out.println(HD.doActivity());
	        System.out.println(HD.getTodaysWork());
	        System.out.println(HD.getWorkDeadline());
	        System.out.println(HD.isTodayAHoliday());
	        
	        System.out.println(" ");
	        System.out.println(TD.departmentName());
	        System.out.println(TD.getTodaysWork());
	        System.out.println(TD.getWorkDeadline());
	        System.out.println(TD.getTechStackInformation());
	        System.out.println(TD.isTodayAHoliday());


	    }
	}

