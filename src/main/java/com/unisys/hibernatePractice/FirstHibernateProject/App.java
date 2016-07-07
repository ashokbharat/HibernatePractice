package com.unisys.hibernatePractice.FirstHibernateProject;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
//import org.hibernate.cfg.;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      /*OneToOne Unidirectional and BiDirectional Mapping
        Student_Info  student1 = new Student_Info();
        student1.setName("Bharat");
        student1.setBirthdate(new Date());
        
        Student_Info  student2 = new Student_Info();
        student2.setName("Girija");
        student2.setBirthdate(new Date());
        
        Student_Details stud1_details = new Student_Details();
        stud1_details.setStud_mobile_no("9886067080");
        //stud1_details.setStudent(student1);
        
        Student_Details stud2_details = new Student_Details();
        stud2_details.setStud_mobile_no("8884810636");
        //stud2_details.setStudent(student2);
        
        student1.setStud_details(stud1_details);
        student2.setStud_details(stud2_details);
        */
      
      /*ManyToOne and OneToMany mapping demo of mapping studentaddressid of StudentAddress table to id of Student table*/
      
        //StudentAddress stud_add = new StudentAddress();
        //stud_add.setStudent_addressId(245);
        //stud_add.setAddress_detail("Bangalore");
        
        //Student stud1 = new Student();
        //stud1.setStudent_id(15);
        //stud1.setStudent_name("Akku");
        //stud1.setStud_address(stud_add);
        
        //Student stud2 = new Student();
        //stud2.setStudent_id(16);
        //stud2.setStud_address(stud_add);
        //stud2.setStudent_name("Panni");
        
        //(stud_add.getStudents()).add(stud1);
        //(stud_add.getStudents()).add(stud2);
        
       /* StudentAddress stud1_add = new StudentAddress();
        stud1_add.setAddress_detail("Hyderabad");
        
        StudentAddress stud2_add = new StudentAddress();
        stud2_add.setAddress_detail("Hyderabad");
        */
        
        //Commenting for OneToMany mapping
        //stud1.setStud_address(stud_add);
        //stud2.setStud_address(stud_add);
      
        //ManyToMany Mapping
        Employee emp1 =new Employee();
        emp1.setEmp_name("Ashok Bharat");
        
        Employee emp2 =new Employee();
        emp2.setEmp_name("Girija");
        
        Certification cert1 = new Certification();
        cert1.setCert_name("Java");
        
        Certification cert2 = new Certification();
        cert2.setCert_name("PharmacoVigilance");
        
        (emp1.getCertfs()).add(cert1);
        (emp2.getCertfs()).add(cert2);
        
        
        
        
        
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        SessionFactory sessFact = cfg.configure().buildSessionFactory();
        Session sess = sessFact.openSession();
        
        sess.beginTransaction();
        //sess.save(student1);
        //sess.save(student2);
        
        //One-One mapping: here stud1_details save to db saves the information related to student_info as well
        //sess.save(stud1_details);
        //sess.save(stud2_details);
        
        //ManyToOne and OneToMany mapping of addressid of student table to StudentAddress table, Hibernate first inserts StudentAddress table records and then inserts records to Student table
        //sess.save(stud1);
        //sess.save(stud2);
        
        //OneToMany, Hibernate now not only inserts studentaddress table records but also inserts assosciated student table records as well 
        //sess.save(stud_add);
          
        //ManyToMany
        sess.save(emp1);
        sess.save(emp2);
        //sess.save(cert1);
        //sess.save(cert2);
        
        sess.getTransaction().commit();
        sess.close();
        sessFact.close();
        
        System.out.println( "Hello World!" );
    }
}
