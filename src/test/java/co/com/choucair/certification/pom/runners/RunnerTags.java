package co.com.choucair.certification.pom.runners;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        tags =  "@HistoriaDeUsuario",
        glue = "co.com.choucair.certification.pom")

public class RunnerTags {
}


