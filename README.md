spring-single-context-demo
==========================

Project demonstates how to configure single Spring context in Spring MVC application with Spring Security

### Usage ###

Just type **mvn** after checkout. Then open http://localhost:8080/q/
User: bob, Password: bobspassword

### Requirements ###

* Maven 3
* Java 8

### Details ###

Spring documentation has no clear recommendation for context setup. My experience is that multiple context may lead to configuration errors. Single context is safer.

Master use Java config. For XML config check tag **xml**

