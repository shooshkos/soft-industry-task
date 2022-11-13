Feature: Search for products

  Scenario Outline: GET valid products
    When I call GET "<product>"
    Then I see response has 200 status code
    And I see the proper response body
    Examples:
      | product |
      | apple   |
      | mango   |
      | water   |
      | tofu    |

  Scenario Outline: GET invalid product
    When I call GET "<invalidValue>"
    Then I see response has 404 status code
    Examples:
      | invalidValue |
      | car   |
      | melon   |
      | rose   |
      | laptop    |

  Scenario: GET with an empty value
    When I call GET ""
    Then I see response has 401 status code

