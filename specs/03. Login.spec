Login Specification
===================
Project Name : iOS_Mobile_App_Test_Automation
Developer    : Osanda Deshan
Version      : 1.0.0
Date         : 9/16/17
Time         : 12:49 PM
Description  : This is an executable specification file which follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.


tags: login



Verify that the Login page contains the Create Account button
-------------------------------------------------------------
* Create Account button should be visible



Verify that an invalid user cannot login to the application
-----------------------------------------------------------
* Login page title is "Login"
* Set the username and the password
     |Username       |Password       |
     |---------------|---------------|
     |Osanda         |Password       |
* Tap on Sign In button
* Login error alert title is "Login Failed"
* Login error alert message is "Incorrect username or password!"
* Tap on Ok button in the login error alert



Clear username and password textbox contents
--------------------------------------------
* Clear text fields in Login page



Verify that previously logged user can login to the application without going through onboarding flow
-----------------------------------------------------------------------------------------------------
* Set the username and the password
     |Username       |Password       |
     |---------------|---------------|
     |osanda12       |Password1      |
* Tap on Sign In button
* User lands to the "Expert Decks" page



Verify that the user lands to the Expert Decks page after the login
-------------------------------------------------------------------
* User lands to the "Expert Decks" page



Verify that the user is having the Sample Expert Deck
-----------------------------------------------------
* "Test: Sample Expert Deck - Try It! by Pearson" expert deck should be visible