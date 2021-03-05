package BDD_PracticeEbay.PageObject;

import BDD_PracticeEbay.BaseClassPackage.DriverFactory;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;

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


}
