package HW1503;

public class Account {
    int id;
    Customer customer;
    double balance;

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    double put (double sum){
        balance += sum;
        return balance;
    }

    double withdraw(double sum){
        balance -= sum;
        return balance;
    }

    double deposit (int yearsNum, double percent){
        double result = balance;
        for (int i = 0; i < yearsNum; i++) {
            result = (result * (100 + percent)) / 100;
        }
        return result;
    }

    @Override
    public String toString() {
        return customer.getName() +
                customer.customerType() + " " + id +
                ": " + balance;
    }
}
