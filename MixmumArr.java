package Array;

public class MixmumArr {
	public static void main(String[] args) {
		int a[] = { 40, 80, 10, 30, 70 };
		int mix = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > mix) {
				mix = a[i];
			}

		}
		System.out.println("In this arr mixmun no is:" + mix);
	}
}
