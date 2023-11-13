package starter.stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.helpers.GestionsFinancieraPage;
import starter.helpers.AddValue;
import starter.helpers.NavigateTo;

public class AddValuesDefinitions {
    @Given("{actor} opens the PoliticasDePago view")
    public void  actorsMovesToPDPView(Actor actor){
        actor.wasAbleTo(NavigateTo.thePoliticasDePagoPage());
    }

    @When("{actor} he adds {string} to Porcetaje Socio and {string} to  Porcentaje Impuestos")
    public void heAddsToFields(Actor actor, String value1, String value2) {
        actor.attemptsTo(AddValue.addPorcentajeImpuestos("10"));
        actor.attemptsTo(AddValue.addPorcentajeSocio("20"));
    }

    @Then("{actor} sees {string} as the Porcentaje Intermediacion")
    public void heSeesAValue(Actor actor, String value1){
        actor.attemptsTo(Ensure.that(GestionsFinancieraPage.PORCENTAJE_INTERMEDIACION_FIELD).hasText("70"));
    }
}
