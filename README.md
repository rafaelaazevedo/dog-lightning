# cucumber-maven-selenium
A simple project with the configuration to run automation with cucumber, maven and selenium on Eclipse


***Run the automation on Eclipse***

- Right click on your project's folder > Rua As... > Run configurations... > Maven build
- Add Goals: test -Dcucumber.options="--tags @smoke"
- Run !


***Run the automation on CLI***

- Open the terminal on your project's folder
- Run the command:
mvn test -Dcucumber.options="--tags @smoke"


***Run the automation with Cucumber***

- Install the Cucumber plugin for Eclipse
- Right Click on the feature you want
- Run as > Cucumber feature
