import java.util.Scanner;

public class Hello {
     public static void main(String[] args) {



          var angkaTebak = 50;
          Scanner input = new Scanner(System.in);
          System.out.println("===================================");
          while (true) {
               System.out.print("Masukan Angka: ");
               int angka = input.nextInt();
               
               if (angka == angkaTebak) {
                    break;
               }
               
               System.out.println("Salah Euyyy wkwkwkwkkw");
          }

          System.out.println("Benar Euuuy WWKWKWKWKWK");
     }
}