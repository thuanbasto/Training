
public class Password {
	public static int password(long a, long b){
		long[] arr = new long[150];
		long[] arr2 = new long[150];
		int[] arrSNT = new int[150];
		int password2 = 1;
		// tao 1 mang SNT
		for (int i = 2; i < arrSNT.length; i++) {
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					arrSNT[i] = 1;
					break;
				}
			}
		}
		// neu chia het cho SNT thi ++ len cho mang Arr
		while(a > 1) {
			for (int i = 2; i < arrSNT.length; i++) {
				if (arrSNT[i] == 0 && i <= a && a % i == 0) {
					a/= i;
					arr[i] += b;
				} else if (a <= 1) {
					break;
				}
			}
		}
		for (int k = 2; k < arr.length; k++) {
			if (arr[k] != 0) {
				arr[k]++;
				while(arr[k] > 0) {
					for (int i = 2; i < arrSNT.length; i++) {
						if (arrSNT[i] == 0 && i <= arr[k] && arr[k] % i == 0) {
							arr[k]/= i;
							arr2[i] ++;
						} else if (arr[k] <= 1) {
							arr[k] = 0;
							break;
						}
					}
				}
			}
		}
		for (int i = 2; i < arr2.length; i++) {
			if (arr2[i] != 0) {
				password2 *= (arr2[i]+1);
			}
		}
		return password2;
	}
// 12000000000000
	public static void main(String[] args) {
		System.out.println(password(12,2));
//		System.out.println(password(1000000000000L,1000000000000L));
	}
}
