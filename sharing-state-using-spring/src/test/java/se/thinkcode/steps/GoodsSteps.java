package se.thinkcode.steps;

import cucumber.api.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import se.thinkcode.Customer;
import se.thinkcode.Item;

public class GoodsSteps {
    @Autowired
    private World world;

    @Given("^that (.*) bought a faulty (.*) for \\$(\\d+)$")
    public void that_bought_a_faulty_kettle(String name, String itemType, int price) throws Throwable {
        world.customer = new Customer(name);
        world.item = new Item(itemType, price);
    }
}