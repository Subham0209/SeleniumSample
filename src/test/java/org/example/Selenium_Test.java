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

import java.sql.Driver;
import java.util.HashMap;

import java.net.MalformedURLException;
import java.net.URL;

public class Selenium_Test {

        WebDriver driver ;

        public void setup() throws Exception {
            // BrowserStack options
            HashMap<String, Object> browserstackOptions = new HashMap<>();
            browserstackOptions.put("os", "Windows");
            browserstackOptions.put("osVersion", "10");
            browserstackOptions.put("buildName", "Selenium_BS_Build");
            browserstackOptions.put("sessionName", "Google Search Test on BrowserStack");
            browserstackOptions.put("debug", true);
            browserstackOptions.put("networkLogs", true);

            // Main capabilities
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("browserName", "Chrome");
            caps.setCapability("browserVersion", "latest");
            caps.setCapability("bstack:options", browserstackOptions);

            // Start remote session
            driver = new RemoteWebDriver(
                    new URL("https://USERNAME:ACCESS_KEY@hub-cloud.browserstack.com/wd/hub"),
                    caps
            );
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


