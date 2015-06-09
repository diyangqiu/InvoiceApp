//Diyang Qiu
//06/07/2015
//Validator Class


import java.util.Scanner;

public class Validator {
	Scanner sc = new Scanner(System.in);

	public static String getString(Scanner sc, String promp) {
		String string;
		System.out.println(promp);
		string = sc.next();
		sc.nextLine();
		return string;
	}

	public static int getint(Scanner sc, String promp) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.println(promp);
			System.out.println();
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Invalid Input!");
			}
			sc.nextLine();
		}
		return i;
	}
	
	public static int getint(Scanner sc, String promp, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.println(promp);
			System.out.println();
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				if(i >= min && i <= max) {
					isValid = true;
				} else {
					System.out.println("Please Enter a value between " + min + " and " + max );
					System.out.println();
				}
			} else {
				System.out.println("Invalid Input!");
			}
			sc.nextLine();
		}
		return i;
	}
	
	public static double getDouble(Scanner sc, String promp) {
		double d = 0.0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.println(promp);
			System.out.println();
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Invalid Input!");
			}
			sc.nextLine();
		}
		return d;
	}
	
	public static double getint(Scanner sc, String promp, double min, double max) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.println(promp);
			System.out.println();
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				if(d >= min && d <= max) {
					isValid = true;
				} else {
					System.out.println("Please Enter a value between " + min + " and " + max );
					System.out.println();
				}
			} else {
				System.out.println("Invalid Input!");
			}
			sc.nextLine();
		}
		return d;
	}
}
