
public class JumppingMokey {
	public static int jumppingMokey(int[] a){
		int result = 0;
		if (a.length == 1) return result;
		if (a.length == 2) return -1;
		int index = 0;
		for (int i = 0; i < a.length-3; i++) {
			if (a[i+3] == 0) {
				result++;
				i+=2;
			} else if (a[i+2] == 0) {
				result++;
				i+=1;
			} else if (a[i+1] == 0) {
				if (result == 0)
					return -1;
				else if (a[i-1] == 1)
					return -1;
				else 
					result++;
			} else return -1;
			index = i+1;
		}
		if (index < a.length-1) {
			if (a[a.length-1] == 0) {
				if (a.length-1-index == 1) {
					if (a[a.length-2-index] == 0) {	
						
					} else return -1;
				}
				result++;
			}
			else return -1;
		}
		return result;
	}

	public static void main(String[] args) {
		int a[] = {0,0,1,1,0};
		System.out.println(jumppingMokey(a));
	}

}
