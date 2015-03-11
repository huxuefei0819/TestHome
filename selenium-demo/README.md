Description
==========================================================================================================

This is an example project wherein the different test types (smoke, regression) are split out into different Java packages.  Using the Maven Surefire plugin & JUnit, we can pick and choose which tests to run, given that they have been correctly tagged/annotated to be run using a Maven profile id defined in the topmost level pom.xml.  

Note: A lot of this example is 'stubbed out'.  You'll notice that there is no src/main directory, all of the 'tests' written will always pass (assertTrue(true)), and most of the XML files contain only a declaration tag.  The intent of the project is to try to explain the plumbing behind splitting up tests into logical sections and running them with Maven

How To's
==========================================================================================================

To read a test resource (e.g. an XML file) into a test for consumption
-----------------------------------------------------------------------------------------------------------------------
See com.tdc.regression.ContactInfoRegressionTest

To add a new testing category (e.g. Unit Tests)
-----------------------------------------------------------------------------------------------------------------------
1) Create a new package in src/test/java, this is where all test files will go
2) Write & place your unit tests in this package
3) In the com.tdc.groups package, create an interface similar to RegressionTests.java
   a) Be sure to annotate your tests from 2) with the correct interface name
4) In pom.xml, create a new profile for maven surefire plugin for the new testing category
   a) Be sure to change the profile id, group for the interface, and default filename

To build using Maven
-----------------------------------------------------------------------------------------------------------------------
1) In the project explorer in Eclipse, right click on the Maven project, select Run As->Maven Build...
   a) If you've already run/defined the build you wish to run, you may select Run As->Maven Build (w/o the ...) and select from the list presented
2) Select a name at the top for this configuration to find easier later on
3) Under goals, type test 
4) Under profiles, select the profile you wish to run (this corresponds to the profile id tag in pom.xml)
5) If there are additional parameters (e.g. a designated, non default filename) add the correct variable name/value
   a) For this example, we'd add testDataFilename as the var name and the value could be any file that we have in test/resources

Example Configurations
-----------------------------------------------------------------------------------------------------------------------
These are the configurations that we ran thru on 2/23
1) Smoke Testing
   Name: SmokeTests (Note: this is not dependent on anything, can be whatever you want)
   Goals: test
   Profiles: smokeTests (Note: this DOES depend on the id of the profile in pom.xml)
   
2) Regression Testing
   Name: RegressionTests (Note: this is not dependent on anything, can be whatever you want)
   Goals: test
   Profiles: regressionTests (Note: this DOES depend on the id of the profile in pom.xml)
   
3) Regression Testing w/Special File Name
   Name: RegressionTests with some file (Note: this is not dependent on anything, can be whatever you want)
   Goals: test
   Profiles: regressionTests (Note: this DOES depend on the id of the profile in pom.xml) 
   Variable: testDataFilename      |      Value: specialTestDataFile.xml 
   

Additional Resources
-----------------------------------------------------------------------------------------------------------------------
http://maven.apache.org/
http://www.hascode.com/2012/12/running-categorized-tests-using-junit-maven-and-annotated-test-suites/
http://www.petrikainulainen.net/programming/maven/integration-testing-with-maven/
http://blog.stchedroff.com/2012/10/29/10/
http://www.mkyong.com/java/java-read-a-file-from-resources-folder/