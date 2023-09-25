
package javaprogram;

public class TypeOfParameter {
    public void add(int a,int b)
    {
    	System.out.println("addition of two interger datatype values"+(a+b));
    }
    public void add(char a,char b)
    {
    	System.out.println("addition of two char datatype values"+(a+b));
    }
    public void add(float a,float b)
    {
    	System.out.println("addition of two float datatype values"+(a+b));
    }
    public void add(char a,float b)
    {
    	System.out.println("addition of two different datatype values"+(a+b));
    }
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypeOfParameter tp=new TypeOfParameter();
		tp.add(25466, 76599);
		tp.add('a','z');
		tp.add(5.6f, 8.9f);
		tp.add('z',16.9f);
		
	}

}
