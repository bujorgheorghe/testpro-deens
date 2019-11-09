import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class LoginTest {

    
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://deens-master.now.sh/");
        WebElement login_button = driver.findElement(By.cssSelector("[data-testid=\"loginSubmit\"]"));
        login_button.click();
        WebElement uiErrorMessage =driver.findElement(By.cssSelector(".ui.error.message.p"));
        String errorMessagetext = uiErrorMessage.getText();
        Assert.assertEquals(errorMessagetext, "Empty email or password");
        driver.quit();





    }



}
