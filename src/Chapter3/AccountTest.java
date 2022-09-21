package Chapter3;

public class AccountTest {
    public static void main(String[] args) {
        Account jenny = new Account("Jennifer", 30.0);
        jenny.deposit(100);
        jenny.withdrawal(150);
        System.out.printf("Name: %s%nBalance:%.2f%nNew Balance:%.2f%n", jenny.getName(), jenny.getBalance(), jenny.getBalance());
        jenny.setName("Ebuka");
        System.out.printf("New name: %s", jenny.getName());
    }
}