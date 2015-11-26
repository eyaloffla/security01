package com.offla.utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ReadFile {
	
	private static final String fileName = "C:/Users/eyal/Documents/Temporary/SortedSumofIDandDateWithoutDuplicates.txt";
	
	
	
	public static void main(String args[]) {

		
		String number = "317755361";
		
		ReadFile rd = new ReadFile();
		rd.isInTheList(number);
		
	}
	
	
	public boolean isInTheList(String number){
		
		boolean b = isPersonInTheList(number);
		System.out.println(" \n Result for " + number + " : " + b);
		return b;
	}
	
	private boolean isPersonInTheList(String numberToCheck){
		
		Stream<String> stream = null;
		boolean result = false;
		String value = "";
		
       try {
			stream = Files.lines(Paths.get(fileName));
		}catch(Exception e){
	   }
		
		
		try{
		
		 value = stream.filter(s -> s.trim().equals(numberToCheck)).findFirst().get();
		 if(value.length()>1){
			 result = true;
		 }
		
		}
		catch (java.util.NoSuchElementException e) {
			//e.printStackTrace();
		}
		
		return result;
		
	}
	
	
	
	private static boolean isPersonInTheList(List<String> numberList, String numberToCheck){
		
		//List<String> list = new ArrayList<>();
        //list = stream.collect(Collectors.toList());
		
		boolean result = false;
		
		for(String s : numberList){
			
			s = s.trim();
			if(s.trim().equals(numberToCheck)){
				result = true;
			}
	  }
	 return result;
	}

}
