package Falabella.stepdefinitions;

import tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class ComprarProductoStepDefinitions {

    @Before
    public void setup() {
        setTheStage(new OnlineCast());
    }

    @Given("ir a la pagina de falabella (.*)$")
    public void irALaPaginaDeFalabellaUrl(String url) {
        OnStage.theActorCalled("Daniel").wasAbleTo(Open.url(url));
    }

    @When("^Selecciona el producto e ingresa a la bolsa de compras (.*)$")
    public void seleccionaElProductoEIngresaALaBolsaDeComprasProducto(String producto) {
       OnStage.theActorInTheSpotlight().attemptsTo(BuscarProducto.enPaginaPricipal(producto));
       OnStage.theActorInTheSpotlight().attemptsTo(AgregarAlCarrito.enPaginaPricipal());
    }

    @And("^Ingresa los datos de la direccion (.*) y (.*)$")
    public void ingresaLosDatosDeLaDireccionDireccionYTipoVivienda(String direccion, String tipoVivienda) {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarDireccion.DatosAdicionales(direccion, tipoVivienda));
    }

    @When("^Ingresa los datos tarjeta (.*), (.*), (.*) y (.*)$")
    public void ingresaLosDatosTarjeta(String nombreTitular, String numeroTarjeta, String cvv, String fechaExp) {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarTarjeta.DatosTarjeta(nombreTitular, numeroTarjeta, cvv, fechaExp));
    }

    @When("^Ingresa los datos personales (.*), (.*), (.*), (.*) y (.*)$")
    public void ingresaLosDatosPersonales(String nombre, String apellido, String email, String id, String celular) {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarDatosPersona.DatosPersona(nombre, apellido, email, id, celular));
    }

    @Then("^Valida que el sistema muestre el siguiente texto$")
    public void validaQueElSistemaMuestreElSiguienteTextoTexto() {
    }

}
