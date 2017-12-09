# cucumber-maven-selenium
A simple project with the configuration to run automation with cucumber, maven and selenium on Eclipse
<br>
<br>

*Windows Users*
You will need to update the chromedriver's file name in the ChromeManager.class. You just need to add .exe after the ".../chromedriver".


**Eclipse

- Right click on your project's folder > Run As... > Run configurations... > Maven build
- Add Goals: clean test
- Run !

<br>

**CLI

- Open the terminal on your project's folder
- Run the command:
mvn clean test
