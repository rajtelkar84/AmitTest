package com.exceptionhandling;

public class TryCatchExample {
	
	public static void main(String args[]){  
		   try{  
		    int a[]=new int[5];  
		    a[6]=30/0;  
		   }  
		   catch(ArithmeticException e){System.out.println("task1 is completed");}  
		   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}  
		   catch(Exception e){System.out.println("common task completed");}  
		  
		   
		   finally{System.out.println("finally block is always executed");}  
		   
		   System.out.println("rest of the code...");  
			 
		   
	}
	
		} 


