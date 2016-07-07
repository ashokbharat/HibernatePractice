package com.unisys.hibernatePractice.FirstHibernateProject;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="studentaddress")
public class StudentAddress 
{
  @Id
  @GeneratedValue
  private int student_addressId;
  
  @Column
  private String address_detail;
  
  @OneToMany(cascade=CascadeType.ALL, mappedBy = "stud_add")
  private Set<Student> students = new HashSet<Student>();
  public Set<Student> getStudents() {
    return students;
  }
  public void setStudents(Set<Student> students) {
    this.students = students;
  }
  public int getStudent_addressId() {
    return student_addressId;
  }
  public void setStudent_addressId(int student_addressId) {
    this.student_addressId = student_addressId;
  }
  public String getAddress_detail() {
    return address_detail;
  }
  public void setAddress_detail(String address_detail) {
    this.address_detail = address_detail;
  }
}
