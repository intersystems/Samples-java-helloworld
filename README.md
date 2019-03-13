# Samples-java-helloworld
Simple hello world code to show a Java connection to InterSystems IRIS

## To run this code in provided Theia IDE
  
Edit Samples-java-helloworld/Simple/HelloWorld.java:  
1. comment out line 4 as we won't need the package declaration
2. edit line 14 to change the ip to "try-iris"
In the terminal window type:  
`cd Samples-java-helloworld/Simple`  
`javac -cp ".:intersystems-jdbc-3.0.0.jar" HelloWorld.java`  
`java -cp ".:intersystems-jdbc-3.0.0.jar" HelloWorld`  
