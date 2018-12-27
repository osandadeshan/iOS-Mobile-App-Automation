My Card Archive And Restore From The Card List Specification
============================================================
Project Name : iOS_Mobile_App_Test_Automation
Developer    : Osanda Deshan
Version      : 1.0.0
Date         : 9/3/18
Time         : 2:21 PM
Description  : This is an executable specification file which follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.



Verify that a user can cancel the card archive process from the card list
-------------------------------------------------------------------------
* On Card list page of "Test deck2" my deck
* Tap Option button in "What is the best BDD Framework?" card
* Tap on "Cancel" button
* "What is the best BDD Framework?" Card should be visible



Verify that a user can archive a card from the card list
--------------------------------------------------------
* On Card list page of "Test deck2" my deck
* Tap Option button in "What is the best BDD Framework?" card
* Tap on "Archive Card" button
* "What is the best BDD Framework?" Card should not be visible



Verify that a user can see the archived card from the archived filter
---------------------------------------------------------------------
* Tap on "lastModified" button
* Tap on "Archived cards"
* Tap on "Apply" button
* "What is the best BDD Framework?" Card should be visible



Verify that a user can unarchive a card from the card list
----------------------------------------------------------
* Tap Option button in "What is the best BDD Framework?" card
* Tap on "Unarchive" button
* "What is the best BDD Framework?" Card should not be visible



Verify that a user can see the unarchived card from the archived filter
-----------------------------------------------------------------------
* Tap on "lastModified" button
* Tap on "Archived cards"
* Tap on "Apply" button
* "What is the best BDD Framework?" Card should be visible



Verify that a user can archive two cards from the card list
-----------------------------------------------------------
* On Card list page of "Test deck3" my deck
* Tap Option button in "What is the best BDD Framework?" card
* Tap on "Archive Card" button
* "What is the best BDD Framework?" Card should not be visible
* Tap Option button in "What is Gauge Framework?" card
* Tap on "Archive Card" button
* "What is Gauge Framework?" Card should not be visible



Verify that a user can see the archived cards from the archived filter
----------------------------------------------------------------------
* Tap on "lastModified" button
* Tap on "Archived cards"
* Tap on "Apply" button
* "What is the best BDD Framework?" Card should be visible
* "What is Gauge Framework?" Card should be visible



Verify that a user can unarchive cards from the card list
---------------------------------------------------------
* Tap Option button in "What is the best BDD Framework?" card
* Tap on "Unarchive" button
* "What is the best BDD Framework?" Card should not be visible
* Tap Option button in "What is Gauge Framework?" card
* Tap on "Unarchive" button
* "What is Gauge Framework?" Card should not be visible



Verify that a user can see the unarchived cards from the archived filter
------------------------------------------------------------------------
* Tap on "lastModified" button
* Tap on "Archived cards"
* Tap on "Apply" button
* "What is the best BDD Framework?" Card should be visible
* "What is Gauge Framework?" Card should be visible



                                                                                                                                                           Verify that a user can cancel the card archive process from the card view
-------------------------------------------------------------------------
* On Card list page of "Test deck2" my deck
* Tap on "What is the best BDD Framework?" card
* Question prompt is "What is the best BDD Framework?"
* Answer is "Gauge"
* Tap option button on the card preview
* Tap on "Cancel" button
* Tap close button on the card preview
* "What is the best BDD Framework?" Card should be visible



Verify that a user can archive a card from the card view
--------------------------------------------------------
* On Card list page of "Test deck2" my deck
* Tap on "What is the best BDD Framework?" card
* Question prompt is "What is the best BDD Framework?"
* Answer is "Gauge"
* Page title is "1/1"
* Tap option button on the card preview
* Tap on "Archive Card" button
* "What is the best BDD Framework?" Card should not be visible



Verify that a user can see the archived card from the archived filter which archived in card view
-------------------------------------------------------------------------------------------------
* Tap on "lastModified" button
* Tap on "Archived cards"
* Tap on "Apply" button
* "What is the best BDD Framework?" Card should be visible



Verify that a user can unarchive a card from the card list which archived in card view
--------------------------------------------------------------------------------------
* Tap Option button in "What is the best BDD Framework?" card
* Tap on "Unarchive" button
* "What is the best BDD Framework?" Card should not be visible



Verify that a user can see the unarchived card from the archived filter which archived in card view
---------------------------------------------------------------------------------------------------
* Tap on "lastModified" button
* Tap on "Archived cards"
* Tap on "Apply" button
* "What is the best BDD Framework?" Card should be visible



Verify that a user can archive two cards from the card list which archived in card view
---------------------------------------------------------------------------------------
* On Card list page of "Test deck3" my deck
* Tap on "What is the best BDD Framework?" card
* Question prompt is "What is the best BDD Framework?"
* Answer is "Gauge"
* Page title is "3/3"
* Tap option button on the card preview
* Tap on "Archive Card" button
* "What is the best BDD Framework?" Card should not be visible
* Page title is "2/2"
* Question prompt is "What is Gauge Framework?"
* Answer is "The best BDD Automation Framework"
* Tap option button on the card preview
* Tap on "Archive Card" button
* "What is Gauge Framework?" Card should not be visible
* Page title is "1/1"
* Question prompt is "What is MaxSoft?"
* Answer is "Open source test automation frameworks development company"
* Tap close button on the card preview



Verify that a user can see the archived cards from the archived filter which archived in card view
--------------------------------------------------------------------------------------------------
* Tap on "lastModified" button
* Tap on "Archived cards"
* Tap on "Apply" button
* "What is Gauge Framework?" Card should be visible
* "What is the best BDD Framework?" Card should be visible



Verify that a user can unarchive cards from the card list which archived in card view
-------------------------------------------------------------------------------------
* Tap Option button in "What is the best BDD Framework?" card
* Tap on "Unarchive" button
* "What is the best BDD Framework?" Card should not be visible
* Tap Option button in "What is Gauge Framework?" card
* Tap on "Unarchive" button
* "What is Gauge Framework?" Card should not be visible



Verify that a user can see the unarchived cards from the archived filter which archived in card view
----------------------------------------------------------------------------------------------------
* Tap on "lastModified" button
* Tap on "Archived cards"
* Tap on "Apply" button
* "What is the best BDD Framework?" Card should be visible
* "What is Gauge Framework?" Card should be visible
* "What is MaxSoft?" Card should be visible



//Archive Test deck2
//------------------
//* Archive "Test deck2" my deck
//* "Test deck2" my deck should not be visible



//Archive Test deck3
//------------------
//* Archive "Test deck3" my deck
//* "Test deck3" my deck should not be visible