# indie-spring

![Image of KyojinIndie](https://github.com/kyojinindie/indie-spring/blob/main/kyojinIndie.png)

This repository contains a brief overview about Spring features and characteristics.

## Spring

Spring is an ecosystem with several modules, there are many modules for differents objectives.

## Spring Started Project

It is a tool that helps you configure your project an easier way.

## Dependency Injection

When we create Java applications, we have several classes and objects, sometimes we have dependencies between this objects.
For example:
If we have an object to access a data base and other that requires to do logical business, this object depends on the data base information to access data to do its logic.
If we aren't working with spring we need to create an object and later create the other and asign references by manual way, on the constructor or setter method.

So what is looking for dependency injection, by the way?

group in one place all the objects that we are going to be working with inside spring and delegate to spring the responsability to manage this dependency injection.

So, when we are working with spring we have 2 basic concepts:

1.- Dependency injection
2.- Inversion of control

thus, all that we do is called dependency injection and all that spring does is called inversion of control.

Let's review some characteristics for dependency injection:

1.- Reduce coupling between classes.

2.- Classes don't get their dependencies from other components, these are provided by spring's container.

3.- It is posible to change dependencies easily according to configurations
    Imagine this, I have a class that has a configuration to access to a data base, so i'm going to create an object of this class and i'm going to put the parameters for this connection, for example the URL, User, Password, etc.
    This class is going to tell me how can i connect with data base, but what can i do with this, you may ask?
    Somethig like that, if environment is Dev, i can tell the class to use some configuration for this environment, or if environment is QA its class uses other configuration for this new environment.
    
4.- The objects managed by spring are known as beans.

5.- It's not necessary to implement an interface to create a spring's bean.
    The only thing that you need to do is register your classes in a spring's container and say to spring that it needs to manage the objects of this classes.
    
6.- It is posible to perform dependency injection through XML, Annotations and Java code.
    What does this means?
    I can register my objects in a spring's container through XML files, Annotation and Java code.
    There are people who say that XML is not necessary any more because XML is deprecated, but XML works when we don't have access to the source code.
    For example:
    Imagine that i have a JAR and i need to register those beans into spring's context, but i don't have access to source code, so i don't have any way to add annotations, so i can add these beans through XML or Java code as well.
    
7.- Spring's container will manage the life cycle of beans.
    When we register an object into spring these objects will have something called scope or life cycle,Spring will define for me this scope, the only thing that i need to define is the scope type, so that Spring will do all the work for me.


## Types of dependency injection.

There are differents types for dependency injection, this types of dependency injection will define how can i do the dependency injection.

Spring provides 3 posibilities to do that, by constructor, by setter method and class attributes.

### Injection by atribute

Imagine that you have two classes Person and Address. if you are not working with spring, normally you'll need to instantiate the object to use it, so you will have something like this:


```java
 Address address = new Address("894567", "somewhere");	
 Person person = new Person("Erick", 31, address);
```
 
But with Spring dependency injection by attribute the only thing that you need to do is register your classes into a Spring's container:

```java
@Component
public class Person {
```

After that Spring will manage these objects and you wont have to instantiate them, so you will have access through the Spring' context.

```java
 ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		
 Person person = context.getBean(Person.class);
		
```

When we talk about the Spring's context we are talking about the place where Spring's objects lives.
When i start a Spring application the return value of this application is a Spring context, there are multiples interfaces that we can use to work with Spring context.

### Injection by constructor

In this case Spring's container is in charge to invoke class contructor passing arguments as dependencies.

### Injection by setter

For setter injection Spring's container asing dependencies using setter methods. Is recomended for optional dependencies.


Look at the source code for full example.

## Stereotypes

Allow indicate to Spring that It needs to manage objects of the annotated class, there are 4 main types:

Annotation | Description
------------ | -------------
@Component | This is the most general stereotype, It is father of the others 3 stereotypes.
@Service | This stereotype is for execute bussiness logic.
@Repository | This stereotype is for access data.
@Controller | This stereotype is for expose date.

Stereotypes allow give a role to classes that will be managed by spring, EachOne has same behavior and apply only to implementation.

## Qualifiers

In case that we have an interface with multiples implementations we can use @Qualifier annotation to specify wich bean we want inject.

For example:

```java
Interface SoccerPlayer {
}

@Componet
@Qualifier("forward")
public class Forward  implements SoccerPlayer{}

@Component
@Qualifier("defender")
public class Defender implemets SoccerPlayer{}

@Component
@Qualifier("midfielder")
public class Midfilder implements SoccerPlayer{}
```
Look at the source code for full example.
This is an open source project.

@Primary

This annotation is used to define a default bean when an interface is implemente by multiples classes.

## Profile configuration

Profiles are used to register beans into Spring's context according to a condition, for example:

-OS
-Enviroments-
-Countries

And so on.

Then wich is the difference between @Qualifier and @Profile?

The main difference between these annotations is that @Qualifier is used to eliminate ambiguity between beans and @Profile annotation provide a way to segregate parts of your application and make it available only in certain enviroment.

```java
Interface OperationSystem {
}

@Service
@Profile("windows")
public class Windows implements OperationSystem {}

@@Service
@Profile("mac")
public class Mac implements OperationSystem {}

@Service
@Profile("linux")
public class Linux implements OperationSystem {}
```

Once profiles are defined, next step is activate them.

To do this we have 3 options:

1.- Adding this line `spring.profiles.active=linux` into properties file.
2.-Defining following property `-Dspring.profiles.active=linux` in the VM.
3.-Annotating a test like this `@ActivateProfiles("linux")`.

If we want register a bean in case that there isn't defined a profile, is posible define a default profile as following shows:

```java
@Service
@Profile({"windows","default"})
public class Windows implements OperationSystem {
```
Look at the source code for full example, feel free to play with properties file.
This is an open source project.


Open source is a development methodology; free software is a social movement.

Happy Hacking :)
