package BDD_PracticeEbay.StepsDefinitions.TrolleyPageForShoesSteps;

import BDD_PracticeEbay.PageObject.ProductDescriptionForShoes;
import BDD_PracticeEbay.PageObject.ResultPageForSohes;
import BDD_PracticeEbay.PageObject.TrolleyPageForShoes;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class SelectedShoesIntoTrolleySteps {

    ResultPageForSohes resultpageforshoes = new ResultPageForSohes();
    ProductDescriptionForShoes productdescriptionforshoes = new ProductDescriptionForShoes();
    TrolleyPageForShoes trolleypageforshoes = new TrolleyPageForShoes();

    @When("user select one product of the shoes")
    public void user_select_one_product_of_the_shoes() {
        resultpageforshoes.selectionOfShoes();
    }
    @And("user select shoes colour and size")
    public void userSelectShoesColourAndSize() {
        productdescriptionforshoes.selectShoesColourAndSize();
    }
    @And("user add the product of shoes to basket")
    public void userAddTheProductOfShoesToBasket() {
        productdescriptionforshoes.addToBasket();
        productdescriptionforshoes.goToBasket();
    }
    @Then("user able to see that selected shoes into trolley")
    public void user_able_to_see_that_selected_shoes_into_trolley() throws IOException {
        trolleypageforshoes.assertionForSelectedShoesIntoTrolley();
    }

}
