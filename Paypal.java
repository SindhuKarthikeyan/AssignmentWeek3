package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Paypal {

	public static void main(String[] args) {
		String str = "PayPal India"; 
		char[] ch= str.toCharArray();
	//	* Convert it into a character array
		System.out.println("Convert it into a character array");
		for (char c : ch) {
			System.out.println(c);
			}
	//* Declare a Set as charSet for Character
		Set<Character> Charset = new LinkedHashSet<Character>();
		
	//* Declare a Set as dupCharSet for duplicate Character	
		Set<Character> DupCharset = new LinkedHashSet<Character>();
		
	//* Iterate character array and add it into charSet
	for (int i = 0; i < ch.length; i++) {
		boolean Result = Charset.add(ch[i]);
    	if(Result == false)
    	DupCharset.add(ch[i]);
		}
	System.out.println("Character Set ");
	for (Character Eachchar : Charset) {
		System.out.println(Eachchar);
		
	}
	System.out.println("Duplicate Character Set");
	for (Character EachChar : DupCharset) {
		System.out.println(EachChar);
		
	}
	 Charset.removeAll(DupCharset);
     System.out.println("After removal of duplicates Charset");
     for (Character eachChar : Charset) {
  		System.out.println(eachChar);
  	 } 
     System.out.println("After removal of duplicates in Duplicate Charset"); 
     for (Character eachChar1 : DupCharset) {
  		System.out.println(eachChar1);
  	 } 
    
     System.out.println("Print variables without space");
     for (Character eachChar : Charset) {
   	  if (eachChar != ' ')
  		System.out.println(eachChar);
  	 }
	
	
	
	

	}

}
