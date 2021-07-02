package programs;


import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle);
		//System.out.println("AREA = " + rectangle);
		//System.out.println("PERIMETER = " + rectangle.perimeter());
		//System.out.println("Diagonal = " + rectangle.diagonal());
				
		sc.close();
	}

}
