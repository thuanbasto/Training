
public class BuyFlowers {
	public static int buyFlowers(int marigold, int rose, int m, int n){
		int result = 0;
		if ((double)marigold/m < rose) {
			result =n/m*marigold;
			if ((rose*(n%m)) > marigold) {
				result += marigold;
			} else{
				result += rose*(n%m);
			}
            return result;
		}
		return n*rose;
	}

	public static void main(String[] args) {
		System.out.println(buyFlowers(3, 2, 4, 7));
		System.out.println(buyFlowers(3, 2, 2, 5));
	}

}
