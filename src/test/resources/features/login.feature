Feature: Login

  Para acceder mi cuenta de usuario en la tienda
  COMO usuario registrado
  QUIERO ser capaz de autenticarme en la Tienda Online

  @login
  Scenario: Acceso de un usuario existente al sistema

    Given dado que yo quiero entrar al sistema
    When ingreso mis credenciales
    Then debería ver la página principal
