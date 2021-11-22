package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import userinterface.PaginaAgregarAlCarrito;

public class AgregarAlCarrito implements Task{

    public static AgregarAlCarrito enPaginaPricipal() {
        return Tasks.instrumented(AgregarAlCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(PaginaAgregarAlCarrito.BTN_CERRAR_ANUNCIO), $$$Este era el problema, falabella retiró este anuncio de su página de selección de productos y mi automatización no lo omitió, para esto debí usar un validador si era visible el anuncio, sino lo omitiera$$$
                Click.on(PaginaAgregarAlCarrito.SELECCION_PRODUCTO),
                Click.on(PaginaAgregarAlCarrito.BTN_CERRAR_ANUNCIO),
                Click.on(PaginaAgregarAlCarrito.AGREGAR_CARRITO),
                Click.on(PaginaAgregarAlCarrito.VER_BOLSA_COMPRAS),
                Click.on(PaginaAgregarAlCarrito.HACER_COMPRA)
                );
    }
}
