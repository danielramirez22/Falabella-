@Regresion
Feature: Comprar producto
  Yo como cliente de la tienda online de falabella
  Quiero elegir un producto
  Para comprar y pagar lo seleccionado.

  @compraFalabella
  Scenario Outline: Seleccionar y pagar producto
    Given ir a la pagina de falabella <url>
    When Selecciona el producto e ingresa a la bolsa de compras <producto>
    And Ingresa los datos de la direccion <direccion> y <tipoVivienda>
    And Ingresa los datos tarjeta <nombreTitular>, <numeroTarjeta>, <cvv> y <fechaExp>
    And Ingresa los datos personales <nombre>, <apellido>, <email>, <id> y <celular>
    Then Valida que el sistema muestre el siguiente texto

    Examples:
      | url                                    | producto  | direccion      | tipoVivienda      | nombreTitular       | numeroTarjeta    | cvv | fechaExp | nombre   | apellido     | email                      | id         | celular    |
      |http://www.falabella.com.co/falabella-co| iPhone XR | Cra 1bis 36-08 | Casa segundo piso | Daniel L Ramirez    | 4174832929313821 | 803 | 07-23    | Daniel L | Ramirez      | danielleonardo04@gmail.com | 1088334389 | 3113013546 |


