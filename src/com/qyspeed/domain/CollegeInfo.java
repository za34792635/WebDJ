package com.qyspeed.domain;

import java.sql.Timestamp;

public class CollegeInfo {

	private String collegeNumber;//��ѧ���
	private String collegeName;//��ѧ����
	private Timestamp collegeBrithDate;//��ѧ��������
	private String collegeMan;//��ѧ��ʼ��
	private String collegeTelephone;//��ѧ����绰
	private String collegeMemo;//��ѧ��ע
	
	
	public String getCollegeNumber() {
		return collegeNumber;
	}
	public void setCollegeNumber(String collegeNumber) {
		this.collegeNumber = collegeNumber;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Timestamp getCollegeBrithDate() {
		return collegeBrithDate;
	}
	public void setCollegeBrithDate(Timestamp collegeBrithDate) {
		this.collegeBrithDate = collegeBrithDate;
	}
	public String getCollegeMan() {
		return collegeMan;
	}
	public void setCollegeMan(String collegeMan) {
		this.collegeMan = collegeMan;
	}
	public String getCollegeTelephone() {
		return collegeTelephone;
	}
	public void setCollegeTelephone(String collegeTelephone) {
		this.collegeTelephone = collegeTelephone;
	}
	public String getCollegeMemo() {
		return collegeMemo;
	}
	public void setCollegeMemo(String collegeMemo) {
		this.collegeMemo = collegeMemo;
	}
	
	
}
