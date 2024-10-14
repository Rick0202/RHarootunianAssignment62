// Main class - provides the inputs for the methoda and prints the output.

public class Main {
  public static void main(String[] args) {
    System.out.println(formatOutput(4937));
    System.out.println(formatOutput(-2810));
    System.out.println(formatOutput(0));
    System.out.println(formatOutput(100361));
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

  public static String formatOutput(long n) {
    int sum = sumDigits(n);
    String digits = String.valueOf(n)
      .replace("", " + ")  // Insert " + " between digits
      .trim()  // Trim leading and trailing spaces
      .replaceAll("^\\+\\s", "")  // Remove leading " + "
      .replaceAll("\\+$", "")  // Remove trailing " + "
      .replaceAll("\\+\\s\\+", "+")  // Remove excess spaces between "+"
      .replaceAll("\\s", "");  // Remove any remaining spaces

    return "\nOriginal number: " + n + " adds to " + sum + " (" + digits + ")";

  }
  
        }
 
