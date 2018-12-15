$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/CucumberSecondPartOfHW3.Feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: ninamishchenko31@gmail.com"
    }
  ],
  "line": 2,
  "name": "Scenario output",
  "description": "",
  "id": "scenario-output",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Sign up to the FreeCRM",
  "description": "",
  "id": "scenario-output;sign-up-to-the-freecrm",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I open my browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Navigate to FreeCRM and click sign in",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I provide following details",
  "rows": [
    {
      "cells": [
        "Edition",
        "FirstName",
        "LastName",
        "Email",
        "ConfirmEmail",
        "UserName",
        "Password",
        "ConfirmPassword"
      ],
      "line": 8
    },
    {
      "cells": [
        "Free Edition",
        "Damir",
        "Kuanbayev",
        "damir@gmail.com",
        "damir@gmail.com",
        "Damir777",
        "1234567",
        "1234567"
      ],
      "line": 9
    },
    {
      "cells": [
        "Free Edition",
        "Arina",
        "Cherry",
        "Chey@gmail.com",
        "Chey@gmail.com",
        "Cherry23",
        "12345678",
        "12345678"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click  agree conditions and submit",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I on company page I provide folloving details",
  "rows": [
    {
      "cells": [
        "Company",
        "Phone"
      ],
      "line": 13
    },
    {
      "cells": [
        "Syntax",
        "hhhhhhhh"
      ],
      "line": 14
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "i click continue and complete registration",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I close my browser",
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
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});