//Leap Year or not cheek .

import java.util.Scanner; //user input libarary function.

public class LeapYear3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int year;

    System.out.println("\nEnter any Year:\n");
    year = input.nextInt();

    input.close();

    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { // Condition Cheek.
      System.out.println("This is Leap Year.");
    } else {
      System.out.println("This is not a Leap Year.");
    }

  }

}
