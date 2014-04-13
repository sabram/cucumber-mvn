Feature: Daily car maintenance
  Cars need maintenance

  Scenario: Fuelling from empty
    Given a car with 0 litres of fuel in the tank
    When you fill it with 10 litres of fuel
    Then the tank contains 10 litres

  Scenario: Fuelling
    Given a car with 10 litres of fuel in the tank
    When you fill it with 50 litres of fuel
    Then the tank contains 60 litres
