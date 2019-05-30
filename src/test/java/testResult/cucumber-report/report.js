$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PPlusComparison.feature");
formatter.feature({
  "line": 1,
  "name": "Login into Pregnancy Plus Application",
  "description": "",
  "id": "login-into-pregnancy-plus-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9203454103,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login using valid username and valid password and check daily text",
  "description": "",
  "id": "login-into-pregnancy-plus-application;login-using-valid-username-and-valid-password-and-check-daily-text;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@PPlus_daily"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Click On Login button",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter the User Name dev_qa@email.com",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter the Password 12345678",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on Continue Button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click on ok button",
  "keyword": "Then "
});
formatter.match({
  "location": "PPlusDaily.Click_On_Login_button()"
});
formatter.result({
  "duration": 6489620976,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dev_qa@email.com",
      "offset": 20
    }
  ],
  "location": "PPlusDaily.enterUserName(String)"
});
formatter.result({
  "duration": 8808945496,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345678",
      "offset": 19
    }
  ],
  "location": "PPlusDaily.enterPassword(String)"
});
formatter.result({
  "duration": 5855748713,
  "status": "passed"
});
formatter.match({
  "location": "PPlusDaily.clickOnContinueButton()"
});
formatter.result({
  "duration": 33794743333,
  "status": "passed"
});
formatter.match({
  "location": "PPlusDaily.clickOkButton()"
});
formatter.result({
  "duration": 3169649027,
  "status": "passed"
});
formatter.after({
  "duration": 1398882722,
  "status": "passed"
});
formatter.before({
  "duration": 8083403471,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Login using valid username and valid password and check daily text",
  "description": "",
  "id": "login-into-pregnancy-plus-application;login-using-valid-username-and-valid-password-and-check-daily-text;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@PPlus_daily"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "Click On Login button",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "Click on Ok Button",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Enter the User Name dev_qa@email.com",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Enter the Password 1234567",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Click on Continue Button",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Verify whether login successful or not",
  "keyword": "Then "
});
formatter.match({
  "location": "PPlusDaily.Click_On_Login_button()"
});
formatter.result({
  "duration": 5760724870,
  "status": "passed"
});
formatter.match({
  "location": "PPlusDaily.clickOnOkButton()"
});
formatter.result({
  "duration": 30471054940,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dev_qa@email.com",
      "offset": 20
    }
  ],
  "location": "PPlusDaily.enterUserName(String)"
});
formatter.result({
  "duration": 7180213361,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234567",
      "offset": 19
    }
  ],
  "location": "PPlusDaily.enterPassword(String)"
});
formatter.result({
  "duration": 6211011854,
  "status": "passed"
});
formatter.match({
  "location": "PPlusDaily.clickOnContinueButton()"
});
formatter.result({
  "duration": 34248449802,
  "status": "passed"
});
formatter.match({
  "location": "PPlusDaily.verifyLoginSuccessful()"
});
formatter.result({
  "duration": 1679684,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.face.stepDefinitions.PPlusDaily.verifyLoginSuccessful(PPlusDaily.java:68)\r\n\tat ✽.Then Verify whether login successful or not(PPlusComparison.feature:24)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 4543575318,
  "status": "passed"
});
});