public class Lesson7 {
    static void sayHello() {
        System.out.println("Hello");
    }

    static int topla(int a, int b) {
        int c = a + b;
        return c;
    }

    static int cixma(int a, int b) {
        int c = a - b;
        return c;
    }





    public static void main(String[] args) {
        topla(1, 5);
        int height = 5;
        for (int i = 1; i <= height; i++) {
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = height; i >= 1; i--) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }


}
