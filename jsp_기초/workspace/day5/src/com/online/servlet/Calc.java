package com.online.servlet;

public class Calc {
	private int num1;
	private int num2;
	
	public Calc() {;}
	
	
	
	
	public int getNum1() {
		return num1;
	}




	public void setNum1(int num1) {
		this.num1 = num1;
	}




	public int getNum2() {
		return num2;
	}




	public void setNum2(int num2) {
		this.num2 = num2;
	}




	public int plus() {
		return num1 + num2;
	}
	public int sub() {
		return num1 -num2;
	}
	public int devide(){
		return num1/num2;
	}
	
	public int multi() {
		return num1*num2;
	}
}
