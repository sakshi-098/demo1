package com.client;

import com.model.Hello;
import com.model.MyThread;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Hello h=new Hello();
		MyThread m1=new MyThread("java", h);
		MyThread m12=new MyThread("classes", h);
		m1.start();
		m12.start();
		
Hello h1=new Hello();
		MyThread m3=new MyThread("java", h1);
		MyThread m4=new MyThread("classes", h1);
		m3.start();
		m4.start();

	}

}
