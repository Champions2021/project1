package BDD_PracticeEbay.PageObject;

import BDD_PracticeEbay.BaseClassPackage.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductDescriptionForShoes extends DriverFactory {

    //For shoes colour and size selection

    @FindBy(id = "msku-sel-1")
    WebElement colourDropdown;

    @FindBy(id = "msku-sel-2")
    WebElement sizeDropdown;

    public void selectShoesColourAndSize(){

        Select s1 = new Select(colourDropdown);
        s1.selectByVisibleText("BLUE NEW");
       // s1.selectByIndex(2);
       // s1.selectByValue("2");

        Select s2 = new Select(sizeDropdown);
       // s2.selectByVisibleText("UK 5 / EU 38 / US 7");
        s2.selectByValue("6");
       // s2.selectByIndex(2);
    }

    //For add to basket

    @FindBy(id = "atcRedesignId_btn")
    WebElement addToBasketBtn;

    public void addToBasket(){
        addToBasketBtn.click();
    }

    //for go to basket

    @FindBy(linkText = "Go to basket")
    WebElement goToBasket;

    public void goToBasket(){
        goToBasket.click();
    }
}
