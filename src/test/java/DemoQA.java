import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DemoQA {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");


        //      click on element
        By firstElement = new By.ByCssSelector(".card:first-child");
        WebElement element = driver.findElement(firstElement);
        element.click();


        //     check if the logo is Elements
        By headerLocator = new By.ByCssSelector(".main-header");
        WebElement header = driver.findElement(headerLocator);
        String headerText = header.getText();

        Assert.assertEquals(headerText, "Elements");

        // System.out.println(headerText);
        // if (headerText.equals("Elements") ){
        //    System.out.println("Elements' found in the header");
        //}else {
        //  System.out.println("Element's not found");
        //}


         //    click on logo
        By logoLocator = new By.ByCssSelector("header img");
        WebElement logo = driver.findElement(logoLocator);
        logo.click();


        //    click on form
        By formsLocater = new By.ByCssSelector(".card:nth-child(2)");
        WebElement forms = driver.findElement(formsLocater);
        forms.click();

//   check if the logo is Forms
        header = driver.findElement(headerLocator);
        headerText = header.getText();
        Assert.assertEquals(headerText, "Forms");

       // quitting
        driver.quit();

    }
}
