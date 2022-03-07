package Arrays;

import java.util.Arrays;


class Student										// Clase
{
	private String studentName;						// Instancias
	private int regNo;
	private Double gpa;
	
	Student(String s, int i, Double d)				// constructor
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
public class MehrDimArrayDrucken
{
	public static void main(String[] args)
	{
		Student s1 = new Student("Justin", 101, 8.81);
		Student s2 = new Student("Jessica", 102, 9.11);
		Student s3 = new Student("Simon", 103, 7.02);
		Student s4 = new Student("Harry", 104, 8.0);
		
		Student[] studentArr = {s1, s2, s3,s4};   // crea array simple studentArr
		
		Student[][] twoDimStudentArr = {			// crea array multidimensional
				{s1, s2},
				{s3, s4}
		};
		System.out.println("Multidim. Using toString(): " + Arrays.toString(twoDimStudentArr));
		
		System.out.println("Multidim. Using deepToString(): " + Arrays.deepToString(twoDimStudentArr));
		
		System.out.println("_____________________________________");
		
		System.out.println("Using toString() Array Simple : " + Arrays.toString(studentArr));
	}
}