package com.qyspeed.domain;
/*
 * ѧ��ѡ�α�   �־ö�����
 */
public class StudentSelectCourseInfo {

	private int selectid;//ѡ��id
	private Student studentNumber;//ѧ�����
	private CourseInfo courseNumber;//�γ̱��
	
	public int getSelectid() {
		return selectid;
	}
	public void setSelectid(int selectid) {
		this.selectid = selectid;
	}
	public Student getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(Student studentNumber) {
		this.studentNumber = studentNumber;
	}
	public CourseInfo getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(CourseInfo courseNumber) {
		this.courseNumber = courseNumber;
	}
	
	
}
