Feature: JBK offline application

Scenario outline: loginTest

Given User should be on login page# pre-requisites
When User enters valid credentials# action to be perform
Then User will be on Home page# output

Scenario outline: JBK logo test

Given User should be on login page
then User should see JBK logo