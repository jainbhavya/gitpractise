//import java.util.HashMap;
//
//public class MySample {
//
//	public static void main(String[] args) {
//		HashMap<String, Integer> map = new HashMap<>();
//
//		// Add elements to the map
//		map.put("vishal", 10);
//		map.put("sachin", 30);
//		map.put("vaibhav", 20);
//		map.put("vishal", 50);
//
//		// Print size and content
//		System.out.println("Size of map is:- " + map.size());
//		System.out.println(map);
//
//		// Check if a key is present and if
//		// present, print value
//		if (map.containsKey("vishal")) {
//			Integer a = map.get("sachin");
//			System.out.println("value for key" + " \"vishal\" is:- " + a);
//		}
//	}
//}


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
        public static void main(String[] args)
        {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuffer newStrA=new StringBuffer(A);
        StringBuffer newStrB=new StringBuffer(B);    
        int lengthA=A.length();
        int lengthB=B.length();
        int sum=lengthA + lengthB;
        System.out.println(sum);
        
         for(int i = 0; i <A.length(); i++) {    
            if(Character.isLowerCase(A.charAt(0))) {    
                newStrA.setCharAt(i, Character.toUpperCase(A.charAt(0)));    
            }    
        }
        
        for(int i = 0; i <B.length(); i++) {    
            if(Character.isLowerCase(B.charAt(0))) {    
                newStrB.setCharAt(i, Character.toUpperCase(B.charAt(0)));    
            }    
        }
        
         System.out.println(A+" "+B);    
    }
}