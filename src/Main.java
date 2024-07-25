// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(2001, "Kassa", "credit", "Bank", 30000, 3, 21);
        Employee employee = new Employee(27000, 4,23);
        System.out.println(bank.validationEmployee(employee));
    }
}