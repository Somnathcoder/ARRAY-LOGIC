package Array;

public class DesndingArr {
	public static void main(String[] args) {
		int a [] = {47,68,10,24,3,4,9};
		for (int i = 0; i < a.length; i++) {
			int des =i;
			for (int j = i+1; j < a.length; j++) {
				if (a[des]<a[j]) {
					des=j;
				}
			}
			int temp =a[i];
			a[i]=a[des];
			a[des]=temp;
		}
	
	
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	}
	

}
