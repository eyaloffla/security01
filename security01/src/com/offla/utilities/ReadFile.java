package com.offla.utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ReadFile {
	
	public static void main(String args[]) {

		String fileName = "C:/Users/eyal/Documents/Temporary/SortedSumofIDandDateWithoutDuplicates.txt";
		List<String> list = new ArrayList<>();
		Stream<String> stream = null;
		
		
		try {
			
			stream = Files.lines(Paths.get(fileName));
			}catch(Exception e){
		}
		

		//	 list = stream.collect(Collectors.toList());
			
			
			 
			 boolean b = isPersonInTheList(stream,   1111111);                                  //  100000326);
			 System.out.println("Result is: " + b);
			
			// int size = list.size();
			// System.out.println("Size list: " + size);
			//stream.forEach(System.out::println);
				
			 
		
		ReadFile rf = new ReadFile();
		
		
		
	//	System.out.println("The person is in the list: " + rf.isPersonInTheList(list, 11111111));

	}
	
	private static boolean isPersonInTheList(Stream<String> stream, int numberToCheck){
		
		boolean result = false;
		String valor = "";
		
		try{
		
		 valor = stream.filter(s -> stringToInteger(s)== numberToCheck).findFirst().get();
		
		}
		catch (java.util.NoSuchElementException e) {
			//e.printStackTrace();
		}
		
		System.out.println("The value is: " + valor);
		
		return result;
		
	}
	
	private static int stringToInteger(String s){
		
		int n = 0;
		
		try{
			   n = Integer.parseInt(s);
			}
			catch(Exception e){
				
			}
		return n;
	}
	
	
	private boolean isPersonInTheList(List<String> numberList, int numberToCheck){
		
		boolean result = false;
		int n = 0;
		
		for(String s : numberList){
			
			s = s.trim();
			
			try{
			   n = Integer.parseInt(s);
			}
			catch(Exception e){
				
			}
			  
			if(n==numberToCheck){
				result = true;
			}
	  }
		
		 return result;
	}

}
