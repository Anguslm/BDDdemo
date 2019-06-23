package pom.bbcsite.BbcPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BbcRegisterPage {
    private WebDriver driver;

    //Page Identifiers
    private String BbcRegisterPageURL="https://account.bbc.com/register?context=HOMEPAGE&nonce=liSlD8gu-8nZYTe1kxvHcK8HIe8NcYhtz9qs&ptrt=https%3A%2F%2Fwww.bbc.co.uk%2F&userOrigin=HOMEPAGE_PS";
    private By Under13=By.partialLinkText("Under 13");
    private By Over13=By.partialLinkText("13 or over");
    private By Day = By.id("day-input");
    private By Month = By.id("month-input");
    private By Year = By.id("year-input");

    public BbcRegisterPage(WebDriver driver){
        this.driver=driver;
    }
    public void goToRegisterPage(){
        driver.navigate().to(BbcRegisterPageURL);
    }

    public BbcRegisterPage ClickUnder13Button(){
        driver.findElement(Under13).click();
        return this;
    }
    public BbcRegisterPage ClickOver13Button(){
        driver.findElement(Over13).click();
        return this;
    }
    public BbcRegisterPage InputDay(String day){
        driver.findElement(Day).sendKeys(day);
        return this;
    }
    public BbcRegisterPage InputMonth(String month){
        driver.findElement(Month).sendKeys(month);
        return this;
    }
    public BbcRegisterPage InputYear(String year){
        driver.findElement(Year).sendKeys(year);
        return this;
    }
}
