package com.rahul.batch4119.springboot.spring.boot.example.model;
import jakarta.persistence.*;
@Entity
@Table(name="student_info")
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="stud_id")
private int id;
private String name;
private String CollName;
private String emailid;
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getCollName() {
return CollName;
}
public void setCollName(String collName) {
CollName = collName;
}
public String getEmailid() {
return emailid;
}
public void setEmailid(String emailid) {
this.emailid = emailid;
}
public Student(String name, String collName, String emailid) {
super();
this.name = name;
CollName = collName;
this.emailid = emailid;
}
public Student() {
}
}
