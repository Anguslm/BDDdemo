import com.spartaglobal.utilities.DriverUtilities;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.bbcsite.BbcPages.BbcHomePage;
import pom.bbcsite.BbcSite;

public class bbcTests {
    static BbcSite bbcSite=new BbcSite(new ChromeDriver());

    @Test
    public void debugger(){
        bbcSite.getBbcHomePage().goToHomePage().clickSignInLink();
        //bbcSite.getBbcHomePage().clickSignInLink();
    }
    @Test
    public void testPasswordErrorMessage(){
        bbcSite.getBbcSignInPage().goToSignInPage();
        bbcSite.getBbcSignInPage().inputUserName("aaaaaaaaa");
        bbcSite.getBbcSignInPage().inputPassword("b");
        bbcSite.getBbcSignInPage().ClickSubmitButton();
        Assert.assertEquals("Sorry, that password is too short. It needs to be eight characters or more.",bbcSite.getBbcSignInPage().getPasswordErrorText());
    }
    @Test
    public void registerOver13(){
        bbcSite.getBbcRegisterPage().goToRegisterPage();
        try {
            Thread.sleep(2000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        bbcSite.getBbcRegisterPage().ClickOver13Button().InputDay("01").InputMonth("07").InputYear("1995");
    }
    @Test
    public void registerUnder13(){
        bbcSite.getBbcRegisterPage().goToRegisterPage();
        try {
            Thread.sleep(2000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        bbcSite.getBbcRegisterPage().ClickUnder13Button();
    }
    @AfterClass
    public static void tearDown(){
        //bbcSite.closeDriver();
    }
}
