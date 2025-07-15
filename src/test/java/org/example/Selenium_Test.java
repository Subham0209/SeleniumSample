package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

public class Selenium_Test {

    public static final String USERNAME = "gopalbist_fs3NtA";
    public static final String AUTOMATE_KEY = "q5uWYnH4psXJsnoxkcz1";

    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    WebDriver driver;

     @BeforeClass
     public void setup() throws Exception{
         DesiredCapabilities caps = new DesiredCapabilities();
         caps.setCapability("os", "Windows");
         caps.setCapability("os_version", "10");
         caps.setCapability("browser", "Chrome");
         caps.setCapability("browser_version", "latest");
         caps.setCapability("name", "Google Search Test on BrowserStack");

         driver = new RemoteWebDriver(new URL(URL), caps);
 }

    @Test
    public void googleSearch() {
        driver.get("https://www.google.com");
        System.out.println("Title: " + driver.getTitle());
    }

     /*WebElement searchBox = driver.findElement(By.name("q"));
     searchBox.sendKeys("TestNG with Selenium");
     searchBox.submit();

     // Add basic wait (for demo only)
     try {
         Thread.sleep(2000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }*/

     /*String title = driver.getTitle();
     System.out.println("Page Title: " + title);
     assert title.toLowerCase().contains("testng with selenium");*/


    @AfterClass
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }
 }


