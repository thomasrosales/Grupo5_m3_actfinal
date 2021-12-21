Feature: Navigation

  COMO usuario
  QUIERO ser capaz de navegar por los diferentes tipos de productos
  y ver (Teléfonos, ordenadores y Pantallas).

  Scenario: Ver la lista de telefonos

    Given que soy parte del sistema
    When hago click en telefonos
    Then deberia obserbar una lista de telefonos: '7', entre ellos 'Samsung galaxy s6'


  Scenario: Ver la lista de ordenadores

    Given que soy parte del sistema
    When hago click en ordenadores
    Then deberia obserbar una lista de ordenadores: '6', entre ellos 'Sony vaio i5'


  Scenario: Ver la lista de pantallas

    Given que soy parte del sistema
    When hago click en pantallas
    Then deberia obserbar una lista de pantallas: '2', entre ellos 'Apple monitor 24'
