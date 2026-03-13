Feature: Automation practice home page
Background:Given User lauches browser 
 
Scenario: fill form details
Given User open automation practice page
When User enters name "Meenu"
And User enters email "meenu@gmail.com"
And user enters phone '9677875643'
And user enters address "1/34,kk pudhur,tirupur"
And user select gender as "Male"
And user select gender as "Female"
Then user verifies the entered details


 
 And  User selects day as Monday
 And User selects day as Wednesday
 Then Days should be selected successfully
 

 When user selects country as "India"
 Then country should be selected successfully
 
 When user selects multiplecolors Red and Green
 Then colors should be selected successfully
 
 When user selects multipleanimals
 Then Animals selected successfully
 
 When user enters date in datepicker1 "05/02/2026"
 And  user enters date in datepicker2 "13/03/2026"
 Then user selected dates successfully
 
 When user selects start date "05/02/2026"
 And users selects end date "05/03/2026"
 And User clicks submit
 Then user selected dates range successfully
 
 When user upload single file "D:\\User Panel 360\\beauty&spa.xlsx"
 And user upload multiple file "D:\\picture demo\\2nn.png","D:\\User Panel 360\\beauty&spa.xlsx"
 Then file uploaded successfully
 
 
 When user gets table row count
 And user gets table column count
 Then table deatils show correctly
 
 When user gets disk value for "Firefox"
 And user gets memory value for "System"
 Then Dynamic table value display correctly
 
 When user selects checkbox for product "Tablet"
 And user gets price of product "Laptop"
 Then details displayed successfully
 
 When user enter section1 as "Complete workflow"
 And user enter submit1 button
 And user enter section2 as "One of the parah"
 And user enter submit2 button
 And user enter section3 as "Related to article"
 And user enter submit3 button
 Then Entered details visible clearly
 
 When user enters search text "gmail"
 And User click search button
 And user select the first result
 
 
  
When User click start button
And User click simplealert button
 
And User click Confirmalert button
And user click promptalert button
And user enters name in alert
And user click new tab button
And user click popup window button


When User perform mouse hover
And User select Mobile option
And User performs double click
And user performs drag and drop
Then verify actions executed

When user moves the slider
And user clicks Scrolling DropDown link
And display circle icon
And display square icon

And user verify Samsung label
And labels should be displayed
And user verify RealMe label
And labels should be displayed
And user verify Moto label
Then labels should be displayed

When user clicks Apple link
And user should navigate to Apple page
And  user clicks Lenovo link
And user should navigate to Lenovo page
And  user clicks Dell link
And user should navigate to Dell page
And respective laptop page should open
And user scroll to visitors section
Then user capture visitor count

When user verify broken links
Then broken link displays all the details

When user clicks home in footer
And user clicks Hidden Elements & AJAX footer link
And user enters "hello" in Input Box 1
And user enters "world" in Input Box 2
And user checks Checkbox 1
And user checks Checkbox 2
And user toggles Input Box 2
And user toggles Checkbox 2
And user clicks Load AJAX Content
Then status should be ready

When user clicks download in footer
And user enter text "Automation Testing"
And user click generate text file
And user download text file
And user click generate pdf file
And user download pdf file
And user download pdf using browser
Then user return back to home page
Then All the link working fine
	


 
 