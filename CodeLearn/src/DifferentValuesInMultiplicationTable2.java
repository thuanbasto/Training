import java.util.HashSet;
import java.util.Set;

public class DifferentValuesInMultiplicationTable2 {
	public static int differentValuesInMultiplicationTable2(int n, int m){
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				set.add(i*j);
			}
		}
		return set.size();
	}

}
