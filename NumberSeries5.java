//Number series print n to n.

import java.util.Scanner;

public class NumberSeries5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int i, s, n;

    System.out.println("\nEnter Start and Last number:");

    s = input.nextInt(); // to take start input number
    n = input.nextInt(); // to take end input number

    input.close();

    System.out.println();

    for (i = s; i <= n; i++) {
      System.out.print(i + " ");
    }

  }

}
