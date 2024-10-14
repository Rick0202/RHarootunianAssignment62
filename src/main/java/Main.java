

public class Main {
  public static void main(String[] args) {
    System.out.println(sumDigits(4937));
    System.out.println(sumDigits(-2810));
    System.out.println(sumDigits(0));
    System.out.println(sumDigits(100361));
  }
  public static int sumDigits(long n) {
    int sum = 0;
    n = Math.abs(n);

    while (n != 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }
      
  }
 
