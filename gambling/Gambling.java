package gambling;

import java.util.Random;
import java.util.Scanner;

public class Gambling {
     public static void main(String[] args) {
          Random random = new Random();
          int answer = random.nextInt(0,101);
          Scanner input = new Scanner(System.in);

          System.out.print("Put a Number between 0-100: ");
          int bet = input.nextInt();

          if (bet == answer) {
               System.out.println("You win");
          }else{
               System.out.println("You loose, the aswer is " + answer);
          }

          input.close();
     }
}
