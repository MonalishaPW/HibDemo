package com. pwskills.HibDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//       Student stud=new Student();
//       stud.setRollno(101);
//       stud.setName("Monalisha");
//       stud.setMarks(70);
    	
    	Student stud =null;
        Student stud1 =null;
    	
    	Configuration config =new Configuration().configure().addAnnotatedClass(Student.class);
    	SessionFactory sf=config.buildSessionFactory();
    	Session session=sf.openSession();
    	    
        stud =session.get(Student.class,101);
        System.out.println(stud);
        session.close();
        
        Session session1 =sf.openSession();
        stud1 =session1.get(Student.class,101);
        System.out.println(stud1); 
        session1.close();
    }
}