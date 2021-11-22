package userinterface;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaAgregarAlCarrito extends PageObject{
    public static Target SELECCION_PRODUCTO = Target.the("Panel de selección de producto").located(By.id("testId-pod-prices-prod10900024"));
    public static Target AGREGAR_CARRITO = Target.the("Clic al botón que permitirá agregar el producto al carrito").located(By.xpath("//BUTTON[@type='button'][text()='Agregar a la Bolsa']"));
    public static Target VER_BOLSA_COMPRAS = Target.the("Ir a la bolsa de compras").located(By.xpath("//*[@id='linkButton']"));
    public static Target HACER_COMPRA = Target.the("Clic al botón para continuar con la compra").located(By.xpath("//BUTTON[@class='fb-btn fb-btn-primary fb-btn-icon fb-order-status__continue-purchase js-fb-continue-purchase']"));
    public static Target BTN_CERRAR_ANUNCIO = Target.the("Cerrar anuncio de falabella").located(By.className("dy-lb-close"));
}