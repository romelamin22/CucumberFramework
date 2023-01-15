Feature: Test login functionality of automation.scaledupit.com

  #hello this is a comment

  Background:
    Given user opens up the browser and navigates to automation
    And click on login link

  Scenario Outline: Check login function with valid credentials

      And enters valid "<username>" in username field
      And enters valid "<password>" in password field
      And clicks on login button
      Then user is navigated to my account page

    Examples:
      | username | password |
      | test     | abcd123  |

  Scenario Outline: Check login function with invalid credentials

      And enters invalid "<username>" in username field
      And enters invalid "<password>" in password field
      And clicks on login button
      Then user sees an error message

    Examples:
      | username | password |
      | xyz      | asdfasf  |
      | werw     | uuuipp   |
      | sdfsad   | 9048509  |

