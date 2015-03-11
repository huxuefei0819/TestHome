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
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});