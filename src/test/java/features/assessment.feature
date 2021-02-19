Feature: Automate web application for shopping and update personal information journeys

@WebTest
Scenario Outline: Order TShirt and Verify in Order History
Given User is on the Login page
And User logs in to the application with <Username> and password <password>
And User selects TShirt
And User does checkout
#When User login in to application with <Username> and password <password>
#Then Home page is populated
#And Cards displayed are "true"
Examples:
| Username                   | password             |
| prasanna.sdet@gmail.com    | dummySiteTest4564    |


#@WebTest
#Scenario : Update Personal Information in My Account
#Given User is on NetBanking landing page
#When User login in to application with <Username> and password <password>
#Then Home page is populated
#And Cards displayed are "true"


