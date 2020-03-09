
public class MaxModulo {
	public static int maxmodulo(int[] a){
		int max1 = 0;
		int max2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max1) {
				max1 = a[i];
			} 
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max2 && a[i] != max1) {
				max2 = a[i];
			}
		}
		return max2%max1;
	}
	public static void main(String[] args) {
		int[] a = {981,146,745,931,82,620,453,796,151,837,37,665,849
				,851,455,466,777,932,48,470,967,128,732,546,391,35,224,387
				,811,375,739,600,929,394,28,947,142,460,672,58,659,436,395
				,689,807,315,921,242,430,417};
		int[] b = {5,5,5,2,3,8};
		System.out.println(maxmodulo(a));
	}

}
