$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Valid Login",
  "description": "",
  "id": "loginfeature;valid-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I navihate to the FreeCrm",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I enter \"Nina__\" and \"odimeg23\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.i_open_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.i_navihate_to_the_FreeCrm()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "LoginStep.i_click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.i_successfully_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 12,
  "name": "Invalid login",
  "description": "",
  "id": "loginfeature;invalid-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I navihate to the FreeCrm",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter \"Nina\" and \"odimeg23\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I unsuccessfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.i_open_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.i_navihate_to_the_FreeCrm()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "LoginStep.i_click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.i_unsuccessfully_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 20,
  "name": "Test login with invalid password",
  "description": "",
  "id": "loginfeature;test-login-with-invalid-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "I open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I navihate to the FreeCrm",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I enter \"Ni\" and \"odi\"",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I should see an error text",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I close browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.i_open_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.i_navihate_to_the_FreeCrm()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "LoginStep.i_click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.i_should_see_an_error_text()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.i_close_browser()"
});
formatter.result({
  "status": "skipped"
});
});