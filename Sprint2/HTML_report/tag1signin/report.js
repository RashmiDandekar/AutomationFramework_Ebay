$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Buy.feature");
formatter.feature({
  "line": 2,
  "name": "Buy the products",
  "description": "",
  "id": "buy-the-products",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Buy"
    }
  ]
});
formatter.scenarioOutline({
  "line": 19,
  "name": "Writing the product name for buy",
  "description": "",
  "id": "buy-the-products;writing-the-product-name-for-buy",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User clicks on Buy option",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Print the title",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user \u003ctypeproduct\u003e in search box in Buy option",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "click on search Buy option",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Print the title",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Choose and select the product to buy",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Add to cart for buy",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Print the title",
  "keyword": "And "
});
formatter.examples({
  "line": 28,
  "name": "",
  "description": "",
  "id": "buy-the-products;writing-the-product-name-for-buy;",
  "rows": [
    {
      "cells": [
        "typeproduct"
      ],
      "line": 29,
      "id": "buy-the-products;writing-the-product-name-for-buy;;1"
    },
    {
      "cells": [
        "reebok bag"
      ],
      "line": 30,
      "id": "buy-the-products;writing-the-product-name-for-buy;;2"
    },
    {
      "cells": [
        "tupperware bottle"
      ],
      "line": 31,
      "id": "buy-the-products;writing-the-product-name-for-buy;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user should be on homepage of eBay website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_should_be_on_homepage_of_eBay_website()"
});
formatter.result({
<<<<<<< HEAD
  "duration": 51157669700,
=======
<<<<<<< HEAD
  "duration": 8324652300,
>>>>>>> branch 'master' of https://github.com/rashmidan/Sprint2
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_sign_in()"
});
formatter.result({
<<<<<<< HEAD
  "duration": 30352536800,
=======
  "duration": 23106326200,
=======
  "duration": 46751791300,
>>>>>>> branch 'master' of https://github.com/rashmidan/Sprint2
>>>>>>> branch 'master' of https://github.com/rashmidan/Sprint2
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Writing the product name for buy",
  "description": "",
  "id": "buy-the-products;writing-the-product-name-for-buy;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Buy"
    },
    {
      "line": 18,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User clicks on Buy option",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Print the title",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user reebok bag in search box in Buy option",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "click on search Buy option",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Print the title",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Choose and select the product to buy",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Add to cart for buy",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Print the title",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_buy_option()"
});
formatter.result({
  "duration": 11270745000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.print_the_title()"
});
formatter.result({
  "duration": 10676800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "reebok bag",
      "offset": 5
    }
  ],
  "location": "StepDefinition.user_in_search_box_in_buy_option(String)"
});
formatter.result({
  "duration": 225995800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_search_buy_option()"
});
formatter.result({
  "duration": 4658532100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.print_the_title()"
});
formatter.result({
  "duration": 11018400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.choose_and_select_the_product_to_buy()"
});
formatter.result({
  "duration": 9483950500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.add_to_cart_for_buy()"
});
formatter.result({
  "duration": 14851600100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.print_the_title()"
});
formatter.result({
  "duration": 1946330100,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user should be on homepage of eBay website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_should_be_on_homepage_of_eBay_website()"
});
formatter.result({
  "duration": 21768918500,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Writing the product name for buy",
  "description": "",
  "id": "buy-the-products;writing-the-product-name-for-buy;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Buy"
    },
    {
      "line": 18,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User clicks on Buy option",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Print the title",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user tupperware bottle in search box in Buy option",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "click on search Buy option",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Print the title",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Choose and select the product to buy",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Add to cart for buy",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Print the title",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_buy_option()"
});
formatter.result({
  "duration": 15229431400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.print_the_title()"
});
formatter.result({
  "duration": 11967300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tupperware bottle",
      "offset": 5
    }
  ],
  "location": "StepDefinition.user_in_search_box_in_buy_option(String)"
});
formatter.result({
  "duration": 276648100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_search_buy_option()"
});
formatter.result({
  "duration": 9142188200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.print_the_title()"
});
formatter.result({
  "duration": 10023100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.choose_and_select_the_product_to_buy()"
});
formatter.result({
  "duration": 18770537500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.add_to_cart_for_buy()"
});
formatter.result({
  "duration": 8714659100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.print_the_title()"
});
formatter.result({
  "duration": 4651376100,
  "status": "passed"
});
});