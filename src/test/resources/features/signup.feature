Feature: SignUp

  Para crear mi cuenta de usuario
  COMO usuario
  QUIERO ser capaz de darme de alta (Sign Up) en la Tienda Online

  Scenario: Registrar nuevo usuario en el sistema

    Given dado que yo quiero registrarme en el sistema
    When ingreso usuario y contraseña
    Then debería ver el mensaje 'Sign up successful.'
