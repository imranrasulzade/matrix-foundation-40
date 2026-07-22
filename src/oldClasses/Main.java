package oldClasses;

public class Main {

    static void sayHello() {
        System.out.println("Hello");
    }

    static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    static void toplaVeCapEt(int a, int b) {
        System.out.println(a + b);
    }

    static int topla(int a, int b) {
        int c = a + b;
        return c;
    }

    static double topla(double a, double b) {
        double c = a + b;
        return c;
    }



    static int topla(int a, int b, int c) {
         return topla(a, b) + c;

    }

    public static void main(String[] args) {

        toplaVeCapEt(8, 9);
        toplaVeCapEt(4, 2);

        int h = 8;
        int l = 9;
        int cem = topla(h, l);
        double sum = topla(8.2, 6.8);

        topla(1, 6, 9);

        sayHello();


        int[] arr = {1, 6, 9, 8};
        int[] array2 = {9, -8, 6, 2};
        int[] arr3 = {3, 5, 7};


        printArray(arr);
        printArray(array2);
        printArray(arr3);





    }

}

