
public class RainWater {
	public static int sort(int i, int a[]) {
		int index = 0;
		int start = a[i];
		int i2 = i+1;
		for (i+=1; i < a.length; i++) {
			if (start <= a[i]) { // tìm đoạn lớn hơn đoạn đầu, nếu lớn hơn thì break;
				index = i;
				break;
			}
			if (i == a.length-1) {
				index = i;
			}
		}
		// tìm Chỉ số lớn Nhì, Ex: {6,2,5,1};
		int temp = 0;
		int indexTemp = index;
		for (; i2 < index; i2++) {
			if (a[index] <= a[i2] && a[i2] >= temp) {
				temp = a[i2];
				indexTemp = i2;
			}
		}
		return indexTemp;
	}
	public static int[] rainWater(int[] a){
		int i = 0;
		int length = a.length;
		if (length == 2) return a;
		while(i < length-1) {
			int end = sort(i,a);
			// lấy số nhỏ nhấp để lấp 
			int min = Math.min(a[i], a[end]);
			// lấp các đường = chỉ số min, đc tính bởi 1 đoạn ngắn -> 1 đoạn dài nhất
			for (i+=1; i < end; i++) {
				a[i] = min;
			}
			i = end;
		}
		return a;
	}

	public static void main(String[] args) {
		int a[] = {3,4,5,6,2,5,1};
		a = rainWater(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
