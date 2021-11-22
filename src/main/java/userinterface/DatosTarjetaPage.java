package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosTarjetaPage {

    public static final Target OPCION_PAGO = Target.the("Elegir la opción de pago otra tarjeta de crédito").located(By.xpath("//DIV[@class='headerWrapper fbra__header-paymentByOtherCards-enabled']"));
    public static final Target BTN_CONTINUAR_PAGO = Target.the("Continuar con actual medio de pago").located(By.xpath("//A[@class='fbra_anchor fbra_simpleActionModal__yesLink fbra_test_simpleActionModal__yesLink'][text()='Continuar con el medio de pago seleccionado']"));
    public static final Target NOMBRE_TARJETA = Target.the("Nombre en la tarjeta").located(By.id("nameOnCard"));
    public static final Target NUMERO_TARJETA = Target.the("Numero de la tarjeta").located(By.id("cardNumber"));
    public static final Target CVV = Target.the("Codigo de seguridad").located(By.id("cardCvv"));
    public static final Target MES_EXP = Target.the("selección mes de expiración de la tarjeta").located(By.id("expirationMonth"));
    public static final Target MES_EXP_TARJETA = Target.the("Mes de expiración de la tarjeta").located(By.xpath("//*[@id='expirationMonth']/option[8]"));
    public static final Target ANO_EXP = Target.the("Selección año de expiración de la tarjeta").located(By.id("expirationYear"));
    public static final Target ANO_EXP_TARJETA = Target.the("Año de expiración de la tarjeta").located(By.xpath("//*[@id='expirationYear']/option[4]"));
    public static final Target BTN_USAR_TARJETA = Target.the("Botón confirmar uso de tarjeta").located(By.xpath("//*[@id='fbra_checkoutPaymentOptions']/div/div/div[1]/div[3]/div/div[2]/section/div/div/form/div[6]/button"));
}
