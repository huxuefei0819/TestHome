$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("compose.feature");
formatter.feature({
  "line": 1,
  "name": "add file when compose a email",
  "description": "As a user of gmail\r\nI should be able to add file when composing a email",
  "id": "add-file-when-compose-a-email",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "compose gmail with a file",
  "description": "",
  "id": "add-file-when-compose-a-email;compose-gmail-with-a-file",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@compose"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I login gmail by using username \"goldenkeytest\" and password \"goldenkeytest222\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click COMPOSE and click Attch files button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I add a local file",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click send",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I am able to see an error message",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "goldenkeytest",
      "offset": 33
    },
    {
      "val": "goldenkeytest222",
      "offset": 62
    }
  ],
  "location": "GoogleComposeAlertTest.i_login_gmail_by_using_username_and_password(String,String)"
});
formatter.result({
  "duration": 6164035611,
  "status": "passed"
});
formatter.match({
  "location": "GoogleComposeAlertTest.i_click_COMPOSE()"
});
formatter.result({
  "duration": 2228493935,
  "status": "passed"
});
formatter.match({
  "location": "GoogleComposeAlertTest.i_click_Attach_files_to_add_a_local_file()"
});
formatter.result({
  "duration": 8309142676,
  "status": "passed"
});
formatter.match({
  "location": "GoogleComposeAlertTest.i_click_send()"
});
formatter.result({
  "duration": 97642770,
  "status": "passed"
});
formatter.match({
  "location": "GoogleComposeAlertTest.i_am_able_to_see_an_error_message()"
});
formatter.result({
  "duration": 1938264599,
  "status": "passed"
});
});