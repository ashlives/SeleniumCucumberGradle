# Created by Lenovo G50-70 at 02-08-2017
Feature: Using Contact Form
 To test the functionality of contact form

 Background:
  Given I am on Home Page of "http://room5.trivago.com/"
  And I click OK on Cookies Popup
  And I click on Contact in Footer

  Scenario Outline: Filling contact form
   And I enter message as "<message>"
   And I enter full name as "<fullname>"
   And I enter email as "<email>"
   And I click on Submit button
   Then I see success message
   Examples:
   |message|fullname|email|
   |just some gibberish message|Ashish Deshmukh|ashish@deshmukh.com|
   | |Ashish Deshmukh|ashish@deshmukh.com|
   |just some givverish message| |ashish@deshmukh.com|
   |just some gibberish message|Ashish Deshmukh| |