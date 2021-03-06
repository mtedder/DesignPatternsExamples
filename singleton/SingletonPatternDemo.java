package com.gc.singleton;
/*
 * Ref: http://www.tutorialspoint.com/design_pattern/mvc_pattern.htm
 */
public class SingletonPatternDemo {
	   public static void main(String[] args) {

	      //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
//	      SingleObject object = new SingleObject();

	      //Get the only object available		   
	      SingleObject object = SingleObject.getInstance();

	      //show the message
	      object.showMessage();
	      	     
	   }
}
