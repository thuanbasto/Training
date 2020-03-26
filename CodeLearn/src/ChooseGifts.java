import java.util.HashMap;
import java.util.Map;


public class ChooseGifts {
	public static int chooseGifts(int[] a) {
		int result = 0;
		int tempResult = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (map.get(a[i]) == null)
				map.put(a[i], 1);
			else
				map.put(a[i], map.get(a[i]) + 1);
		}
		int index = 0;
		tempResult = checkMax(index, a);
		for (int i = 0; i < a.length-1; i++) {
			if (map.get(a[i]) >= 2 && a[i] != 0) {
				map.put(a[i], map.get(a[i]) - 2);
				index = i+1;
				int temp = result;
				result += a[i]*2;
				for (; index < a.length; index++) {
					if (a[index] == a[i]) {
						if (tempResult <= result) {
							tempResult = result + checkMax(index, a);
						}
						int index2 = i+1;
						for (; index2 < index; index2++) {
							if (map.get(a[index2]) >= 2 && a[index2] != 0) {
								map.put(a[index2], map.get(a[index2]) - 2);
								temp += a[index2]*2;
								int index3 = index2+1;
								for (; index3 < index; index3++) {
									if (a[index3] == a[index2]) {
										index2 = index3-1;
										break;
									}
								}
							}
						}
						if (result < temp) {
							result = temp;
							index = index2;
						} 
						i = index-1;
						break;
					}
				}
			}
		}
		result += checkMax(index, a);
		if (tempResult > result) return tempResult;
		if (index == a.length-1) return result;
		return result;
	}
	public static int checkMax(int index,int[] a) {
		int max = Integer.MIN_VALUE;
		for (index +=1; index < a.length; index++) {
			if (a[index] > max && a[index] != 0) {
				max = a[index];
			}
		}
		return max > 0?max:0;
	}
	public static void main(String[] args) {
		int a[] = {6,11,14,0,10,1,11,7,7,11,11,14,14,13,9,0,12,9,11,3};
		System.out.println(chooseGifts(a));
	}

}
