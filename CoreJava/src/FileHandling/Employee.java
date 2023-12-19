package FileHandling;

import java.io.Serializable;
public class Employee implements Serializable  {
	private int empid;
	private String empname;
	private String add;
	private double empsal;
	public int getEmpid() {
		return empid;
	}
	public String getEmpname() {
		return empname;
	}
	public String getAdd() {
		return add;
	}
	public double getEmpsal() {
		return empsal;
	}
	public void setEmpid(int empid) {
		// TODO Auto-generated method stub
		this.empid=empid;
	}
	public void setEmpName(String empname) {
		// TODO Auto-generated method stub
		this.empname=empname;
	}
	public void setAdd(String add) {
		// TODO Auto-generated method stub
		this.add=add;
	}
	public void setEmpSal(double empsal) {
		// TODO Auto-generated method stub
		this.empsal=empsal;			
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", add=" + add + ", empsal=" + empsal + "]";
	}
	

}
