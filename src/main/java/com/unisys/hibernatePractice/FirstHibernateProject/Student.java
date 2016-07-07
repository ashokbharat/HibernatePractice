package com.unisys.hibernatePractice.FirstHibernateProject;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student 
{
  @Id
  @GeneratedValue
  @Column(name="stud_id")
  private int student_id;
  
  @Column(name="stud_name")
  private String student_name;
  
  @ManyToOne(cascade=CascadeType.ALL)
  private StudentAddress stud_add;
  public StudentAddress getStud_address() {
    return stud_add;
  }
  public void setStud_address(StudentAddress stud_add) {
    this.stud_add = stud_add;
  }
  public int getStudent_id() {
    return student_id;
  }
  public void setStudent_id(int student_id) {
    this.student_id = student_id;
  }
  public String getStudent_name() {
    return student_name;
  }
  public void setStudent_name(String student_name) {
    this.student_name = student_name;
  }
  
}
