package PrototypePattern;

public class Customer implements Prototype<Customer> {
    private String name;
    private String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return "Customer{name='" + name + "', address='" + address + "'}";
    }

    @Override
    public Customer clone() {
        return new Customer(this.name, this.address);
    }

}
