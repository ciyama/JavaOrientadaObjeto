package programs;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Groos salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee : "+ employee);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage;
		percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("Update data: " + employee);
		
		
		sc.close();

	}

}
