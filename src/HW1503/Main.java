package HW1503;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1,"Bob", 24);
        customer1.getAge();
        System.out.println(customer1);

        Account account = new Account(1,customer1, 100);
        System.out.println(account.deposit(5,10));


    }
}
