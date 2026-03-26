package gitproject2;

public class java3 {
	 public static void main(String[] args) {

	        int number = 121;   // Change this number to test
	        int original = number;
	        int reversed = 0;

	        while (number != 0) {
	            int digit = number % 10;
	            reversed = reversed * 10 + digit;
	            number = number / 10;
	            
	        }

	        if (original == reversed) {
	            System.out.println("Palindrome Number");
	        } else {
	            System.out.println("Not a Palindrome Number");
	          
	        }
	    }

}
