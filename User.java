public class User {
    private String name;
    private String address;
    private double consumption; // in kWh

    public User(String name, String address, double consumption) {
        this.name = name;
        this.address = address;
        this.consumption = consumption;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getConsumption() {
        return consumption;
    }
}