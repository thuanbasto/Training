
public class NonZeros {
	public static String nonZeros(int v, int a){
		long sum = v+a;
		String tempV = ""+v;
		String tempA = ""+a;
		String tempSum = ""+sum;
		tempV = tempV.replace("0", "");
		tempA = tempA.replace("0", "");
		tempSum = tempSum.replace("0", "");
		v = Integer.valueOf(tempV);
		a = Integer.valueOf(tempA);
		sum = Long.valueOf(tempSum);
		if ((long)(v+a) == sum) return "YES";
		else return "NO";
	}

	public static void main(String[] args) {
		System.out.println(nonZeros(102, 107));
	}

}
