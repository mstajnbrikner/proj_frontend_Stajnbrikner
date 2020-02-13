# Web frontend testing project
## Introduction

This project is made as a final task for one of the courses called **Software testing methods and techniques** on Faculty of Electrical Engineering, Computer Science and Information Technology. This project consists of 5 tests that are testing frontend of webpage of travel agency called "Arriva".

Tools used in project:
* IntelliJ IDEA Community Edition - *IDE for developing and testing computer software*
* Selenium - *portable framework for testing web applications*
* TestNG - *testing framework inspired from JUnit and NUnit; makes testing more powerful and easier*
* Apache Maven - *software project management and comprehension tool based on the concept of a project object model*
* Ranorex Selocity - *free extension for the Chrome DevTools that instantly provides unique and robust selectors for your web page*

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


















