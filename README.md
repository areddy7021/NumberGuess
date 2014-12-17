Programme which accepts the guessing parameters from the users to find out or compute the actual guessing number of the user. Maven enabled project.

Purpose : Find out the actual guess number of the user based on the inputs of the user.

Maximum Number of guesses : 10

Type of Project : Java

Build Tool : Maven

GitHub URL : https://github.com/areddy7021/NumberGuess

To Run this project :

1) Download as a zip. 
2) Import into the Eclipse workspace in which maven plugin is configured. If you do not have the maven plugin configured in eclipse , Please add the maven plugin to teh existing workspace.
3) Right click on the project --> Run As --> Maven Build --> goal as exec:java --> property = -Dexec.mainClass ; value = Main
4) If you do not carry any eclipse in your machine , If you want to run as a plain Maven project. Installing and setting up the maven is required in your machine. You can go http://apache.maven.org to follow the instructions.
5) Once the maven is installed , You can execute mvn exec:java -Dexec.mainClass="Main" by pointing to the source directory of the project.
6) Or else You can run as a stand alone application by just running the main class.
