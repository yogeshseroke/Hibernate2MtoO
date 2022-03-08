package scs;
import javax.persistence.*;
@Entity
@Table(name="emp")
public class Employee {
@Id
private int empid;
@Column
private String empname;
@ManyToOne(fetch=FetchType.LAZY,targetEntity=Dept.class,cascade=CascadeType.ALL)
@JoinColumn(name="deptid",referencedColumnName="deptid")
private Dept dept;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public Dept getDept() {
	return dept;
}
public void setDept(Dept dept) {
	this.dept = dept;
}
}
