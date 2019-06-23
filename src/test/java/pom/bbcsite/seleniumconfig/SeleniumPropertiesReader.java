package pom.bbcsite.seleniumconfig;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SeleniumPropertiesReader {
    private String chromeDriverPath;
    private String firefoxDriverPath;
    private String propertiesFiileLocation="resources/selenium.properties";

    public SeleniumPropertiesReader(){
        Properties seleniumProperties =new Properties();
        try {
            seleniumProperties.load(new FileReader(propertiesFiileLocation));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        chromeDriverPath=seleniumProperties.getProperty("chromedriverpath");
        firefoxDriverPath=seleniumProperties.getProperty("firefoxdriverpath");
    }
}
