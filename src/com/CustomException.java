package com;

import org.omg.PortableServer.ThreadPolicyOperations;

public class CustomException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	CustomException(String s) {
		super(s);
	}
	
	public static void main(String args[]) {
		
		try {
			if(10 > 9) {
				throw new CustomException("Error");
			}
			
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
