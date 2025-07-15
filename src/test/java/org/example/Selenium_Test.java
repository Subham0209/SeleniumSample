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

import java.net.MalformedURLException;
import java.net.URL;

public class Selenium_Test {

    public static final String USERNAME = "gopalbist_fs3NtA";
    public static final String AUTOMATE_KEY = "q5uWYnH4psXJsnoxkcz1";

    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    WebDriver driver;

     @BeforeClass
     public void setup() throws MalformedURLException {
         String username = System.getenv("BROWSERSTACK_USERNAME");
         String accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");

         if (username == null || accessKey == null) {
             throw new IllegalArgumentException("BrowserStack credentials not set in environment variables.");
         }

         DesiredCapabilities caps = new DesiredCapabilities();
         caps.setCapability("browserName", "Chrome");
         caps.setCapability("browserVersion", "latest");
         caps.setCapability("os", "Windows");
         caps.setCapability("osVersion", "10");
         caps.setCapability("name", "Google Search Test on BrowserStack");
         caps.setCapability("build", "Selenium_BS_Build");
         caps.setCapability("browserstack.debug", "true");
         caps.setCapability("browserstack.networkLogs", "true");

         System.out.println("Connecting to BrowserStack with URL...");
         String url = "https://" + username + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub";
         driver = new RemoteWebDriver(new URL(url), caps);
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


