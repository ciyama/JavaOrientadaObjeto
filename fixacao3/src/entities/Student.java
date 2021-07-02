package entities;

public class Student {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double finalGrade() {
		return nota1 + nota2 + nota3;
	}
	
	
	public String toString() {
		if (finalGrade() >= 60) {
			return "FINAL GRADE = " + String.format("%.2f%n", finalGrade())
				+ "PASS";
		} else {
			double result;
			result = 60 - finalGrade();
			return "FINAL GRADE = " + String.format("%.2f%n", finalGrade()) 
					+"FAILED \n"
					+ "MISSING " 
					+ result
					+ " POINTS";
		}
	}

}
