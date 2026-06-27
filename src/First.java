import java.util.Random;
import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int n = random.nextInt(10);
        int count = 0;
        int number = 0;
        do {
            number = sc.nextInt();
            count++;
        } while (n != number);

        System.out.println(count);
    }


}
