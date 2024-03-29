package com.solvd.testautomation.ui.components;

import com.solvd.testautomation.ui.components.headercomponenets.MenuOption;
import com.solvd.testautomation.ui.components.headercomponenets.SearchComponent;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class Header extends AbstractUIObject {
    @FindBy(xpath = "//header//*[@class='pt1-lg']//a[@aria-label='New & Featured']")
    private ExtendedWebElement newFeature;
    @FindBy(xpath = "//header//*[@class='pt1-lg']//a[@aria-label='Men']")
    private ExtendedWebElement men;
    @FindBy(xpath = "//header//*[@class='pt1-lg']//a[@aria-label='Women']")
    private ExtendedWebElement women;
    @FindBy(xpath = "//div[@type='search']")
    private SearchComponent searchComponent;
    @FindBy(xpath = "//div[@data-pre='DesktopUserMenu']")
    private MenuOption menuOption;
    public Header(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
    public ExtendedWebElement getMen() {
        return men;
    }
    public MenuOption getMenuOption() {
        return menuOption;
    }
    public SearchComponent getSearchComponent() {
        return searchComponent;
    }
    public ExtendedWebElement getNewFeature() {
        return newFeature;
    }
    public void clickFeature(){
        newFeature.click();
    }
    public void clickMen(){
        men.click();
    }
}
