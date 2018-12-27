Expert Card Archive And Restore From The Card List Specification
================================================================
Project Name : iOS_Mobile_App_Test_Automation
Developer    : Osanda Deshan
Version      : 1.0.0
Date         : 9/3/18
Time         : 2:21 PM
Description  : This is an executable specification file which follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.



Verify that a user can cancel the card archive process from the card list
-------------------------------------------------------------------------
* On Card list page of the sample expert deck
* Tap Option button in "True or False: I can create my own decks and cards in the My Decks tab." card
* Tap on "Cancel" button
* "True or False: I can create my own decks and cards in the My Decks tab." Card should be visible



Verify that a user can archive a card from the card list
--------------------------------------------------------
* On Card list page of the sample expert deck
* Tap Option button in "True or False: I can create my own decks and cards in the My Decks tab." card
* Tap on "Archive Card" button
* "True or False: I can create my own decks and cards in the My Decks tab." Card should not be visible



Verify that a user can see the archived card from the archived filter
---------------------------------------------------------------------
* Tap on "lastModified" button
* Tap on "Archived cards"
* Tap on "Apply" button
* "True or False: I can create my own decks and cards in the My Decks tab." Card should be visible



Verify that a user can unarchive a card from the card list
----------------------------------------------------------
* Tap Option button in "True or False: I can create my own decks and cards in the My Decks tab." card
* Tap on "Unarchive" button
* "True or False: I can create my own decks and cards in the My Decks tab." Card should not be visible



Verify that a user can see the unarchived card from the archived filter
-----------------------------------------------------------------------
* Tap on "lastModified" button
* Tap on "Archived cards"
* Tap on "Apply" button
* "True or False: I can create my own decks and cards in the My Decks tab." Card should be visible



Verify that a user can archive two cards from the card list
-----------------------------------------------------------
* On Card list page of the sample expert deck
* Tap Option button in "True or False: I can create my own decks and cards in the My Decks tab." card
* Tap on "Archive Card" button
* "True or False: I can create my own decks and cards in the My Decks tab." Card should not be visible
* Tap Option button in "True or False: I can practice anytime, anywhere, even if my device is offline." card
* Tap on "Archive Card" button
* "True or False: I can practice anytime, anywhere, even if my device is offline." Card should not be visible



Verify that a user can see the archived cards from the archived filter
----------------------------------------------------------------------
* Tap on "lastModified" button
* Tap on "Archived cards"
* Tap on "Apply" button
* "True or False: I can create my own decks and cards in the My Decks tab." Card should be visible
* "True or False: I can practice anytime, anywhere, even if my device is offline." Card should be visible



Verify that a user can unarchive cards from the card list
---------------------------------------------------------
* Tap Option button in "True or False: I can create my own decks and cards in the My Decks tab." card
* Tap on "Unarchive" button
* "True or False: I can create my own decks and cards in the My Decks tab." Card should not be visible
* Tap Option button in "True or False: I can practice anytime, anywhere, even if my device is offline." card
* Tap on "Unarchive" button
* "True or False: I can practice anytime, anywhere, even if my device is offline." Card should not be visible



Verify that a user can see the unarchived cards from the archived filter
------------------------------------------------------------------------
* Tap on "lastModified" button
* Tap on "Archived cards"
* Tap on "Apply" button
* "True or False: I can create my own decks and cards in the My Decks tab." Card should be visible
* "True or False: I can practice anytime, anywhere, even if my device is offline." Card should be visible



Verify that a user can cancel the card archive process from the card view
-------------------------------------------------------------------------
* On Card list page of the sample expert deck
* Tap on "True or False: I can copy Expert Decks to any My Deck I create, so that everything I need to study is together in one place." card
* Question prompt is "True or False: I can copy Expert Decks to any My Deck I create, so that everything I need to study is together in one place."
* Tap option button on the card preview
* Tap on "Cancel" button
* Tap close button on the card preview
* "True or False: I can copy Expert Decks to any My Deck I create, so that everything I need to study is together in one place." Card should be visible



Verify that a user can archive two cards from the card list which archived in card view
---------------------------------------------------------------------------------------
* On Card list page of the sample expert deck
* Tap on "True or False: I can copy Expert Decks to any My Deck I create, so that everything I need to study is together in one place." card
* Question prompt is "True or False: I can copy Expert Decks to any My Deck I create, so that everything I need to study is together in one place."
* Page title is "2/7"
* Tap option button on the card preview
* Tap on "Archive Card" button
* "True or False: I can copy Expert Decks to any My Deck I create, so that everything I need to study is together in one place." Card should not be visible
* Page title is "2/6"
* Question prompt is "True or False: I can create my own decks and cards in the My Decks tab."
* Tap option button on the card preview
* Tap on "Archive Card" button
* "True or False: I can create my own decks and cards in the My Decks tab." Card should not be visible
* Page title is "2/5"
* Question prompt is "True or False: I can practice anytime, anywhere, even if my device is offline."
* Tap close button on the card preview



Verify that a user can see the archived cards from the archived filter which archived in card view
--------------------------------------------------------------------------------------------------
* Tap on "lastModified" button
* Tap on "Archived cards"
* Tap on "Apply" button
* "True or False: I can copy Expert Decks to any My Deck I create, so that everything I need to study is together in one place." Card should be visible
* "True or False: I can create my own decks and cards in the My Decks tab." Card should be visible



Verify that a user can unarchive cards from the card list which archived in card view
-------------------------------------------------------------------------------------
* Tap Option button in "True or False: I can copy Expert Decks to any My Deck I create, so that everything I need to study is together in one place." card
* Tap on "Unarchive" button
* "True or False: I can copy Expert Decks to any My Deck I create, so that everything I need to study is together in one place." Card should not be visible
* Tap Option button in "True or False: I can create my own decks and cards in the My Decks tab." card
* Tap on "Unarchive" button
* "True or False: I can create my own decks and cards in the My Decks tab." Card should not be visible



Verify that a user can see the unarchived cards from the archived filter which archived in card view
----------------------------------------------------------------------------------------------------
* Tap on "lastModified" button
* Tap on "Archived cards"
* Tap on "Apply" button
* "True or False: I can create my own decks and cards in the My Decks tab." Card should be visible
* "True or False: I can copy Expert Decks to any My Deck I create, so that everything I need to study is together in one place." Card should be visible
* "Rich contents available" Card should be visible
* "True or False: I can practice anytime, anywhere, even if my device is offline." Card should be visible
* "True or False: Pearson Prep can auto-create flashcards from my class notes." Card should be visible
* "True or False: Pearson Prep has pre-made Expert Flashcards available for me to study." Card should be visible
* "True or False: Pearson Prep adapts to me, so I see more of the cards I still don't know in practice." Card should be visible