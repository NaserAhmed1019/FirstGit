package Way2Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StudentRegistrationForm {
    WebDriver driver;

    @BeforeClass
    void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
    }
    @Test
    void FirstName() {
        By FirstNameLocate = new By.ByCssSelector("#firstName");
        WebElement firstnameElement= driver.findElement(FirstNameLocate);
        firstnameElement.sendKeys("Naser");
    }
    @Test
    void LastName() {
        By LastNameLocate = new By.ByCssSelector("#lastName");
        WebElement lastnameElement= driver.findElement(LastNameLocate);
        lastnameElement.sendKeys("Ahmed");
    }
    @Test
    void Email() {
        By EmailLocate = new By.ByCssSelector("#userEmail");
        WebElement emailElement= driver.findElement(EmailLocate);
        emailElement.sendKeys("Naser@gmail.com");
    }
    @Test
    void Gender() {
        By GenderLocate = new By.ByCssSelector(".col-md-9 div [for='gender-radio-1']");
        WebElement genderElement= driver.findElement(GenderLocate);
        genderElement.click();
    }
    @Test
    void Mobile10Digits() {
        By MobileLocate = new By.ByCssSelector("#userNumber-wrapper div:nth-child(2) input");
        WebElement mobileElement= driver.findElement(MobileLocate);
        mobileElement.sendKeys("0123456789");
    }
    @Test
    void DateOfBirth() {
        By DOB = new By.ByCssSelector("#dateOfBirthInput");
        WebElement dobElement = driver.findElement(DOB);
        dobElement.click();

        By Month = new By.ByCssSelector(".react-datepicker__month-select");
        WebElement monthElement = driver.findElement(Month);
        monthElement.click();

        Select dobSelect = new Select(driver.findElement(Month));
        dobSelect.selectByVisibleText("March");

        By Year = new By.ByCssSelector(".react-datepicker__year-select");
        WebElement yearElement = driver.findElement(Year);
        yearElement.click();

        Select yearSelect = new Select(driver.findElement(Year));
        yearSelect.selectByVisibleText("2020");



        By Day = new By.ByCssSelector(".react-datepicker__day--010 ");
        WebElement dayElement = driver.findElement(Day);
        dayElement.click();


        //dobSelect.selectByVisibleText("10");
//        dobSelect.selectByVisibleText("Jan");
//        dobSelect.selectByVisibleText("2020");

    }
    @Test
    void Subjects() throws InterruptedException {
        By SubjectLocate = new By.ByCssSelector("#subjectsInput");
        WebElement subjectElement= driver.findElement(SubjectLocate);
        subjectElement.click();
        subjectElement.sendKeys("Maths");
      Thread.sleep(1000);
        subjectElement.sendKeys(Keys.ENTER);


       // Select subject = new Select(driver.findElement(SubjectLocate));
   }
    @Test
    void Hobbies() {
        By HobbiesLocate = new By.ByCssSelector("#hobbiesWrapper [for='hobbies-checkbox-2']");
        WebElement hobbiesElement= driver.findElement(HobbiesLocate);
        hobbiesElement.click();
    }
    @Test
    void yourProfilePicture() {
        By uploadFile = new By.ByCssSelector("#uploadPicture");
        WebElement uploadElement = driver.findElement(uploadFile);
        uploadElement.sendKeys("C:\\Users\\Naser Ahmed\\Downloads\\Flag_of_Argentina_(alternative).svg.png");
    }
    @Test
    void CurrentAddress() {
        By CurrentAddressLocate = new By.ByCssSelector("#currentAddress");
        WebElement addressElement= driver.findElement(CurrentAddressLocate);
        addressElement.sendKeys("White House 111");
    }
    @Test
    void StateAndCity() {
        By State = new By.ByCssSelector("#react-select-3-input");
        WebElement stateElement = driver.findElement(State);
        stateElement.sendKeys("NCR");
        stateElement.sendKeys(Keys.ENTER);
     //   Select scSelect = new Select(driver.findElement(SC));
     //   scSelect.selectByVisibleText("NCR");


    }


    @AfterClass
    void WrapUp() {
        //  driver.quit();
    }
}


