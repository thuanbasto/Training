
public class HappyPresents {
	public static int happyPresents(int n){
		return n/3*2+(n%3==0?0:1);
	}

	public static void main(String[] args) {
		System.out.println(happyPresents(5));
		System.out.println(2%2);
	}

}
