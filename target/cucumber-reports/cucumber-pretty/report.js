$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login/Flight_Booking.feature");
formatter.feature({
  "line": 1,
  "name": "As a customer I should be able to book flight and get a valid confirmation Id",
  "description": "",
  "id": "as-a-customer-i-should-be-able-to-book-flight-and-get-a-valid-confirmation-id",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5973768700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Checking the flight confirmation functionality of the website",
  "description": "",
  "id": "as-a-customer-i-should-be-able-to-book-flight-and-get-a-valid-confirmation-id;checking-the-flight-confirmation-functionality-of-the-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on the home page \"http://blazedemo.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I see Welcome to the Simple Travel Ageny! on homePage",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I see Choose your departure city and Choose your destination city on page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I select \"departure\" city as \"Paris\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I select \"destination\" city as \"Rome\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I Click on find flights",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I am navigated to the \"reserve\" page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I choose a flight",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I am navigated to the \"purchase\" page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter the details and click on purchase flight",
  "rows": [
    {
      "cells": [
        "jenny",
        "1234 new york",
        "new york",
        "New York",
        "10001",
        "1234567890123456",
        "jenny"
      ],
      "line": 14
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I am navigated to the \"confirmation\" page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should be seeing confirmation id field as not null",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://blazedemo.com/",
      "offset": 23
    }
  ],
  "location": "loginLogoutPageStepDefinitions.i_am_on_the_homePage(String)"
});
formatter.result({
  "duration": 2532054900,
  "status": "passed"
});
formatter.match({
  "location": "loginLogoutPageStepDefinitions.i_see_something_onHomePage()"
});
formatter.result({
  "duration": 54754600,
  "status": "passed"
});
formatter.match({
  "location": "loginLogoutPageStepDefinitions.i_see_choose_departureand_destinationCity()"
});
formatter.result({
  "duration": 68126100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "departure",
      "offset": 10
    },
    {
      "val": "Paris",
      "offset": 30
    }
  ],
  "location": "loginLogoutPageStepDefinitions.i_select_departure_and_destinationCity(String,String)"
});
formatter.result({
  "duration": 110687100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "destination",
      "offset": 10
    },
    {
      "val": "Rome",
      "offset": 32
    }
  ],
  "location": "loginLogoutPageStepDefinitions.i_select_departure_and_destinationCity(String,String)"
});
formatter.result({
  "duration": 135552800,
  "status": "passed"
});
formatter.match({
  "location": "loginLogoutPageStepDefinitions.i_clickon_find_flights()"
});
formatter.result({
  "duration": 1135369200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "reserve",
      "offset": 23
    }
  ],
  "location": "loginLogoutPageStepDefinitions.i_am_navigated_to_correct_url(String)"
});
formatter.result({
  "duration": 12839800,
  "status": "passed"
});
formatter.match({
  "location": "loginLogoutPageStepDefinitions.i_choose_aflight()"
});
formatter.result({
  "duration": 716719000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "purchase",
      "offset": 23
    }
  ],
  "location": "loginLogoutPageStepDefinitions.i_am_navigated_to_correct_url(String)"
});
formatter.result({
  "duration": 12244400,
  "status": "passed"
});
formatter.match({
  "location": "loginLogoutPageStepDefinitions.i_enterdetails_and_click_onPurchaseflight(DataTable)"
});
formatter.result({
  "duration": 1232920400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "confirmation",
      "offset": 23
    }
  ],
  "location": "loginLogoutPageStepDefinitions.i_am_navigated_to_correct_url(String)"
});
formatter.result({
  "duration": 9909100,
  "status": "passed"
});
formatter.match({
  "location": "loginLogoutPageStepDefinitions.i_check_ifconfirmationID_is_generated()"
});
formatter.result({
  "duration": 62768800,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1685862300,
  "status": "passed"
});
});