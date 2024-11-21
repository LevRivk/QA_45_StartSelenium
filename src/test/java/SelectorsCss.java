import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectorsCss {

    WebDriver driver = new ChromeDriver();
    @Test
    public void elementsHeaderIlCarro(){
        driver.navigate().to("https://ilcarro.web.app/search");
        WebElement elementTextHeader = driver.findElement(By.cssSelector("div[class='header']"));
        System.out.println("text: "+ elementTextHeader.getText());



        driver.quit();

    }

}
