Neuroph - Java Neural Network Framework
======

Neuroph is an open source Java neural network framework and Development Environment for neural networks. 
It contains well designed, open source Java library with small number of basic classes which correspond to basic NN concepts, which makes it perfect for beginners and education. 
Also it provides nice GUI neural network editor and wizards  to quickly create Java neural network components, along with various visualization tools. 
It has been released as open source under the Apache 2.0 license.

Adding Maven Dependency
======

Copy/Paste following code into your pom.xml file

```xml
<repositories>
        <repository>
            <id>neuroph.sourceforge.net</id>
            <url>http://neuroph.sourceforge.net/maven2/</url>
        </repository>        
</repositories>
    
<dependencies>
        <dependency>
            <groupId>org.neuroph</groupId>
            <artifactId>neuroph-core</artifactId>
            <version>2.96</version>
        </dependency>
</dependencies>
```
Getting and Building from Sources using NetBeans
======

Click: Main Menu > Team > Git > Clone

For Repository URL, enter: https://github.com/neuroph/NeurophFramework.git

Click: Finish

Right click "cloned project", and click "Build"

Note: Any IDE can be used for this project. If you wish to use a different IDE, please refer to that IDE's documentation for instructions on how to get and build from sources from a Git repository.

Getting and Building from Sources using command line
======

### `git clone  https://github.com/neuroph/NeurophFramework.git`
### `cd neuroph`

To compile the project
### `mvn compile`

To run unit tests
### `mvn test`

To run integration tests
### `mvn verify`

To compile, test, and package the project
### `mvn package`


