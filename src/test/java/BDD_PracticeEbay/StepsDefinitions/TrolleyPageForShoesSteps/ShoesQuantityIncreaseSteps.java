package BDD_PracticeEbay.StepsDefinitions.TrolleyPageForShoesSteps;

import BDD_PracticeEbay.PageObject.TrolleyPageForShoes;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoesQuantityIncreaseSteps {

    TrolleyPageForShoes trolleyPageForShoes = new TrolleyPageForShoes();

    @When("user increase the shoes quantity")
    public void user_increase_the_shoes_quantity() {
        trolleyPageForShoes.IncreaseShoesQuantity();

    }
    @Then("user able to see shoes price is increase as per quantity")
    public void user_able_to_see_shoes_price_is_increase_as_per_quantity() {
        trolleyPageForShoes.assrtionForShoesPriceIncease();

    }

}
