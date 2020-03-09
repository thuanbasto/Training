
public class DecodeDivision {
	public static int UCLN(int a,int b) {
		if (a==0||b==0) return a+b;
		while (a!=b) {
			if (a>b) a-=b;
			else b-=a;
		}
		return a;
	}
	public static int[] decodeDivision(String s){
		int result[] = {0,0};
		String arr[] = s.split("\\.");
		
		int tu = Integer.valueOf(arr[0]);
		
		// 76.435 => 435/1000 = 87/200 , Tu = 76*200+87
		int tuOfMau = Integer.valueOf(arr[1]);
		int mauOfMau = (int) Math.pow(10,arr[1].length());
		int temp = UCLN(tuOfMau, mauOfMau);
		tuOfMau /= temp;
		mauOfMau /= temp;
		tu = tu*mauOfMau+tuOfMau;
		
		temp = UCLN(tu, mauOfMau);
		
		result[0] = tu/temp;
		result[1] = mauOfMau/temp;
		return result;
	}

	public static void main(String[] args) {
		int result[] = decodeDivision("76.435");
		System.out.println(result[0]);
		System.out.println(result[1]);
	}

}
