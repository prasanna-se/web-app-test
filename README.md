# web-app-test

Instructions to run this application:

1.This is a maven project, dependencies are mentioned in the POM file.

2.Please build as a maven project and run.
mvn test

Alternatively, in your IDE, right click on run, TestRunner class.


Improvements;

1.Have a Hooks class, to add pre/post conditions for scenario.

2.Move PageFactory objects to higher level of abstraction, to reuse code.

3.Abstraction for re-usable methods, to reduce duplicate code.

4.for future enhancements, json can be used as data format, and data models can be build around it, for serialization/deserialization.

5.API's like MockNeat, can be used for inflight data genaration.

6.Better names for variables/methods:-)
