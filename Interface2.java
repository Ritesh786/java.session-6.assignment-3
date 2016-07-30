package com.Ritesh.tools;


public class Interface2 extends Interface1 {

	public static void main(String[] args) {
	   Interface1 obj =new Interface1();
	   obj.draw();
	    System.out.println( "Area of rectangle is " +obj.getarea(2, 3));
	    System.out.println( "Area of circle is " +  obj.makearea(6));
	}

}
