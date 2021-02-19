package com.test.prasanna;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;

public class Base {

    public static WebDriver driver;
    public static Properties prop;

    public static WebDriver getDriver() throws IOException {

        prop = new Properties();
        FileInputStream fileInputStream =
                new FileInputStream(Paths.get("").toAbsolutePath().toString().concat("/src/test/java/com/test/prasanna/global.properties"));
        prop.load(fileInputStream);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(prop.getProperty("url"));
        return driver;

    }
}
