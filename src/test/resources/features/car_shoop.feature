Feature: Car Shoop

  COMO usuario
  QUIERO añadir al carrito un Samsung galaxy s7,
  Samsung galaxy s6 y un Sony vaio i7.

  Scenario: Agregar item al carrito de compras

    Given que soy parte del sistema
    When agrego los items
    | Samsung galaxy s7 | phone  |
    | Samsung galaxy s6 | phone  |
    | Sony vaio i7      | laptop |
    Then deberia observar la lista de 3 items agregados