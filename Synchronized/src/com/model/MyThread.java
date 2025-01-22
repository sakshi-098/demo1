package com.model;

public class MyThread extends Thread {
	
	String msg;
	Hello h;
	
	public MyThread(String msg,Hello h)
	{
		this.h=h;
		this.msg=msg;
		
	}
	public void run()
	{
		h.display(msg);
	}
	
	
	
	

}
