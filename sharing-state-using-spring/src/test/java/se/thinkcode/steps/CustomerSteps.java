package se.thinkcode.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CustomerSteps {
    @Autowired
    private World world;

    @When("^she return the kettle to the store$")
    public void return_the_an_item_to_the_store() throws Throwable {
        world.customer.refund(world.item.getPrice());
    }

    @Then("^she will get \\$(\\d+) refunded$")
    public void she_will_get_$_back(int expected) throws Throwable {
        assertThat(world.customer.getRefunded(), is(expected));
    }
}