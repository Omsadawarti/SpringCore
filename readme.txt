# Maven
- Maven is a powerfull project management tool that is based on POM (project object model)
- it is used for project build, dependency and documentation
- it simplifies the build process like ANT, but it is too much advance than ANT


- Apache Maven helps to manage
- build
- documentation
- reporting
- SCM
- release
- distribution


# What is built tool
A build tool takes case of everything for building a process, 
- generates source code
- generate documentation from source code
- compiles source code
- packges compiled code into JAR or ZIP file
- install the packaged code in local repository, server repository or central repository


# Maven Repository
It refer to the directories of packaged JAR files that contain metadata. the metadata refers to the POM
file relavent to each other project. this metadata is what allow maven to download dependencies

Theer are three type of repositories
1. local repository - your PC
2. Remote repository - any server
3. Central repository - internet


# Basic concepts of Maven

> POM (Project Object Model)
- It refer to the XML file that have all the information regarding project and configuration details
- It has the description of the project detail regarding the versioning and configuration management of the project
- The xml file is in the project home directory.
Maven searches for POM in the current dirctory when any task id to be executed



> Dependencies and Repository
- dependencies refer to the java libraries that are needed for the project
- repository refer to the directories of packaged JAR file
- if the dependencies are not present in you local repository, then maven downloads them from the central repo
and stores them in the local repo





# Maven Architecture

Maven----> POM.xml ---------> maven repositoy

1. read POM.xml file
2. Download dependencies defines in pom.xml into local repo from central repo
3. create and generate a report according to the requirement and execute life cycle, phases, goal, plugin etc





Advantages of maven
- Apache maven helps manage all the processes such as building, documentation, releasing and distribution in project management
- the tool simplifies the process of project building
- the task of download jar file and other dependencies is done automatically



What is Maven?
Maven is a popular open source build tool developed by apache group to build, publish and deploy several project at once, it is written in java and is used to build projects written in c#, ruby, scala etc

# What does maven help with?
- The tools simplifies the process of project bulding, it increses the performace of the project and build process
- the task of downloading jar files and other dependencies is done automatically
- maven provides easy access to all the required information


--------------------------------------



# What is ORM?
Object Relational Mapper


it is a technique that let you query and manipulate data from a database using object oriented paradigm
when taking about ORM most of the people are refereing to a library that implement the object relational mapping technique

An ORM library is completely ordinary library writtin in your language of choice that encapsulate the code needed to manipulate that data so you dont have to use SQL anymore, you interact directly with an object in the same language you are using

# Props
- using ORM save a lot of time 
- using an ORM libray is more flexible

# Cons
- you have to learn it
- you have to set it up


-------------------------------

# Hibernate
it is a java framework that simplifies the development of java application to interact with the database
it is an open source, lightweight, ORM tool
hibernate implement the specification of JPA (Java persistence API) for data persistence

an ORM tools simplifies the data creation, data manipulation and data access
it is a programming technique that maps the object to the data store in the database

the ORM tool internally uses the JDBC API to interact with the database

# JPA
java persistence API is a java specification that provides certain functionality and standard to the ORM tool
the javax.persistence package contains the JPA class and interface



# Advantages of hibernate
1. open source and lightweight
2. fast performance
3. database indepedent query - HQL
4. automatic table creation
5. simplified complex join
6. provide query statistics and database status



# hibernate architecture
it inlude many object such as persistence object, session factory, transaction factory, connection factory, session etc


# hibernate architecture is categorized into four layers
- java application layer
- hibernate framework layer
- backend API
- database layer

# elements of hibernate architecture

SessionFactory
it is a factory of session and client of connectionProvider, it is an interface provides factory method to get object of session

Session
it is an object of interface between the application and data store in the dtabase
it is short lived object and wrap JDBC connection


Transaction
it is an object specified the atomic unit of work


connectionProvider
it is a factory of JDBC connection


# how to use hibernate
1. create the persistence class
2. creating the mapping file for persistence class
3. create the configuration
4. create the class that retrive or store the persistence object
5. load the jar file
6. run our first hibenate app




1. create the persistence class
a simple persistence class should follow some rule
- a no argument constructor
- provide an identifier property
- declare getter and setter method
- prefer non final class


2. creating the mapping file for persistence class
class_name.hbm.xml

- hibernate-mapping- it is the root element in the mapping file that contain all mapping elements
- class - it is sub-element
- id - used to specifity primary key
- generator - sub element of id, it is used to generate the primary key
- property - it is sub-element of class that specifiy the property name of the persistence class


3. creating configuration file
the config file contain information about the database and mapping file
conventionally the name should be hibernate.cfg.xml


4. create the class that retrive or store the object

we can simply store the persistence class object to the database

@Entity
@Table
@Id
@GeneratedValue
@Column
@Transient
@OneToOne
@OneToMany
@ManytoOne
@ManyToMany


# Dialect
the dialiect specifies the type of database used to hibernate generated appropriate type of sql statement
for connecting any hibernate with the database it is required to provide the configuration of the sql dialect



# Exercise: create first hibernate app

1. create maven project - quick start

2. add two depdenices in the pom.xml
 - hibernate-core
 - mysql-connection-java


  <!-- https://mvnrepository.com/artifact/com.mysql/mysql-connector-j -->
    <dependency>
      <groupId>com.mysql</groupId>
      <artifactId>mysql-connector-j</artifactId>
      <version>8.0.33</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/org.hibernate.orm/hibernate-core -->
    <dependency>
      <groupId>org.hibernate.orm</groupId>
      <artifactId>hibernate-core</artifactId>
      <version>6.2.4.Final</version>
    </dependency>


3. create hibernate configuration  - hibernate.cfg.xml

<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE hibernate-configuration PUBLIC
        "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
        "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">

<hibernate-configuration>
    <session-factory>
        <property name="connection.driver_class">com.mysql.cj.jdbc.Driver</property>
        <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/demo</property>
        <property name="connection.username">root</property>
        <property name="connection.password">root</property>
        <property name="dialect">org.hibernate.dialect.MySQL8Dialect</property>
        <property name="hbm2ddl.auto">update</property>
        <property name="show_sql">true</property>
        <mapping class="" />
    </session-factory>
</hibernate-configuration>

4. create persistence class 
Student
 - id
 - name
 - email


package com.thevarungupta;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int id;
    private String name;
    private String email;

    public Student(){

    }

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


5. app.java - main()
- create connection
- open session
- start transaction
- create employee object
- save
- commit
- close




package com.thevarungupta;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        // create a configuration object
        Configuration config = new Configuration();

        // read the configuration
        config.configure("hibernate.cfg.xml");

        // create factory
        SessionFactory sessionFactory = config.buildSessionFactory();

        // open the session
        Session session = sessionFactory.openSession();

        // begin transaction
        Transaction transaction = session.beginTransaction();

        // create object
        Student student = new Student();
        student.setId(2);
        student.setName("Paul");
        student.setEmail("p@gmail.com");

        // save the object
        session.save(student);

        // commit
        transaction.commit();

        //close the connection
        session.close();



    }
}




