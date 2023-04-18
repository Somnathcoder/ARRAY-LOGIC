package Array;

public class MargeTwoArray {
public static void main(String[] args) {
		
		int a [] = {10,20,30,40};
		int b [] = {50,60,70,80};
		 int a_leng =a.length;
		 int b_leng =a.length;
		 int c_leng= a_leng+b_leng;
		 int c[] = new int [c_leng];
		 for (int i = 0; i <a .length; i++) {
			c[i]=a[i];
		}
		 for (int j = 0; j < b_leng; j++) {
			 
			c[j+b_leng]=b[j];
						
		}
		for (int j2 = 0; j2 < c.length; j2++) {
			System.out.println(c[j2]);
		}
	}	

}
