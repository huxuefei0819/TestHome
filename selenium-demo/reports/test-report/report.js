$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sql.feature");
formatter.feature({
  "line": 1,
  "name": "login with username and password from mysql database",
  "description": "As a user of gmail\r\nI should be able to login",
  "id": "login-with-username-and-password-from-mysql-database",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "compose gmail with a file",
  "description": "",
  "id": "login-with-username-and-password-from-mysql-database;compose-gmail-with-a-file",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sql"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "google gmail page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "set up database connection",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "login with username and password from database",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see my login page",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleLoginSQLTest.google_gmail_page()"
});
formatter.result({
  "duration": 3265274098,
  "status": "passed"
});
formatter.match({
  "location": "GoogleLoginSQLTest.set_up_database_connection()"
});
formatter.result({
  "duration": 2530953,
  "status": "passed"
});
formatter.match({
  "location": "GoogleLoginSQLTest.login_with_username_and_password_from_database()"
});
formatter.result({
  "duration": 126576523,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: keys should be a string\n  (Session info: chrome\u003d40.0.2214.115)\n  (Driver info: chromedriver\u003d2.11.298604 (75ea2fdb5c87f133a8e1b8da16f6091fb7d5321e),platform\u003dWindows NT 6.3 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 41 milliseconds\nBuild info: version: \u00272.44.0\u0027, revision: \u002776d78cf\u0027, time: \u00272014-10-23 20:02:37\u0027\nSystem info: host: \u0027BKSQ2BNL6\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_31\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, chrome\u003d{userDataDir\u003dC:\\Users\\hux3\\AppData\\Local\\Temp\\scoped_dir12172_18625}, takesHeapSnapshot\u003dtrue, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d40.0.2214.115, platform\u003dWIN8_1, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 8d427ba486dded784b11d88778c4af04\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:408)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:268)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:89)\r\n\tat com.tdc.smoke.GoogleLoginSQLTest.login_with_username_and_password_from_database(GoogleLoginSQLTest.java:83)\r\n\tat ✽.When login with username and password from database(sql.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "GoogleLoginSQLTest.i_should_see_my_login_page()"
});
formatter.result({
  "status": "skipped"
});
});