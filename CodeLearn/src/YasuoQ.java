import java.util.HashSet;
import java.util.Set;

public class YasuoQ {
	
    public static int steelTempest(int[] ingame)
    {
    	int result = 0;
    	int i = 0;
    	int len = ingame.length;
    	while (i < len-2) {
    		if (ingame[i] == 1 && ingame[i+1] == 1) {
    			result++;
    			i+=3;
    		} else {
    			i++;
    		}
    	}
    	return result;
    }

	public static void main(String[] args) {
		int[] a = {1,1,1,0,0,1,1,1,1,1,0,1,1};
		System.out.println(steelTempest(a));
	}

}
