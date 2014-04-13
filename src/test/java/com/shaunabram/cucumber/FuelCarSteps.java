package com.shaunabram.cucumber;

import com.shaunabram.cucumber.Car;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FuelCarSteps {
    private Car car;

    @Given("^a car with (\\d*) litres of fuel in the tank$")
    public void createCar(int initialFuelLevel) {
        car = new Car(initialFuelLevel);
    }

    @When("^you fill it with (\\d*) litres of fuel$")
    public void addFuel(int addedFuel) {
        car.addFuel(addedFuel);
    }

    @Then("^the tank contains (\\d*) litres$")
    public void checkBalance(int expectedFuelLevel) {
        int actualFuelLevel = car.getFuelLevel();
        assertThat(actualFuelLevel, is(expectedFuelLevel));
    }
}
