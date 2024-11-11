// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		int max =Math.max(a, Math.max(b,c));
		int min =Math.min(a, Math.min(b,c));
		int middle= (a+b+c)-(max+min);

		System.out.println(min + " " + middle + " " + max );
	}
}
