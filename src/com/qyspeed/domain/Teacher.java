package com.qyspeed.domain;

import java.io.File;
import java.sql.Timestamp;
/*
 * ����teacher �־ö����
 */
public class Teacher {

	private String teacherNumber;//��ʦ���
	private String teacherName;//��ʦ��
	private String teacherPassword;//��ʦ����
	private String teacherSex;//��ʦ�Ա�
	private Timestamp teacherBirthday;//��������
	private Timestamp teacherArriveDate;//��ְ����
	private String teacherCardNumber;//��ʦ����
	private String teacherPhone;//��ϵ�绰
	private String teacherPhoto;//��ʦ��Ƭ
	private String teacherAddress;//��ʦ��ְ��ַ
	private String teacherMemo;//��ʦ��ע
	
	
	public String getTeacherNumber() {
		return teacherNumber;
	}
	public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherPassword() {
		return teacherPassword;
	}
	public void setTeacherPassword(String teacherPassword) {
		this.teacherPassword = teacherPassword;
	}
	public String getTeacherSex() {
		return teacherSex;
	}
	public void setTeacherSex(String teacherSex) {
		this.teacherSex = teacherSex;
	}
	public Timestamp getTeacherBirthday() {
		return teacherBirthday;
	}
	public void setTeacherBirthday(Timestamp teacherBirthday) {
		this.teacherBirthday = teacherBirthday;
	}
	public Timestamp getTeacherArriveDate() {
		return teacherArriveDate;
	}
	public void setTeacherArriveDate(Timestamp teacherArriveDate) {
		this.teacherArriveDate = teacherArriveDate;
	}
	public String getTeacherCardNumber() {
		return teacherCardNumber;
	}
	public void setTeacherCardNumber(String teacherCardNumber) {
		this.teacherCardNumber = teacherCardNumber;
	}
	public String getTeacherPhone() {
		return teacherPhone;
	}
	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
	}
	public String getTeacherPhoto() {
		return teacherPhoto;
	}
	public void setTeacherPhoto(String teacherPhoto) {
		this.teacherPhoto = teacherPhoto;
	}
	public String getTeacherAddress() {
		return teacherAddress;
	}
	public void setTeacherAddress(String teacherAddress) {
		this.teacherAddress = teacherAddress;
	}
	public String getTeacherMemo() {
		return teacherMemo;
	}
	public void setTeacherMemo(String teacherMemo) {
		this.teacherMemo = teacherMemo;
	}
	
	
}
