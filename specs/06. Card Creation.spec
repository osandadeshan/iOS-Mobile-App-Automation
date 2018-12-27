Card Creation Specification
===========================
Project Name : iOS_Mobile_App_Test_Automation
Developer    : Osanda Deshan
Version      : 1.0.0
Date         : 8/28/18
Time         : 11:13 AM
Description  : This is an executable specification file which follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.



Verify that the alert box is visible for the card creation flow
---------------------------------------------------------------
* On Card list page of "Test deck2" my deck
* Tap on "Create new card" button
* Create card alert title should be visible
* Create card alert title is "Card Create"
* Create card alert description is " You can upload class notes and other files to auto-create flashcards. Accepts .docx Google Drive files."



Verify that a user can navigate to create card page
---------------------------------------------------
* Tap on "New Card" button
* Confidence Card page title is "Create Card"



Verify that a user can create a card by providing the question and the answer
-----------------------------------------------------------------------------
* Set question as "What is the best BDD Framework?"
* Tap on "Back" button
* Set answer as "Gauge"
* Tap on "Save" button
* "What is the best BDD Framework?" Card should be visible



Verify that a user cannot create card by providing only the question
--------------------------------------------------------------------
* Tap on "Create new card" button
* Tap on "New Card" button
* Set question as "What is the best BDD Framework?"
* Tap on "Save" button
* Alert title is "Error"
* Alert description is "Answer can't be empty!"
* Tap on "OK" button
* Tap on "Cancel" button



Verify that a user cannot create card by providing only the answer
------------------------------------------------------------------
* Tap on "Create new card" button
* Tap on "New Card" button
* Tap on "Back" button
* Set answer as "Gauge"
* Tap on "Save" button
* Alert title is "Error"
* Alert description is "Question can't be empty!"
* Tap on "OK" button
* Tap on "Cancel" button



Verify that a user can create few cards by providing the question and the answer
--------------------------------------------------------------------------------
* Create "Test deck3" my deck
* On Card list page of "Test deck3" my deck
* Tap on "Create new card" button
* Tap on "New Card" button
* Set question as "What is the best BDD Framework?"
* Tap on "Back" button
* Set answer as "Gauge"
* Tap on "Save" button
* "What is the best BDD Framework?" Card should be visible

* Tap on "Create new card" button
* Tap on "New Card" button
* Set question as "What is Gauge Framework?"
* Tap on "Back" button
* Set answer as "The best BDD Automation Framework"
* Tap on "Save" button
* "What is Gauge Framework?" Card should be visible

* Tap on "Create new card" button
* Tap on "New Card" button
* Set question as "What is MaxSoft?"
* Tap on "Back" button
* Set answer as "Open source test automation frameworks development company"
* Tap on "Save" button
* "What is MaxSoft?" Card should be visible