package co.com.choucair.certification.pom.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class PaginaUrl extends PageObject {

    @FindBy(xpath="//*[@id=\"login\"]/form/input[1]")
    public WebElementFacade user;
    @FindBy(xpath="//*[@id=\"login\"]/form/input[2]")
    public WebElementFacade pass;
    @FindBy(xpath="//*[@id=\"login\"]/form/button")
    public WebElementFacade btn_sing_in;
    @FindBy(xpath="//*[@id=\"content\"]/div/div")
    public WebElementFacade lbl_Menu;
    @FindBy(xpath="//*[@id=\"menu\"]/li[6]/a/span[1]")
    public WebElementFacade opc_Menu;
    @FindBy(xpath="//*[@id=\"menu\"]/li[6]/ul/li[2]/a")
    public WebElementFacade sub_Menu;
    @FindBy(xpath="//*[@id=\"content\"]/div/div/div[2]/div/div/header/h5")
    public WebElementFacade Verification_forms;
    @FindBy(xpath="//*[@id=\"required2\"]")
    public WebElementFacade required;
    @FindBy(xpath="//*[@id=\"content\"]/div/div/div[1]/div/div/header/div[2]/nav/a[1]/i")
    public WebElementFacade Minimizar;
    @FindBy(xpath="//*[@id=\"email2\"]")
    public WebElementFacade mail;
    @FindBy(xpath="//*[@id=\"password2\"]")
    public WebElementFacade passForm;
    @FindBy(xpath="//*[@id=\"confirm_password2\"]")
    public WebElementFacade Conf_pass;
    @FindBy(xpath="//*[@id=\"date2\"]")
    public WebElementFacade date;
    @FindBy(xpath="//*[@id=\"url2\"]")
    public WebElementFacade url;
    @FindBy(xpath="//*[@id=\"digits\"]")
    public WebElementFacade digitsOnly;
    @FindBy(xpath="//*[@id=\"range\"]")
    public WebElementFacade range;
    @FindBy(xpath="//*[@id=\"agree2\"]")
    public WebElementFacade check_policy;
    @FindBy(xpath="//*[@id=\"block-validate\"]/div[10]/input")
    public WebElementFacade btn_validate;

}
