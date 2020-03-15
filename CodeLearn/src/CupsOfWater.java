
public class CupsOfWater {
	public static long cupsOfWater(long totalWater, int k){
		if (k == 0) return -1;
		if (totalWater == 0) return 0;
		long result = 0;
		double temp = (double)totalWater/k;
		if (temp > (int)temp) 
			result = (long)temp + 1;
		else 
			result = (long) temp;
		return result;
	}

	public static void main(String[] args) {

	}

}
