$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/ContinueWithGoogle.feature");
formatter.feature({
  "line": 2,
  "name": "Continue with google",
  "description": "",
  "id": "continue-with-google",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Continue_with_google"
    }
  ]
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
  "duration": 75590273500,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Successful login with google",
  "description": "",
  "id": "continue-with-google;successful-login-with-google",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user clicks Sign in",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "sign in or register page will open",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks continue with google option",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_clicks_sign_in()"
});
formatter.result({
  "duration": 31191623200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.sign_in_or_register_page_will_open()"
});
formatter.result({
  "duration": 44946900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_continue_with_google_option()"
});
formatter.result({
  "duration": 352181300,
  "status": "passed"
});
formatter.after({
  "duration": 2122675200,
  "status": "passed"
});
formatter.uri("Features/Sell.feature");
formatter.feature({
  "line": 2,
  "name": "Sell",
  "description": "",
  "id": "sell",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Sell"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user should be on homepage of eBay website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_should_be_on_homepage_of_eBay_website()"
});
formatter.result({
  "duration": 18202426200,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Check Sell option is available",
  "description": "",
  "id": "sell;check-sell-option-is-available",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Sell option is available",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "print the text of sell option",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.sell_option_is_available()"
});
formatter.result({
  "duration": 64238300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.print_the_text_of_sell_option()"
});
formatter.result({
  "duration": 43165200,
  "status": "passed"
});
formatter.after({
  "duration": 1317260200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 11,
  "name": "Selecting the sell option",
  "description": "",
  "id": "sell;selecting-the-sell-option",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 12,
  "name": "user clicks sell option",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user click list an item",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user \u003ctypeproduct\u003e in Sell search box",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click go",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "click on sell one like this",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Print the title",
  "keyword": "And "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "sell;selecting-the-sell-option;",
  "rows": [
    {
      "cells": [
        "typeproduct"
      ],
      "line": 19,
      "id": "sell;selecting-the-sell-option;;1"
    },
    {
      "cells": [
        "laptop"
      ],
      "line": 20,
      "id": "sell;selecting-the-sell-option;;2"
    },
    {
      "cells": [
        "watches"
      ],
      "line": 21,
      "id": "sell;selecting-the-sell-option;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user should be on homepage of eBay website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_should_be_on_homepage_of_eBay_website()"
});
formatter.result({
  "duration": 16736168600,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Selecting the sell option",
  "description": "",
  "id": "sell;selecting-the-sell-option;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Sell"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user clicks sell option",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user click list an item",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user laptop in Sell search box",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click go",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "click on sell one like this",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Print the title",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_sell_option()"
});
formatter.result({
  "duration": 11053358300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_list_an_item()"
});
formatter.result({
  "duration": 7928962800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "laptop",
      "offset": 5
    }
  ],
  "location": "StepDefinition.user_in_sell_search_box(String)"
});
formatter.result({
  "duration": 1949036200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_go()"
});
formatter.result({
  "duration": 21102482500,
  "error_message": "org.openqa.selenium.WebDriverException: disconnected: Unable to receive message from renderer\n  (Session info: chrome\u003d87.0.4280.88)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-MIJ45EA\u0027, ip: \u0027192.168.43.230\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.9\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: C:\\Users\\SONY\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:54796}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 51d909b5af9207868985322459589a2c\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat Pages.ListAnItempage.clickgo(ListAnItempage.java:19)\r\n\tat StepDefinition.StepDefinition.click_go(StepDefinition.java:187)\r\n\tat ✽.Then click go(Features/Sell.feature:15)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.click_on_sell_one_like_this()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.print_the_title()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1651981000,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user should be on homepage of eBay website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_should_be_on_homepage_of_eBay_website()"
});
formatter.result({
  "duration": 178952132700,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Selecting the sell option",
  "description": "",
  "id": "sell;selecting-the-sell-option;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Sell"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user clicks sell option",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user click list an item",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user watches in Sell search box",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click go",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "click on sell one like this",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Print the title",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_sell_option()"
});
formatter.result({
  "duration": 4005652500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_list_an_item()"
});
formatter.result({
  "duration": 12033093200,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d87.0.4280.88)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-MIJ45EA\u0027, ip: \u0027192.168.43.230\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.9\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: C:\\Users\\SONY\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:54956}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: c72c433477ebba24a72181696bca5844\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"TOPINVITATION\"]/div/div/div[2]/a/span}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat Pages.Sellpage.list_an_item(Sellpage.java:17)\r\n\tat StepDefinition.StepDefinition.user_click_list_an_item(StepDefinition.java:101)\r\n\tat ✽.And user click list an item(Features/Sell.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "watches",
      "offset": 5
    }
  ],
  "location": "StepDefinition.user_in_sell_search_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.click_go()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.click_on_sell_one_like_this()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.print_the_title()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 6348272900,
  "status": "passed"
});
});