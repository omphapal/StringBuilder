package stringPerformanceDemo;

public class Sb3 {

	public static void main(String[] args) {
		
		//Goal : Create  a comma-sepearted list of  squard number :"1,4,9,16,25"
		StringBuilder ListBuilder=new StringBuilder();
		int [] numbers= {1,2,3,4,5};
		
		for(int number: numbers) {
			//Append the calculated value
			
			ListBuilder.append(number *number);
			
			//Append the comma delimiter,but not after the last number
			if(number !=numbers[numbers.length-1]) {
				ListBuilder.append(",");
				
			}
		}
		String finalReport=ListBuilder.toString();
		System.err.println("Final list"+finalReport);
	}
}
