package vikraman.basics;

import java.util.HashSet;

public class Remove {
	    public static void main(String args[]) 
	    { 
	        HashSet<String> v = new HashSet<String>(); 
	  
	        v.add("Siva"); 
	        v.add("Vikraman"); 
	        v.add("rajan"); 
	        v.add("Sooriya"); 
	        v.add("Vignesh"); 
	        System.out.println("Compare: " + v); 
	  
	        v.remove("rajan"); 
	        v.remove("Vignesh"); 
	        v.remove("Siva"); 
	  
	        System.out.println("Remove : " + v); 
	    } 
	} 
