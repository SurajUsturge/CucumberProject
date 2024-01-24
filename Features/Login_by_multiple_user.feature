	Feature: orange Hrm
Scenario Outline: Launch orangehrm successfull
    Given user enter orange url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When user enter "<username>" and "<password>"
    Then user should successfully access page

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Admin    |   				|
      |          | admin123 |
      | Admin    | admin123 |