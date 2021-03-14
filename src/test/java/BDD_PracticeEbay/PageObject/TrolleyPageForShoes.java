package BDD_PracticeEbay.PageObject;

import BDD_PracticeEbay.BaseClassPackage.DriverFactory;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.core.Is.is;

public class TrolleyPageForShoes extends DriverFactory {

    //For assertion of selected shoes into trolley

    @FindBy(linkText = "Ladies Womens Trainers Sneakers Lace Up Jogging Fashion Gym Comfy Pumps Shoes")
    WebElement selectedShoesName;

    public void assertionForSelectedShoesIntoTrolley() throws IOException {

        File sourcefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destinationfile = new File("C:\\Users\\unnati\\Desktop\\Testing DOCS\\Ketan Lectures\\ScreenShot\\SelectedShoes.png");
        FileUtils.copyFile(sourcefile,destinationfile);

        String expectedShoes = selectedShoesName.getText();
        Assert.assertThat(expectedShoes,is(startsWith("Ladies Womens Trainers")));
    }


    // For assertion of Shoes quantity Price increase as per quantity increase.

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div/div[3]/div[1]/div/div/div[2]/div/div[1]/div/div/div[1]/div/div[3]/div/div[1]/div[2]/div/div/span/span/span")
    WebElement priceWithSign;

    public double getPriceFromBasket(){

        String priceWithoutSign = priceWithSign.getText().replace("£","");
        double priceInDouble = Double.parseDouble(priceWithoutSign);

        return priceInDouble;
    }



     //For Increasing Shoes Quantity

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/select[1]")
    WebElement quntityDropdown;

    public void IncreaseShoesQuantity(){

        Select s1 = new Select(quntityDropdown);
        s1.selectByValue("4");
        // s1.selectByVisibleText("4");
        //s1.selectByIndex(3);
        sleep(4000);


    }
    public double priceForIncreasedQuantity(){
        double priceForOneQuantity = getPriceFromBasket();
        double expected = priceForOneQuantity * 4;
        return priceForOneQuantity;
    }

    public void assrtionForShoesPriceIncease(){
        getPriceFromBasket();
        double expected = priceForIncreasedQuantity();
        double actual = getPriceFromBasket();
        Assert.assertThat(expected,is(equalTo(actual)));

    }


} //Class Ends
