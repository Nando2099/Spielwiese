package tests;

class Calc
{
//	public int add(int i,int j)  //<- Para dos valores 
	public int add(int ... n) // {4,5,6,7,8,8,4}  // Variable length Arguments
	{
//		return i+j;
		int sum=0;
		for(int i : n) // ENHANCED FOR LOOP -> n es el valor / los valores
		{
			sum = sum + i;
		}
		return sum;
	}
}



public class VarArgs 

{
	public static void main(String[] args)
	{	
		Calc obj = new Calc();
		System.out.println(obj.add(4,5,6,7,874,4,3,3,4,5,6,64));
	}
}