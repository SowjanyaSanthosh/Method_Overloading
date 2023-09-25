package javaprogram;

public class PositionOfParameters {
	 public void add(char a,float b)
	    {
	    	System.out.println("addition of two different datatype values"+(a+b));
	    }
	 public void add(float a,char b)
	    {
	    	System.out.println("addition of two different datatype values"+(a+b));
	    }
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositionOfParameters pp=new PositionOfParameters();
		pp.add('a', 19.09f);
		pp.add(132.90f,'d');

	}

}
