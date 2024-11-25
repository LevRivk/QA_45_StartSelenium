package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ILCarroXPath {
    WebDriver driver = new ChromeDriver();

    @Test
    public void typeRegForm() {
        driver.navigate().to("https://ilcarro.web.app/registration?url=%2Fsearch");
        //driver.manage().window().maximize();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement inputName = driver.findElement(By.xpath("//input[@formcontrolname='firstName']"));
        inputName.sendKeys("Lev");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement inputLastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        inputLastName.sendKeys("Rivkin");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='email']"));
        inputEmail.sendKeys("myemail@gmail.com");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='password']"));
        inputPassword.sendKeys("TelRan2024!");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("driver.findElement(By.xpath(\"//label[@for='terms-of-use']\")).click();"));


        WebElement checkBox = driver.findElement(By.xpath("//input[@id='terms-of-use']"));
        if (!checkBox.isSelected()) {
            checkBox.click();

        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        WebElement btnYalla = driver.findElement(By.xpath("//button [@type='submit']"));
        btnYalla.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    @Test

        public  void CheckVisibilityCheckBox  () {

            WebDriver driver = new ChromeDriver();
            driver.get("https://ilcarro.web.app/registration?url=%2Fsearch");
            WebElement checkbox = driver.findElement(By.xpath("//input[@id='terms-of-use']"));
            if (checkbox.isDisplayed()) {
                System.out.println("Checkbox is visible on the page");
            } else {
                System.out.println("Checkbox is hidden.");
            }
            driver.quit();
        }
    }










