//Fibonacci Series .

import java.util.Scanner;

public class FibonacciSeries9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int first = 0, secound = 1, next, i, n;

    System.out.println("\nEnter the range of Fibonacci:");
    n = input.nextInt();
    input.close();

    System.out.println("The Fibonacci series of " + n + " is = ");

    System.out.print(first + " ");
    System.out.print(secound + " ");

    for (i = 2; i < n; i++) {
      next = first + secound;
      System.out.print(next + " ");

      first = secound;
      secound = next;
    }
  }
}
