package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FalabellaPaginaPrincipal {
    public static final Target AVISO= Target.the("El aviso").locatedBy("//*[@id='acc-alert-close']");
    public static final Target INPUT_PRODUCTO= Target.the("la barra de busqueda de la pagina principal de falabella para encontrar un producto ingresamos su nombre").located(By.id("testId-SearchBar-Input"));
}
