package com;

public class MajorException3 extends Exception{
	public MajorException(String msg){
		super(msg);
	}

	public static void main(String[] args){
		try{//create instance of MajorException with custom message
			throw new MajorException("This is a custom exception message.");
		}
		catch(MajorException e){
			//Handle the exception by printing its message
			System.out.println("Caught exception: "+ e.getMessage());
		}
	}
}