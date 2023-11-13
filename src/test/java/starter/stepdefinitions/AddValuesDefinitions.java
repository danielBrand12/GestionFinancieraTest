package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Screenshots;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import starter.helpers.GestionsFinancieraPage;
import starter.helpers.AddValue;
import starter.helpers.NavigateTo;

public class AddValuesDefinitions {

    WebDriver driver = new ChromeDriver();

    @ParameterType(".*")
    public Actor actor(String name) {
        return new Actor(name);
    }

    @Before
    public void preStage(){
        driver.manage().window().maximize();
    }
    @Given("{actor} opens the PoliticasDePago view")
    @Screenshots(forEachAction = true)
    public void  daniel_opens_the_politicas_de_pago_view(Actor actor){
        actor.can(BrowseTheWeb.with(driver));
        actor.wasAbleTo(NavigateTo.thePoliticasDePagoPage());
    }

    @When("{actor} adds {string} to Porcetaje Socio and {string} to  Porcentaje Impuestos")
    @Screenshots(forEachAction = true)
    public void daniel_adds_to_porcetaje_socio_and_to_porcentaje_impuestos(Actor actor, String value1, String value2) {
        actor.can(BrowseTheWeb.with(driver));
        actor.attemptsTo(AddValue.addPorcentajeImpuestos(value2));
        actor.attemptsTo(AddValue.addPorcentajeSocio(value1));
    }

    @Then("{actor} sees {string} as the Porcentaje Intermediacion")
    @Screenshots(afterEachStep = true)
    public void daniel_sees_as_the_porcentaje_intermediacion(Actor actor, String value1){
        actor.can(BrowseTheWeb.with(driver));
        actor.attemptsTo(Ensure.that(GestionsFinancieraPage.PORCENTAJE_INTERMEDIACION_FIELD).hasValue(value1));
    }
}
