package com.nit.service;

import java.util.StringTokenizer;

public class App 
{
	public void m1(){
	System.out.println("m1() method modified");
	}
	public void m2(){
	System.out.println("this is m2() method completed");
	}
	public void m3(){
	System.out.println("m3() method after completed");
	}
	public void m4(){
	}

    public static void main( String[] args ) throws StringIndexOutOfBoundsException 
    {
    	StringTokenizer st = new StringTokenizer("Hello Everyone Have a nice day"," ");
    	
    	System.out.println("Total number of Tokens: "+st.countTokens());
    }
}
