package com.qyspeed.domain;

public class ScoreInfo {

	private int scoreid;//����id
	private Student studentNumber;//ѧ������
	private CourseInfo courseNumber;//�γ̺���
	private float scoreValue;//����
	private String studentEvalute;//ѧ������
	
	public int getScoreid() {
		return scoreid;
	}
	public void setScoreid(int scoreid) {
		this.scoreid = scoreid;
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
	public float getScoreValue() {
		return scoreValue;
	}
	public void setScoreValue(float scoreValue) {
		this.scoreValue = scoreValue;
	}
	public String getStudentEvalute() {
		return studentEvalute;
	}
	public void setStudentEvalute(String studentEvalute) {
		this.studentEvalute = studentEvalute;
	}
	
	
	
}
