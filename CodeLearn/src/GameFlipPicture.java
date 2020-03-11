import java.util.HashMap;
import java.util.Map;

public class GameFlipPicture {
	public static boolean gameFlipPicture(int[][] a){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int m = a.length;
		int n = a[0].length;
		if (m*n % 2 != 0) return false;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] > m*n/2) {
					return false;
				}
				if (map.get(a[i][j]) == null)
					map.put(a[i][j], 1);
				else 
					map.put(a[i][j],map.get(a[i][j]) + 1);
			}
		}
		for (Integer i : map.keySet()) {
			if (map.get(i) > 2) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] a = {{2,2,3},{3,1,3}};
		System.out.println(gameFlipPicture(a));
	}

}
