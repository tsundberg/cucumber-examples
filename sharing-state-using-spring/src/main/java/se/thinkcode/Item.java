package se.thinkcode;

import java.util.Objects;

public class Item {
    private String type;
    private int price;

    public Item(String type) {
        this.type = type;
    }

    public Item(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return price == item.price &&
                Objects.equals(type, item.type);
    }

    @Override
    public int hashCode() {

        return Objects.hash(type, price);
    }

    @Override
    public String toString() {
        return "Item{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
