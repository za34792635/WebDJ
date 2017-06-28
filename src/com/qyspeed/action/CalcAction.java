package com.qyspeed.action;

public class CalcAction {

	private int operand1;
	private int operand2;
	private int result;
	
	public int add(int x,int y)
	{
		return x+y;
	}
	public int sub(int x,int y)
	{
		return x-y;
	}
	
	public String execute(){
	  
		result=add(operand1,operand2);
		return "sucess";
	}
}
