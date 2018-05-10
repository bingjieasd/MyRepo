package service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.StudentDao;
import entity.Student;

@Service
public class StudentService {
	@Resource
	StudentDao  studentDao;
	
	public List<Student> findAllStudents(){
		return studentDao.findAllStudents();
	}
	public List<Student> findStudentByName(String name){
		return studentDao.findStudentByName(name);
	}
	
	public Student login(String name,String pwd){
		return studentDao.findStudentByNameAndPwd(name, pwd);
	}
	
	public int register(Student stu){
		return studentDao.add(stu);
	}
}
