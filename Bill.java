public class Bill {
    private User user;
    private Tariff tariff;

    public Bill(User user, Tariff tariff) {
        this.user = user;
        this.tariff = tariff;
    }

    public double calculateBill() {
        return user.getConsumption() * tariff.getRate();
    }

    public void generateBill() {
        System.out.println("Electricity Bill");
        System.out.println("=================");
        System.out.println("Name: " + user.getName());
        System.out.println("Address: " + user.getAddress());
        System.out.println("Consumption: " + user.getConsumption() + " kWh");
        System.out.println("Rate: $" + tariff.getRate() + " per kWh");
        System.out.println("Total Amount: $" + calculateBill());
        System.out.println("=================");
    }
}