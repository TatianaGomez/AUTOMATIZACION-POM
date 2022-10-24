#Autor: Tatiana Alexandra Gomez Urrego
    #languaje: es

@HistoriaDeUsuario

Feature: Verify login session for colorlib page

  @CasoAutenticacion

  Scenario:Verify correct entry
    Given I enter with my credentials
    When I proceed with the authentication
    And go to the main view of the page
    And enter submenu
    And Check the title of the form on the screen
    And fill out information
    And clic button Validate
    Then successful response or wrong answer






