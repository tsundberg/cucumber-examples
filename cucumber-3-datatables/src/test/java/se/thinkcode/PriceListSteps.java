package se.thinkcode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PriceListSteps {
    private Map<String, Integer> priceList;
    private int totalSum;

    @Given("the price list for a coffee shop")
    public void the_price_list_for_a_coffee_shop(Map<String, Integer> priceList) {
        this.priceList = priceList;
    }

    @When("I order {int} {word} and {int} {word}")
    public void i_order_coffee_and_donut(Integer numberOfFirstItems, String firstItem,
                                         Integer numberOfSecondItems, String secondItem) {
        int firstPrice = priceList.get(firstItem);
        int secondPrice = priceList.get(secondItem);

        totalSum += firstPrice * numberOfFirstItems;
        totalSum += secondPrice * numberOfSecondItems;
    }

    @Then("should I pay {int}")
    public void should_I_pay(int expectedCost) {
        assertThat(totalSum, is(expectedCost));
    }
}
