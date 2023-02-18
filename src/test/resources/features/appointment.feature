Feature: Create an appointment

  Scenario: Schedule an appointment
    Given user credentials are in the page
    When user creates a new appointment
    Then the message Appointment Confirmation appears in the screen