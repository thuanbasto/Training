
public class CountTeam2 {
	public static int[] countTeam(int n){
	    int result[] = {0,n};
	    double temp = (double)n/4;
	    if (temp > (int)temp) {
	    	result[0] = n/4+1;
	    } else {
	    	result[0] = n/4;
	    }
	    if (n>=25) result[1] = 25;
	    return result;
	}

	public static void main(String[] args) {
		int result[] = countTeam(25);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}

}
