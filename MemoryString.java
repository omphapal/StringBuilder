package stringPerformanceDemo;

public class MemoryString {

	public static void main(String[] args) {
		// --- PART 1: String Pool and Immutability ---
		
		System.out.println("---1 . String Pool and Immutablity");
		
		// 1. Literal creation: "Java" goes into the String Pool (unique copy).
		String s1="Java";
		
		// 2. Duplicate literal: s2 points to the SAME object as s1 in the Pool.
		String s2="java";
		
		// 3. 'new' keyword: s3 forces the creation of a brand NEW object in the General Heap.
		String s3=new String("Java");
		
		//Reference comparison using ===
		System.out.println("s1== s2(Pool vs .pool:"+(s1==s2));
		//output :true(same object)
		
		System.out.println("s1==s3(Pool vs Heap):"+(s1==s3));
		//Otput : false (diffrence objects)
		
		
		//Value comparison using .equals()
		System.out.println("s1.equals (s3) (value)"+s1.equals(s3));
		// Output: true (Contents are identical)
		
		
		// Demonstrate Immutability (Modification)
		String original="Hello";
		System.out.println("\n Original String"+original);
		
		// This operation does NOT change the "Hello" object.
        // It creates a BRAND NEW object "Hello World" in the Heap, 
        // and 'original' now points to it.	
		original=original+"word";
		
		System.out.println("After Concatenation"+original);
		//The memory address of  'original' has changed
		
		System.out.println("\n"+"-".repeat(50));
		
		// --- PART 2: Performance Comparison (String vs. StringBuilder) ---
		System.out.println("--- 2. Performance: Concatenation in a Loop ---");
		
		// Goal: Build a string of 1000 iterations
		final int count=1000;
		
		// // --- Inefficient String (O(N²)) ---
		long startString=System.nanoTime();
		String resultString="";
		for(int i=0; i<count; i++) {
			// New String object is created and copied in every loop iteration.
			resultString=resultString+"*";
		}
		long endString=System.nanoTime();
		System.out.println("String time"+(endString-startString)+"nanoseconds");
		
		// --Efficient StringBuilder (0(N))---
		long startBuilder=System.nanoTime();
		StringBuilder resultBuilder=new StringBuilder();
		
		for(int i=0; i<count; i++) {
			// Appends to the SAME mutable object, no new object creation overhead.
			resultBuilder.append("*");
		}
		String finalResult=resultBuilder.toString();
		// Convert to String once at the end
		
		long endBuilder=System.nanoTime();
		System.out.println("StringBuilder time" +(endBuilder-startBuilder)+"nanoseconds");
		
		// The output will show StringBuilder is significantly faster, especially for larger counts.
	}
}
