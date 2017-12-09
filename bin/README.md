# cucumber-maven-selenium
A simple project with the configuration to run automation with cucumber, maven and selenium on Eclipse
<br>
<br>

**Run the automation on Eclipse**

- Right click on your project's folder > Run As... > Run configurations... > Maven build
- Add Goals: test -Dcucumber.options="--tags @smoke"
- Run !

<br>

**Run the automation on CLI**

- Open the terminal on your project's folder
- Run the command:
mvn test -Dcucumber.options="--tags @smoke"

<br>

**Run the automation with Cucumber**

- Install the Cucumber plugin for Eclipse
- Right Click on the feature you want
- Run as > Cucumber feature
