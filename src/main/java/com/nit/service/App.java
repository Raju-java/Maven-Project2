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

    public static void main( String[] args ) throws StringIndexOutOfBoundsException 
    {
    	StringTokenizer st = new StringTokenizer("Hello Everyone Have a nice day"," ");
    	
    	System.out.println("Total number of Tokens: "+st.countTokens());
    }
}
