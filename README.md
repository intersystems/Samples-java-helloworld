# Samples-java-helloworld
This is a simple hello world example to show a JDBC connection to InterSystems IRIS. For more information about using this sample, please see [documentation](https://irisdocs.intersystems.com/irislatest/csp/docbook/DocBook.UI.Page.cls?KEY=AB_idesetup).

## To run this code locally
1. Clone this repo
2. Open the repo in your favorite Java IDE (such as Eclipse, IntelliJ, or NetBeans)
3. Open Samples-java-helloworld/src/main/java/com/intersystems/samples/HelloWorld.java and verify ip, password, port, and username are right. Update as necessary.
4. Set up a classpath to intersystems-jdbc-3.2.0.jar
5. Run HelloWorld.java

## To run this code in InterSystems Learning Labs or Evaluator Edition (on AWS, GCP, or Azure)
1. Clone the `ry-iris` branch: `git clone -b try-iris https://github.com/intersystems/Samples-java-helloworld` 
3. For AWS, GCP, or Azure ONLY: Edit line 14 to change the ip to "try-iris" (Please skip this step if using InterSystems Learning Labs)
4. In the terminal window, move to the `Samples-java-helloworld` and type:  
	`javac -cp ".:intersystems-jdbc-3.2.0.jar" HelloWorld.java`  
	`java -cp ".:intersystems-jdbc-3.2.0.jar" HelloWorld`  
