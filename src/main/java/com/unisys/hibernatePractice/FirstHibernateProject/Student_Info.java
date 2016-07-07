package com.unisys.hibernatePractice.FirstHibernateProject;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "STUDENT")
public class Student_Info {
  
  @Id
  @Column(name = "stud_id")
  @GeneratedValue(generator = "parentGenerator")
  @GenericGenerator(name="parentGenerator",strategy="foreign",parameters={@Parameter(name="property",value="stud_details")})
  private int stud_id;
  
  @Column(name = "name", nullable = false)
  private String name;
  
  @Temporal(TemporalType.DATE)
  private Date birthdate;
  
  //Bi-deirectional mapping in which Student_Info parent class will have a reference to Student_Details child class
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name="stud_id")
  private Student_Details stud_details;
  
  public Student_Details getStud_details() {
    return stud_details;
  }
  public void setStud_details(Student_Details stud_details) {
    this.stud_details = stud_details;
  }
  public Date getBirthdate() {
    return birthdate;
  }
  public void setBirthdate(Date birthdate) {
    this.birthdate = birthdate;
  }
  public int getStud_id() {
    return stud_id;
  }
  public void setStud_id(int stud_id) {
    this.stud_id = stud_id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
}
