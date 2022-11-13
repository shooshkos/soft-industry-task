Feature: Search for products

  Scenario Outline: Make GET request with valid products
    When I call GET "<product>"
    Then I see response has 200 status code
    And I see the proper response body
    Examples:
      | product |
      | apple   |
      | mango   |
      | water   |
      | tofu    |

  Scenario Outline: Make GET request with invalid product
    When I call GET "<invalidProduct>"
    Then I see response has 404 status code
    Examples:
      | invalidProduct |
      | car            |
      | melon          |
      | rose           |
      | laptop         |

  Scenario: Make GET request with an empty value
    When I call GET ""
    Then I see response has 401 status code

  Scenario: Make POST request to the endpoint
    When I call POST method on my endpoint
    Then I see response has 405 status code