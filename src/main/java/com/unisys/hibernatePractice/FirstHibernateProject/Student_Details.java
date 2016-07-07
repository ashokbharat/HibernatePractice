package com.unisys.hibernatePractice.FirstHibernateProject;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "STUDENT_DETAILS")
public class Student_Details 
{
  //here in one-one mapping we should say Hobernate to not to generate unique primary ids for stud_id so making use of @Parameter 
  @Id
  @GeneratedValue
  private int stud_id;
  
  
  private String stud_mobile_no;
  
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name="stud_id")
  private Student_Info student;
  
  public Student_Info getStudent() {
    return student;
  }
  public void setStudent(Student_Info student) {
    this.student = student;
  }
  public int getStud_id() {
    return stud_id;
  }
  public void setStud_id(int stud_id) {
    this.stud_id = stud_id;
  }
  public String getStud_mobile_no() {
    return stud_mobile_no;
  }
  public void setStud_mobile_no(String stud_mobile_no) {
    this.stud_mobile_no = stud_mobile_no;
  }
  
}
