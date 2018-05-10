package dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import entity.Student;

public interface StudentDao {
	public List<Student> findAllStudents();
	public Student findStudentById(Integer id);
	public Student findStudentByNameAndPwd(@Param("name")String name,@Param("pwd")String pwd);
	public List<Student> findStudentByName(@Param("name")String name);
	public int findCount();
	public int deleteById(Integer id);
	public int updatepwd(@Param("id")Integer id,@Param("pwd")String pwd);
	public int update(Student stu);
	public int add(Student stu);
	public List<Student> findStudentBy(Map<String,Object> map);
	public List<Student> findStuno_name(Integer sex);
	public List<Student> find_stu_byid(Integer sno);
	public List<Student> find_stu_res(Integer sno);
	public List<Student> findbysex(@Param("ss")String sex);
	public List<Student> findstuBYarray(int[] nos);
}
