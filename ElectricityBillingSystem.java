import java.util.Scanner;

public class ElectricityBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter user name: ");
        String name = scanner.nextLine();

        System.out.print("Enter user address: ");
        String address = scanner.nextLine();

        System.out.print("Enter electricity consumption (kWh): ");
        double consumption = scanner.nextDouble();

        System.out.print("Enter tariff rate ($ per kWh): ");
        double rate = scanner.nextDouble();

        User user = new User(name, address, consumption);
        Tariff tariff = new Tariff(rate);
        Bill bill = new Bill(user, tariff);

        bill.generateBill();
        
        scanner.close();
    }
}