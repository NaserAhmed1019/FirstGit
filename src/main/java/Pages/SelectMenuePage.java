package Pages;

import org.openqa.selenium.By;

public class SelectMenuePage {

    // SelectValue
    public String pageUrl = "https://demoqa.com/select-menu";

    public By selectValueLocator = new By.ByCssSelector("#withOptGroup .css-tlfecz-indicatorContainer");
    public By selctingGroupB_Opt1 = new By.ByCssSelector("#react-select-2-option-1-0");
    public By selectValueAssert = new By.ByCssSelector("#withOptGroup .css-1uccc91-singleValue");


    // SelectOne
    public By selectOneLocator = new By.ByCssSelector("#selectOne [class=' css-1wa3eu0-placeholder']");
    public By selectOneMs_Locator = new By.ByCssSelector("#react-select-3-option-0-3");
    public By selectOneAssert = new By.ByCssSelector("#selectOne div.css-1uccc91-singleValue");


    // Old Style Select Menu
    public By oldSelectMenuLocator = new By.ByCssSelector("#oldSelectMenu");
    public By oldMenuBlueLocator = new By.ByCssSelector("#oldSelectMenu [value='1']");


    // Multi Select
    public By multiSelectLocator = new By.ByCssSelector("[style='opacity: 1; transition: opacity 260ms ease 0s;']");
    public By multiSelectBlackLocator = new By.ByCssSelector("#react-select-4-option-2");
    public By multiselectAssert = new By.ByCssSelector("[style='overflow: hidden; white-space: nowrap; width: 66.0625px;'] .css-12jo7m5");
    public By multiSelectExitLo = new By.ByCssSelector("#selectMenuContainer div:nth-child(7) .css-1wy0on6 :nth-child(3)");

    // Standard Multi Select
    public By standardMultiSelectLocator = new By.ByCssSelector("cars");

    public By standardMultiSelectSaab = new By.ByCssSelector("[value='saab']");


}
