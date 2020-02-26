Feature: To validate facebook login functionality

  Scenario Outline: to verify login with invalid credentials
    Given user is on facebook login page
    When use enters the "<username>"  and "<password>"
    Then user click login button

    Examples: 
      | username | password |
      | prad     |      123 |
      | ranj     |      987 |
      | dhar     |      654 |

  Scenario: to verify sign up page
    Given user is on facebook login page
    When user enter the first name
    Then user click sign up button
