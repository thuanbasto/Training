
public class BirthdayGift {
	public static int[] birthdayGift(int n, int[] t){
		int result[] = new int[12];
		for (int i = 0; i < t.length; i++) {
			result[t[i]-1]++;
		}
		return result;
	}

	public static void main(String[] args) {
		int t[] = {1, 3, 1, 3, 4, 3, 11, 9, 11, 4};
		int result[] = birthdayGift(10, t);
		for (int i = 0; i < 12; i++) {
			System.out.print(result[i]+" ");
		}
	}

}
