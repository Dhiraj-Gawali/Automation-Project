Feature: Login Feature of Swag Labs

  Scenario Outline: Verify the login functionality is working
    Given Browser is Open
    And user is on Swag Labs Log in page
    When user enters the <username> and <password>
    And user taps on submit button
    Then user navigated to home Page of Swag Labs

    Examples: 
      | username        | password     |
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |
      | problem_user    | secret_sauce |
      #| performance_glitch_user | secret_sauce |
