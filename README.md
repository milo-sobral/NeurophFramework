Neuroph - Java Neural Network Framework
======
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/milo-sobral/NeurophFramework)
![](https://travis-ci.com/milo-sobral/NeurophFramework.svg?branch=master)

### The official website for the project

http://neuroph.sourceforge.net/index.html

You will find more information about the project as well as technical documentation and tutorials on the website.

### What is Neuroph?

Neuroph is an open source Java neural network framework and Development Environment for neural networks, and it is free to use. It can be used to create neural networks and to easily add neural networks to your programs, or just to experiment with neural networks.

Neuroph contains well designed, open source Java library with small number of basic classes which correspond to basic NN concepts, which makes it perfect for beginners and education. Also, it provides nice GUI neural network editor and wizards to quickly create Java neural network components, along with various visualization tools. 

Neuroph has been released as open source under the Apache 2.0 license.

### History

Neuroph started as a graduate thesis project, after that a part of master theses, and on September 2008. it became open source project on SourceForge. After the initial release,  development continued and several people helped to improve it in many ways. After a few months the version 2 was released,  with many new features, optimized and cleaned code. After that it has been adopted for teaching neural networks during the Inteligent Systems course at Faculty of Organisational Sciences in Belgrade.

### Vision

Our vision is to create neural network framework which is:

1. **Small**, **intuitive**, **easy** to learn and use (even for the beginners in this area).
2. **Flexible**, so it can be easily extended for specific purporse with high level of reusability
3. **Well documented** (in our view if some features are not documented, it's almost as they dont exist at all)
4. **Ready to use**, providing out of the box functionality
5. **Equiped with tools** for typical tasks during neural network development such as creating, training, testing and deploying (see Neuroph editor easyNeurones)
6. **Fun** to use

### Contributors

Neuroph has been created thanks to the support provided by the following people:
- Zoran Sevarac
- Jon Tait
- Laura Carter-Greaves
- Aidan Morgan (NEAT support for Neuroph)
- Dr. Valentin Steinhauer
- And many other who contributed their code or helped in some other way

If you you are interested in joining the development, or contributing in any other way, feel free to contact us at sevarac@gmail.com. If you have developed something based on Neuroph and you wish to share that with others, send us your code.

### What are neural networks and what can they be used for?

According to *The Biological Paradigm* by R. Rojas (http://page.mi.fu-berlin.de/rojas/neural/chapter/K1.pdf), artificial neural networks, also known as neural networks, are "an attempt at modeling the information processing capabilities of nervous systems" of animals. 
Neural networks can be used for various tasks like classification, recognition, prediction, function approximation, and modelling. Typical tasks are image, fingerprint or face recognition, stock prediction, pattern classification etc.

### Requirements to use Neuroph

The only requirement to use Neuroph is to have Java SE version 1.6 or later installed.

### Types of neural networks supported by Neuroph

At the moment Neuroph supports the following networks: Adaline, Perceptron, Multi Layer Perceptron with Backpropagation, Hopfield, Konhonen, Hebbian, Maxnet, Competitive, Instar, Outstar, BAM, RBF network and NFR

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

#### `git clone  https://github.com/neuroph/NeurophFramework.git`
#### `cd neuroph`

To compile the project
#### `mvn compile`

To run unit tests
#### `mvn test`

To run integration tests
#### `mvn verify`

To compile, test, and package the project
#### `mvn package`

Contributing to Neuroph
======

*For thechnical details about how to contribute to the GitHub repository, please refer to the CONTRIBUTING.md file*

### Ways to contribute

Neuroph welcomes all contributions. Initialy all code contributions should go into Contrib module / package (or its own module). Here is how can you contribute:
- Create new learning rules, network architectures or some utilities at framework level
- Create some Neuroph based tools - Neuroph Studio plugins (wizards, application specific tools, visualization etc.)
- If you've used Neuroph to create some interesting application, consider contributing your code to Neuroph, or at least just let us know to put a link to your work on applications page.
- If you're using Neuroph for teaching - provide code samples, teaching materials/slides and let us know so we can link to your site.
- If you're working on other some open source project that is in some way related to Neuroph
- Write tutorials, articles, documentation

Feel free to contact us at sevarac@gmail.com if you are interested in contributing to the project. 

### Todo list

Here is a list of features and tasks that need to be worked on:
- Backpropagation variations ( delta-bar-delta, quickprop, etc.)
- More neural network architectures and learning rules: ART, Counterpropagation, Jordan, Elman, Backpropagation Through Time, Probabilistic Neural Network, Interactive Activation Controller, Optimal Brain Damage (all other are welcome too)
- Deep Learning: Restricted Boltzman Machines, Deep Belief, Autoencoder
- Multithreading support using Java parallel streams
- Distributed processing using Apache Spark
- Support for spiking networks
- Brain research tools using Neuroph
- Use of genetic algorithms in neural network learning
- Applications (tools or code samples): image recognition, medical image recognition, face recognition, OCR, EEG signal classification
- JBoss application server performance prediction using Neuroph neural networks, based on the number and type of requests

### Making a contribition to this repository

If you would like to suggest an improvement or point out a bug in this repository, please submit an issue on GitHub using our issue template and our team will review it. If we deem the issue to worthwile, we will keep approve it and keep it open, otherwise we will close the issue. To Make a contribution to this GitHub repository, please submit a pull request following our pull request template. Our team will review your request and respond to let you know if it has been approve or why it has not been approved. To increase your chances of your contribution being approved, you should only submit a pull request that fixes at least one of the issues currently open. If you would like to make a contribution unrelated to the currently open issues, then we suggest that you submit a new issue and wait for it to be approved before making the contribition. 

### Developer Guidelines

###### Guidelines for developers which will help us to manage the project, and keep the quality of code and documentation:
1. Please do not put anything in core and nnet packages, instead use something like org.neuroph.contrib.yourpackage
After review and testing when that code become stable, it may be moved to some more appropriate package.
2. Please put comments for classes and methods in your code so javadoc can generate documentation.
3. Use plugins (see org.neuroph.util.plugins) to create custom additional components which are not related to neural network architectures or learning algorithms.
4. Prefered tool for any GUI related development is NetBeans
5. Please follow the [Java coding conventions](https://www.oracle.com/java/technologies/javase/codeconventions-contents.html) and [Javadoc comments style recommendations](https://www.oracle.com/java/technologies/)

###### SVN
the following are some excerpts from the "Continuous Integration" wikipedia entry that should be used as guidelines for maintaining Neuroph's SVN using the industry "best practice".

http://en.wikipedia.org/wiki/Continuous_integration

"Extreme Programming advocate Martin Fowler also mentions that where branching is supported by tools, its use should be minimised[citation needed]. Instead, it is preferred that changes are integrated rather than creating multiple versions of the software that are maintained simultaneously. The mainline (or trunk) should be the place for the working version of the software."

"By committing regularly, every committer can reduce the number of conflicting changes. Checking in a week's worth of work runs the risk of conflicting with other features and can be very difficult to resolve. Early, small conflicts in an area of the system cause team members to communicate about the change they are making."

###### Policy
The suggested policy for the Neuroph team to adopt is that all current code modifications are based on and committed to HEAD (the mainline). It is perfectly acceptable to commit "in progress" code to head at any time as long as it builds. Code contributors will either need to make themselves available to resolve conflicts or else risk having another contributor resolve it for them without their input.

Official releases are created by branching HEAD and naming the branch with a version number. The branch becomes a "release candidate" until it passes whatever testing the contributors need to do. Once branched, the release candidate should only receive bug-fixes and stability patches. No new development code should be committed there.

An implication of this policy is that there are 2 places in SVN that contributors are concerned with: HEAD, and the current release candidate branch. There should only be one "active" release candidate branch at a time. Any contributor who is working on "silo'ed" code in a branch should merge their work into HEAD and abandon their branch.


GitFlow Cheat Sheet:
[img]https://i.imgur.com/R53D42x.png[/img]
