Feature: Place Order

  COMO usuario
  QUIERO realizar el pedido de los artículos
  seleccionados

  Scenario: Generar orden de compra

    Given que soy parte del sistema
    When agrego los items
      | Samsung galaxy s7 | phone  |
      | Samsung galaxy s6 | phone  |
      | Sony vaio i7      | laptop |
    And voy a cart menu
    And hago click en place order
    And lleno el formulario con 'anakin skywalker', 'Tatooine', 'Sector Arkanis', 'ABCD 123 456 789'
    And hago click en Purchase
    Then deberia observar el ticket con Amount '1950 USD', Card Number 'ABCD 123 456 789' y Name 'anakin skywalker'
