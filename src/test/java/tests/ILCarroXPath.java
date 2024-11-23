package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ILCarroXPath {
    WebDriver driver = new ChromeDriver();
    @Test
    public void typeRegForm(){
        driver.navigate().to("https://ilcarro.web.app/registration?url=%2Fsearch");
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
        inputEmail.sendKeys("myEmail@gmail.com");
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
        driver.quit();




    }

}
