package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome Akash";
	}
	
	@PostMapping("/getList/{type1}")
	public List  getList(@PathVariable
			String type1) {
		System.out.println("inside getList");
		List list1 = new ArrayList<>();
		
		
		
		System.out.println(type1.toString());
		if(type1.equalsIgnoreCase("ASSET PRODUCT"))
		{
			list1.add("MORTGAGE");
			list1.add("RIBG PRODUCTS");
		
			System.out.print(list1);
			
			
		}else if (type1.equalsIgnoreCase("BRANCH BANKING PROCESS")) {
			list1.add("AADHAAR CAMP REQUEST");
			list1.add("ACCOUNT ACTIVATION");
			list1.add("ADHERENCE SCORE");
			list1.add("AMXE TREVELLERS CHEQUE");
			list1.add("ANTI MONEY LAUNDERING QUERY");
			System.out.print(list1);
			
		}else if(type1.equalsIgnoreCase("HFC-IT APPLICATION CALLS")) {
			list1.add("HFC CKYC");
			list1.add("HFC LEGAL WORKFLOW");
			list1.add("HFC MOBILITY");
			list1.add("HFC TREASURY");
			System.out.println("list1");
			
		}
		return list1;
	}
	@PostMapping("/getList2/{type2}")
	public List  getList2(@PathVariable
			String type2) {
		System.out.println("inside getList");
		List list1 = new ArrayList<>();
		
		
		
		System.out.println(type2.toString());
		if(type2.equalsIgnoreCase("MORTGAGE"))
		{
			list1.add("BALANCE SCORECARD");
			list1.add("BRANCH SEGMENT OR EMPLOYMENT RECONCILLATION");
			list1.add("CHANNEL MAPPING UPDATION");
		
			System.out.print(list1);
			
			
		}else if (type2.equalsIgnoreCase("AADHAAR CAMP REQUEST")) {
			list1.add("CAMP APPROVAL REQUEST");
			
			System.out.print(list1);
			
		}else if(type2.equalsIgnoreCase("HFC CKYC")) {
			list1.add("APPLICATION SLOW OR DOWN-HFC CKYC");
			list1.add("REPORT AN ISSUE HFC CKYC");
			System.out.println("list1");
			
		}
		return list1;
	}
}
