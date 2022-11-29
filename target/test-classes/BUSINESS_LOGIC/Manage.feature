Feature:Manage Address functionality

Background:user successfully clicked on login page
When user provide "webdriver.chrome.driver" and exe location as "D:\\Automation Support\\chromedriver.exe"
When user provide url as "https://flipkart.com/"
When user cancle initial login page
When user navigate on Login
When user click on My profile
When user enter "9370462129" as username
When user enter "9921741725"as password
When user click on Login button

Scenario:Manage Address functionality with valid username and valid password
When user click on Manage Address
When user click on ADD A NEW  ADDRESS
When user enter name as "Shubhangi"
When user enter "9370462129"as mobile no.
When user enter pincode 412210
When user enter locallity "BaburaoNagar"
When user enter Address as "1169,Utkarsh building ,Shirur"
When user click on  Home button
When user click on save
