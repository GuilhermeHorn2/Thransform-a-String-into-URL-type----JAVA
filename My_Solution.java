package misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;


public class main_misc {
    //private static HashMap<String,String> cache = new HashMap<>();
	public static void main(String[] args) {
	    String s = "Mr John Smith ";
	    int n = 13;
	    
	    System.out.println(url_ify(s,n));
	    
		
		
	}
	private static String url_ify(String s,int n){
		//
	
		int size = 0;
		
		for(int i = 0;i < n;i++){
			if(s.substring(i,i+1).equals(" ")) {
				size++;
			}
		}
		//because : "%20" has length 3 and " " has length 1
		size *= 3;
		size += n-2;
		
		char[] c = new char[size];
		
		int j = 0;
		for(int i = 0;i < size;i++){
			if(!s.substring(j,j+1).equals(" ")){
				c[i] = s.charAt(j);
				j++;
				continue;
				
			}
			if(s.substring(j,j+1).equals(" ") && i+2 < size){
				 c[i] = '%';
				 c[i+1] = '2';
				 c[i+2] = '0';
				 i+= 2;
				 j++;
				 
			}
		}
		
		String r = "";
		for(int i = 0;i < size;i++) {
			r += c[i];
		}
		
		return r;
		
	}
	
		
	
	}
	
		
		
	

	
	
	
	
	
	
	
	
	

	


	
	

	
		
	
	


	

	
	


	
	
	

	


	
	

	
		
	
	


	

	
	

