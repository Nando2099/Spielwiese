package Methode_Overload2;

class Casio
{

	
	public void add(int i , int j) 
	{
		System.out.println(i + j);
	}
	public void add(int i , int j , String k) 
	{
		System.out.println(i + j + k);
	}
	public void add(double i, double j) 
	{
		System.out.println(i + j);
	}
}


public class MethodOverloadingDemo 
{
	public static void main(String[] args)
	{
		Casio obj = new Casio();
		
		obj.add(5, 2);
		
		obj.add(4, 9, " Loco");
		
		obj.add(4.5, 3.8);
	}

}