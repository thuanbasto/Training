
public class LocationRobot {
	static int arr[][];
	static int result[] = {0,0};
	public static int[] locationRobot(int m, int n){
		int count = 0;
		// rút gọn vòng bo
		while(m > 2 && n > 2) {
			m-=2;
			n-=2;
			count++;
		}
		arr = new int[m][n];
		if (m == 1 || n == 1) {
			result[0] =count+ m;
			result[1] =count+ n;
			return result;
		} else 
		recursion(0, 0,true,true);
		result[0] +=1+count;
		result[1] +=1+count;
		return result;
	}
	public static void recursion(int i, int j,boolean check,boolean check2) {
//		System.out.println("-----");
//		for (int k = 0; k < arr.length; k++) {
//			for (int k2 = 0; k2 < arr[0].length; k2++) {
//				System.out.print(arr[k][k2] +" ");
//			}
//			System.out.println();
//		}
		if (check==true && check2==true) {   // right
			for (;j < arr[i].length; j++) {
				if (arr[i][j] == 1) break;
				arr[i][j] = 1; 
			}
			if (arr[i+1][j-1] == 1) {
				result[0]= i;
				result[1]= j-1;
				return ;
			}
			recursion(i+1, j-1, check, !check2);
		} else if (check==true && check2==false){ // down
			for (;i < arr.length; i++) {
				if (arr[i][j] == 1) break;
				arr[i][j] = 1;
			}
			if (arr[i-1][j-1] == 1) {
				result[0]= i-1;
				result[1]= j;
				return ;
			}
			recursion(i-1, j-1, !check, !check2);
		} else if (check==false && check2==true) { // left
			for (;j >= 0; j--) {
				if (arr[i][j] == 1) break;
				arr[i][j] = 1; 
			}
			if (arr[i-1][j+1] == 1) {
				result[0]= i;
				result[1]= j+1;
				return ;
			}
			recursion(i-1, j+1, check, !check2);
		} else { // up
			for (;i >= 0; i--) {
				if (arr[i][j] == 1) break;
				arr[i][j] = 1;
			}
			if (arr[i+1][j+1] == 1) {
				result[0]= i+1;
				result[1]= j;
				return ;
			}
			recursion(i+1, j+1, !check, !check2);
		}
		return ;
	}
	public static void main(String[] args) {
		int result[] = locationRobot(4,5);
		System.out.println("-----");
		for (int k = 0; k < arr.length; k++) {
			for (int k2 = 0; k2 < arr[0].length; k2++) {
				System.out.print(arr[k][k2] +" ");
			}
			System.out.println();
		}
		System.out.println(result[0]);
		System.out.println(result[1]);
	}

}
