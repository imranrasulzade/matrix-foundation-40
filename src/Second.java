import java.util.Scanner;

public class Second {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        while (cont) {
            String menuText = " 1. Valyuta çevirici\n" +
                    " 2. Bədən kütlə indeksi (BMI)\n" +
                    " 3. Vergi hesablayıcı\n" +
                    " 4. Qiymət/Grade kalkulyatoru\n" +
                    " 5. Taksi haqqı hesablayıcı\n" +
                    " 6. Üçbucaq növü təyini\n" +
                    " 7. EXIT";

            System.out.println(menuText);

            int menu = sc.nextInt();
            switch (menu) {
                case 1: {
                    exchange();
                    break;
                }
                case 2: {
                    // BMI
                    break;
                }
                case 3: {
                    // Vergi
                    System.out.println("Maas daxil et:");
                    double monthlySalary = sc.nextDouble();

                    System.out.println("residentliyi daxil et");
                    boolean isResident = sc.nextBoolean();
                    double tax = 0;
                    double netSalary;
                    if (isResident) {
                        if (monthlySalary <= 500) {
                            tax = 0;
                        } else if (monthlySalary > 500 && monthlySalary <= 2000) {
                            tax = (monthlySalary - 500) * 0.1;
                        } else if (monthlySalary > 2000) {
                            tax = (monthlySalary - 2000) * 1.5 + 150;
                        }
                    } else {
                        tax = monthlySalary * 0.2;
                    }
                    netSalary = monthlySalary - tax;
                    System.out.println("Tax: " + tax + " <-> Net salary: " + netSalary);

                    break;
                }
                case 4: {
                    //grade
                    break;
                }
                case 5: {
                    //taxi
                    System.out.println("Mesafe daxil et:");
                    double distanceKm = sc.nextDouble();
                    System.out.println("IsNight daxil et:");
                    boolean isNight = sc.nextBoolean();
                    System.out.println("Yas daxil et:");
                    byte age = sc.nextByte();
                    double finalAmount = 0;

                    double startAmount = 1.0;
                    double eachKmAmount = 0.7;
                    double nightKmAmount = 0.1;
                    if (!isNight) {
                        finalAmount = startAmount + distanceKm * eachKmAmount;

                    } else {
                        finalAmount = startAmount + (eachKmAmount + nightKmAmount) * distanceKm;
                    }
                    if (age < 12) {
                        finalAmount /= 2;
                    } else if (age >= 65) {
                        finalAmount = finalAmount * 0.3;
                    }

                    System.out.println("Yekun qiymet: " + finalAmount);

                    break;
                }
                case 6: {
                    // ucbucaq
                    break;
                }
                case 7: {
                    cont = false;
                    break;
                }
                default:
                    System.out.println("Yanlis daxil edilib!");
            }
        }


    }



    public static void exchange() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Amount daxil et:");
        double amount = sc.nextDouble();
        System.out.println("From daxil et:");
        String from = sc.next();
        System.out.println("To daxil et:");
        String to = sc.next();
        double result = -1;

        double aznToUsd = 1.70;
        double aznToEur = 0.54;
        double usdToAzn = 0.59;
        double eurToAzn = 1.85;

        if (from.equals("AZN") && to.equals("USD")) {
            result = amount * aznToUsd;
        } else if (from.equals("AZN") && to.equals("EUR")) {
            result = amount * aznToEur;
        } else if (from.equals("USD") && to.equals("AZN")) {
            result = amount * usdToAzn;
        } else if (from.equals("EUR") && to.equals("AZN")) {
            result = amount * eurToAzn;
        } else {
            System.out.println("Something went wrong");
        }
        System.out.println(result);
    }


}
