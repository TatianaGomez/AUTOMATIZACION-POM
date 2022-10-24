package co.com.choucair.certification.pom.step;

import co.com.choucair.certification.pom.pageobject.PaginaUrl;
import co.com.choucair.certification.pom.pageobject.ValidationForms;
import com.gargoylesoftware.htmlunit.javascript.host.Window;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.ScrollToBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


public class TaskAction {
    private PaginaUrl paginaUrl;
    private ValidationForms validationForms;

    @Step
    public void appUrl() {
        paginaUrl.open();
    }

    @Step

    public void singIn() throws InterruptedException {
        paginaUrl.user.sendKeys("tatianaGomez");
        Thread.sleep(500);
        paginaUrl.pass.sendKeys("Tatiana3006");
        Thread.sleep(500);
        paginaUrl.btn_sing_in.click();
        Thread.sleep(500);
    }

    @Step

    public void verificar() {
        assertThat(paginaUrl.lbl_Menu.isCurrentlyVisible(), is(true));
    }

    @Step

    public void Menu() throws InterruptedException {
        paginaUrl.opc_Menu.click();
        Thread.sleep(500);
        paginaUrl.sub_Menu.click();
        Thread.sleep(500);
    }

    @Step

    public void verificarForms() {
        assertThat(paginaUrl.Verification_forms.isCurrentlyVisible(), is(true));
    }

    @Step

    public void InformationForms() throws InterruptedException {

        paginaUrl.Minimizar.click();
        Thread.sleep(500);
        paginaUrl.required.sendKeys("");
        Thread.sleep(500);
        paginaUrl.mail.sendKeys("tatiana@gmail.com");
        Thread.sleep(500);
        paginaUrl.passForm.sendKeys("analista");
        Thread.sleep(500);
        paginaUrl.Conf_pass.sendKeys("analista");
        Thread.sleep(500);
        paginaUrl.date.sendKeys("24/10/1996");
        Thread.sleep(500);
        paginaUrl.url.sendKeys("https://www.youtube.com/");
        Thread.sleep(500);
        paginaUrl.digitsOnly.sendKeys("1");
        Thread.sleep(500);
        paginaUrl.range.sendKeys("9");
        Thread.sleep(500);
        paginaUrl.check_policy.click();
        Thread.sleep(500);

    }

    @Step

    public void BtnValidate() throws InterruptedException {
        paginaUrl.btn_validate.click();
        Thread.sleep(500);
    }


    @Step
    public void ValidationForms() throws InterruptedException {
        List<WebElementFacade> ListValidation = Arrays.asList(
                validationForms.requiredError,
                validationForms.mailError,
                validationForms.passError,
                validationForms.ConfPassError,
                validationForms.dateError,
                validationForms.urlError,
                validationForms.DigitsError,
                validationForms.rangeError,
                validationForms.policyError
        );
        for (WebElementFacade j : ListValidation) {
            if (j.isCurrentlyVisible()) {
                assertThat(j.isCurrentlyVisible(), is(true));
                System.out.println("Campo NO ingresado o con error: " + j);
            } else {
                assertThat(j.isCurrentlyVisible(), is(false));
                System.out.println("Campo ingresado correctamente: " + j);
            }
        }
    }
}


