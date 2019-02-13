
public class FizzBuzz {

	public static void main(String[] args) {
		
		int x;
		
		int y; //First Multiple Checker
		int z; //Second Multiple Checker
		
		y = 3;
		z = 5;
		
		for (x=1; x<=100; x++) {
			
			if(x % y == 0 && x % z == 0) {
				System.out.println("Fizz Buzz");
			}
			else if (x % y == 0){
				System.out.println("Fizz");
			}
			else if (x % z == 0){
				System.out.println("Buzz");
			}
			else
			System.out.println(x);
			
		}

	}

}
