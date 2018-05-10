package entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
public class Grade implements Serializable{
	private Integer gradeid;
	private String gradename; 
	private List<Student> students;
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	@Override
	public String toString() {
		return "Grade [gradeid=" + gradeid + ", gradename=" + gradename + ", students=" + students + "]";
	}
	public Integer getGradeid() {
		return gradeid;
	}
	public void setGradeid(Integer gradeid) {
		this.gradeid = gradeid;
	}
	public String getGradename() {
		return gradename;
	}
	public void setGradename(String gradename) {
		this.gradename = gradename;
	}
}
