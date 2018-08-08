package com.timbuchalka;

import java.util.HashMap;

public class Test {

	public static void main(String [] args) {
		int i =2;
		System.out.println(1*100 + i++);
		System.out.println(i);
//		float f = 4096.0;
//		double d = 4096.0;
//		byte b= 4096;
//		char c = 4096;
//		long l = 4096;
//		
//		System.out.println(b + " " + c);
//		int x = 4096;
//		char c1 = -1;
//		char c2 = '\u00FF';
//		char c3 = 4096;
//		char c4 = 4096L;
//		char c5 = 'c';
		
		HashMap<Integer,String> m = new HashMap<Integer, String>();
		m.put(1, "AA");
		m.put(2, "BB");
		m.put(3, "CC");
		m.put(1, "DDd");
		System.out.println(" XX : " + m.get(1));
		
		
	}
	
	public synchronized class FC extends Thread {
		
	}
	
	public abstract class Fast {
		
	}
	protected class Fastx {
		
	}
	
	final class XX extends Thread {
		
	}
	

	
} 



