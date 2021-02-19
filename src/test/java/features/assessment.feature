Feature: Automate web application for shopping and update personal information journeys

@WebTest
Scenario Outline: Order TShirt and Verify in Order History
Given User is on the Login page
And User logs in to the application with <Username> and password <password>
And User selects TShirt
When User does checkout
Then verify order history

Examples:
| Username                   | password             |
| prasanna.sdet@gmail.com    | dummySiteTest4564    |


