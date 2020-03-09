
public class Promotion {
	public static int promotion(int x, int y, int s){
		if (x + y >= s) {
	      if (x > s)
	        return s;
	      else
	        return x;
	    }
		int result = x + y;
		int temp = s/result;
		if (result < s) {
			result *= temp;
		}
		if (result <= s) {
			result = s-result + result - temp*y;
		}
		return result;
	}
	public static int promotion2(int x,int y,int s) {
		if (x + y >= s) {
	      if (x > s)
	        return s;
	      else	
	        return x;
	    }
	    int a = s/(x+y);
	    if(((s*a)+(y*a)) != s)
	        return (s*a)+s-((s*a)+(y*a));
	    return (s*a);
	}
	public static void main(String[] args) {
		System.out.println(promotion2(4, 4, 2));
	}

}
