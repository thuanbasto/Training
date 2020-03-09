
public class MaxFractions {
	public static int UCLN(int a,int b) {
		while (a != b) {
			if (a > b) {
				a = a-b;
			} else {
				b = b-a;
			}
		}
		return a;
	}
	public static int[] maxFractions(int[] a){
		int[] result = new int[2];
		int count = 0;
		if (a[0] % a[1] == 0) {
			a[0] = a[0]/a[1];
			a[1] = a[1]/a[1];
		} else if (a[1] % a[0] == 0) {
			a[1] = a[1]/a[0];
			a[0] = a[0]/a[0];
		}
		int ucln = UCLN(a[0], a[1]);
		a[0] = a[0]/ucln;
		a[1] = a[1]/ucln;
		if (a[0] >= a[2] || a[1] >= a[2] || a[0] + a[1] > a[2]) {
			result[0] = -a[0];
			result[1] = -a[1];
			return result;
		} else if (a[0] + a[1] == a[2]) {
			result[0] = a[0];
			result[1] = a[1];
			return result;
		}
		while (true) {
			count++;
			result[0] = a[0] * count;
			result[1] = a[1] * count;
			System.out.println(a[0]);
			System.out.println(a[1]);
			if (result[0] >= a[2] || result[1] >= a[2] || result[0] + result[1] > a[2]) {
				break;
			}
			if (result[0] + result[1] == a[2]) {
				return result;
			} else if (result[0] + result[1] < a[2]) {
				continue;
			}
		}
		count--;
		result[0] = a[0] * count;
		result[1] = a[1] * count;
		return result;
	}

	public static void main(String[] args) {
		int a[] = {9,6,6};
		int b[] = maxFractions(a);
		System.out.println(b[0]);
		System.out.println(b[1]);
	}

}
