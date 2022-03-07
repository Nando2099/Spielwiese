package Constructor_Overloaded2;

class Casio
{
	int num1;
	int num2;
	String operation;
	
	public Casio()
	{
		num1 = 0;
		num2 = 0;
		operation = "Nothing";
	}
	public Casio(int i)
	{
		num1 = i;
		num2 = 0;
		operation = "Nothing";
	}
	public Casio(int i,int j,String op)
	{
		num1 = i;
		num2 = j;
		operation = op;
	}
}
	
	


public class ConstructorloadingDemo 
{
	
	public static void main(String[] args)
	{
		Casio obj = new Casio(4,5,"Palabra");
		System.out.println(obj.num1 + obj.num2 + obj.operation);
		
		Casio obj1 = new Casio(6);
		System.out.println(obj.num1);
		
	}

}