# Web frontend testing project
## Introduction

This project is made as a final task for one of the courses called **Software testing methods and techniques** on Faculty of Electrical Engineering, Computer Science and Information Technology in Osijek. This project consists of 5 tests that are testing frontend of webpage of travel agency called "Arriva".

Tools used in project:
* **IntelliJ IDEA Community Edition** - *IDE for developing and testing computer software*
* **Selenium** - *portable framework for testing web applications*
* **TestNG** - *testing framework inspired from JUnit and NUnit; makes testing more powerful and easier*
* **Apache Maven** - *software project management and comprehension tool based on the concept of a project object model*
* **Ranorex Selocity** - *free extension for the Chrome DevTools that instantly provides unique and robust selectors for your web page*

## Set up PC before testing

We will have to install and configure some things for this project to work properly.

### Install "Google Chrome" and "Mozilla Firefox"

Because this project involves testing in Chrome and Firefox you have to download both in case you don't have them installed.
* [Download Chrome](https://www.google.com/chrome/)
* [Download Firefox](https://www.mozilla.org/en-US/firefox/new/)

### Install Ranorex Selocity 

We will use **Ranorex Selocity** to find our selectors for web elements which we want to interact with. 
Open **Chrome Web Store**, search for **Ranorex Selocity** and then add it to Chrome. You may also follow this [link](https://chrome.google.com/webstore/search/ranorex%20selocity?hl=hr). 
  
### Install Java JDK

Firstly, check if you already have installed Java JDK by following these instructions:
1. Open **Command Prompt**
2. Type in: `java -version`
Expected output: `java version "1.8.0_231"` if Java is already installed (version may differ)

If you don't have Java installed, download it from this [link](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html) and install it. This [link](https://www.swtestacademy.com/selenium-tutorial-java-junit/#install-java-jdk) might help you with installation process.

### Install RapidEE

We will use **RapidEE** application to easily manage environment variables. It can be downloaded from this [link](https://www.rapidee.com/en/download). Install it easily by clicking **Next** until it is not finished. 

### Install Apache Maven

Follow these instructions to install Maven properly:
1. Download **Binary zip archive** from this [link](https://maven.apache.org/download.cgi).
2. Copy downloaded zip archive and paste it under  "C:\Program Files" and then extract it.
3. Set JAVA_HOME environment variable by following next instructions:
   * Open **RapidEE** and click **Add new variable** button.
   * Write "JAVA_HOME" as a parameter **Variable name** and click **OK**.
   * Press **F7** and select the Java JDK path "C:\Program Files\Java\jdk1.8.0_60" and then click **OK** (version of jdk may differ)
   * Save the changed settings by clicking the save button
4. Add maven folder to PATH by following next instructions:
   * Select path variable: 
   
   ![image1](https://224926-685269-raikfcquaxqncofqfm.stackpathdns.com/wp-content/uploads/2015/09/rapidee-set-path-variable.jpg "Select path variable")
   
   * Click button **Add value to the current variable** 
   
   ![image2](https://224926-685269-raikfcquaxqncofqfm.stackpathdns.com/wp-content/uploads/2015/09/selenium-rapidee-add-variable.jpg "Add value to the current variable")
   
   * Copy and paste maven bin directory and press enter then click save button 
   
   ![image3](https://224926-685269-raikfcquaxqncofqfm.stackpathdns.com/wp-content/uploads/2015/09/selenium-rapidee-save.jpg "Copy and paste maven bin directory")
   
   * Check if maven installation is successfull
	   * Open **Command Prompt** and type in: `mvn -v`
	   * Expected output: `Apache Maven 3.6.2 ...` (version may differ)
	   
### Install IntelliJ IDEA

We will use IntelliJ to write our test automation code. Download it from this [link](https://www.jetbrains.com/idea/download/#section=windows) and install it by clicking **Next** until it is finished.

## Create and set up IntelliJ project before testing

### Create IntelliJ project

Follow these instructions to create IntelliJ project properly:
1. Open **IntelliJ** and click **Create New Project**

![image4](https://224926-685269-raikfcquaxqncofqfm.stackpathdns.com/wp-content/uploads/2015/09/intellij-download.jpg "create project")

2. Select **Maven** as the project type and browse the JAVA folder as "Project SDK"; click **Next**

![image5](https://224926-685269-raikfcquaxqncofqfm.stackpathdns.com/wp-content/uploads/2015/09/selenium-intellij-settings.jpg "select maven")

3. Fill GroupId and ArtifactId as you want then click **Next**

![image6](https://224926-685269-raikfcquaxqncofqfm.stackpathdns.com/wp-content/uploads/2015/09/intellij-maven-selenium.jpg "fill ids")

4. Give a name to your project and click **Finish**

![image7](https://224926-685269-raikfcquaxqncofqfm.stackpathdns.com/wp-content/uploads/2015/09/wedriver-intellij.jpg "name project")

5. When project is finally created you will see pop-up window and then click **Enable Auto-Import**

![image8](https://224926-685269-raikfcquaxqncofqfm.stackpathdns.com/wp-content/uploads/2015/09/intellij-selenium-webdriver.jpg "enable autoimport")

### Set up "pom.xml" file

In this file we will conigure dependencies which are needed for tests to run properly. You can simply open "pom.xml" file from this repository and copy its content to your "pom.xml" file.
* **Selenium Dependency** - *it is required to use the Selenium framework for browser automation in our project*
* **TestNG Dependency** - *is required to use TestNG framework (test runner in our project)*
* **Maven-surefire-plugin** - *it is used for configuration and running tests / configuration of TestNG.xml file*
* **Maven-compiler-plugin** - *it is used for code compiling and using special JDK version for compilation*
* **webdrivermanager** - *it allows to automate the management of the binary drivers (e.g. chromedriver, geckodriver,...) required by Selenium WebDriver*
* **slf4j-simple** - *serves as a simple facade or abstraction for various logging frameworks; allows the end-user to plug in the desired logging framework at deployment time*

### Create and set up "testng.xml" file

We will use this file to determine which test methods or classes we want to run. It is also possible to change some test parameters in this file (e.g. change browser).
Follow these instructions to create and configure "testng.xml" file properly:
1. Right click on root folder of project then click **New** and then click **File**

![image9](https://raw.githubusercontent.com/mstajnbrikner/projFrontendImages/master/createTestNg.jpg "testng")

2. Choose name "testng.xml" and click **Ok**

3. Open "testng.xml" file from this repository and copy its content into yours "testng.xml" file

### Create packages "test" and "pages"; create "*.java" files 

Do following for each package:
1. Locate `java` folder under `yourRootProjDirectory\src\test` and right click on it
2. Click **New** and then click **Package**
3. Choose name ("test"/"pages") and click **Ok**

Do following for each "*.java" file (look for packages in this repository under "src/test/java"):
1. Right click on package where you want to create **Java class**
2. Click **New** and then click **Java Class**
3. Choose name that corresponds to one in this repository
4. Copy and paste code from "*.java" file from this repository with same name as your file

## Testing

If everything is configured as it must be, tests will run properly. We can configure and run tests as it will be described below.

### Configuring tests through "testng.xml"

Originnaly, "testng.xml" is configured to run all 5 tests.
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">

<suite name="AllTestsSuite">
    <test name="selenium NG test">
        <parameter name="browserName" value="chrome"></parameter>
        <classes>
            <class name="test.ArrivaTripTest">
                <methods>
                    <include name="testMethod1"/>
                    <include name="testMethod2"/>
                    <include name="testMethod3"/>
                    <include name="testMethod4"/>
                    <include name="testMethod5"/>
                </methods>
            </class>
        </classes>
    </test>
</suite>
```

If you want, you can configure "testng.xml" as you want. For example, let's configure "testng.xml" to run only "testMethod4" and "testMethod5".
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">

<suite name="AllTestsSuite">
    <test name="selenium NG test">
        <parameter name="browserName" value="chrome"></parameter>
        <classes>
            <class name="test.ArrivaTripTest">
                <methods>
                    <!--include name="testMethod1"/>
                    <include name="testMethod2"/>
                    <include name="testMethod3"/-->
                    <include name="testMethod4"/>
                    <include name="testMethod5"/>
                </methods>
            </class>
        </classes>
    </test>
</suite>
```

Cross-browser testing is enabled in this project. It is possible to run tests on **Google Chrome** or **Mozilla Firefox**. Let's say we want to run tests on Firefox. We just need to change one parameter in "testng.xml". 
**Firefox:**
```xml
<parameter name="browserName" value="firefox"></parameter>
``` 

**Chrome:**
```xml
<parameter name="browserName" value="chrome"></parameter>
``` 

### Running test through "Command Prompt"

We will run our tests through "CMD" because then **surefire reports** will be created. Follow these instructions:
1. Open **Command Prompt** and locate your project's directory using `cd` command. 
2. Type in `mvn site`
3. Type in `mvn test`

Now you should see tests running in given browser if everything is well configured.








