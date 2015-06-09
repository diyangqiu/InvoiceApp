// Diyang Qiu. 
// May 28th. 
// Exercise 3.2 for Add three numbers together


import java.util.Scanner; 
public class AddThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Total = 0;
		int FisrstNumber = 0;
		int SecondNumber = 0;
		int ThirdNumber = 0;

		System.out.println("Please enter three numbers\n");
		System.out.println();
		System.out.println("First Number: ");
		Scanner sc = new Scanner(System.in);
		FisrstNumber = sc.nextInt();
		System.out.println("Second Number: ");
		SecondNumber = sc.nextInt();
		System.out.println("Third Number: ");
		ThirdNumber = sc.nextInt();
		Total = FisrstNumber + SecondNumber + ThirdNumber;
		String message = "\n" + "Total sum = " + Total + "\n";
		System.out.println(message);
	}

}
