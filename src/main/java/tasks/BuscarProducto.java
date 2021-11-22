package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import userinterface.FalabellaPaginaPrincipal;


public class BuscarProducto implements Task{

    private String nombreProducto;
    private FalabellaPaginaPrincipal falabellaPaginaPrincipal;
    public BuscarProducto(String nombreProducto) {

        this.nombreProducto = nombreProducto;
    }



    public static BuscarProducto enPaginaPricipal(String nombreProducto) {
        return Tasks.instrumented(BuscarProducto.class, nombreProducto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(falabellaPaginaPrincipal.AVISO),
                Click.on(falabellaPaginaPrincipal.INPUT_PRODUCTO),
                Enter.theValue(nombreProducto).into(falabellaPaginaPrincipal.INPUT_PRODUCTO).thenHit(Keys.ENTER)
        );
    }
}
