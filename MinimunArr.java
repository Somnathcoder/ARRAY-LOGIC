package Array;

public class MinimunArr {
	public static void main(String[] args) {
		int a[] = { 80, 45, 56, 66, 51, 86 };
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("In this arr minimum no is:" + min);
	}
}
