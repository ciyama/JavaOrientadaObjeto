package util;

public class Calculator { //quando eu coloco static nas funções então eu posso chamar direto a minha classe
	public static final double PI = 3.14159; // final -> constante PI em maiusculo toda constante

	public static double circumference(double radius) {
		return 2 * PI * radius;
	}
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
