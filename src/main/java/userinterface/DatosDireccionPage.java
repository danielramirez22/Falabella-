package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosDireccionPage {

    public static final Target DEPARTAMENTO= Target.the("El departamento").located(By.xpath("//select[@id='region']"));
    public static final Target DEPT_RDA = Target.the("Seleccionar Risaralda").located(By.xpath("//*[@id='region']/option[23]"));
    public static final Target CIUDAD= Target.the("La ciudad").locatedBy("//*[@id='ciudad']");
    public static final Target CIUDAD_DOSQ = Target.the("Seleccionar Dosquebradas").located(By.xpath("//*[@id='ciudad']/option[4]"));
    public static final Target BARRIO= Target.the("El barrio").locatedBy("//*[@id='comuna']");
    public static final Target BARRIO_DOSQ = Target.the("Seleccionar Dosquebradas").located(By.xpath("//*[@id='comuna']/option[2]"));
    public static final Target BTN_CONTINUAR= Target.the("El boton continuar").locatedBy("//*[@name='field04']");
    public static final Target DIRECCION= Target.the("La direccion").locatedBy("//*[@id='address']");
    public static final Target TIPO_VIVIENDA= Target.the("El tipo de vivienda").locatedBy("//*[@id='departmentNumber']");
    public static final Target BTN_INGRESAR_DIRECCION= Target.the("El boton ingresar dreccion").locatedBy("//*[@name='useAddress']");
    public static final Target BTN_CONTINUAR2= Target.the("El boton continuar").located(By.xpath("//*[@id='fbra_checkoutDeliveryActions']/div/div/span/div/div/div/div[2]/button"));
}
