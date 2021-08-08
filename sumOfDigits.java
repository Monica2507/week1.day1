package Week1.Day1;

public class sumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5775;
		int sum = 0;
		int digit;

		while (number > 0) {
			digit = number % 10;
			sum = sum + digit;
			number = number / 10;

		}
		System.out.println(sum);
	}
}
