package SimpleJava;
import java.util.Scanner;

public class vaw_04_CBSE_board_percentage_calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of math: ");
		short math = sc.nextByte();
		System.out.println("Enter the marks of english: ");
		short english = sc.nextByte();
		System.out.println("Enter the marks of physics: ");
		short physics = sc.nextByte();
		System.out.println("Enter the marks of chemistry: ");
		short chemistry = sc.nextByte();
		System.out.println("Enter the marks of biology: ");
		short biology = sc.nextByte();
		int percentage = (math + english + physics + chemistry + biology)/5;
		System.out.println("The total percentage is: " + percentage + "%");
	}
}
