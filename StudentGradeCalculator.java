import java.util.*;
import java.lang.*;
class StudentGradeCalculator
{
	static Scanner sc = new Scanner(System.in);
	static String grade;
	static String perfomance;
	public static void main(String[] args)
	{
		System.out.println("*****Student Grade Calculator*****");
		System.out.println();
		System.out.print("Enter the No of Subject : ");
		int n = sc.nextInt();
		int marks[] = new int[n];
		
		float total = 0;
		float avg;


		for(int i =0;i<n;i++)
		{
			System.out.print("Enter Marks of Subject "+(i+1)+ ":");
			marks[i] = sc.nextInt();
			total=total+marks[i];
		}

		avg = total/n;
		//System.out.println("Student Grade According to their Avgerage marks : ");
		if(avg>=80)
		{
			//System.out.print(grade);
			grade = "A";
			perfomance = "Very Good";
			
		}
		else if(avg>=60 && avg<80)
		{
			//System.out.print("Grade : B");
			grade = "B";
			perfomance = "Good";
		}
		else if(avg>=40 && avg<60)
		{
			//System.out.print("Grade : C");
			grade = "C";
			perfomance = "Poor perfomance";
		}
		else
		{
			//System.out.print("Grade : D");
			grade = "D";
			perfomance = "Needs Improvement";
		}

		System.out.println();
		System.out.println("***Result***");
		System.out.println("Total Marks : "+total);
		System.out.println("Average percentage : "+avg);
		System.out.println("Grade : "+grade);
		System.out.println("Perfomance : "+perfomance);
	}
}