# language: en
Feature: Compra de productos

  Yo como usuario
  necesito realizar el proceso de compra
  para completar una compra de productos exitosa

  @CompraProductos
  Scenario Outline: Realizar proceso de compra en portal saucedemo
    Given 'El usuario' inicia sesion en saucedemo
    When agrega los productos <primerProducto> y <segundoProducto> al carrito
    And visualiza los productos en el carrito
    And completa el formulario de compra
    Then finaliza la compra exitosamente

    Examples:
      | primerProducto        | segundoProducto       |
      | "Sauce Labs Backpack" | "Sauce Labs Bike Light" |


