Feature: Add new payment policy
  Scenario: Add payment policy to check intermediation percentage
    Given Daniel opens the PoliticasDePago view
    When Daniel adds "10" to Porcetaje Socio and "20" to  Porcentaje Impuestos
    Then Daniel sees "70" as the Porcentaje Intermediacion