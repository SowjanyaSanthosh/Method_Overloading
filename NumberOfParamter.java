package javaprogram;

public class NumberOfParamter {
	public void add(int a,int b)
	{
		System.out.println("sum of two numbers "+(a+b));
	}
	public void add(int a,int b,int c)
	{
		System.out.println("sum of three numbers "+(a+b+c));
	}
	public void add(int a,int b,int c,int d)
	{
		System.out.println("sum of four numbers " +(a+b+c+d));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfParamter np=new NumberOfParamter();
		np.add(10, 20);
		np.add(10, 20, 30);
		np.add(10, 20,30,40);
	}

}
