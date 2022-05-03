Feature: Cenário para validar endpoit Users

  Scenario Outline: Validar o metodo POST
    Given faco uma requisicao 'POST' no endpoint '/users'
    And passo como parameters '<name>' e '<job>'
    Then verifico o status code '201'
    And verifico se o '<name>' e '<job>' apresenta corretamente

    Examples: 
      | name   | job      |
      | Danilo | Analista |

  Scenario Outline: Validar o metodo GET SINGLE USER
    Given faco uma requisicao 'GET' no endpoint '/users/<id>'
    Then verifico o status code '200'
    And verifico se o id '<id>' apresenta corretamente

    Examples: 
      | id |
      |  2 |

  Scenario: Validar o metodo GET LIST USERS

  Scenario: Validar o metodo PATCH
