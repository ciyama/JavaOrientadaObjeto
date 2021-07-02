package util;

public class Calculator {
	public final double PI = 3.14159; // final -> constante PI em maiusculo toda constante

	public double circumference(double radius) {
		return 2 * PI * radius;
	}
	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
