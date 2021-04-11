package com.teju.one;

import java.util.ArrayList;
import java.util.List;

import com.tejas.important.ImportantClass;

public class MainCaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting to call all the shits from here");
		
		ImportantClass workingok = new ImportantClass();
		List<String> one = new ArrayList<String>();
		one.add("tejas");
		one.add("is");
		one.add("working well");
		String[] xcd=workingok.listconversion(one);
		System.out.println(xcd);

	}

}
