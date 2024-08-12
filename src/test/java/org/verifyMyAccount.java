package org;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

@Test
public class verifyMyAccount {
    WebDriver driver;

@Test
    public void loginTest(){
        //open browser using edgedriver
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        //input username & password findElement by id/name/xpath
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        driver.findElement(By.id("input-email")).sendKeys("hilibrikateu-4757@yopmail.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

        //verify success login findElement by xpath
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[.='My Account']")));
        String txtSecureAreaActual = driver.findElement(By.xpath("//h2[.='My Account']")).getText();
        String txtSecureAreaExpected = "My Account";

        //verify whether two values are exactly the same.
        Assert.assertEquals(txtSecureAreaActual,txtSecureAreaExpected);

        //close browser
        driver.quit();
    }
}
