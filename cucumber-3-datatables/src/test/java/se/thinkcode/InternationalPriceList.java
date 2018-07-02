package se.thinkcode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class InternationalPriceList {
    private Map<String, Price> priceList;
    private int sekSum;
    private int euroSum;

    @Given("the price list for an international coffee shop")
    public void the_price_list_for_an_international_coffee_shop(List<Price> prices) {
        priceList = new HashMap<>();

        for (Price price : prices) {
            String key = price.getProduct();
            priceList.put(key, price);
        }
    }

    @When("I buy {int} {word}")
    public void i_buy(Integer numberOfItems, String item) {
        Price price = priceList.get(item);
        calculate(numberOfItems, price);
    }

    private void calculate(int numberOfItems, Price price) {
        if (price.getCurrency().equals("SEK")) {
            sekSum += numberOfItems * price.getPrice();
            return;
        }
        if (price.getCurrency().equals("EUR")) {
            euroSum += numberOfItems * price.getPrice();
            return;
        }
        throw new IllegalArgumentException("The currency is unknown");
    }

    @Then("should I pay {int} EUR and {int} SEK")
    public void should_I_pay_EUR_and_SEK(Integer expectedEuroSum, Integer expectedSekSum) {
        assertThat(euroSum, is(expectedEuroSum));
        assertThat(sekSum, is(expectedSekSum));
    }
}
