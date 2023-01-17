package Pages;

import org.openqa.selenium.By;

public class SelectMenuePage {


    public String pageUrl = "https://demoqa.com/select-menu";
    public By selectValueLocator = new By.ByCssSelector("#withOptGroup .css-tlfecz-indicatorContainer");
    public By selctingGroupB_Opt1 = new By.ByCssSelector("#react-select-2-option-1-0");
    public By selectValueAssert = new By.ByCssSelector("#withOptGroup .css-1uccc91-singleValue");


}
