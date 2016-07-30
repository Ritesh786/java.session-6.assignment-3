package com.Ritesh.tools;



import com.Ritesh.Intreface.Shape;

public class Interface1 implements Shape{
	
	
	  public void   draw(){
   	   System.out.println("area of some shapes are ");
   
      }
	
	@Override
	public double getarea( double l,double d) {
	     return l*d;	
		
	}
	
	public double makearea( double k) {
		    return k*k;
		
	}
	
	
}
