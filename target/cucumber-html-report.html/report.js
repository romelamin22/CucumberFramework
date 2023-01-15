$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Tags/tags.feature");
formatter.feature({
  "name": "To test the tag",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "First Scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "we add tags",
  "keyword": "Given "
});
formatter.match({
  "location": "tags.step_def.TagsTestSteps.we_add_tags()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "added properly",
  "keyword": "When "
});
formatter.match({
  "location": "tags.step_def.TagsTestSteps.added_properly()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "it works",
  "keyword": "Then "
});
formatter.match({
  "location": "tags.step_def.TagsTestSteps.it_works()"
});
formatter.result({
  "status": "passed"
});
});