# Samples-java-helloworld
This is a simple hello world example to show a JDBC connection to InterSystems IRIS. For more information about using this sample, please see [documentation](https://irisdocs.intersystems.com/irislatest/csp/docbook/DocBook.UI.Page.cls?KEY=AB_idesetup).

## To run this code in InterSystems Learning Labs, AWS, GCP, or Azure
1. Open Samples-java-helloworld/Simple/HelloWorld.java
2. Comment out line 4 (we won't need the package declaration here)
3. Edit line 14 to change the ip to "try-iris"
4. In the terminal window type:  
	`cd Samples-java-helloworld/simple`  
	`javac -cp ".:intersystems-jdbc-3.0.0.jar" HelloWorld.java`  
	`java -cp ".:intersystems-jdbc-3.0.0.jar" HelloWorld`  

## To run this code locally
1. Clone this repo
2. Open the repo in your favorite Java IDE (such as Eclipse, IntelliJ, or NetBeans)
3. Open Samples-java-helloworld/simple/HelloWorld.java and verify ip, password, port, and username are right. Update as necessary.
4. Set up a classpath to intersystems-jdbc-3.0.0.jar
5. Run HelloWorld.java