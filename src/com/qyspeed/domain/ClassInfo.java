package com.qyspeed.domain;

import java.sql.Timestamp;

/*
 * ����classinfo ���γ���Ϣ���ĳ־ö�����
 */
public class ClassInfo {

	//�γ̱��
	private String classNumber;

	//�γ̰༶����
	private String className;
	
	//רҵ
	private SpcialFieldNumber classSpecialFieldNumber;
	//�γ̿���ʱ��
	private Timestamp classBirthday;
    //�γ̸�����ʦ
	private String classTeacherCharge;
	//�γ̸����˵绰
	private String classTelephone;
	//�γ̸�����Ϣ
	private String classMemo;
	
	
	public String getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public SpcialFieldNumber getClassSpecialFieldNumber() {
		return classSpecialFieldNumber;
	}
	public void setClassSpecialFieldNumber(SpcialFieldNumber classSpecialFieldNumber) {
		this.classSpecialFieldNumber = classSpecialFieldNumber;
	}
	public Timestamp getClassBirthday() {
		return classBirthday;
	}
	public void setClassBirthday(Timestamp classBirthday) {
		this.classBirthday = classBirthday;
	}
	public String getClassTeacherCharge() {
		return classTeacherCharge;
	}
	public void setClassTeacherCharge(String classTeacherCharge) {
		this.classTeacherCharge = classTeacherCharge;
	}
	public String getClassTelephone() {
		return classTelephone;
	}
	public void setClassTelephone(String classTelephone) {
		this.classTelephone = classTelephone;
	}
	public String getClassMemo() {
		return classMemo;
	}
	public void setClassMemo(String classMemo) {
		this.classMemo = classMemo;
	}
	
	
}
