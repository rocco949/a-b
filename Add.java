import java.util.Scanner;

public class Add {
	static Scanner sc_obj = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int x = sc_obj.nextInt();

		System.out.println("Enter a second number: ");
		int y = sc_obj.nextInt();

		System.out.println(add(x, y));
	}

	public static int add(int x, int y) {
		return x + y;
	}
 }