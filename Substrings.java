package stringPerformanceDemo;

public class Substrings {

	public static void main(String[] args) {
		StringBuilder logEntry=new StringBuilder("ERROR: Time: 2025-11-19 Message: File Not Found");
		
		// Example 3A: Deleting a range
		// Remove the specific "Time: 2025-11-19 " section (start index 7, end index 25)
		// Indices: E R R O R : [ ] T i m e : [ ] 2 0 2 5 - 1 1 - 1 9 [ ] M e s s a g e : [ ] F i l e [ ] N o t [ ] F o u n d
		// Index:   0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5
		logEntry.delete(7, 25);
		
		System.out.println("After Delete "+logEntry.toString());
		// Output: ERROR: Message: File Not Found
		
		// Example 3B: Replacing a segment (starting from index 7 to 14)
		logEntry.replace(7, 14, "FATAl");
		
		System.out.println("After Replace"+logEntry.toString());
		// Output: ERROR: FATAL File Not Found
	}
}
