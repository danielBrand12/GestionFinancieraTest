package starter.helpers;

import com.sun.org.apache.bcel.internal.generic.PUSH;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("codefactory-frontend-presencial.s3-website-us-east-1.amazonaws.com/GestionFinanciera/GestionDeCuenta/PoliticasDePago.html")
public class GestionsFinancieraPage extends PageObject{
    public static Target PORCENTAJE_SOCIO_FIELD = Target.the("Porcetaje Socio field").locatedBy("#input1");
    public static Target PORCENTAJE_IMPUESTOS_FIELD = Target.the("Porcentaje Impuestos field").locatedBy("#input2");
    public static Target PORCENTAJE_INTERMEDIACION_FIELD = Target.the("Porcentaje Intermediacion field").locatedBy("#:r2:");
}
