package Way2Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class RegistrationTest {
    WebDriver driver;

    // How to set up before running automation
    // This line of code is used to creat a chrome to run the code.
    @BeforeClass
    void SetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
    }

    // How to use keys to fill in chat boxes.
    // Fill in the text box for first Name.
    @Test
    void firstNameSetUp() {
        By inputFirstName = new By.ByCssSelector(".fieldset [name='name']");
        WebElement firstNameElement = driver.findElement(inputFirstName);
        firstNameElement.sendKeys("Naser");

    }

    // Fill for Last name.
    @Test
    void lastNameSetUp() {
        By inputLastName = new By.ByCssSelector("p:nth-child(2) input");
        WebElement lastNameElement = driver.findElement(inputLastName);
        lastNameElement.sendKeys("Ahmed");
    }

    // How to click on things.
    // Selecting married status.
    @Test
    void selectingMarried() {
        By marriedStatus = new By.ByCssSelector("fieldset:nth-child(2) .radio_wrap label:nth-child(2) input");
        WebElement marriedElement = driver.findElement(marriedStatus);
        marriedElement.click();

    }

    // How to click on things
    // Selecting a hobby.
    @Test
    void selectingDance() {
        By danceHobby = new By.ByCssSelector(".padding-bottom div label:first-child input");
        WebElement danceElement = driver.findElement(danceHobby);
        danceElement.click();
    }


    // How to use the Select operation to choose from a list of things.
    @Test
    void selectingCountry() {
        By country = new By.ByCssSelector("fieldset:nth-child(4) select");
        Select countrySelect = new Select(driver.findElement(country));
        countrySelect.selectByVisibleText("India");
    }


    // Selecting from a list of ....
    @Test
    void monthOfBirth() {
        By month = new By.ByCssSelector("fieldset div:nth-child(2) select");
        Select monthSelect = new Select(driver.findElement(month));
        monthSelect.selectByVisibleText("1");
    }

    // Day of Birth
    @Test
    void dayOfBirth() {
        By day = new By.ByCssSelector("fieldset .time_feild:nth-child(3) select");
        Select daySelect = new Select(driver.findElement(day));
        daySelect.selectByVisibleText("1");

    }

    @Test
    void YearOfBirth() {
        By year = new By.ByCssSelector("fieldset .time_feild:nth-child(4) select");
        Select yearSelect = new Select(driver.findElement(year));
        yearSelect.selectByVisibleText("2014");

    }

    @Test
    void PhoneNumber() {
        By numberLocation = new By.ByCssSelector(".fieldset [name='phone']");
        WebElement numberElement = driver.findElement(numberLocation);
        numberElement.sendKeys("911");
    }

    @Test
    void userNameSetUp() {
        By inputUserName = new By.ByCssSelector(".fieldset [name='username']");
        WebElement userNameElement = driver.findElement(inputUserName);
        userNameElement.sendKeys("Naser@gamil.com");
    }

    @Test
    void EmailSetUp() {
        By inputEmail = new By.ByCssSelector(".fieldset [name='email']");
        WebElement emailElement = driver.findElement(inputEmail);
        emailElement.sendKeys("Naser@gamil.com");
    }

    // How to upload a file.
    @Test
    void yourProfilePicture() {
        By uploadFile = new By.ByCssSelector("[type='file']");
        WebElement uploadElement = driver.findElement(uploadFile);
        uploadElement.sendKeys("C:\\Users\\Naser Ahmed\\Downloads\\Flag_of_Argentina_(alternative).svg.png");
        //  driver.findElement(By.id("[type='file']")).sendKeys("C:\\Users\\Naser Ahmed\\Downloads\\Flag_of_Argentina_(alternative).svg.png");
    }

    @Test
    void AboutYourSelf() {
        By aboutYourself = new By.ByCssSelector("fieldset [rows='5']");
        WebElement infoElement = driver.findElement(aboutYourself);
        infoElement.sendKeys("Hello Everyone");
    }

    @Test
    void PasswordSetUp() {
        By inputPassword = new By.ByCssSelector(".fieldset [name='password']");
        WebElement passwordElement = driver.findElement(inputPassword);
        passwordElement.sendKeys("Naser");
    }

    @Test
    void ConfirmPassword() {
        By confirmPassword = new By.ByCssSelector(".fieldset [name='c_password']");
        WebElement confirmElement = driver.findElement(confirmPassword);
        confirmElement.sendKeys("Naser");
    }


    // How to close the web after the automation test is complete.
    @AfterClass
    void wrapUp() {
   //     driver.quit();
    }

}
//ArrayList<String> tabs = new ArrayList <> (driver.getWindowHandles()):
//String secondTabAddress = tabs.get(1);
//driver.switchTo().window(secondtabAddress);