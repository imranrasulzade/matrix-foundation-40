package lesson11;

public class HWMain {

    public static Product getMaxProduct(Product[] products) {
        Product maxPr = products[0];

        for (Product pr: products) {
           if (pr.getPrice() > maxPr.getPrice()) {
               maxPr = pr;
           }
        }
        return maxPr;
    }

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("AZ215478", 100);
        bankAccount.deposit(10);
        bankAccount.withdraw(200);

        System.out.println(bankAccount.getBalance());


        Product pr1 = new Product(1, "Phone", 2000);
        Product pr2 = new Product(2, "Laptop", 2500);
        Product pr3 = new Product(3, "Watch", 1000);

        System.out.println(pr1);

        Product[] products = {pr1, pr2, pr3};

        System.out.println(getMaxProduct(products));


    }
}
