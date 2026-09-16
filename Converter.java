import java.util.Scanner;
class Converter {
	public static double celsius;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a temperature in Celsius:");
		celsius = sc.nextDouble();
		System.out.printf("%.1f C = %.1f F", celsius, celsius * 9 / 5 + 32);
	}
}
