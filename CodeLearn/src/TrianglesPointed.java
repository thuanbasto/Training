import java.util.ArrayList;
import java.util.List;

public class TrianglesPointed {
	public static int[] trianglesPointed(int a, int b){
		int result[] = {0,0};
		long tempA = a;
		long tempB = b;
		List<Long> list = new ArrayList<Long>();
		for (long i = 1; i < tempA+tempB; i++) {
			if (tempA < tempB+i && tempB < tempA+i && i < tempA+tempB) {
				// Tam giác nhọn là tam giác , Bình phuong 1 cạnh < 2 cạnh bình phương cộng lại
				if (tempA*tempA < tempB*tempB + i*i && tempB*tempB < tempA*tempA + i*i && i*i < tempA*tempA + tempB*tempB) {
					list.add(i);
				}
			}
		}
		tempA = list.get(0);
		tempB = list.get(list.size()-1);
		result[0] = (int) tempA;
		result[1] = (int) tempB;
		return result;
	}
	public static int[] trianglesPointed2(int a, int b){
		int result[] = {0,0};
		long tempA = a;
		long tempB = b;
		if (a>b) {
			tempA = b;
			tempB = a;
		}  
		long min = (long) (Math.ceil(Math.sqrt(tempB*tempB-tempA*tempA) *1)/1);
		long max = (long) (Math.ceil(Math.sqrt(tempB*tempB+tempA*tempA) *1)/1) - 1;
		if (a == b) min = 1;
		result[0] = (int) min;
		result[1] = (int) max;
		return result;
	}
	
	public static void main(String[] args) {

	}

}
