Feature: Login into Sauce Demo website

  Scenario Outline: Login with valid credentials
    Given user visits the website
    When user enters valid username "<username>" and password "<password>"
    Then user enters into website dashboard
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |

  Scenario Outline: Login with invalid credentials
    Given user visits the website
    When user enters valid username "<username>" and password "<password>"
    Then user cannot enter into website dashboard with invalid credentials
    Examples:
      | username         | password     |
      | standard_user    | secretsauce  |
      | problem_use      | secret_sauce |
      | performance_user | secret_sauce |