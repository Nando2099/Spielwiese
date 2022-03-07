package Arrays;

import java.util.Arrays;

	class Student3							// clase Student
{
	private String studentName;			// instancias
	private int regNo;
	private Double gpa;
	
	Student3(String s, int i, Double d)  // constructor
	{
		this.studentName = s;
		this.regNo = i;
		this.gpa = d;
	}
										//overriding the toString() method
	@Override
	public String toString()
	{
		return this.studentName + " " + this.regNo + " " + this.gpa;
	}
}
public class ArrayObjektDrucken
{
	public static void main(String[] args)  // Main method
	{
		Student3 s1 = new Student3("Justin", 101, 8.81);   //crea objeto clase Student
		Student3 s2 = new Student3("Jessica", 102, 9.11);
		Student3 s3 = new Student3("Simon", 103, 7.02);
		
		//Creating Arrays
		Student3[] studentArr = {s1, s2, s3};         // manda objetos a array
		int[] intArr = {5, 10, 15};
		double[] doubleArr = {5.0, 10.0, 15.0};
		String[] stringArr = {"Justin", "Jessica"};
		
		System.out.println("Student Array: " + Arrays.toString(studentArr)); //convierte array en String e imprime
		System.out.println("Intger Array: " + Arrays.toString(intArr));
		System.out.println("Double Array: " + Arrays.toString(doubleArr));
		System.out.println("String Array: " + Arrays.toString(stringArr));
	}
}