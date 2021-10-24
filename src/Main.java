
public class Main {
	public static void main(String[] args) {
	    String[] intArray = {"a","b","c","d","e","f"};
	     
	  //print array starting from first element
	    System.out.println("Original Array:");
	    for(int i=0;i<intArray.length;i++)
	         System.out.print(intArray[i] + "  ");
	     
	    System.out.println();
	     
	    //print array starting from last element
	    System.out.println("Original Array printed in reverse order:");
	         for(int i=intArray.length-1;i>=0;i--)
	         System.out.print(intArray[i] + "  ");
		
//		 String original, reverse = "";
//		 original="This is the shit";
//		    int length = original.length();
//
//		    for (int i = length - 1 ; i >= 0 ; i--)
//		      reverse = reverse + original.charAt(i);
//
//		    System.out.println("Reverse of the string: " + reverse);
		
		
//		String s1 = "this is the shit";
//        for(int i=s1.length()-1;i>=0;i--)
//            {
//                System.out.print(s1.charAt(i));
//            }
	    }
}
