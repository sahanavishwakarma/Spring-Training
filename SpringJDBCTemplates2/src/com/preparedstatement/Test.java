package com.preparedstatement;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Test {  
  
	public static void main(String[] args) {  
	    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext2.xml");  
	          
	    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
	    dao.saveEmployeeByPreparedStatement(new Employee(110,"Amit",35000));  
	    System.out.println("Data Inserted");
	}  
}