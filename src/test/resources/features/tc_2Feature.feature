Feature: Verificar contenido de la hoja

  Scenario: Comparar el contenido mostrado con la especificación
    Given el usuario está en la página de la hoja
    When el usuario revisa el contenido mostrado
    Then el contenido debe coincidir con lo especificado