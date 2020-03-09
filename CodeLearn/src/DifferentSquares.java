import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DifferentSquares {
	public static int differentSquares(int[][] matrix){
		List<String> list = new ArrayList<String>();
	    for(int i = 0; i < matrix.length - 1; i++){
	        for(int j = 0; j < matrix[0].length - 1; j++){
	            list.add("" + matrix[i][j] + matrix[i + 1][j] + matrix[i][j + 1] + matrix[i + 1][j+1]);
	        }
	    }
	    Set<String> result = new HashSet<String>(list);
		return result.size();
	}

	public static void main(String[] args) {
		int matrix[][] = {{1,2,1},{2,2,2},{2,2,2},{1,2,3},{2,2,1}};
		System.out.println(differentSquares(matrix));
	}

}
