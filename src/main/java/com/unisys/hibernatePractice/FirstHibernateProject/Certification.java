package com.unisys.hibernatePractice.FirstHibernateProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentcertification")
public class Certification 
{
  @Id
  @Column(name="certId")
  @GeneratedValue
  private int cert_id;
  
  @Column(name="certName")
  private String cert_name;
  public int getCert_id() {
    return cert_id;
  }
  public void setCert_id(int cert_id) {
    this.cert_id = cert_id;
  }
  public String getCert_name() {
    return cert_name;
  }
  public void setCert_name(String cert_name) {
    this.cert_name = cert_name;
  }
  
}
