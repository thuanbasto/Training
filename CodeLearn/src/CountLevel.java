
public class CountLevel {
	public static int countLevel(int[] a){
		if (a[0] >= a[1] && a[2] >= a[3]) return -1;
		int level = 1;
		long dmg = a[0], hp = a[1];
		while (dmg >= hp) {
			dmg *= a[2];
			hp *= a[3];
			level++;
		}
		return level;
	}

	public static void main(String[] args) {

	}

}
