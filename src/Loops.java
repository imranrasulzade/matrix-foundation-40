import java.util.Random;
import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

//        for (int i = 1; i <= 4; i++ ) {
//
//            for (int j = 0; j < i; j++ ) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        /*

        *
        **
        ***
        ****


        ****
        ***
        **
        *

            *
           **
          ***
         ****


         *
        ***
       *****
      *******



         */

//        for (int i = 0; i < 10; i++) {
//            System.out.println("Salam");
//        }

//        int number = 89864841;
//        int hasil = 1;
//        while (number > 0) {
//            int digit = number % 10;
//            hasil *= digit;
//            number /= 10;
//        }
//
//        System.out.println(hasil);


        Random rand = new Random();
        int a = rand.nextInt(100);
        int b;
        int count = 0;
        do {
            b = sc.nextInt();
            if (b > a) {
                System.out.println("daha kicik daxil et");
            } else if (b < a) {
                System.out.println("daha boyuk daxil et");
            }
            count++;
        } while (b != a);

        System.out.println(count);

    }
    /*

     */
}
