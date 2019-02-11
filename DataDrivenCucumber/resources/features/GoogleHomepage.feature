Feature: Login Action

Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User User enters UserName Password  
	And User Enters "<PlanNumber>"
	Then Message displayed Login Successfully
	And User LogOut from the Application
	And Message displayed LogOut Successfully

Examples:
    | PlanNumber  |
    | 325285 | 
    |000015|


	

	
