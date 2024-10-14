// Main class - provides the inputs for the methoda and prints the output.

public class Main {
  public static void main(String[] args) {
    System.out.println(sumDigits(4937));
    System.out.println(sumDigits(-2810));
    System.out.println(sumDigits(0));
    System.out.println(sumDigits(100361));
  }

  // Method - imports the numbers from the Main class, adds the individual digits together, and returns the results for the main class to print.
  
  public static int sumDigits(long n) {
    int sum = 0;
    n = Math.abs(n);
    
// The while loop does most of the heavy lifting.

   
    while (n != 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }
        }
 
