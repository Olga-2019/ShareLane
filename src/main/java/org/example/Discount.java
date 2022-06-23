package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

//39 #20 - 49    | 2
//        40 #50 - 99    | 3
//        41 #100-499    | 4
//        42 #500-999    | 5
//        43 #1000-4999  | 6
//        44 #5000-9999  | 7
//        45 #10000 and more | 8





public class Discount extends BaseTest {
    String email;

    String password;


    public void loginUser() {
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("Olga");
        driver.findElement(By.name("email")).sendKeys("olgatester2020@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("Olga12345");
        driver.findElement(By.name("password2")).sendKeys("Olga12345");
        driver.findElement(By.cssSelector("input[value='Register']")).click();
        email = driver.findElement(By.xpath("//td[text()='Email']/following::b")).getText();
        password = driver.findElement(By.xpath("//td[text()='Password']/following::td")).getText();
        driver.findElement(By.cssSelector("img[src='../images/logo.jpg']")).click();
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.cssSelector("input[value='Login']")).click();
    }
    @Test
    public void discountForOneBook() {
        loginUser();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=7");
        driver.findElement(By.cssSelector("img[src='../images/add_to_cart.gif']")).click();
        driver.findElement(By.cssSelector("body > center > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(3) > a")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("1");
        driver.findElement(By.cssSelector("input[value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='0']"));
        Assert.assertTrue(discount.isDisplayed());
    }

    @Test
    public void discountForNineteenBooks() {
        loginUser();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=7");
        driver.findElement(By.cssSelector("img[src='../images/add_to_cart.gif']")).click();
        driver.findElement(By.cssSelector("body > center > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(3) > a")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("19");
        driver.findElement(By.cssSelector("input[value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='0']"));
        Assert.assertTrue(discount.isDisplayed());
    }
    @Test
    public void discountForTwentyBooks() {
        loginUser();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=7");
        driver.findElement(By.cssSelector("img[src='../images/add_to_cart.gif']")).click();
        driver.findElement(By.cssSelector("body > center > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(3) > a")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("20");
        driver.findElement(By.cssSelector("input[value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='2']"));
        Assert.assertTrue(discount.isDisplayed());
    }
    @Test
    public void discountForTwentyOneBooks() {
        loginUser();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=7");
        driver.findElement(By.cssSelector("img[src='../images/add_to_cart.gif']")).click();
        driver.findElement(By.cssSelector("body > center > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(3) > a")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("21");
        driver.findElement(By.cssSelector("input[value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='2']"));
        Assert.assertTrue(discount.isDisplayed());
    }
    @Test
    public void discountForFortyNineBooks() {
        loginUser();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=7");
        driver.findElement(By.cssSelector("img[src='../images/add_to_cart.gif']")).click();
        driver.findElement(By.cssSelector("body > center > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(3) > a")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("49");
        driver.findElement(By.cssSelector("input[value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='2']"));
        Assert.assertTrue(discount.isDisplayed());
    }
    @Test
    public void discountForFifteenBooks() {
        loginUser();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=7");
        driver.findElement(By.cssSelector("img[src='../images/add_to_cart.gif']")).click();
        driver.findElement(By.cssSelector("body > center > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(3) > a")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("50");
        driver.findElement(By.cssSelector("input[value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='3']"));
        Assert.assertTrue(discount.isDisplayed());
    }
    @Test
    public void discountForFiftyOneBooks() {
        loginUser();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=7");
        driver.findElement(By.cssSelector("img[src='../images/add_to_cart.gif']")).click();
        driver.findElement(By.cssSelector("body > center > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(3) > a")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("51");
        driver.findElement(By.cssSelector("input[value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='3']"));
        Assert.assertTrue(discount.isDisplayed());
    }
    @Test
    public void discountForNinetyNineBooks() {
        loginUser();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=7");
        driver.findElement(By.cssSelector("img[src='../images/add_to_cart.gif']")).click();
        driver.findElement(By.cssSelector("body > center > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(3) > a")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("99");
        driver.findElement(By.cssSelector("input[value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='3']"));
        Assert.assertTrue(discount.isDisplayed());
    }
    @Test
    public void discountForOneHundredBooks() {
        loginUser();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=7");
        driver.findElement(By.cssSelector("img[src='../images/add_to_cart.gif']")).click();
        driver.findElement(By.cssSelector("body > center > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(3) > a")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("100");
        driver.findElement(By.cssSelector("input[value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='4']"));
        Assert.assertTrue(discount.isDisplayed());
    }
    @Test
    public void discountForOneHundredAndOneBooks() {
        loginUser();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=7");
        driver.findElement(By.cssSelector("img[src='../images/add_to_cart.gif']")).click();
        driver.findElement(By.cssSelector("body > center > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(3) > a")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("101");
        driver.findElement(By.cssSelector("input[value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='4']"));
        Assert.assertTrue(discount.isDisplayed());
    }
    @Test
    public void discountForFourHundredAndNinetyNineBooks() {
        loginUser();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=7");
        driver.findElement(By.cssSelector("img[src='../images/add_to_cart.gif']")).click();
        driver.findElement(By.cssSelector("body > center > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(3) > a")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("499");
        driver.findElement(By.cssSelector("input[value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='4']"));
        Assert.assertTrue(discount.isDisplayed());
    }
    @Test
    public void discountForFiveHundredBooks() {
        loginUser();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=7");
        driver.findElement(By.cssSelector("img[src='../images/add_to_cart.gif']")).click();
        driver.findElement(By.cssSelector("body > center > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(3) > a")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("500");
        driver.findElement(By.cssSelector("input[value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='5']"));
        Assert.assertTrue(discount.isDisplayed());
    }
    @Test
    public void discountForFiveHundredAndOneBooks() {
        loginUser();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=7");
        driver.findElement(By.cssSelector("img[src='../images/add_to_cart.gif']")).click();
        driver.findElement(By.cssSelector("body > center > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(3) > a")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("501");
        driver.findElement(By.cssSelector("input[value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='5']"));
        Assert.assertTrue(discount.isDisplayed());
    }
    @Test
    public void discountForNineHundredAndNinetyNineBooks() {
        loginUser();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=7");
        driver.findElement(By.cssSelector("img[src='../images/add_to_cart.gif']")).click();
        driver.findElement(By.cssSelector("body > center > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(3) > a")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("999");
        driver.findElement(By.cssSelector("input[value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='5']"));
        Assert.assertTrue(discount.isDisplayed());
    }
    @Test
    public void discountForOneThousendBooks() {
        loginUser();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=7");
        driver.findElement(By.cssSelector("img[src='../images/add_to_cart.gif']")).click();
        driver.findElement(By.cssSelector("body > center > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(3) > a")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("1000");
        driver.findElement(By.cssSelector("input[value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='6']"));
        Assert.assertTrue(discount.isDisplayed());
    }
    @Test
    public void discountForOneThousendAndOneBooks() {
        loginUser();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=7");
        driver.findElement(By.cssSelector("img[src='../images/add_to_cart.gif']")).click();
        driver.findElement(By.cssSelector("body > center > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(3) > a")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("1001");
        driver.findElement(By.cssSelector("input[value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='6']"));
        Assert.assertTrue(discount.isDisplayed());
    }
    @Test
    public void discountForFourThousandNineHundredNinetyNineBooks() {
        loginUser();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=7");
        driver.findElement(By.cssSelector("img[src='../images/add_to_cart.gif']")).click();
        driver.findElement(By.cssSelector("body > center > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(3) > a")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("4999");
        driver.findElement(By.cssSelector("input[value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='6']"));
        Assert.assertTrue(discount.isDisplayed());
    }
    @Test
    public void discountForFiveThousendBooks() {
        loginUser();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=7");
        driver.findElement(By.cssSelector("img[src='../images/add_to_cart.gif']")).click();
        driver.findElement(By.cssSelector("body > center > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(3) > a")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("5000");
        driver.findElement(By.cssSelector("input[value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='7']"));
        Assert.assertTrue(discount.isDisplayed());
    }
    @Test
    public void discountForFiveThousendAndOneBooks() {
        loginUser();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=7");
        driver.findElement(By.cssSelector("img[src='../images/add_to_cart.gif']")).click();
        driver.findElement(By.cssSelector("body > center > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(3) > a")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("5001");
        driver.findElement(By.cssSelector("input[value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='7']"));
        Assert.assertTrue(discount.isDisplayed());
    }
    @Test
    public void discountForNineThousandNineHundredNinetyNineBooks() {
        loginUser();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=7");
        driver.findElement(By.cssSelector("img[src='../images/add_to_cart.gif']")).click();
        driver.findElement(By.cssSelector("body > center > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(3) > a")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("9999");
        driver.findElement(By.cssSelector("input[value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='7']"));
        Assert.assertTrue(discount.isDisplayed());
    }
    @Test
    public void discountForTenThousandBooks() {
        loginUser();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=7");
        driver.findElement(By.cssSelector("img[src='../images/add_to_cart.gif']")).click();
        driver.findElement(By.cssSelector("body > center > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(3) > a")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("10000");
        driver.findElement(By.cssSelector("input[value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='8']"));
        Assert.assertTrue(discount.isDisplayed());
    }
    @Test
    public void discountForTenThousandAndOneBooks() {
        loginUser();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=7");
        driver.findElement(By.cssSelector("img[src='../images/add_to_cart.gif']")).click();
        driver.findElement(By.cssSelector("body > center > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(3) > a")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("10001");
        driver.findElement(By.cssSelector("input[value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='8']"));
        Assert.assertTrue(discount.isDisplayed());
    }
    @Test
    public void discountForMillionBooks() {
        loginUser();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=7");
        driver.findElement(By.cssSelector("img[src='../images/add_to_cart.gif']")).click();
        driver.findElement(By.cssSelector("body > center > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(3) > a")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("1000000");
        driver.findElement(By.cssSelector("input[value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='8']"));
        Assert.assertTrue(discount.isDisplayed());
    }
}
