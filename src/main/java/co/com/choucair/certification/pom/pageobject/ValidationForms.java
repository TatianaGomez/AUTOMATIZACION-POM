package co.com.choucair.certification.pom.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

public class ValidationForms extends PageObject {

    @FindBy(xpath = "//*[@id=\"required2-error\"]")
    public WebElementFacade requiredError;
    @FindBy(xpath = "//*[@id=\"email2-error\"]")
    public WebElementFacade mailError;
    @FindBy(xpath = "//*[@id=\"password2-error\"]")
    public WebElementFacade passError;
    @FindBy(xpath = "//*[@id=\"confirm_password2-error\"]")
    public WebElementFacade ConfPassError;
    @FindBy(xpath = "//*[@id=\"date2-error\"]")
    public WebElementFacade dateError;
    @FindBy(xpath = "//*[@id=\"url2-error\"]")
    public WebElementFacade urlError;
    @FindBy(xpath = "//*[@id=\"digits-error\"]")
    public WebElementFacade DigitsError;
    @FindBy(xpath = "//*[@id=\"range-error\"]")
    public WebElementFacade rangeError;
    @FindBy(xpath = "//*[@id=\"agree2-error\"]")
    public WebElementFacade policyError;
}
