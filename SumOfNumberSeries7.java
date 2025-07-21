//summation of any natural number series.

import java.util.Scanner;

public class SumOfNumberSeries7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int s, n, i, sum = 0;

    System.out.println("\nEnter the starting  number ending number of the series:");
    s = input.nextInt(); // to take starting number of this series.
    n = input.nextInt(); // to take ending number of this series.

    input.close();

    System.out.println("\nThe seies are: ");

    for (i = s; i <= n; i++) {
      System.out.print(i + " ");
      sum = sum + i;
    }
    System.out.println("\nThe summation of number series is= " + sum);
  }
}
