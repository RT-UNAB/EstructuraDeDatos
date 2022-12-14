package cl.estructuradatos;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableStrings {
	public static void main(String[] args) {
		 
		Enumeration names;
		String key;
	 
	   // Creating a Hashtable
	   Hashtable<String, String> hashtable = 
	              new Hashtable<String, String>();
	 
	   // Adding Key and Value pairs to Hashtable
	   
	   hashtable.put("0929306406","Horowitz");
	   hashtable.put("0201514257","Sedgewick");
	   hashtable.put("0201000237","Aho");
	   hashtable.put("8177584235","Kruse");
	 
	 
	   names = hashtable.keys();
	   while(names.hasMoreElements()) {
	      key = (String) names.nextElement();
	      System.out.println("isbn-10: " +key+ " & Autor: " +
	      hashtable.get(key));
	   }
	 }
}
