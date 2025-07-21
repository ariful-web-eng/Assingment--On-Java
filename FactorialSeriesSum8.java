//Sum of Factorial Series.

import java.util.Scanner;

public class FactorialSeriesSum8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n, i, sum = 0;

    System.out.println("\nEnter the Number for Factorial:");
    n = input.nextInt();
    input.close();

    for (i = n; i >= 1; i--) {
      sum = sum + i * i;
    }

    System.out.println("The Factorial value of" + " " + n + " is =" + sum);
  }
}
