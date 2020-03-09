
public class NumberOfSocks {
	public static int numberOfSocks(String[] socks){
		int result = 0;
		for (int i = 0; i < socks.length; i++) {
			if (socks[i].equals("")) {
				continue;
			} else {
				for (int j = 0; j < socks.length; j++) {
					if (socks[j].equals("")) {
						continue;
					} else {
						if ((socks[i].charAt(0) == 'L' && socks[j].charAt(0) == 'R') ||
								(socks[i].charAt(0) == 'R' && socks[j].charAt(0) == 'L')) {
							if (socks[i].substring(1,socks[i].length()).equals(socks[j].substring(1,socks[j].length()))) {
								result++;
								socks[i] = "";
								socks[j] = "";
								break;
							}
						}
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String[] socks = {"Lay", "Lay", "Ray", "Rax"};
		System.out.println(numberOfSocks(socks));
	}

}
