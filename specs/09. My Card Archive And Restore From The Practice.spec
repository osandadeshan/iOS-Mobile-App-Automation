My Card Archive And Restore From The Practice Specification
===========================================================
Project Name : iOS_Mobile_App_Test_Automation
Developer    : Osanda Deshan
Version      : 1.0.0
Date         : 9/20/18
Time         : 12:23 PM
Description  : This is an executable specification file which follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.



Verify that a user can practice a my deck
-----------------------------------------
* On My Decks page
* On Practice page of "Test deck3" my deck
* Page title is "1/3"
* Question title is "What is MaxSoft?"
* Tap on question "What is MaxSoft?" to see the answer
* Answer is "Open source test automation frameworks development company"
* Set answer as correct
* Tap close button on the practice session

* Tap on "Practice More" button
* Page title is "1/3"
* Question title is "What is Gauge Framework?"
* Tap on question "What is Gauge Framework?" to see the answer
* Answer is "The best BDD Automation Framework"
* Set answer as correct
* Tap close button on the practice session

* Tap on "Practice More" button
* Page title is "1/3"
* Question title is "What is the best BDD Framework?"
* Tap on question "What is the best BDD Framework?" to see the answer
* Answer is "Gauge"
* Set answer as correct
* Tap close button on the practice session
* Tap close button on the practice summary



Archive a card on the practice session
--------------------------------------
* On Practice page of "Test deck3" my deck
* Check "What is MaxSoft?" is visible on the page
* Tap on Option button on the practice session
* Tap on "Archive Card" button
* Page title is "1/2"
* Check "What is Gauge Framework?" is visible on the page
* Tap close button on the practice session
* Tap close button on the practice summary



Verify that the archived card is not available on the practice session
----------------------------------------------------------------------
* On Practice page of "Test deck3" my deck
* Page title is "1/2"
* Check "What is MaxSoft?" is not visible on the page
* Swipe the device screen horizontally right to left
* Page title is "2/2"
* Check "What is MaxSoft?" is not visible on the page