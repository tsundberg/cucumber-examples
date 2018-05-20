package se.thinkcode;

public class Customer {
    private String name;
    private int refunded;

    public Customer(String name) {
        this.name = name;
    }

    public int getRefunded() {
        return refunded;
    }

    public void refund(int value) {
        this.refunded = value;
    }
}
