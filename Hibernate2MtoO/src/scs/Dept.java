package scs;
import java.util.*;
import javax.persistence.*;
@Entity
@Table(name="dept")
public class Dept {
@Id
private int deptid;
@Column
private String deptname;
public int getDeptid() {
	return deptid;
}
public void setDeptid(int deptid) {
	this.deptid = deptid;
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
}
