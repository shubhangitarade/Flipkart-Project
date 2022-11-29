Feature:Login functionality


Background:user successfully clicked on login page
When user provide "webdriver.chrome.driver" and exe location as "D:\\Automation Support\\chromedriver.exe"
When user provide url as "https://flipkart.com/"
When user cancle initial login page

@smokeTest
Scenario:Login functionality with valid username and valid password
When user navigate on Login
When user click on My profile
When user enter 9370462129 as username
When user enter 9921741725 as password
When user click on Login button
Then application shows user profile to user

















