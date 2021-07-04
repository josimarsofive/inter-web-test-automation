@Sprint15
Feature: Login into the application

  @Charles @Automatable @HappyPath @C001
  Scenario Outline: Request life insurance information
    Given charles has an active account
    When he sends "<document>" "<phone>" "<email>" their valid credentials

    Examples:

    |document|phone|email|
    |46713761|959134676|jchcuevacarbajal@gmail.com|
    |46713761|959134676|jchcuevacarbajal@gmail.com|
    |46713761|959134676|jchcuevacarbajal@gmail.com|


 @Charles @Automatable @HappyPath @C002
  Scenario Outline: Request life insurance information unsuccessful
    Given charles has an active account
    When he sends "<document>" "<phone>" "<email>" their valid credentials
    Then he should have acces "<message>" denied

    Examples:

      |document|phone|email|message|
      #|46713761|959134676|jchcuevacarbajal@gmail.com|Uno o más campos tienen un error. Por favor revisa e inténtalo de nuevo.|
      |46713761|959134676|                          |Uno o más campos tienen un error. Por favor revisa e inténtalo de nuevo.El campo es obligatorio.|
      |46713761|         |jchcuevacarbajal@gmail.com|Uno o más campos tienen un error. Por favor revisa e inténtalo de nuevo.|


  @Charles @Manual @AlternativePath @C003
  Scenario Outline: Request life insurance information unsuccessful manual
    Given charles has an active account
    When he sends "<document>" "<phone>" "<email>" their valid credentials
    Then he should have acces "<message>" denied

    Examples:

      |document|phone|email|message|
      #|46713761|959134676|jchcuevacarbajal@gmail.com|Uno o más campos tienen un error. Por favor revisa e inténtalo de nuevo.|
      |46713761|959134676|                          |Uno o más campos tienen un error. Por favor revisa e inténtalo de nuevo.El campo es obligatorio.|
      |46713761|         |jchcuevacarbajal@gmail.com|Uno o más campos tienen un error. Por favor revisa e inténtalo de nuevo.|



