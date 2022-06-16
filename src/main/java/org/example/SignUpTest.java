package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest {
    /*
    1. Открыть браузер
    2. Зайти на сайт https://www.sharelane.com/cgi-bin/register.py
    3. Ввести цифры 12345
    4. Нажать Continue
    -----
     */
// 1
    @Test
    public void zipCodeShouldBeValid() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        WebElement zipCodeField = driver.findElement(By.name("zip_code"));
        zipCodeField.sendKeys("12345");
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
        WebElement registerButton = driver.findElement(By.cssSelector("input[value='Register']"));
        Assert.assertTrue(registerButton.isDisplayed());
    }

    //2
    @Test
    public void zipCodeIncludFourSimbols() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        WebElement zipCodeField = driver.findElement(By.name("zip_code"));
        zipCodeField.sendKeys("1234");
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
        WebElement continueButton = driver.findElement(By.cssSelector("input[value='Continue']"));
        Assert.assertTrue(continueButton.isDisplayed());
    }

    //3
    @Test
    public void zipCodeIncludSixSimbols() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        WebElement zipCodeField = driver.findElement(By.name("zip_code"));
        zipCodeField.sendKeys("123456");
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
        WebElement continueButton = driver.findElement(By.cssSelector("input[value='Continue']"));
        Assert.assertTrue(continueButton.isDisplayed());
    }

    //4
    @Test
    public void FirstNameIsARequiredField() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=11111");
        WebElement firstNameField = driver.findElement(By.name("first_name"));
        firstNameField.sendKeys("");
        WebElement lastNameField = driver.findElement(By.name("last_name"));
        lastNameField.sendKeys("Strukova");
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("olgatester2020@gmail.com");
        WebElement passwordField = driver.findElement(By.name("password1"));
        passwordField.sendKeys("qwerty12345");
        WebElement confirmPasswordField = driver.findElement(By.name("password2"));
        confirmPasswordField.sendKeys("qwerty12345");
        driver.findElement(By.cssSelector("input[value='Register']")).click();
        WebElement registerButton = driver.findElement(By.cssSelector("input[value='Register']"));
        Assert.assertTrue(registerButton.isDisplayed());
    }

    //5
    @Test
    public void FirstNameFieldIsFilledWithNumbers() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=11111");
        WebElement firstNameField = driver.findElement(By.name("first_name"));
        firstNameField.sendKeys("123456");
        WebElement lastNameField = driver.findElement(By.name("last_name"));
        lastNameField.sendKeys("Strukova");
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("olgatester2020@gmail.com");
        WebElement passwordField = driver.findElement(By.name("password1"));
        passwordField.sendKeys("qwerty12345");
        WebElement confirmPasswordField = driver.findElement(By.name("password2"));
        confirmPasswordField.sendKeys("qwerty12345");
        driver.findElement(By.cssSelector("input[value='Register']")).click();
        WebElement registerButton = driver.findElement(By.cssSelector("input[value='Register']"));
        Assert.assertTrue(registerButton.isDisplayed());
    }

    //6
    @Test
    public void lastNameIsNotARequiredField() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=11111");
        WebElement firstNameField = driver.findElement(By.name("first_name"));
        firstNameField.sendKeys("Olga");
        WebElement lastNameField = driver.findElement(By.name("last_name"));
        lastNameField.sendKeys("");
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("olgatester2020@gmail.com");
        WebElement passwordField = driver.findElement(By.name("password1"));
        passwordField.sendKeys("qwerty12345");
        WebElement confirmPasswordField = driver.findElement(By.name("password2"));
        confirmPasswordField.sendKeys("qwerty12345");
        driver.findElement(By.cssSelector("input[value='Register']")).click();
        WebElement tableAccount = driver.findElement(By.cssSelector("table"));
        Assert.assertTrue(tableAccount.isDisplayed());
    }

    //7
    @Test
    public void emailIsARequiredField() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=11111");
        WebElement firstNameField = driver.findElement(By.name("first_name"));
        firstNameField.sendKeys("Olga");
        WebElement lastNameField = driver.findElement(By.name("last_name"));
        lastNameField.sendKeys("Strukova");
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("");
        WebElement passwordField = driver.findElement(By.name("password1"));
        passwordField.sendKeys("qwerty12345");
        WebElement confirmPasswordField = driver.findElement(By.name("password2"));
        confirmPasswordField.sendKeys("qwerty12345");
        driver.findElement(By.cssSelector("input[value='Register']")).click();
        WebElement registerButton = driver.findElement(By.cssSelector("input[value='Register']"));
        Assert.assertTrue(registerButton.isDisplayed());
    }
}

