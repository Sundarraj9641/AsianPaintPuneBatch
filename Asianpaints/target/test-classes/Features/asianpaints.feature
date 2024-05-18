Feature: Homedecor Functionality
This will help us to test Homedecor functionality of AsianPaints application
@tag1
Scenario: View Homedecor
Given user is on Homedecor page 
When user clicks on sofas 
Then it should redirect to the sofas
And user should view the specific sofas
Then user is on Amritsar
Then user clicks on findstore
#NegativeScenario
@tag2
Scenario: Open Storage and Wardrobes
Given user is on Homedecor Page
And user clicks on Storage and Wardrobes
When user clicks on recommended Wardrobes
And  user is on SelectCity
Then user chooses one city
And user clicks on findstore
Then Book a visit 
And  user will try to write name
Then Submit the details
@tag3
Scenario Outline: Wallpapers
Given user is on Homedecor page
When user is on Wallpaper website select one design
And user can redirect to designer collection
Then user clicks on any design
Then  write "pincode"
And user clicks on check
And click on Add To Cart
Examples:
|Pincode|
|411001|
|411007|
|411007|
@tag4
#Positive Scenario
Scenario: Open Storage and Wardrobes
Given user is on Homedecor page
And user clicks on Storage and Wardrobes
When user clicks on recommended Wardrobes
And  user is on SelectCity
Then user chooses onecity
And user clicks on findstore
Then Book a visit 
And  user will try to write name
Then Submit the details








