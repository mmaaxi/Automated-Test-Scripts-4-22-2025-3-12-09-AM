Feature: Test de Login

  Scenario: Usuario ingresa credenciales correctas
    Given el navegador está abierto en la página de login
    When ingreso el nombre de usuario "usuario"
    And ingreso la contraseña "contraseña"
    Then debería poder iniciar sesión correctamente