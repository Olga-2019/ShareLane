package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import io.github.bonigarcia.wdm.WebDriverManager;



//import java.time.Duration;


public class SignUpTest extends BaseTest {

    // 1

    @Test
    public void zipCodeShouldBeValid() {
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
        WebElement registerButton = driver.findElement(By.cssSelector("input[value='Register']"));
        Assert.assertTrue(registerButton.isDisplayed());
    }

    //2
    @Test
    public void zipCodeIncludFourSimbols() {
        driver.findElement(By.name("zip_code")).sendKeys("1234");
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
        WebElement continueButton = driver.findElement(By.cssSelector("input[value='Continue']"));
        Assert.assertTrue(continueButton.isDisplayed());
    }
    //3
    @Test
    public void zipCodeIncludSixSimbols() {
        driver.findElement(By.name("zip_code")).sendKeys("123456");
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
        WebElement continueButton = driver.findElement(By.cssSelector("input[value='Continue']"));
        Assert.assertTrue(continueButton.isDisplayed());
    }
    //4
    @Test
    public void FirstNameIsARequiredField() {
        driver.findElement(By.name("first_name")).sendKeys("");
        driver.findElement(By.name("last_name")).sendKeys("Strukova");
        driver.findElement(By.name("email")).sendKeys("olgatester2020@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("qwerty12345");
        driver.findElement(By.name("password2")).sendKeys("qwerty12345");
        driver.findElement(By.cssSelector("input[value='Register']")).click();
        WebElement registerButton = driver.findElement(By.cssSelector("input[value='Register']"));
        Assert.assertTrue(registerButton.isDisplayed());
    }
    //5
    @Test
    public void FirstNameFieldIsFilledWithNumbers() {
        driver.findElement(By.name("first_name")).sendKeys("123456");
        driver.findElement(By.name("last_name")).sendKeys("Strukova");
        driver.findElement(By.name("email")).sendKeys("olgatester2020@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("qwerty12345");
        driver.findElement(By.name("password2")).sendKeys("qwerty12345");
        driver.findElement(By.cssSelector("input[value='Register']")).click();
        WebElement registerButton = driver.findElement(By.cssSelector("input[value='Register']"));
        Assert.assertTrue(registerButton.isDisplayed());
    }
    //6
    @Test
    public void lastNameIsNotARequiredField() {
        driver.findElement(By.name("first_name")).sendKeys("Olga");
        driver.findElement(By.name("last_name")).sendKeys("");
        driver.findElement(By.name("email")).sendKeys("olgatester2020@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("qwerty12345");
        driver.findElement(By.name("password2")).sendKeys("qwerty12345");
        driver.findElement(By.cssSelector("input[value='Register']")).click();
        WebElement tableAccount = driver.findElement(By.cssSelector("table"));
        Assert.assertTrue(tableAccount.isDisplayed());
    }
    //7
    @Test
    public void emailIsARequiredField() {
        driver.findElement(By.name("first_name")).sendKeys("Olga");
        driver.findElement(By.name("last_name")).sendKeys("Strukova");
        driver.findElement(By.name("email")).sendKeys("");
        driver.findElement(By.name("password1")).sendKeys("qwerty12345");
        driver.findElement(By.name("password2")).sendKeys("qwerty12345");
        driver.findElement(By.cssSelector("input[value='Register']")).click();
        WebElement registerButton = driver.findElement(By.cssSelector("input[value='Register']"));
        Assert.assertTrue(registerButton.isDisplayed());
    }
}

