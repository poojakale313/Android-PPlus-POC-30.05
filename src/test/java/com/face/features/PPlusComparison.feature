Feature: Login into Pregnancy Plus Application 
@PPlus_daily
Scenario Outline: Login using valid username and valid password and check daily text

	Given Click On Login button 
	Then Enter the User Name <username>
	Then Enter the Password <password>
	Then Click on Continue Button
	Then Click on ok button

	Examples: 
		|username	            | password |                                                    
		|dev_qa@email.com       | 12345678 |
		

@PPlus_daily
Scenario Outline: Login using valid username and valid password and check daily text

	Given Click On Login button 
	Then Click on Ok Button
	Then Enter the User Name <username>
	Then Enter the Password <password>
	Then Click on Continue Button
	Then Verify whether login successful or not

	Examples: 
		|username	            | password |                                                    
		|dev_qa@email.com       | 1234567  |
		