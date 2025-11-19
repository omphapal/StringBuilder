package stringPerformanceDemo;

public class Stringp1 {

	public static void main(String[] args) {
		
		// ---1 Inefficient String Concantenation
		System.out.println("--- 1. Using String (Inefficient: O(N²)) ---");
		long starts=System.nanoTime();
		
		String resultString="";
		for(int i=0; i<26; i++) {
			char ch=(char)('a'+i);
			
			// Inefficient operation: A NEW String object is created and 
            // all previous characters are copied over in every iteration.
			resultString=resultString+ch;
		}
		long endTimeString=System.nanoTime();
		
		System.out.println("Result"+resultString);
		System.out.println("Time taken (String): "+(endTimeString-endTimeString)+"nanoseconds \n");
		
		// --- 2. Efficient StringBuilder Append ---
		System.out.println("---2. Using String builder(Efficient:0(N)) ");
		long startTimeBuilder=System.nanoTime();
		
		// Creates a single, mutable object.
		StringBuilder resultBuilder =new StringBuilder();
		for(int i=0; i<26; i++) {
			char ch=(char)('a'+i);
			
			// Efficient operation: The characters are appended to the *same* object.
			resultBuilder.append(ch);
		}
		long endTimeBuilder=System.nanoTime();
		
		System.out.println("Result"+	resultBuilder.toString());
		System.out.println("Time taken(StringBuilder):"+(endTimeBuilder-startTimeBuilder)+"nanoseconds");
	}
}
