package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
class Student2													// clase
{
	private String studentName;									// instanzen
	private int regNo;
	private Double gpa;
	
	
	Student2(String s, int i, Double d)							// constructor
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
public class ArrayList_HashSet
{
	public static void main(String[] args)
	{
		Student s1 = new Student("Justin", 101, 8.81);
		Student s2 = new Student("Jessica", 102, 9.11);
		Student s3 = new Student("Simon", 103, 7.02);
		
																//Creating an ArrayList
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
																//Creating a Set
		HashSet<Student> studentSet = new HashSet<>();
		studentSet.add(s1);
		studentSet.add(s2);
		studentSet.add(s3);
		
		System.out.println("Student List: " + studentList);
		System.out.println("Student Set: " + studentSet);
	}
}