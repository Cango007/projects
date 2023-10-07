package com.slokam;

public class Calculator {
	
	
	
	
	public int calc(int a,int b,String ope)
	{
		int r=0;
	
		switch (ope) {
		case "ADD":  r=a+b; break; 
		case "SUB": r=a-b; break;
		case "MUL":  r=a*b;break;
		case "DIV":  r=a/b;break;
			
		}
		return r;
	}

}
