package com.qyspeed.domain;

import java.sql.Timestamp;

/*
 * ���� רҵ�� SpecialFieldNumber ��
 */
public class SpcialFieldNumber {


	private String specialFieldNumber; //רҵ���
	private String specialFieldName;//רҵ����
	private CollegeInfo specialCollegeNumber;//רҵ������ѧ
	private Timestamp specialBirthDate; //רҵ��������
	private String specialMan;//רҵ���θ�����
	private String specialTelephone;//רҵ����绰
	private String specialMemo;//רҵ��ע
	
	
	public String getSpecialFieldNumber() {
		return specialFieldNumber;
	}
	public void setSpecialFieldNumber(String specialFieldNumber) {
		this.specialFieldNumber = specialFieldNumber;
	}
	public String getSpecialFieldName() {
		return specialFieldName;
	}
	public void setSpecialFieldName(String specialFieldName) {
		this.specialFieldName = specialFieldName;
	}
	public CollegeInfo getSpecialCollegeNumber() {
		return specialCollegeNumber;
	}
	public void setSpecialCollegeNumber(CollegeInfo specialCollegeNumber) {
		this.specialCollegeNumber = specialCollegeNumber;
	}
	public Timestamp getSpecialBirthDate() {
		return specialBirthDate;
	}
	public void setSpecialBirthDate(Timestamp specialBirthDate) {
		this.specialBirthDate = specialBirthDate;
	}
	public String getSpecialMan() {
		return specialMan;
	}
	public void setSpecialMan(String specialMan) {
		this.specialMan = specialMan;
	}
	public String getSpecialTelephone() {
		return specialTelephone;
	}
	public void setSpecialTelephone(String specialTelephone) {
		this.specialTelephone = specialTelephone;
	}
	public String getSpecialMemo() {
		return specialMemo;
	}
	public void setSpecialMemo(String specialMemo) {
		this.specialMemo = specialMemo;
	}
	
	
}
