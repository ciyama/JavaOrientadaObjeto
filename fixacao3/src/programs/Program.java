package programs;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		System.out.print("Enter student name: ");
		student.name = sc.nextLine();
		System.out.print("Enter nota1: ");
		student.nota1 = sc.nextDouble();
		System.out.print("Enter nota2: ");
		student.nota2 = sc.nextDouble();
		System.out.print("Enter nota3: ");
		student.nota3 = sc.nextDouble();
		
		
		System.out.println(student);
		
		sc.close();
		}

}
