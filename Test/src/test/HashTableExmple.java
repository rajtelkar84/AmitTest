package test;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashTableExmple {
	
	public static void main(String args[]) {
	      // Create a hash map
		HashMap balance = new HashMap();
	      Iterator names;
	      String str;
	      double bal;
	      
	     // balance.put(null, null);

	      balance.put("Zara", new Double(3434.34));
	      balance.put("Mahnaz", new Double(123.22));
	      balance.put("Ayan", new Double(1378.00));
	      balance.put("Daisy", new Double(99.22));
	      balance.put("Qadir", new Double(-19.08));

	      // Show all balances in hash table.
	   Set sh =   balance.keySet();//entrySet is method used to s
	   
	 Iterator itr =  sh.iterator();

			
		
	      
	      while(itr.hasNext()) {
	         str = (String) itr.next();
	         System.out.println(str + ": " + balance.get(str));
	      }        
	      System.out.println();
	      
	      // Deposit 1,000 into Zara's account
	      bal = ((Double)balance.get("Zara")).doubleValue();
	      balance.put("Zara", new Double(bal + 1000));
	      System.out.println("Zara's new balance: " + balance.get("Zara"));
	   }
	}