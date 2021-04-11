package com.tejas.important;

import java.util.List;

public class ImportantClass {

	public ImportantClass() {
		System.out.println("this is to test the dependency across modules");
	}
	
	
	public String[] listconversion(List<String> list)
	{
		String a[] = {"sdsfd","sfdf","sfdsfdfds"};
		if(list == null)
		{
			System.out.println("Nothing passed, just move on");
		}
		else
		{
		  String[] x = (String[])list.toArray();
		  return x;
		}
		return a;
		
 	}

}
