
public class Gravity {
	public static int gravity(int[][] space){
		int result = 0;
		int round = space.length-1;
		int col[] = new int[space[0].length];
		for (int i = 0; i < space.length; i++) {
			for (int j = 0; j < space[i].length; j++) {
				if (space[i][j] == 1) {
					result += round - i - col[j]++; 
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] space = {{1,0,0,1,0},{0,1,0,0,0},{0,1,0,1,0},{1,0,0,1,0},{0,0,1,0,1}};
		System.out.println(gravity(space));
	}

}
