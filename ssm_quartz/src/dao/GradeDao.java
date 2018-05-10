package dao;

import java.util.List;

import entity.Grade;

public interface GradeDao {
	public Grade find_grade_byid(Integer gradeid);
	public List<Grade> findAllgrades();
	public List<Grade> findAllgrades2();
}
