
public class CountNumber2 {
	public static int countNumber(int x){
		int result =0;
		String temp = ""+x;
		int length = x/2;
		for (int i = 1; i <= length; i++) {
			if (x % i == 0) {
				String temp2 = ""+i;
				for (int j = 0; j < temp2.length(); j++) {
					if (temp.contains(String.valueOf(temp2.charAt(j)))) {
						result++;
						break;
					}
				}
			}
		}
		return ++result;
	}
/* public static int countNumber(int x){
		int result =0;
		String temp = ""+x;
		int length = temp.length();
		int index = 0;
		boolean checkX = false;
		boolean arr[] = new boolean[10];
		while (index < length) {
			int oneNumber = Integer.valueOf(String.valueOf(temp.charAt(index++)));
			if (arr[oneNumber] == false) {
				arr[oneNumber] = true;
				while (true) {
					if (oneNumber == 0) {
						if (oneNumber == x) checkX = true;
						oneNumber+=10;
					}
					if (x % oneNumber == 0) {
						System.out.println(oneNumber);
						result++;
					}
					if (oneNumber > x) break;
					else oneNumber+=10;
				}
			}
			if (checkX == false) result++; 
		}
		return result;
	}
*/

	public static void main(String[] args) {
		System.out.println(countNumber(1000000000));
	}

}
