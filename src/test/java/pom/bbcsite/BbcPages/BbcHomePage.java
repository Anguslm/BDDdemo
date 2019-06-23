package pom.bbcsite.BbcPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BbcHomePage {
    private WebDriver driver;

    //Page Identifiers
    private String HomePageURL="https://www.bbc.co.uk";
    private By signInLink=By.id("idcta-username");

    public BbcHomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Page Actions
    public BbcHomePage clickSignInLink(){
        driver.findElement(signInLink).click();
        return this;
    }

    public BbcHomePage goToHomePage(){
        driver.navigate().to(HomePageURL);
        return this;
    }
}
