package stringPerformanceDemo;

public class StringBuilder2 {

	public static void main(String[] args) {
		
		//String to be reversed
		String originalString="palindrome";
		
		//Create a StringBuilder object
		StringBuilder sb=new StringBuilder(originalString);
		
		//Reverse the content in place
		sb.reverse();
		
		//Convert back to an immutable String for final use
		String reversedString=sb.toString();
		
		
		System.out.println("Original "+originalString);
		System.out.println("Reversed "+reversedString);
		//output: emordnilap
	}
}
