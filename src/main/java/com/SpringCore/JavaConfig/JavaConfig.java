package com.SpringCore.JavaConfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// Now instead of xml file we use a java class where we doo all our configureation with the help of java annotations , i.e no role of xml file now , this class is the configuration class where we do configurations
@Configuration // to declare that this java class is the configuration class where we do our configurations
@ComponentScan(basePackages="com.SpringCore.JavaConfig") // this annotation hwlps to scan the package to create a bean of all the classes having @Component annotaion over them
public class JavaConfig {

}
