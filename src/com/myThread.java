package com;

public class myThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized(Test.obj) {
			Test.obj.notify();
		}
	}

}
