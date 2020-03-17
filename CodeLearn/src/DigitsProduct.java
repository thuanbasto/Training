
public class DigitsProduct {
	public static int digitsProduct(int product){
		if (product == 0) return 10;
		int result = 0;
		String temp = "";
		for (int i = 9; i > 1; i--) {
			while (product % i == 0) {
				temp = i + temp;
				product/=i;
			}
		}
		if (temp.equals("")) return -1;
		result = Integer.valueOf(temp);
		return result;
	}

	public static void main(String[] args) {
		System.out.println(digitsProduct(1));
	}

}
