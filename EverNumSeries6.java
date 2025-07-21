//Even Natural number series.

import java.util.Scanner;

public class EverNumSeries6 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int i, n;

    System.out.println("\nEnter Last number:");
    n = input.nextInt(); // to take last number input

    input.close();

    System.out.println();

    for (i = 2; i <= n; i = i + 2) {
      System.out.print(i + " ");
    }

  }

}
