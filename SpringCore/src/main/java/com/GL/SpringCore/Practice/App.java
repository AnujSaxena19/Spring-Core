package com.GL.SpringCore.Practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
        Student stud=(Student) ac.getBean("stu1");
        Student student2=(Student) ac.getBean("stu2");
        System.out.println(stud);
        System.out.println(student2);
    }
}
