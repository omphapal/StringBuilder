package stringPerformanceDemo;

public class String_insert {

	public static void main(String[] args) {
		
		//Start with a basic query structure
		StringBuilder sql=new StringBuilder("Select * FROM Customer");
		
		//Append  a condition(efficient 0(1) operation)
		sql.append("WHERE Country ='USA' ");
		
		//Insertion an additional keyword at index 7(right after "select")
		sql.insert(7, "TOP 10");
		
		//Convert to the final query String
		String finalQuery=sql.toString();
		
		System.out.println("Final query "+finalQuery);
		// Output: SELECT TOP 10 * FROM Customers WHERE Country = 'USA'
	}
}
