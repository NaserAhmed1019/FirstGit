package Pages;


import org.openqa.selenium.By;

public class BookStorePage {
    public String loginUrl = "https://demoqa.com/login";

    public String bookStoreUrl = "https://demoqa.com/books";

    public String profileUrl = "https://demoqa.com/profile";

    public By loginSubmenuLocator = new By.ByCssSelector("#login");

    public By userNameLocator = new By.ByCssSelector("#userName");

    public By passwordLocator = new By.ByCssSelector("#password");

    public By loginButtonLocator = new By.ByCssSelector("#login");

    public By usernameLabelLocator = new By.ByCssSelector("#userName-value");

    public By selectBook = new By.ByCssSelector("[id='see-book-Git Pocket Guide']");

    public By addBook = new By.ByCssSelector("#addNewRecordButton");

    public By profile = new By.ByCssSelector(".accordion .element-group:nth-child(6) #item-3");

    //    public By bookNameLocator = new By.ByCssSelector(".see-book-Git Pocket Guide");
    public By bookNameLocator = new By.ByXPath("//div[contains(text()'Richard E. Silverman')]");


}


