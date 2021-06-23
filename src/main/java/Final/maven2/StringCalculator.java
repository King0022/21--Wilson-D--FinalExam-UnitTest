package Final.maven2;

public class StringCalculator {
	   public static int add(final String numbers) {
	      int returnValue = 0;
	      String[] numbersArray = numbers.split(",|\n"); 
	      for (String number : numbersArray) {
	         if (!number.trim().isEmpty() && Integer.parseInt(number.trim()) <= 1000) {
	            if (Integer.parseInt(number.trim()) < 0) {
	            	throw new IndexOutOfBoundsException("negative numbers not allowed");
	            }
	        	returnValue += Integer.parseInt(number.trim());
	         }
	      }
	      return returnValue;
	   }
	}
