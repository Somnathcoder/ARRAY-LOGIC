package Array;

public class DublicateArr {
	
	public static void main(String[] args) {
		int a[]= {10,50,10,40,30,50};
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j] && i!=j) {
					System.out.println(" Dublicate arr value is:"+a[i]);
				}
			}
		}
	}

}
