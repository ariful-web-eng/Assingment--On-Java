//*Cheek the a number Odd or Even */

import java.util.Scanner; //*This library func. use to take user input */

public class OddEven2 {
  public static void main(String[] args) {
    int num;
    Scanner input = new Scanner(System.in);

    System.out.println("\nEnter a Number:");
    num = input.nextInt();

    input.close();

    if (num % 2 == 0) { // Even odd cheek condition.
      System.out.println("The number is an Even Number.");
    } else {
      System.out.println("The number is an Odd number.");
    }

  }
}
