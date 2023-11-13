package starter.helpers;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.lang.annotation.Target;

public class AddValue {
    public static Performable addPorcentajeSocio(String value){
        return Task.where("{0} adds "+value,
                Enter.theValue(value)
                .into(GestionsFinancieraPage.PORCENTAJE_SOCIO_FIELD)
        );
    }

    public static Performable addPorcentajeImpuestos(String value){
        return Task.where("{0} adds "+value,
                Enter.theValue(value)
                        .into(GestionsFinancieraPage.PORCENTAJE_IMPUESTOS_FIELD)
        );
    }
}
