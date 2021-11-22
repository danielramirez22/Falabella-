package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.DatosPersonaPage.*;

public class AgregarDatosPersona implements Task {

    private String nombre;
    private String apellido;
    private String email;
    private String id;
    private String celular;

    public AgregarDatosPersona (String nombre, String apellido, String email, String id, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.id = id;
        this.celular = celular;
    }

    public static AgregarDatosPersona DatosPersona(String nombre, String apellido, String email, String id, String celular) {
        return Tasks.instrumented(AgregarDatosPersona.class, nombre, apellido, email, id, celular);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    WaitUntil.the(NOMBRE, isVisible()).forNoMoreThan(5).seconds(),
                    Click.on(NOMBRE),
                    Enter.theValue(nombre).into(NOMBRE),
                    Click.on(APELLIDO),
                    Enter.theValue(apellido).into(APELLIDO),
                    Click.on(EMAIL),
                    Enter.theValue(email).into(EMAIL),
                    Click.on(ID),
                    Enter.theValue(id).into(ID),
                    Click.on(CELULAR),
                    Enter.theValue(celular).into(CELULAR),
                    Click.on(BTN_TERMINOS_Y_CONDICIONES)
            );
    }
}
