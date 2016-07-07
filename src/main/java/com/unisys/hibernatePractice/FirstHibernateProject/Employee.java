package com.unisys.hibernatePractice.FirstHibernateProject;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee 
{
  @Id
  @Column(name="empId")
  @GeneratedValue
  private int emp_id;
  
  @Column(name="empName")
  private String emp_name;
  
  @ManyToMany(cascade=CascadeType.ALL)
  private Set<Certification> certfs = new HashSet<Certification>();
  public Set<Certification> getCertfs() {
    return certfs;
  }
  public void setCertfs(Set<Certification> certfs) {
    this.certfs = certfs;
  }
  public int getEmp_id() {
    return emp_id;
  }
  public void setEmp_id(int emp_id) {
    this.emp_id = emp_id;
  }
  public String getEmp_name() {
    return emp_name;
  }
  public void setEmp_name(String emp_name) {
    this.emp_name = emp_name;
  }
  
}
