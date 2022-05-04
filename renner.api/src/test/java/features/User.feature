Feature: Cenário para validar endpoit Users

  Scenario Outline: Validar o metodo POST
    Given faco uma requisicao POST no endpoint '/users'
      | name   | job   |
      | <name> | <job> |
    Then verifico o status code 201
    And verifico se o '<name>' e '<job>' apresenta corretamente

    Examples: 
      | name   | job      |
      | Danilo | Analista |

  Scenario Outline: Validar o metodo GET SINGLE USER
    Given faco uma requisicao GET no endpoint '/users/<id>'
    Then verifico o status code 200
    And verifico se o id <id> apresenta corretamente

    Examples: 
      | id |
      |  2 |

  Scenario Outline: Validar o metodo GET LIST USERS
    Given faco uma requisicao GET no endpoint '/users'
    Then verifico o status code 200
    And verifico se o total <total> apresenta corretamente

    Examples: 
      | total |
      |    12 |

  Scenario Outline: Validar o metodo PATCH
    Given faco uma requisicao PATCH no endpoint '/users/<id>'
      | name   | job   |
      | <name> | <job> |
    Then verifico o status code 200
    And verifico se o '<name>' e '<job>' apresenta corretamente

    Examples: 
      | name  | job    | id |
      | Pedro | atleta |  2 |
