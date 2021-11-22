package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.DatosTarjetaPage.*;

public class AgregarTarjeta implements Task {

    private String nombreTitular;
    private String numeroTarjeta;
    private String cvv;
    private String fechaExp;

    public AgregarTarjeta (String nombreTitular, String numeroTarjeta, String cvv, String fechaExp) {
        this.nombreTitular = nombreTitular;
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
        this.fechaExp = fechaExp;
    }

    public static AgregarTarjeta DatosTarjeta(String nombreTitular, String numeroTarjeta, String cvv, String fechaExp) {
    return Tasks.instrumented(AgregarTarjeta.class, nombreTitular, numeroTarjeta, cvv,fechaExp);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    //WaitUntil.the(OPCION_PAGO, isVisible()).forNoMoreThan(5).seconds(),
                    Click.on(OPCION_PAGO),
                    Click.on(BTN_CONTINUAR_PAGO),
                    Click.on(NOMBRE_TARJETA),
                    Enter.theValue(nombreTitular).into(NOMBRE_TARJETA),
                    Click.on(NUMERO_TARJETA),
                    Enter.theValue(numeroTarjeta).into(NUMERO_TARJETA),
                    Click.on(CVV),
                    Enter.theValue(cvv).into(CVV),
                    Click.on(MES_EXP),
                    Click.on(MES_EXP_TARJETA),
                    Click.on(ANO_EXP),
                    Click.on(ANO_EXP_TARJETA),
                    Click.on(BTN_USAR_TARJETA)
            );
    }
}
