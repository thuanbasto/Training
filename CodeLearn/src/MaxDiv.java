
public class MaxDiv {
	public static int maxDiv(int[] a){
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		boolean check = false;
		// tìm max
		for (int i = 0; i < a.length; i++) {
			if (a[i] > -1) {
				if (a[i] > max) max = a[i];
			}
		}
		// tìm min != 0, nếu có 0 thì check = true
		for (int i = 0; i < a.length; i++) {
			if (a[i] > -1) {
				if (a[i] < min && a[i] < max && a[i] != 0) min = a[i];
				if (a[i] == 0) check = true;
			}
		}
		int max2 = Integer.MIN_VALUE;
		int min2 = Integer.MAX_VALUE;
		// tìm max bên ÂM
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				if (a[i] > max2) max2 = a[i];
			}
		}
		// tìm min bên ÂM
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				if(a[i] < min2 && a[i] < max2) min2 = a[i];
			}
		}
		// đếm có bao nhiều số = max
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == max) count++;
		}
		int count2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == max2) count2++;
		}
		// nếu có 0 , và min ko có giá trị => min = 0;
		if (check && min == Integer.MAX_VALUE) min = 0;
		// nếu có 2 số lớn hơn max và min ko có giá trị => min = max
		if (count > 1 && min == Integer.MAX_VALUE) min = max;
		if (count2 > 1 && min2 == Integer.MAX_VALUE) min2 = max2;
		
		int result = 0;
		int result2 = 0;
		// nếu min ko có giá trị , hoặc min = 0 => 0/N = 0 -> result = 0
		if (min == Integer.MAX_VALUE || min == 0) result = 0;
		else result = max/min;
		if (min2 == Integer.MAX_VALUE) result2 = 0;
		else result2 = min2/max2;
		
		if (max == min && max != 0) result = 1;
		if (max2 == min2) result2 = 1;
		// TH chỉ có 2 số Max dương và Max âm có giá trị
		if (min == Integer.MAX_VALUE && min2 == Integer.MAX_VALUE) return max/max2; 
		
		if (result > result2) {
			return result;
		}
		return result2;
	}

	public static void main(String[] args) {
		int[] a = {7,-3};
		System.out.println(maxDiv(a));
	}

}
