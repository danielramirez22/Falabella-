package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.DatosDireccionPage.*;
import static userinterface.DatosTarjetaPage.OPCION_PAGO;

public class AgregarDireccion implements Task {

    private String direccion;
    private String tipoVivienda;

    public AgregarDireccion (String direccion, String tipoVivienda) {
        this.direccion = direccion;
        this.tipoVivienda = tipoVivienda;
    }

    public static AgregarDireccion DatosAdicionales(String direccion, String tipoVivienda) {
        return Tasks.instrumented(AgregarDireccion.class, direccion, tipoVivienda);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DEPARTAMENTO),
                Click.on(DEPT_RDA),
                WaitUntil.the(CIUDAD, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CIUDAD),
                Click.on(CIUDAD_DOSQ),
                WaitUntil.the(BARRIO, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BARRIO),
                Click.on(BARRIO_DOSQ),
                Click.on(BTN_CONTINUAR),
                Click.on(DIRECCION),
                Enter.theValue(direccion).into(DIRECCION),
                Click.on(TIPO_VIVIENDA),
                Enter.theValue(tipoVivienda).into(TIPO_VIVIENDA),
                Click.on(BTN_INGRESAR_DIRECCION),
                Click.on(BTN_CONTINUAR2),
                WaitUntil.the(OPCION_PAGO, isVisible()).forNoMoreThan(5).seconds()
        );
    }
}
