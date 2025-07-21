//Prime Number cheek only single number.

import java.util.Scanner;

public class PrimeNumber4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num, flag = 0; // prime hole flag=0 and not prime hole flag=1 dhorbo.

    System.out.println("\nEnter any Positive Intiger number:\n");
    num = input.nextInt(); // if inp. 10

    input.close();

    if (num == 0 || num == 1) { // we know 0 and 1 are not prime. so flag=1.
      flag = 1;
    }
    for (int i = 2; i < num; i++) { // i=2 , 2<10 so true
      if (num % i == 0) { // 10%2==0 , so flag==1, so will print This is not a prime number.
        flag = 1;
        break; // akbar true holea ai loop ar kaj kobe na ,so we use break;
      }
    }
    if (flag == 1) {
      System.out.println("This is not prime number.");
    } else {
      System.out.println("This is a prime number.");
    }
  }
}
