# indie-spring

![Image of KyojinIndie](https://github.com/kyojinindie/indie-spring/blob/main/kyojinIndie.png)

This repository contains a brief overview about Spring featurs and characteristics.

## Spring

Spring is an ecosistem with several modules, there are many modules for differents objectives.

## Spring Started Project

Is a tool that help you to configure your project an esaier way.

## Dependency Injection

When we create Java applications, we have several classes and objects, sometimes we have dependencies between this objects.
For example:
If we have an object to access a data base and other that requires do logical bussines, this object depends to data base information to access data to do its logic.
If we arent working with spring we need to create an object and later create the other and asing references by manual way, on the constructor or setter method.

So what is looking for dependency injection, by the way?

group in only place all the objects that we are going to working inside spring and delegate to spring the responsability to manage this dependency injection.

So, when we are working with spring we have 2 basic concepts:

1.- Dependency injection
2.- Inversion of control

thus, all that we do is called dependency injection and all that spring do is called inversion of control.

Let review some characteristics for dependency injection:

1.- Reduce coupling between classes.

2.- Classes don't get their dependencies from other components, these are provaided by spring's container.

3.- It is posible change dependencies easily according to configurations
    Imagin this, I have a class that has a configuration to access to a data base, so i'm goingto create an object of this class and i'm going to put the parameters for this connection, for example the URL, User, Password, etc.
    This class is going to tell me how can i connect with data base, but what can i do with this, by the wat?
    Somethig like that, if enviroment is Dev, i can tell it that use some configuration for this enviroment, or if enviroment is QA it class uses other configuration for this new enviroment.
    
4.- The objects managed by spring are knows as beans.

5.- It's not necesary implement an interface to create a spring's bean.
    The only thing that you need to do is register your classes in spring's container and say to sprig that it needs manage the objects of this classes.
    
6.- It is posible perform dependency injection through XML, Annotations and Java code.
    What is this Means?
    I can register my objects in spring's container through XML files, Annotation and Java code.
    There are people who says that XML are not necesary any more because XML are deprecated, but XML works when i don't have access to the source code.
    For example:
    Imagin that i have a JAR and i need to register those beans into spring's context, but i don't have access to source code, so i don't have any way to add annotations, so i can add this beans through XML or Java code as well.
    
7.- Spring's container will manage the life cycle of beans.
    When we register an object into spring this objects will have something called scope or life cycle,Spring define for me this scope, the only thing that i need to define is the scope type, so Spring do all work for me.


## Types of dependency injection.

There are differents types for dependency injection, this types of dependency injection will define how can i do the dependency injection.

Spring provides 3 posibilities to do that, by constructor, by setter method and class attributes.

### Injection by atribute

Imagin that you have to classes Person and Address if you are not working with spring, normaly you need to intanciate the objecto for use them, so you will have something like this:


```java
 Address address = new Address("894567", "somewhere");	
 Person person = new Person("Erick", 31, address);
```
 
But with Spring dependency injection by attribute the only thing that you need to do is register your classes into Spring's container:

```java
@Component
public class Person {
```

After that Spring will manage this objects and you wont have to instanciate them, so you will have access trhoguh the Spring' context.

```java
 ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		
 Person person = context.getBean(Person.class);
		
```

When we talk about the Spring's context we are talking about the place where Spring's objects lives.
When i start a Spring application the return value of this application is a Spring contexte, there are multiples interface that we can use for work with Spring context.

Look at the source code for full example.


This is a open source project.

Open source is a development methodology; free software is a social movement.

Happy Hacking :)
