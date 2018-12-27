Create My Deck Specification
============================
Project Name : iOS_Mobile_App_Test_Automation
Developer    : Osanda Deshan
Version      : 1.0.0
Date         : 8/20/18
Time         : 12:49 PM
Description  : This is an executable specification file which follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.


tags: create_deck



* On My Decks page



Verify that the user can navigate to the Create My Deck page
------------------------------------------------------------
* Tap on "Create new deck" button
* Page title is "Deck Info"
* Cancel the deck creation



Verify that the user can cancel the my deck creation
----------------------------------------------------
* Tap on "Create new deck" button
* Page title is "Deck Info"
* Set the deck title as "Test deck cancel"
* Toggle is "Deactive" (Active or Deactive)
* Set the exam date "December" "26" "2018" (Month Date Year)
* Toggle is "Active" (Active or Deactive)
* Tap on exam reminder frequency type picker
* Set exam reminder frequency type picker as "5 days before exam"
* Set exam reminder time "7" "34" "AM" (Hour Minute AM/PM)
* Cancel the deck creation
* Check "Test deck cancel" is not visible on the page



Verify that the user can create a my deck with all details
----------------------------------------------------------
* Create "Test deck1" my deck with the exam date of "December" "26" "2018" and the reminder time as "7" "34" "AM" to remind "5 days before exam"
* Scroll to the text of "Test deck1"



Verify that the user can create a my deck only using the title
--------------------------------------------------------------
* Create "Test deck2" my deck
* Scroll to the text of "Test deck2"



Archive Test deck1
------------------
* Tap on Options button of "Test deck1" deck
* Tap on "Archive Deck" button
* "Test deck1" my deck should not be visible